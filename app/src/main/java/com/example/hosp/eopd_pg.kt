package com.example.hosp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.renderscript.Sampler.Value
import android.text.Editable
import android.text.TextWatcher
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.ListView
import androidx.appcompat.widget.AppCompatButton

class
eopd_pg : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_eopd_pg)
        val buttone=findViewById<Button>(R.id.prbtn)
        buttone.setOnClickListener {
            val intnt = Intent(this, doc_info::class.java)
            startActivity(intnt)
        }
        val user = arrayOf(
            "virat", "kohil", "mayank", "virat", "kohil", "mayank", "virat", "kohil", "mayank"

        )
        val arrayList = ArrayList<String>()
        val seracbt = findViewById<EditText>(R.id.edittext)
        val list = findViewById<ListView>(R.id.list_view)
        val arrayAdapter: ArrayAdapter<*>
        arrayAdapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, arrayList)
        list.adapter = arrayAdapter

        seracbt.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
            }

            override fun afterTextChanged(s: Editable?) {
                arrayList.clear()
                for (value in user) {
                    if (value.toLowerCase().startsWith(s.toString().toLowerCase())) {
                        arrayList.add(value)
                    }
                }
                arrayAdapter.notifyDataSetChanged()

            }


        })
        //second search code
        val users = arrayOf(
            "virat", "kohil", "mayank", "virat", "kohil", "mayank", "virat", "kohil", "mayank"

        )
        val arrayList1 = ArrayList<String>()
        val seracbtn = findViewById<EditText>(R.id.doctor)
        val listView = findViewById<ListView>(R.id.secondlist)

        val arrayAdapter1: ArrayAdapter<*>
        arrayAdapter1 = ArrayAdapter(this, android.R.layout.simple_list_item_1, arrayList1)
        listView.adapter = arrayAdapter

        seracbtn.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
            }

            override fun afterTextChanged(s: Editable?) {
                arrayList.clear()
                for (value in users) {
                    if (value.toLowerCase().startsWith(s.toString().toLowerCase())) {
                        arrayList.add(value)
                    }
                }
                arrayAdapter.notifyDataSetChanged()

            }


        })

    }
}
