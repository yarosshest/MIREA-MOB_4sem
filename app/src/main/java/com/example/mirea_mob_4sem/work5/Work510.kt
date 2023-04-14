package com.example.mirea_mob_4sem.work5

import android.graphics.Color.*
import android.os.Bundle
import android.view.View
import android.widget.Toast
import android.widget.ToggleButton
import androidx.appcompat.app.AppCompatActivity
import com.example.mirea_mob_4sem.R


class Work510 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_work510)
    }

    fun onToggleClicked(view: View) {

        val on = (view as ToggleButton).isChecked
        if (on) {
            Toast.makeText(this, "Ligth on", Toast.LENGTH_LONG).show()
            view.setBackgroundColor(WHITE)
        } else {
            Toast.makeText(this, "Ligth off!", Toast.LENGTH_LONG).show()
            view.setBackgroundColor(GRAY)
        }
    }
}