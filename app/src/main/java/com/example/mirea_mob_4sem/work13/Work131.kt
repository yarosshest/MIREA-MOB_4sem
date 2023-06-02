package com.example.mirea_mob_4sem.work13

import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.mirea_mob_4sem.R


class Work131 : AppCompatActivity() {

    var user: User1 = User1("undefined", 0)
    private val userVariableKey = "USER_VARIABLE"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_work131)
    }

    // сохранение состояния
    override fun onSaveInstanceState(outState: Bundle) {
        outState.putSerializable(userVariableKey, user)
        super.onSaveInstanceState(outState)
    }

    // получение ранее сохраненного состояния
    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        // получаем объект User в переменную
        user = (savedInstanceState.getSerializable(userVariableKey) as User1?)!!
        val dataView = findViewById<TextView>(R.id.dataView)
        dataView.text = "Name: " + user.name + " Age: " + user.age
    }

    fun saveData(view: View?) {

        // получаем введенные данные
        val nameBox = findViewById<EditText>(R.id.nameBox)
        val yearBox = findViewById<EditText>(R.id.yearBox)
        val name = nameBox.text.toString()
        var age = 0 // значение по умолчанию, если пользователь ввел некорректные данные
        try {
            age = yearBox.text.toString().toInt()
        } catch (_: NumberFormatException) {
        }
        user = User1(name, age)
    }

    fun getData(view: View?) {

        // получаем сохраненные данные
        val dataView = findViewById<TextView>(R.id.dataView)
        dataView.text = "Name: " + user.name + " Age: " + user.age
    }
}