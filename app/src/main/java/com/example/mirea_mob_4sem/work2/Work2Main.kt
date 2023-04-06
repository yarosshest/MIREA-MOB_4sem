package com.example.mirea_mob_4sem.work2

import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.mirea_mob_4sem.R

class Work2Main : AppCompatActivity() {
    private lateinit var button: Button
    private lateinit var editText: EditText
    private lateinit var v_sdk: TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_work2_main)
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB){
            v_sdk = findViewById(R.id.text_sdk)
            v_sdk.text = "Your version SDK is good"
        }

        button = findViewById(R.id.button)
        editText = findViewById(R.id.inputText)
        button.setOnClickListener{
            val intent = Intent(this@Work2Main, Work2Second::class.java)
            intent.putExtra("text", editText.text.toString())
            startActivity(intent)
        }
    }
}