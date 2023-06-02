package com.example.mirea_mob_4sem.work13


import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.mirea_mob_4sem.R


class SettingsActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_settings3)

        supportFragmentManager
            .beginTransaction()
            .replace(R.id.settings_container, SettingsFragment3())
            .commit()
    }
}