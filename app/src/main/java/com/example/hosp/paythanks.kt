package com.example.hosp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class paythanks : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_paythanks)
        val thanks = findViewById<Button>(R.id.closeButton)
        thanks.setOnClickListener {
            val intnt = Intent(this, doc_info::class.java)
            startActivity(intnt)
        }
    }
}