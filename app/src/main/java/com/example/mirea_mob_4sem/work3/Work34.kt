package com.example.mirea_mob_4sem.work3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout

class Work34 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val constraintLayout = ConstraintLayout(this)
        val textView = TextView(this)
        textView.text = "Hello from code!"
        textView.textSize = 30f

        val layoutParams = ConstraintLayout.LayoutParams(ConstraintLayout.LayoutParams.WRAP_CONTENT,
            ConstraintLayout.LayoutParams.WRAP_CONTENT)

        layoutParams.setMargins(50, 30, 50, 30)

        textView.layoutParams = layoutParams
        textView.setPadding(40, 40, 40, 40)
        constraintLayout.addView(textView)

        setContentView(constraintLayout)
    }
}