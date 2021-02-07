package com.zh.demo.ui.winning;

import android.widget.RadioButton;

import androidx.recyclerview.widget.GridLayoutManager;

import com.apkfuns.logutils.LogUtils;
import com.zh.demo.R;
import com.zh.demo.common.MyActivity;
import com.zh.demo.ui.winning.adapter.DoctorListAdapter;
import com.zh.demo.ui.winning.entity.CommonItem;
import com.zh.demo.ui.winning.entity.DataServer;

import java.util.List;

/**
 * ———— author : 郑皓
 * ———— time : 2021/02/07   Sunday
 * ———— desc :
 */
public class WinningSelectDoctorActivity extends MyActivity {
    private android.widget.RadioGroup mRadioGroup;
    private androidx.recyclerview.widget.RecyclerView mRvList;

    @Override
    protected int getLayoutId() {
        return R.layout.winning_select_doctor_activity;
    }

    @Override
    protected void initView() {

        mRadioGroup = findViewById(R.id.radio_group);
        mRvList = findViewById(R.id.rv_list);
    }

    @Override
    protected void initData() {

        mRadioGroup.setOnCheckedChangeListener((group, checkedId) -> {
            RadioButton rb = findViewById(checkedId);
            LogUtils.e(rb.getText().toString());
        });

        final List<CommonItem> data = DataServer.getCommonData(20);
        final DoctorListAdapter adapter = new DoctorListAdapter(data);
        final GridLayoutManager manager = new GridLayoutManager(this, 2);
        mRvList.setLayoutManager(manager);
        mRvList.setAdapter(adapter);

    }
}
