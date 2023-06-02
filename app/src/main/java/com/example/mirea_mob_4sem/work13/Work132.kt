package com.example.mirea_mob_4sem.work13

import android.content.SharedPreferences
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.mirea_mob_4sem.R


class Work132 : AppCompatActivity() {
    private val PREFS_FILE = "Account"
    private val PREF_NAME = "Name"
    private lateinit var nameBox: EditText
    private lateinit var settings: SharedPreferences
    private lateinit var prefEditor: SharedPreferences.Editor

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_work132)

        nameBox = findViewById(R.id.nameBox)
        settings = getSharedPreferences(PREFS_FILE, MODE_PRIVATE)

        // получаем настройки

        val name = settings.getString(PREF_NAME, "")
        nameBox.setText(name)
    }

    override fun onPause() {
        super.onPause()
        val name: String = nameBox.text.toString()
        // сохраняем в настройках
        prefEditor = settings.edit()
        prefEditor.putString(PREF_NAME, name)
        prefEditor.apply()
    }

    fun saveName(view: View?) {
        // получаем введенное имя
        val nameBox = findViewById<EditText>(R.id.nameBox)
        val name = nameBox.text.toString()
        // сохраняем его в настройках
        val prefEditor = settings.edit()
        prefEditor.putString(PREF_NAME, name)
        prefEditor.apply()
    }

    fun getName(view: View?) {
        // получаем сохраненное имя
        val nameView = findViewById<TextView>(R.id.nameView)
        val name = settings.getString(PREF_NAME, "не определено")
        nameView.text = name
    }
}