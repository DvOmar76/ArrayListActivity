package com.example.arraylistactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    val names=ArrayList<String>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnSave.setOnClickListener {
            val name =edName.text.toString()
            names.add(name)
            edName.getText().clear()
        }
        btnShow.setOnClickListener {
            val number=edNumber.text.toString().toInt()
            textView.text= names[number-1]
            edNumber.getText().clear()

        }
    }
}