package com.zh.demo.ui.winning;

import android.view.View;

import com.gyf.immersionbar.ImmersionBar;
import com.zh.demo.R;
import com.zh.demo.common.MyActivity;

/**
 * ———— author : 郑皓
 * ———— time : 2021/02/03   Wednesday
 * ———— desc :
 */
public class WinningHomeActivity extends MyActivity {
    @Override
    protected int getLayoutId() {
        return R.layout.winning_home_acivity;
    }

    @Override
    protected void initView() {
        ImmersionBar.setFitsSystemWindows(this);

    }

    @Override
    protected void initData() {

    }
}
