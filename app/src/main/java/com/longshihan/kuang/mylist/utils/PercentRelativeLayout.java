package com.longshihan.kuang.mylist.utils;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.RelativeLayout;

/**
 * The type Percent relative layout.
 *
 * @author Administrator
 * @time 2016 /7/19 0019 下午 9:55
 * @des $ {TODO}
 * @updateAuthor $Author$
 * @updateDate $Date$
 * @updateDes $ {TODO}
 */
public class PercentRelativeLayout extends RelativeLayout {
    /**
     * Instantiates a new Percent relative layout.
     *
     * @param context      the context
     * @param attrs        the attrs
     * @param defStyleAttr the def style attr
     */
    public PercentRelativeLayout(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    /**
     * Instantiates a new Percent relative layout.
     *
     * @param context the context
     * @param attrs   the attrs
     */
    public PercentRelativeLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    /**
     * Instantiates a new Percent relative layout.
     *
     * @param context the context
     */
    public PercentRelativeLayout(Context context) {
        super(context);
    }


    /**
     * 测量容器的宽高
     * @param widthMeasureSpec
     * @param heightMeasureSpec
     */
    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
    }

    /**
     * 用来对子控件进行布局
     * @param changed
     * @param l
     * @param t
     * @param r
     * @param b
     */
    @Override
    protected void onLayout(boolean changed, int l, int t, int r, int b) {
        super.onLayout(changed, l, t, r, b);
    }



}
