package com.example.mirea_mob_4sem.work7

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.mirea_mob_4sem.R


class Work711 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_work79)

        val button = findViewById<Button>(R.id.button)
        button.text = "Перейтик к 1 активити"
        button.setOnClickListener {
            val intent = Intent(this, Work79::class.java)
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_SINGLE_TOP)
            startActivity(intent)
        }
    }
}