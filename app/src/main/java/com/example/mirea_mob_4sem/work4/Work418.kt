package com.example.mirea_mob_4sem.work4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.GridLayout

class Work418 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val gridLayout = GridLayout(this)

        gridLayout.rowCount = 3

        gridLayout.columnCount = 3
        for (i in 1..9) {
            val btn = Button(this)
            btn.text = i.toString()
            gridLayout.addView(btn)
        }
        setContentView(gridLayout)
    }
}