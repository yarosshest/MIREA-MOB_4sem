package com.example.mirea_mob_4sem.work6

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.mirea_mob_4sem.R


class Work64 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val res = resources
        val languages = res.getStringArray(R.array.languages)
        var langs = ""
        for (lang in languages) {
            langs += "$lang "
        }
        val textView = TextView(this)
        textView.text = langs
        textView.textSize = 28f
        setContentView(textView)
    }
}