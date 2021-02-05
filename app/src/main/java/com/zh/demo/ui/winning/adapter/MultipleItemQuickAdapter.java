package com.zh.demo.ui.winning.adapter;

import androidx.annotation.NonNull;

import com.chad.library.adapter.base.BaseMultiItemQuickAdapter;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.zh.demo.R;
import com.zh.demo.ui.winning.entity.QuickMultipleEntity;

import java.util.List;

/**
 * https://github.com/CymChad/BaseRecyclerViewAdapterHelper
 * modify by AllenCoder
 */
public class MultipleItemQuickAdapter extends BaseMultiItemQuickAdapter<QuickMultipleEntity, BaseViewHolder> {

    public MultipleItemQuickAdapter(List<QuickMultipleEntity> data) {
        super(data);
        addItemType(QuickMultipleEntity.TEXT, R.layout.item_text_view);
        addItemType(QuickMultipleEntity.IMG, R.layout.item_image_view);
        addItemType(QuickMultipleEntity.IMG_TEXT, R.layout.item_img_text_view);
    }

    @Override
    protected void convert(@NonNull BaseViewHolder helper, QuickMultipleEntity item) {
        switch (helper.getItemViewType()) {
            case QuickMultipleEntity.TEXT:
                helper.setText(R.id.tv, item.getContent());
                break;
            case QuickMultipleEntity.IMG_TEXT:
                switch (helper.getLayoutPosition() % 2) {
                    case 0:
                        helper.setImageResource(R.id.iv, R.drawable.animation_img1);
                        break;
                    case 1:
                        helper.setImageResource(R.id.iv, R.drawable.animation_img2);
                        break;
                    default:
                        break;
                }
                break;
            default:
                break;
        }
    }

}
