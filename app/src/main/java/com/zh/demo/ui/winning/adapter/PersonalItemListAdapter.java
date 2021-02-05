package com.zh.demo.ui.winning.adapter;

import android.view.View;

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
public class PersonalItemListAdapter extends BaseQuickAdapter<CommonItem, BaseViewHolder> {

    public PersonalItemListAdapter(@Nullable List<CommonItem> data) {
        super(R.layout.winning_personal_item, data);
    }

    @Override
    protected void convert(@NotNull BaseViewHolder helper, CommonItem data) {
        helper.setText(R.id.tv_name, data.getName());
        helper.setText(R.id.tv_time, data.getTime());

        if (0 == helper.getAdapterPosition()) {
            helper.getView(R.id.view1).setVisibility(View.INVISIBLE);
        } else if (getItemCount() == helper.getAdapterPosition() + 1) {
            helper.getView(R.id.view3).setVisibility(View.INVISIBLE);
        }
    }
}
