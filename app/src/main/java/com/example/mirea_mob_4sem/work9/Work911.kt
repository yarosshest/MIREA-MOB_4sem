package com.example.mirea_mob_4sem.work9

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.MultiAutoCompleteTextView
import android.widget.MultiAutoCompleteTextView.CommaTokenizer
import androidx.appcompat.app.AppCompatActivity
import com.example.mirea_mob_4sem.R


class Work911 : AppCompatActivity() {
    var cities = arrayOf("Москва", "Самара", "Вологда", "Волгоград", "Саратов", "Воронеж")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_work911)

        // Получаем ссылку на элемент AutoCompleteTextView в разметке
        val autoCompleteTextView = findViewById<MultiAutoCompleteTextView>(R.id.autocomplete)
        // Создаем адаптер для автозаполнения элемента MultiAutoCompleteTextView
        val adapter: ArrayAdapter<String> =
            ArrayAdapter(this, R.layout.textview, cities)
        autoCompleteTextView.setAdapter(adapter)
        // установка запятой в качестве разделителя
        autoCompleteTextView.setTokenizer(CommaTokenizer())
    }
}