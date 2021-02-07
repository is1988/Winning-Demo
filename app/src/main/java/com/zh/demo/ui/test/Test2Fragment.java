package com.zh.demo.ui.test;

import android.view.View;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.listener.OnItemClickListener;
import com.zh.demo.R;
import com.zh.demo.common.MyFragment;
import com.zh.demo.ui.winning.WinningHomeActivity;
import com.zh.demo.ui.winning.WinningPersonalDataActivity;
import com.zh.demo.ui.winning.WinningSelectDoctorActivity;
import com.zh.demo.ui.winning.WinningSelectDoctorActivity2;
import com.zh.demo.ui.winning.WinningSelectOfficeActivity;
import com.zh.demo.ui.winning.adapter.PageTypeListAdapter;
import com.zh.demo.ui.winning.entity.DataServer;
import com.zh.demo.ui.winning.entity.PageType;

import java.util.List;

/**
 * ———— author : 郑皓
 * ———— time : 2021/01/26   Tuesday
 * ———— desc :
 */
public class Test2Fragment extends MyFragment<TestHomeActivity> {

    private RecyclerView mRvList;

    private String[] name = {"机器人首页", "个人信息页", "科室选择", "医生选择1", "医生选择2"};
    private Class[] clz = {WinningHomeActivity.class, WinningPersonalDataActivity.class,
            WinningSelectOfficeActivity.class, WinningSelectDoctorActivity.class, WinningSelectDoctorActivity2.class};


    @Override
    protected int getLayoutId() {
        return R.layout.test2_fragment;
    }

    @Override
    protected void initView() {

        mRvList = findViewById(R.id.rv_list);
    }

    @Override
    protected void initData() {

        final List<PageType> data = DataServer.getPageTypeData(name);
        final PageTypeListAdapter adapter = new PageTypeListAdapter(data);
        final GridLayoutManager manager = new GridLayoutManager(getAttachActivity(), 4);
        mRvList.setLayoutManager(manager);
        mRvList.setAdapter(adapter);

        // 设置点击事件
        adapter.setOnItemClickListener(new OnItemClickListener() {
            @Override
            public void onItemClick(@NonNull BaseQuickAdapter adapter, @NonNull View view, int position) {
                startActivity(clz[position]);
            }
        });

    }

    @Override
    public boolean isStatusBarEnabled() {
        // 使用沉浸式状态栏
        return !super.isStatusBarEnabled();
    }

}
