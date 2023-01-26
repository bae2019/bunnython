package com.example.bunnython

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_fast_matching1.*
import kotlinx.android.synthetic.main.bottombar.*

class fast_matching1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fast_matching1)

        edit_next_btn.setOnClickListener {
            var intent = Intent(this, fast_matching2::class.java)
            var start = edit_start_point1.text.toString()
            var end = edit_end_point1.text.toString()
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