package com.example.hosp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Payment_page : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_payment_page)
        val payButtn=findViewById<Button>(R.id.payButton)
        payButtn.setOnClickListener {
            val intnt = Intent(this, paythanks::class.java)
            startActivity(intnt)
        }
    }
}