package com.zh.demo.ui.winning.adapter;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.zh.demo.R;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

/**
 * ———— author : 郑皓
 * ———— time : 2021/02/05   Friday
 * ———— desc :
 */
public class HomeMsgTypeListAdapter extends BaseQuickAdapter<String, BaseViewHolder> {

    public HomeMsgTypeListAdapter(@Nullable List<String> data) {
        super(R.layout.winning_left_list_item_item, data);
    }

    @Override
    protected void convert(@NotNull BaseViewHolder helper, String s) {
        helper.setText(R.id.tv_item,s);
    }
}
