package com.example.mirea_mob_4sem.work3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Work31 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_work31)
        val textView = TextView(this)
        textView.text = "Hello World!"
        textView.textSize = 30f
        setContentView(textView)
    }
}