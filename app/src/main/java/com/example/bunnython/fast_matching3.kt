package com.example.bunnython

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_fast_matching1.*
import kotlinx.android.synthetic.main.bottombar.*
import kotlinx.android.synthetic.main.toolbar1.*

class fast_matching3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fast_matching3)

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

        Handler(Looper.getMainLooper()).postDelayed(Runnable{
            var intent = Intent(this, fast_matching4::class.java)
            intent.putExtra("start", start)
            intent.putExtra("end", end)
            startActivity(intent)
            finish()
        }, 5000)

        homebtn.setOnClickListener {
            startActivity(Intent(this, MainActivity2::class.java))
            finish()
        }
        backbtn.setOnClickListener {
            startActivity(Intent(this, fast_matching2::class.java))
            finish()
        }
        sysicon.setOnClickListener {
            startActivity(Intent(this, setting::class.java))
            finish()
        }
    }
}