package com.example.mirea_mob_4sem.work5


import android.os.Bundle
import android.widget.TextView
import android.widget.TimePicker
import androidx.appcompat.app.AppCompatActivity
import com.example.mirea_mob_4sem.R


class Work514 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_work514)

        val timeTextView = findViewById<TextView>(R.id.timeTextView)
        val timePicker = findViewById<TimePicker>(R.id.timePicker)

        timePicker.setOnTimeChangedListener { view, hourOfDay, minute ->
            timeTextView.text = "Время: $hourOfDay:$minute"
        }
    }
}