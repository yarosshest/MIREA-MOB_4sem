package com.example.mirea_mob_4sem.work4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout

class Work423 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val constraintLayout = ConstraintLayout(this)
        val textView = TextView(this)
        textView.text = "Hello Android!"
        textView.textSize = 30f
        textView.setBackgroundColor(-0x17150a)
        textView.gravity = Gravity.CENTER
        val layoutParams =
            ConstraintLayout.LayoutParams(ConstraintLayout.LayoutParams.MATCH_CONSTRAINT, 200)
        layoutParams.leftToLeft = ConstraintLayout.LayoutParams.PARENT_ID
        layoutParams.rightToRight = ConstraintLayout.LayoutParams.PARENT_ID
        layoutParams.topToTop = ConstraintLayout.LayoutParams.PARENT_ID
        layoutParams.bottomToBottom = ConstraintLayout.LayoutParams.PARENT_ID
        textView.layoutParams = layoutParams
        constraintLayout.addView(textView)
        setContentView(constraintLayout)
    }
}