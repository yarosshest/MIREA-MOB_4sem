package com.example.mirea_mob_4sem.work7

import android.os.Bundle
import android.widget.ProgressBar
import androidx.appcompat.app.AppCompatActivity
import com.example.mirea_mob_4sem.R

class Work72 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_work72)

        val progress = intent.getIntExtra("progress", 0)
        val progressBar = findViewById<ProgressBar>(R.id.progressBar)

        progressBar.progress = progress
    }
}