package com.example.mirea_mob_4sem.work7

import android.os.Bundle
import android.widget.ProgressBar
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.mirea_mob_4sem.R
import com.example.mirea_mob_4sem.work7.MsgParce as Msg

class Work76 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_work76)

        val msg = intent.getParcelableExtra<Msg>("msg") as Msg

        val textView = findViewById<TextView>(R.id.textView)
        textView.text = msg.time.toString()

        val progressBar = findViewById<ProgressBar>(R.id.progressBar)
        progressBar.progress = msg.value!!
    }
}