package com.example.bunnython

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import kotlinx.android.synthetic.main.activity_fast_matching2.*
import kotlinx.android.synthetic.main.activity_main2.*
import kotlinx.android.synthetic.main.bottombar.*

class MainActivity2 : AppCompatActivity() {
    var currentPosition=0

    val handler= Handler(Looper.getMainLooper()){
        setPage()
        true
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        //어댑터 연결하기
        val adapter=ViewPagerAdapter()
        pager.adapter=adapter

        //버튼 클릭시 2page로
        radioButton2.setOnClickListener {
            currentPosition = 2
            pager.setCurrentItem(2, true)
        }
        radioButton3.setOnClickListener {
            currentPosition = 3
            pager.setCurrentItem(3, true)
        }
        radioButton4.setOnClickListener {
            currentPosition = 4
            pager.setCurrentItem(4, true)
        }
        radioButton1.setOnClickListener {
            currentPosition = 1
            pager.setCurrentItem(1, true)
        }
        radioButton0.setOnClickListener {
            currentPosition = 0
            pager.setCurrentItem(0, true)
        }
        val thread=Thread(PagerRunnable())
        thread.start()

        main_btn1.setOnClickListener {  //다음 액티비티로 전환
            startActivity(Intent(this, fast_matching1::class.java))
        }
        main_btn2.setOnClickListener {  //다음 액티비티로 전환
            startActivity(Intent(this, rsv_matching1::class.java))
        }

    }

    fun setPage(){
        if(currentPosition==5) currentPosition=0
        pager.setCurrentItem(currentPosition,true)
        currentPosition+=1
    }

    //2초 마다 페이지 넘기기
    inner class PagerRunnable:Runnable {
        override fun run() {
            while (true) {
                Thread.sleep(2000)
                handler.sendEmptyMessage(0)
            }
        }
    }
}