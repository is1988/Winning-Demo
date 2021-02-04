package com.zh.demo.ui.test;

import androidx.appcompat.widget.AppCompatTextView;

import com.zh.demo.R;
import com.zh.demo.common.MyFragment;
import com.zh.demo.ui.winning.WinningHomeActivity;

/**
 * ———— author : 郑皓
 * ———— time : 2021/01/26   Tuesday
 * ———— desc :
 */
public class Test2Fragment extends MyFragment<TestHomeActivity> {

    private AppCompatTextView mTvPage;

    @Override
    protected int getLayoutId() {
        return R.layout.test2_fragment;
    }

    @Override
    protected void initView() {

        mTvPage = findViewById(R.id.tv_page);

    }

    @Override
    protected void initData() {


        mTvPage.setOnClickListener(v -> {
            startActivity(WinningHomeActivity.class);
        });

    }

    @Override
    public boolean isStatusBarEnabled() {
        // 使用沉浸式状态栏
        return !super.isStatusBarEnabled();
    }

}
