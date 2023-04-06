package com.example.mirea_mob_4sem.work4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.TypedValue
import android.widget.Button
import android.widget.GridLayout

class Work420 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val gridLayout = GridLayout(this)
        // количество строк
        // количество строк
        gridLayout.rowCount = 3
        // количество столбцов
        // количество столбцов
        gridLayout.columnCount = 3
        for (i in 1..3) {
            val btn = Button(this)
            btn.text = i.toString()
            gridLayout.addView(btn)
        }
        val btn4 = Button(this)
        btn4.text = "4"
        val layoutParams4 = GridLayout.LayoutParams()
        layoutParams4.columnSpec = GridLayout.spec(0, 2)
        layoutParams4.width = TypedValue.applyDimension(
            TypedValue.COMPLEX_UNIT_DIP, 180f,
            resources.displayMetrics
        ).toInt()
        gridLayout.addView(btn4, layoutParams4)
        val btn5 = Button(this)
        btn5.text = "5"
        val layoutParams5 = GridLayout.LayoutParams()
        layoutParams5.rowSpec = GridLayout.spec(1, 2)
        layoutParams5.height = TypedValue.applyDimension(
            TypedValue.COMPLEX_UNIT_DIP, 100f,
            resources.displayMetrics
        ).toInt()
        gridLayout.addView(btn5, layoutParams5)
        val btn6 = Button(this)
        btn6.text = "6"
        val btn7 = Button(this)
        btn7.text = "7"
        gridLayout.addView(btn6)
        gridLayout.addView(btn7)

        setContentView(gridLayout)
    }
}