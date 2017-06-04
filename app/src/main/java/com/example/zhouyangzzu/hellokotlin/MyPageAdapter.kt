package com.example.zhouyangzzu.hellokotlin

import android.content.Context
import android.support.v4.view.PagerAdapter
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout

/**
 * Created by zhouyangzzu on 2017/6/4.
 */

class MyPageAdapter (var mContext:Context): PagerAdapter(){


    override fun isViewFromObject(p0: View?, p1: Any?): Boolean {
        return p0 == p1
    }

    override fun getCount(): Int {
        return 2
    }

    override fun instantiateItem(container: ViewGroup?, position: Int): Any {

        var layoutId = 0
        when(position){
            0 -> layoutId = R.layout.layout_mine_stock
            1 -> layoutId = R.layout.layout_mine_news
        }

        var layout : LinearLayout = LayoutInflater.from(mContext).inflate(layoutId, null) as LinearLayout
        container!!.addView(layout)

        return layout
    }

    override fun destroyItem(container: ViewGroup?, position: Int, `object`: Any?) {
        container!!.removeView(`object` as View)
    }
}