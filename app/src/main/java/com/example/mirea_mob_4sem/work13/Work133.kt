package com.example.mirea_mob_4sem.work13

import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.preference.PreferenceManager
import com.example.mirea_mob_4sem.R


class Work133 : AppCompatActivity() {
    private lateinit var settingsText: TextView
    private var enabled : Boolean = false
    private lateinit var login: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_work133)
        settingsText = findViewById(R.id.settingsText);
    }

    override fun onResume() {
        super.onResume()
        val prefs: SharedPreferences = PreferenceManager.getDefaultSharedPreferences(this)
        enabled = prefs.getBoolean("enabled", false)
        login = prefs.getString("login", "не установлено").toString()
        settingsText.text = login
        if (enabled) settingsText.visibility = View.VISIBLE else settingsText.visibility = View.INVISIBLE
    }

    fun setPrefs(view: View?) {
        val intent = Intent(this, SettingsActivity3::class.java)
        startActivity(intent)
    }
}