package com.zh.demo.ui.winning;

import android.view.View;
import android.widget.RadioButton;

import androidx.recyclerview.widget.LinearLayoutManager;

import com.apkfuns.logutils.LogUtils;
import com.zh.demo.R;
import com.zh.demo.common.MyActivity;
import com.zh.demo.ui.winning.adapter.DoctorListAdapter2;
import com.zh.demo.ui.winning.entity.CommonItem;
import com.zh.demo.ui.winning.entity.DataServer;

import java.util.List;

/**
 * ———— author : 郑皓
 * ———— time : 2021/02/07   Sunday
 * ———— desc :
 */
public class WinningSelectDoctorActivity2 extends MyActivity {
    private android.widget.RadioGroup mRadioGroup;
    private androidx.recyclerview.widget.RecyclerView mRvList;
    private androidx.appcompat.widget.AppCompatTextView mTvRegister;
    private androidx.appcompat.widget.AppCompatTextView mTvRegister2;
    private android.widget.LinearLayout mLayout2;

    @Override
    protected int getLayoutId() {
        return R.layout.winning_select_doctor_activity2;
    }

    @Override
    protected void initView() {

        mRadioGroup = findViewById(R.id.radio_group);
        mRvList = findViewById(R.id.rv_list);
        mTvRegister = findViewById(R.id.tv_register);
        mTvRegister2 = findViewById(R.id.tv_register2);
        mLayout2 = findViewById(R.id.layout2);

        mTvRegister.setOnClickListener(v -> {
            mLayout2.setVisibility(View.GONE);
        });
        mTvRegister2.setOnClickListener(v -> {
            mLayout2.setVisibility(View.GONE);
        });
    }

    @Override
    protected void initData() {

        mRadioGroup.setOnCheckedChangeListener((group, checkedId) -> {
            RadioButton rb = findViewById(checkedId);
            LogUtils.e(rb.getText().toString());
        });

        final List<CommonItem> data = DataServer.getCommonData(20);
        final DoctorListAdapter2 adapter = new DoctorListAdapter2(data);
//        final GridLayoutManager manager = new GridLayoutManager(this, 2);
        mRvList.setLayoutManager(new LinearLayoutManager(this));
        mRvList.setAdapter(adapter);

    }
}
