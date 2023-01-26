package com.example.bunnython

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_fast_matching4.*
import kotlinx.android.synthetic.main.activity_fast_matching4.next_btn
import kotlinx.android.synthetic.main.activity_fast_matching45.*
import kotlinx.android.synthetic.main.bottombar.*
import kotlinx.android.synthetic.main.toolbar1.*

class fast_matching4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fast_matching4)

        var start = ""
        var end = ""
        var comment = ""
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
        if (intent.hasExtra("com")) {
            comment = intent.getStringExtra("comment").toString()
        } else {
            Toast.makeText(this, "Error!", Toast.LENGTH_SHORT).show()
        }

        thistext.setText(comment)


        next_btn.setOnClickListener {  //다음 액티비티로 전환, start end값 넘기기
            var intent = Intent(this, fast_matching5::class.java)
            intent.putExtra("start", start)
            intent.putExtra("end", end)
            startActivity(intent)
        }
        homebtn.setOnClickListener {
            startActivity(Intent(this, MainActivity2::class.java))
            finish()
        }
        backbtn.setOnClickListener {
            startActivity(Intent(this, fast_matching3::class.java))
            finish()
        }
        sysicon.setOnClickListener {
            startActivity(Intent(this, setting::class.java))
            finish()
        }
    }
}