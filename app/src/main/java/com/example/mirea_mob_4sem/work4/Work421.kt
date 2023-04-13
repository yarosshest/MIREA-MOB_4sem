package com.example.mirea_mob_4sem.work4

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.mirea_mob_4sem.R


class Work421 : AppCompatActivity() {
    private var clicks : Int = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_work421)
        val plusButtonView = findViewById<View>(R.id.plus_button)
        val minusButtonView = findViewById<View>(R.id.minus_button)
        val clicksText = findViewById<TextView>(R.id.clicksText)
        val plusButton: Button = plusButtonView.findViewById(R.id.clickBtn)
        val minusButton: Button = minusButtonView.findViewById(R.id.clickBtn)
        plusButton.setText("+")
        minusButton.setText("-")
        plusButton.setOnClickListener { _ ->
            clicks++
            clicksText.text = "$clicks Clicks"
        }
        minusButton.setOnClickListener { _ ->
            clicks--
            clicksText.text = "$clicks Clicks"
        }
    }


}