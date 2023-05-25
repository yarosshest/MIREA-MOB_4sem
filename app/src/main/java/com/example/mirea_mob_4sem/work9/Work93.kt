package com.example.mirea_mob_4sem.work9

import android.os.Bundle
import android.widget.AdapterView.OnItemClickListener
import android.widget.ArrayAdapter
import android.widget.ListAdapter
import android.widget.ListView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.mirea_mob_4sem.R


class Work93 : AppCompatActivity() {
    var countries = arrayOf("Бразилия", "Аргентина", "Колумбия", "Чили", "Уругвай")


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_work93)

        val selection = findViewById<TextView>(R.id.selection)

        val countriesList = findViewById<ListView>(R.id.countriesList)

        val adapter: Any = ArrayAdapter<Any?>(
            this,
            android.R.layout.simple_list_item_multiple_choice, countries
        )

        countriesList.adapter = adapter as ListAdapter?

        countriesList.onItemClickListener =
            OnItemClickListener { parent, v, position, id ->
                val selected = countriesList.checkedItemPositions
                var selectedItems = ""
                for (i in countries.indices) {
                    if (selected[i]) selectedItems += countries[i] + ","
                }

                selection.text = "Выбрано: $selectedItems"
            }
    }
}