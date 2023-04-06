package com.example.mirea_mob_4sem.work4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import android.widget.TextView
import com.example.mirea_mob_4sem.R

class Work44 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val linearLayout = LinearLayout(this);
        linearLayout.orientation = LinearLayout.VERTICAL
        val textView1 = TextView(this)
        textView1.text = "Hello"
        textView1.textSize = 30f
        linearLayout.addView(
            textView1,
            LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT, 0, 3f)
        )
        val textView2 = TextView(this)
        textView2.text = "Android"
        textView2.setBackgroundColor(0xFFBDBDBD.toInt())
        textView2.textSize = 30f
        linearLayout.addView(
            textView2,
            LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT, 0, 2f)
        )
        setContentView(linearLayout)
    }
}