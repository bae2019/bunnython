package com.example.bunnython

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_fast_matching2.*
import kotlinx.android.synthetic.main.bottombar.*


class fast_matching2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fast_matching2)

        var start = ""
        var end = ""
        if (intent.hasExtra("start")) {  //이전 액티비티에서 start end값 가져오기
            start = intent.getStringExtra("start").toString()
        } else {
            Toast.makeText(this, "Error!", Toast.LENGTH_SHORT).show()
        }
        if (intent.hasExtra("end")) {
            end = intent.getStringExtra("end").toString()
        } else {
            Toast.makeText(this, "Error!", Toast.LENGTH_SHORT).show()
        }

        edit_start_point2.setText(start)
        edit_end_point2.setText(end)

        var choice1Arr = arrayOf("~50m", "50m~100m", "100m~500m")
        var choice2Arr = arrayOf("2명", "3명", "4명")
        var choice3Arr = arrayOf("상관없음", "내나이 +-10", "내나이 +-20")
        var choice4Arr = arrayOf("상관없음", "계산할래요", "계산 싫어요")
        var choice5Arr = arrayOf("상관없음", "상의할래요", "맞출게요")

        var data1 = ""
        var data2 = ""
        var data3 = ""
        var data4 = ""
        var data5 = ""
/*
        val spinner1 = findViewById<Spinner>(R.id.choice_btn1)
        val spinner2 = findViewById<Spinner>(R.id.choice_btn2)
        val spinner3 = findViewById<Spinner>(R.id.choice_btn3)
        val spinner4 = findViewById<Spinner>(R.id.choice_btn4)
        val spinner5 = findViewById<Spinner>(R.id.choice_btn5)*/

        val adapter1 = ArrayAdapter(this, android.R.layout.simple_spinner_item, choice1Arr)
        val adapter2 = ArrayAdapter(this, android.R.layout.simple_spinner_item, choice2Arr)
        val adapter3 = ArrayAdapter(this, android.R.layout.simple_spinner_item, choice3Arr)
        val adapter4 = ArrayAdapter(this, android.R.layout.simple_spinner_item, choice4Arr)
        val adapter5 = ArrayAdapter(this, android.R.layout.simple_spinner_item, choice5Arr)

        choice_btn1.adapter = adapter1
        choice_btn2.adapter = adapter2
        choice_btn3.adapter = adapter3
        choice_btn4.adapter = adapter4
        choice_btn5.adapter = adapter5

        choice_btn1.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long) {  }
            override fun onNothingSelected(parent: AdapterView<*>?) {}
        }
        choice_btn2.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long) {  }
            override fun onNothingSelected(parent: AdapterView<*>?) {}
        }
        choice_btn3.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long) {  }
            override fun onNothingSelected(parent: AdapterView<*>?) {}
        }
        choice_btn4.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long) {  }
            override fun onNothingSelected(parent: AdapterView<*>?) {}
        }
        choice_btn5.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long) {  }
            override fun onNothingSelected(parent: AdapterView<*>?) {}
        }

        choice_btn6.setOnClickListener {  //다음 액티비티로 전환, start end값 넘기기
            var intent = Intent(this, fast_matching3::class.java)
            intent.putExtra("start", start)
            intent.putExtra("end", end)
            startActivity(intent)
        }

        homebtn.setOnClickListener {
            startActivity(Intent(this, MainActivity2::class.java))
            finish()
        }
    }
}