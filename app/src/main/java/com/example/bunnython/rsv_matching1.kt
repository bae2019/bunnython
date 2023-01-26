package com.example.bunnython

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.CalendarView
import android.widget.TextView
import kotlinx.android.synthetic.main.bottombar.*
import kotlinx.android.synthetic.main.toolbar2.*
import java.text.DateFormat
import java.text.SimpleDateFormat
import java.util.*

class rsv_matching1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rsv_matching1)

        val dayText: TextView = findViewById(R.id.day_text)
        val calendarView: CalendarView = findViewById(R.id.calendarView)

        val dateFormat: DateFormat = SimpleDateFormat("yyyy년MM월dd일")

        val date: Date = Date(calendarView.date)

        dayText.text = dateFormat.format(date)

        calendarView.setOnDateChangeListener { calendarView, year, month, dayOfMonth ->

            var day: String = "${year}년 ${month}월 ${dayOfMonth}일"

            dayText.text = day
        }

        homebtn.setOnClickListener {
            startActivity(Intent(this, MainActivity2::class.java))
            finish()
        }
        backbtn.setOnClickListener {
            startActivity(Intent(this, MainActivity2::class.java))
            finish()
        }
        sysicon.setOnClickListener {
            startActivity(Intent(this, setting::class.java))
            finish()
        }
    }
}