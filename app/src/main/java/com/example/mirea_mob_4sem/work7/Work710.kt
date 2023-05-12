package com.example.mirea_mob_4sem.work7

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.mirea_mob_4sem.R

class Work710 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_work79)

        val button = findViewById<Button>(R.id.button)
        button.text = "Перейтик к 3 активити"
        button.setOnClickListener {
            val intent = Intent(this, Work711::class.java)
            startActivity(intent)
        }
    }
}