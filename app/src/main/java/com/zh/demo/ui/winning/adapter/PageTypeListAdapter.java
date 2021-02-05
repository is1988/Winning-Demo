package com.zh.demo.ui.winning.adapter;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.zh.demo.R;
import com.zh.demo.ui.winning.entity.PageType;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

/**
 * ———— author : 郑皓
 * ———— time : 2021/02/05   Friday
 * ———— desc :
 */
public class PageTypeListAdapter extends BaseQuickAdapter<PageType, BaseViewHolder> {

    public PageTypeListAdapter(@Nullable List<PageType> data) {
        super(R.layout.winning_page_type_item, data);
    }

    @Override
    protected void convert(@NotNull BaseViewHolder helper, PageType pageType) {
        helper.setText(R.id.tv_item, pageType.getName());
    }
}
