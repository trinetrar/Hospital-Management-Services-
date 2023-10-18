package com.example.hosp

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class doc_info : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_doc_info)
        val buttonone=findViewById<Button>(R.id.buttonBookAppointment)
        buttonone.setOnClickListener {
            val intnt = Intent(this, Payment_page::class.java)
            startActivity(intnt)
        }
        val navbtn=findViewById<ImageView>(R.id.navbutton)
        navbtn.setOnClickListener {
            val intnt = Intent(this, navigation::class.java)
            startActivity(intnt)
        }
    }
}