package com.example.zhouyangzzu.hellokotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.view.PagerAdapter
import com.tmall.ultraviewpager.UltraViewPager

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initUltraViewPager()
    }

    fun initUltraViewPager(){
        var vp: UltraViewPager = findViewById(R.id.ultra_viewpager) as UltraViewPager
        vp.setScrollMode(UltraViewPager.ScrollMode.HORIZONTAL)

        var adapter: PagerAdapter = MyPageAdapter(this)
        vp.adapter = adapter

    }
}
