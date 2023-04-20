package com.example.mirea_mob_4sem.work5

import android.os.Bundle
import android.widget.DatePicker
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.mirea_mob_4sem.R


class Work513 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_work513)

        val dateTextView = findViewById<TextView>(R.id.dateTextView)
        val datePicker = findViewById<DatePicker>(R.id.datePicker)
        datePicker.init(
            2020, 2, 1
        ) { view, _, _, _ ->
            dateTextView.text = "Дата: " + view.dayOfMonth + "/" +
                    (view.month + 1) + "/" + view.year
        }
    }
}