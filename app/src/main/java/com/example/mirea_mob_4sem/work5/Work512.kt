package com.example.mirea_mob_4sem.work5

import android.os.Bundle
import android.view.View
import android.widget.RadioButton
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.mirea_mob_4sem.R


class Work512 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_work512)
    }

    fun onRadioButtonClicked(view: View) {
        val checked = (view as RadioButton).isChecked
        val selection = findViewById<TextView>(R.id.selection)
        when (view.getId()) {
            R.id.java -> if (checked) {
                selection.text = "Java"
            }
            R.id.kotlin -> if (checked) {
                selection.text = "Kotlin"
            }
        }
    }
}