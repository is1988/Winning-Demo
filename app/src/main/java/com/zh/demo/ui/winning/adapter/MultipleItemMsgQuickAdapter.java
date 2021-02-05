package com.zh.demo.ui.winning.adapter;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.chad.library.adapter.base.BaseMultiItemQuickAdapter;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.zh.demo.R;
import com.zh.demo.ui.winning.entity.DataServer;
import com.zh.demo.ui.winning.entity.QuickMultipleEntity;

import java.util.List;

/**
 * https://github.com/CymChad/BaseRecyclerViewAdapterHelper
 * modify by AllenCoder
 */
public class MultipleItemMsgQuickAdapter extends BaseMultiItemQuickAdapter<QuickMultipleEntity, BaseViewHolder> {

    public MultipleItemMsgQuickAdapter(List<QuickMultipleEntity> data) {
        super(data);
        addItemType(QuickMultipleEntity.LEFT_TEXT, R.layout.winning_left_text_item);
        addItemType(QuickMultipleEntity.LEFT_LIST, R.layout.winning_left_list_item);
        addItemType(QuickMultipleEntity.RIGHT_TEXT, R.layout.winning_right_text_item);
    }

    @Override
    protected void convert(@NonNull BaseViewHolder helper, QuickMultipleEntity item) {
        switch (helper.getItemViewType()) {
            case QuickMultipleEntity.LEFT_TEXT:
//                helper.setText(R.id.tv_left,);
                break;
            case QuickMultipleEntity.LEFT_LIST:
//                helper.setText(R.id.tv_left,);
                setDataList(helper);
                break;
            case QuickMultipleEntity.RIGHT_TEXT:
//                helper.setText(R.id.tv_left,);
                break;
            default:
                break;
        }
    }

    private void setDataList(BaseViewHolder helper) {
        RecyclerView mRvList =  helper.getView(R.id.rv_list);

        HomeMsgTypeListAdapter adapter = new HomeMsgTypeListAdapter(DataServer.getMsgItemItemData());
        mRvList.setLayoutManager(new LinearLayoutManager(getContext()));
        mRvList.setAdapter(adapter);
    }

}
