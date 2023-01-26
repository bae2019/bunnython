package com.example.bunnython

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_fast_matching6.*
import kotlinx.android.synthetic.main.bottombar.*

class fast_matching6 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fast_matching6)

        homebtn.setOnClickListener {
            startActivity(Intent(this, MainActivity2::class.java))
            finish()
        }
        arrbtn.setOnClickListener {
            startActivity(Intent(this, fast_matching7::class.java))
            finish()
        }
    }
}