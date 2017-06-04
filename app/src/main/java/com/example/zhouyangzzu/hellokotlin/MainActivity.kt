package com.example.zhouyangzzu.hellokotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.view.PagerAdapter
import android.support.v4.view.ViewPager
import android.view.View
import com.tmall.ultraviewpager.UltraViewPager

class MainActivity : AppCompatActivity(){

    var mBtnMineStock : View?= null
    var mBtnMineNews : View?= null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initUltraViewPager()
    }

    fun initUltraViewPager(){

        mBtnMineStock = findViewById(R.id.btn_mine_stock)
        mBtnMineNews = findViewById(R.id.btn_mine_news)

        var vp: UltraViewPager = findViewById(R.id.ultra_viewpager) as UltraViewPager
        vp.setScrollMode(UltraViewPager.ScrollMode.HORIZONTAL)

        var adapter: PagerAdapter = MyPageAdapter(this)
        vp.adapter = adapter

        vp.setOnPageChangeListener(object : ViewPager.OnPageChangeListener{
            override fun onPageSelected(p0: Int) {
                when(p0){
                    0->selectPage(0)
                    1->selectPage(1)
                }
            }

            override fun onPageScrollStateChanged(p0: Int) {
            }

            override fun onPageScrolled(p0: Int, p1: Float, p2: Int) {
            }
        })

        mBtnMineStock!!.setOnClickListener{
            vp!!.setCurrentItem(0)
            selectPage(0)
        }

        mBtnMineNews!!.setOnClickListener{
            vp!!.setCurrentItem(1)
            selectPage(1)
        }
    }

    fun selectPage(index:Int){
        mBtnMineStock!!.isSelected = false
        mBtnMineNews!!.isSelected = false

        when(index){
            0->mBtnMineStock!!.isSelected = true
            1->mBtnMineNews!!.isSelected = true
        }
    }


}
