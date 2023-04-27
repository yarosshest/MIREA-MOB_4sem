package com.example.mirea_mob_4sem.work7

import android.os.Bundle
import android.widget.ProgressBar
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.mirea_mob_4sem.R

class Work74 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_work74)

        val msg = intent.getSerializableExtra("msg") as Msg

        val textView = findViewById<TextView>(R.id.textView)
        textView.text = msg.time.toString()

        val progressBar = findViewById<ProgressBar>(R.id.progressBar)
        progressBar.progress = msg.value!!
    }
}