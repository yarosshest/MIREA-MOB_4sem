package com.example.mirea_mob_4sem.work3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.mirea_mob_4sem.R

class Work32 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_work32)

        val textView = findViewById<TextView>(R.id.textview)
        textView.text = "Hello from code!"
    }
}