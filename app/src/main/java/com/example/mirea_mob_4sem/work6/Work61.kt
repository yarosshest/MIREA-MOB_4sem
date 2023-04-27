package com.example.mirea_mob_4sem.work6

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.mirea_mob_4sem.R

class Work61 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_work61)

        val textView = findViewById<TextView>(R.id.textView)
        textView.setText(R.string.text61)
    }
}