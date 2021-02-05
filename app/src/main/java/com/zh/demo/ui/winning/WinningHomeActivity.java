package com.zh.demo.ui.winning;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.gyf.immersionbar.ImmersionBar;
import com.zh.demo.R;
import com.zh.demo.common.MyActivity;
import com.zh.demo.ui.winning.adapter.MultipleItemMsgQuickAdapter;
import com.zh.demo.ui.winning.entity.DataServer;
import com.zh.demo.ui.winning.entity.QuickMultipleEntity;

import java.util.List;

/**
 * ———— author : 郑皓
 * ———— time : 2021/02/03   Wednesday
 * ———— desc :
 */
public class WinningHomeActivity extends MyActivity {

    private RecyclerView mRvList;

    @Override
    protected int getLayoutId() {
        return R.layout.winning_home_acivity;
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
