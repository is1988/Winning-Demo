package com.zh.demo.ui.test;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.LinearLayout;

import androidx.annotation.Nullable;

/**
 * ———— author : 郑皓
 * ———— time : 2021/02/08   Monday
 * ———— desc :
 */
public class CustomInsetLayout extends LinearLayout {   

    public CustomInsetLayout(Context context) {
        super(context);
    }

    public CustomInsetLayout(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public CustomInsetLayout(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public CustomInsetLayout(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    @Override
    protected boolean fitSystemWindows(Rect insets) {
        insets.top = 0;
        return super.fitSystemWindows(insets);
    }
}
