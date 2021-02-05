package com.zh.demo.ui.winning;

import android.view.View;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.chad.library.adapter.base.listener.GridSpanSizeLookup;
import com.gyf.immersionbar.ImmersionBar;
import com.zh.base.BaseActivity;
import com.zh.demo.R;
import com.zh.demo.common.MyActivity;
import com.zh.demo.ui.winning.adapter.MultipleItemMsgQuickAdapter;
import com.zh.demo.ui.winning.adapter.MultipleItemQuickAdapter;
import com.zh.demo.ui.winning.entity.DataServer;
import com.zh.demo.ui.winning.entity.QuickMultipleEntity;

import java.util.List;
import java.util.Objects;

/**
 * ———— author : 郑皓
 * ———— time : 2021/02/04   Thursday
 * ———— desc :
 */
public class WinningMsgListActivity extends MyActivity {


    private RecyclerView mRvList;

    @Override
    protected int getLayoutId() {
        return R.layout.winning_msg_list_activity;
    }

    @Override
    protected void initView() {

        mRvList = findViewById(R.id.rv_list);

        ImmersionBar.setFitsSystemWindows(this);
    }

    @Override
    protected void initData() {

        final List<QuickMultipleEntity> data = DataServer.getMsgItemData();
        final MultipleItemMsgQuickAdapter msgAdapter = new MultipleItemMsgQuickAdapter(data);
        mRvList.setLayoutManager(new LinearLayoutManager(this));
        mRvList.setAdapter(msgAdapter);
    }


}
