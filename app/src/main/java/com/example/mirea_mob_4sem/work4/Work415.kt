package com.example.mirea_mob_4sem.work4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.widget.FrameLayout
import android.widget.TextView

class Work415 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val frameLayout = FrameLayout(this)
        val textView = TextView(this)
        textView.text = "Hello World!"
        val layoutParams = FrameLayout.LayoutParams(
            FrameLayout.LayoutParams.WRAP_CONTENT,
            FrameLayout.LayoutParams.WRAP_CONTENT
        )
        layoutParams.gravity = Gravity.CENTER_HORIZONTAL or Gravity.TOP
        textView.layoutParams = layoutParams
        textView.textSize = 26f
        frameLayout.addView(textView)
        setContentView(frameLayout)
    }
}