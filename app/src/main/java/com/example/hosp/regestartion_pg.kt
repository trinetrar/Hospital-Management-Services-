package com.example.hosp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class regestartion_pg : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_regestartion_pg)
        val namelobj = findViewById<EditText>(R.id.name)
        val mobileobj = findViewById<EditText>(R.id.mobilnum)
        val emailobj = findViewById<EditText>(R.id.email)
       // val addobj = findViewById<EditText>(R.id.address)
        val passobj = findViewById<EditText>(R.id.pass)
        val button = findViewById<Button>(R.id.regbtn)
        val buttonlog=findViewById<Button>(R.id.logbtn)
        val buttoneopd=findViewById<Button>(R.id.eopdbutton)
        button.setOnClickListener {
            val stringname = namelobj.text.toString()
            val stringmobile = mobileobj.text.toString()
            val stringeemail = emailobj.text.toString()
           // val stingadd = addobj.text.toString()
            val stringpass = passobj.text.toString()

            val intobj = Intent(this, Loginpage::class.java)

            startActivity(intobj)
        }
               buttonlog.setOnClickListener {
                   val loginobj=Intent(this,Loginpage::class.java)
                   startActivity(loginobj)
               }
        buttoneopd.setOnClickListener {
            val eopobj=Intent(this,eopd_pg::class.java)

            startActivity(eopobj)
        }
    }
}
