package com.zh.demo.ui.winning;

import androidx.recyclerview.widget.LinearLayoutManager;

import com.gyf.immersionbar.ImmersionBar;
import com.zh.demo.R;
import com.zh.demo.common.MyActivity;
import com.zh.demo.ui.winning.adapter.MultipleItemMsgPersonalQuickAdapter;
import com.zh.demo.ui.winning.adapter.PersonalItemListAdapter;
import com.zh.demo.ui.winning.entity.DataServer;
import com.zh.demo.ui.winning.entity.QuickMultipleEntity;

import java.util.List;

/**
 * ———— author : 郑皓
 * ———— time : 2021/02/05   Friday
 * ———— desc :
 */
public class WinningPersonalDataActivity extends MyActivity {
    private androidx.recyclerview.widget.RecyclerView mRvItem1;
    private androidx.recyclerview.widget.RecyclerView mRvItem2;
    private androidx.recyclerview.widget.RecyclerView mRvList;

    @Override
    protected int getLayoutId() {
        return R.layout.winning_personal_data_activity;
    }

    @Override
    protected void initView() {

        mRvItem1 = findViewById(R.id.rv_item1);
        mRvItem2 = findViewById(R.id.rv_item2);
        mRvList = findViewById(R.id.rv_list);

        ImmersionBar.setFitsSystemWindows(this);
    }

    @Override
    protected void initData() {

        final List<QuickMultipleEntity> data = DataServer.getMsgItemPersonalData();
        final MultipleItemMsgPersonalQuickAdapter msgAdapter = new MultipleItemMsgPersonalQuickAdapter(data);
        mRvList.setLayoutManager(new LinearLayoutManager(this));
        mRvList.setAdapter(msgAdapter);

        PersonalItemListAdapter adapter = new PersonalItemListAdapter(DataServer.getCommonData());
        mRvItem1.setLayoutManager(new LinearLayoutManager(getContext()));
        mRvItem1.setAdapter(adapter);
        mRvItem2.setLayoutManager(new LinearLayoutManager(getContext()));
        mRvItem2.setAdapter(adapter);

    }
}
