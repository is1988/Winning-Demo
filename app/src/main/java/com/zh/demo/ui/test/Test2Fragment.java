package com.zh.demo.ui.test;

import androidx.appcompat.widget.AppCompatTextView;

import com.zh.demo.R;
import com.zh.demo.common.MyFragment;
import com.zh.demo.ui.winning.WinningHomeActivity;
import com.zh.demo.ui.winning.WinningMsgListActivity;
import com.zh.demo.ui.winning.WinningTypeListActivity;

/**
 * ———— author : 郑皓
 * ———— time : 2021/01/26   Tuesday
 * ———— desc :
 */
public class Test2Fragment extends MyFragment<TestHomeActivity> {

    private AppCompatTextView mTvPage;
    private AppCompatTextView mTvTypeList;
    private AppCompatTextView mTvMsgList;

    @Override
    protected int getLayoutId() {
        return R.layout.test2_fragment;
    }

    @Override
    protected void initView() {

        mTvPage = findViewById(R.id.tv_page);
        mTvTypeList = findViewById(R.id.tv_type_list);
        mTvMsgList = findViewById(R.id.tv_msg_list);
    }

    @Override
    protected void initData() {


        mTvPage.setOnClickListener(v -> {
            startActivity(WinningHomeActivity.class);
        });
        mTvTypeList.setOnClickListener(v -> {
            startActivity(WinningTypeListActivity.class);
        });
        mTvMsgList.setOnClickListener(v -> {
            startActivity(WinningMsgListActivity.class);
        });

    }

    @Override
    public boolean isStatusBarEnabled() {
        // 使用沉浸式状态栏
        return !super.isStatusBarEnabled();
    }

}
