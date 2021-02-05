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
public class MultipleItemMsgPersonalQuickAdapter extends BaseMultiItemQuickAdapter<QuickMultipleEntity, BaseViewHolder> {

    String arr[] = {"查询到您有规模待办事项，请您尽快处理！", "是否需要为您预约耳鼻喉科的张医生？","",
            "是否需要为您指引耳鼻喉科的位置？"};

    public MultipleItemMsgPersonalQuickAdapter(List<QuickMultipleEntity> data) {
        super(data);
        addItemType(QuickMultipleEntity.LEFT_TEXT, R.layout.winning_left_text_item);
        addItemType(QuickMultipleEntity.RIGHT_TEXT, R.layout.winning_right_text_item);
    }

    @Override
    protected void convert(@NonNull BaseViewHolder helper, QuickMultipleEntity item) {
        switch (helper.getItemViewType()) {
            case QuickMultipleEntity.LEFT_TEXT:
                helper.setText(R.id.tv_left, arr[helper.getAdapterPosition()]);
                break;
//            case QuickMultipleEntity.LEFT_LIST:
////                helper.setText(R.id.tv_left,);
//                setDataList(helper);
//                break;
            case QuickMultipleEntity.RIGHT_TEXT:
                helper.setText(R.id.tv_left,"需要");
                break;
            default:
                break;
        }
    }

    private void setDataList(BaseViewHolder helper) {
        RecyclerView mRvList = helper.getView(R.id.rv_list);

        HomeMsgTypeListAdapter adapter = new HomeMsgTypeListAdapter(DataServer.getMsgItemItemData());
        mRvList.setLayoutManager(new LinearLayoutManager(getContext()));
        mRvList.setAdapter(adapter);
    }

}
