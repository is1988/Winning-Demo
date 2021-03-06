package com.zh.demo.ui.test;

import android.text.InputType;
import android.view.View;

import com.google.gson.Gson;
import com.hjq.http.EasyConfig;
import com.hjq.http.EasyHttp;
import com.hjq.http.listener.HttpCallback;
import com.zh.base.BaseDialog;
import com.zh.demo.R;
import com.zh.demo.common.MyActivity;
import com.zh.demo.http.request.SearchAuthorApi;
import com.zh.demo.http.response.SearchBean;
import com.zh.demo.ui.activity.BrowserActivity;
import com.zh.demo.ui.dialog.InputDialog;
import com.zh.demo.ui.test.http.TestLoginApi;
import com.zh.demo.ui.test.http.TestTimeOutApi;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;

/**
 * ———— author : 郑皓
 * ———— time : 2021/01/29   Friday
 * ———— desc :
 */
public class TestHttpActivity extends MyActivity {
    private android.widget.TextView mTvJson;
    private android.widget.Button mBtnTimeOut;
    private android.widget.Button mBtnBaidu;
    private android.widget.Button mBtnGet;
    private android.widget.Button mBtnPost;

    @Override
    protected int getLayoutId() {
        return R.layout.test_http_activity;
    }

    @Override
    protected void initView() {

        setOnClickListener(R.id.btn_baidu, R.id.btn_get, R.id.btn_post,R.id.btn_time_out,R.id.btn_time_out30);

        mTvJson = findViewById(R.id.tv_json);
    }

    @Override
    protected void initData() {
        mTvJson.setText("......");
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        if (id == R.id.btn_baidu) {
            openLink();
        } else if (id == R.id.btn_get) {
            get();
        } else if (id == R.id.btn_post) {
            post();
        } else if (id == R.id.btn_time_out) {
            timeOut(3000L);
        } else if (id == R.id.btn_time_out30) {
            timeOut(30000L);
        }
    }

    // 访问超时测试
    private void timeOut(Long time) {

        OkHttpClient.Builder builder = EasyConfig.getInstance().getClient().newBuilder();
        builder.readTimeout(time, TimeUnit.MILLISECONDS);
        builder.writeTimeout(time, TimeUnit.MILLISECONDS);
        builder.connectTimeout(time, TimeUnit.MILLISECONDS);

        EasyHttp.post(this)
                .api(new TestTimeOutApi())
                .client(builder.build())
                .request(new HttpCallback<String>(this) {

                    @Override
                    public void onSucceed(String result) {
                        mTvJson.setText(result);
                    }

                    @Override
                    public void onFail(Exception e) {
                        super.onFail(e);
                        mTvJson.setText(e.getMessage());
                    }
                });
    }

    private void openLink() {
        new InputDialog.Builder(this)
                // 标题可以不用填写
                .setTitle("你也可以输入其他rul")
                // 内容可以不用填写
                .setContent("https://www.baidu.com")
                // 提示可以不用填写
                .setHint("请输入一个url")
                // 确定按钮文本
                .setConfirm(getString(R.string.common_confirm))
                // 设置 null 表示不显示取消按钮
                .setCancel(getString(R.string.common_cancel))
                // 设置点击按钮后不关闭对话框
                //.setAutoDismiss(false)
                .setCancelable(false)
                .setInputType(InputType.TYPE_TEXT_VARIATION_EMAIL_ADDRESS)
                .setListener(new InputDialog.OnListener() {

                    @Override
                    public void onConfirm(BaseDialog dialog, String content) {
                        BrowserActivity.start(getActivity(), content);
                    }

                    @Override
                    public void onCancel(BaseDialog dialog) {
                    }
                })
                .show();
    }

    private void post() {

//        EasyHttp.post(this)
//                .api(new SearchBlogsApi()
//                        .setKeyword("搬砖不再有"))
//                .request(new HttpCallback<HttpData<SearchBean>>(this) {
//
//                    @Override
//                    public void onSucceed(HttpData<SearchBean> result) {
//                        setText(result.getData());
//                    }
//                });

        EasyHttp.post(this)
                .api(new TestLoginApi()
                        .setParams("winning","winning"))
                .request(new HttpCallback<String>(this) {

                    @Override
                    public void onSucceed(String result) {
                        mTvJson.setText(result);
                    }
                });

    }

    private void get() {
        EasyHttp.get(this)
                .api(new SearchAuthorApi()
                        .setAuthor("winning88"))
                .request(new HttpCallback<String>(this) {

                    @Override
                    public void onSucceed(String result) {
                        mTvJson.setText(result);
                    }

                    @Override
                    public void onFail(Exception e) {
                        super.onFail(e);
                        mTvJson.setText(e.getMessage());
                    }
                });
    }

    private void setText(SearchBean data) {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < data.getDatas().size(); i++) {
            str.append(getJsonStringByEntity(data.getDatas().get(i))).append("\n");
        }
        mTvJson.setText(str);
    }

    public static String getJsonStringByEntity(Object o) {
        String strJson = "";
        Gson gson = new Gson();
        strJson = gson.toJson(o);
        return strJson;
    }
}
