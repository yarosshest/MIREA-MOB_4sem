package com.example.mirea_mob_4sem.work7

import android.R.id.message
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.mirea_mob_4sem.MainActivity
import com.example.mirea_mob_4sem.R


class Work78 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_work78)

        val randomNum = (0..100).random()

        val textView = findViewById<TextView>(R.id.textView)

        textView.text = randomNum.toString()

    }

    fun transition(v : View){
        val data = Intent()
        val textView = findViewById<TextView>(R.id.textView)
        val message = textView.text.toString()

        data.putExtra("result", message)
        setResult(RESULT_OK, data)
        finish()
    }
}