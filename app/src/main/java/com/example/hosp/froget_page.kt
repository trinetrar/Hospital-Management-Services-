package com.example.hosp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class froget_page : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_froget_page)
        val froButtn=findViewById<Button>(R.id.resetButton)
        froButtn.setOnClickListener {
            val intnt = Intent(this, paythanks::class.java)
            startActivity(intnt)
        }
    }
}