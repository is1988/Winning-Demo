package com.zh.demo.ui.winning.adapter;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.zh.demo.R;
import com.zh.demo.ui.winning.entity.CommonItem;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

/**
 * ———— author : 郑皓
 * ———— time : 2021/02/05   Friday
 * ———— desc :
 */
public class DoctorListAdapter2 extends BaseQuickAdapter<CommonItem, BaseViewHolder> {

    public DoctorListAdapter2(@Nullable List<CommonItem> data) {
        super(R.layout.winning_doctor_item2, data);
    }

    @Override
    protected void convert(@NotNull BaseViewHolder helper, CommonItem data) {
        helper.setText(R.id.tv_name, data.getName());
    }
}
