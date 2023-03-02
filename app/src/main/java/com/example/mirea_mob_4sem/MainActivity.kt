package com.example.mirea_mob_4sem

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
     private lateinit var button: Button
    private lateinit var editText: EditText


    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button = findViewById(R.id.button)
        editText = findViewById(R.id.inputText)
        button.setOnClickListener{
            val intent = Intent(this@MainActivity, MainActivity2::class.java)
            intent.putExtra("text", editText.text.toString())
            startActivity(intent)
        }
    }
}