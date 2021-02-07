package com.zh.demo.ui.winning;

import androidx.recyclerview.widget.GridLayoutManager;

import com.gyf.immersionbar.ImmersionBar;
import com.zh.demo.R;
import com.zh.demo.common.MyActivity;
import com.zh.demo.ui.winning.adapter.OfficeListAdapter;
import com.zh.demo.ui.winning.entity.CommonItem;
import com.zh.demo.ui.winning.entity.DataServer;

import java.util.List;

/**
 * ———— author : 郑皓
 * ———— time : 2021/02/05   Friday
 * ———— desc :
 */
public class WinningSelectOfficeActivity extends MyActivity {
    private androidx.recyclerview.widget.RecyclerView mRvList;

    @Override
    protected int getLayoutId() {
        return R.layout.winning_select_office_activity;
    }

    @Override
    protected void initView() {

        mRvList = findViewById(R.id.rv_list);

        ImmersionBar.setFitsSystemWindows(this);
    }

    @Override
    protected void initData() {

        final List<CommonItem> data = DataServer.getCommonData(50);
        final OfficeListAdapter adapter = new OfficeListAdapter(data);
        final GridLayoutManager manager = new GridLayoutManager(this, 4);
        mRvList.setLayoutManager(manager);
        mRvList.setAdapter(adapter);

    }
}
