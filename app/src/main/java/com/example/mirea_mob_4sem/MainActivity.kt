package com.example.mirea_mob_4sem

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var button: Button
    private lateinit var editText: EditText
    private lateinit var v_sdk: TextView


    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB){
            v_sdk = findViewById(R.id.text_sdk)
            v_sdk.text = "Your version SDK is good"
        }

        button = findViewById(R.id.button)
        editText = findViewById(R.id.inputText)
        button.setOnClickListener{
            val intent = Intent(this@MainActivity, MainActivity2::class.java)
            intent.putExtra("text", editText.text.toString())
            startActivity(intent)
        }
    }
}