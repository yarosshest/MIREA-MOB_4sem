package com.example.mirea_mob_4sem.work5

import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.widget.Toast
import android.widget.ToggleButton
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout


class Work511 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val layout = ConstraintLayout(this)
        val layoutParams = ConstraintLayout.LayoutParams(
            ConstraintLayout.LayoutParams.WRAP_CONTENT,
            ConstraintLayout.LayoutParams.WRAP_CONTENT
        )
        val toggleButton = ToggleButton(this)
        toggleButton.textOff = "Выключено"
        toggleButton.textOn = "Включено"
        toggleButton.text = "Выключено"
        toggleButton.setOnClickListener { view ->
            val on = (view as ToggleButton).isChecked
            if (on) {
                Toast.makeText(applicationContext, "Свет включен", Toast.LENGTH_LONG).show()
                view.setBackgroundColor(Color.WHITE)
            } else {
                Toast.makeText(applicationContext, "Свет выключен!", Toast.LENGTH_LONG).show()
                view.setBackgroundColor(Color.GRAY)
            }
        }
        layoutParams.leftToLeft = ConstraintLayout.LayoutParams.PARENT_ID
        layoutParams.topToTop = ConstraintLayout.LayoutParams.PARENT_ID
        layout.addView(toggleButton)
        setContentView(layout)
    }
}