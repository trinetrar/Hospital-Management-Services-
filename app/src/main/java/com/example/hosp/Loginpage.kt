package com.example.hosp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView

class Loginpage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_loginpage)
        val loginbtn=findViewById<Button>(R.id.loginbtn)
        val frogorbtn=findViewById<TextView>(R.id.textView2)
        val regbtn=findViewById<Button>(R.id.Regesterbtn)
        val eopd=findViewById<Button>(R.id.Eopdbtn)
        loginbtn.setOnClickListener {
            val intnt=Intent(this,doc_info::class.java)
            startActivity(intnt)
        }
        regbtn.setOnClickListener {
            val intnt=Intent(this,regestartion_pg::class.java)
            startActivity(intnt)
        }
        eopd.setOnClickListener {
            val intnt=Intent(this,eopd_pg::class.java)
            startActivity(intnt)
            frogorbtn.setOnClickListener {
                val intnt=Intent(this,froget_page::class.java)
                startActivity(intnt)
            }
        }
    }
}