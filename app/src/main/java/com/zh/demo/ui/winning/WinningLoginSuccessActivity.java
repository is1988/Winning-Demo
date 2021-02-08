package com.zh.demo.ui.winning;

import android.content.Context;
import android.content.Intent;

import com.zh.demo.R;
import com.zh.demo.aop.DebugLog;
import com.zh.demo.common.MyActivity;
import com.zh.demo.other.IntentKey;

/**
 * ———— author : 郑皓
 * ———— time : 2021/02/08   Monday
 * ———— desc :
 */
public class WinningLoginSuccessActivity extends MyActivity {
    private com.yuyh.jsonviewer.library.JsonRecyclerView mRvJson;

    @DebugLog
    public static void start(Context context, String json) {
        Intent intent = new Intent(context, WinningLoginSuccessActivity.class);
        intent.putExtra(IntentKey.TEXT, json);
        context.startActivity(intent);
    }

    @Override
    protected int getLayoutId() {
        return R.layout.winning_login_suuccess_activity;
    }

    @Override
    protected void initView() {

        mRvJson = findViewById(R.id.rv_json);
    }

    @Override
    protected void initData() {
        mRvJson.bindJson(getString(IntentKey.TEXT));
        mRvJson.setTextSize(22);
    }
}
