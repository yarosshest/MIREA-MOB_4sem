package com.example.mirea_mob_4sem.work6

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.mirea_mob_4sem.R

class Work62 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_work62)

        val str = getString(R.string.text62, "Kotlin")

        val textView = findViewById<TextView>(R.id.textView)
        textView.text = str
    }
}