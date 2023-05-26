package com.example.mirea_mob_4sem.work9

import android.os.Bundle
import android.widget.AdapterView.OnItemClickListener
import android.widget.ArrayAdapter
import android.widget.GridView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.mirea_mob_4sem.R


class Work912 : AppCompatActivity() {

    var countries = arrayOf("Бразилия", "Аргентина", "Чили", "Колумбия", "Уругвай")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_work912)

        // получаем элемент GridView
        val countriesList = findViewById<GridView>(R.id.gridview)
        // создаем адаптер
        val adapter: ArrayAdapter<String> =
            ArrayAdapter(this, android.R.layout.simple_list_item_1, countries)
        countriesList.adapter = adapter

        val itemListener =
            OnItemClickListener { parent, _, position, _ ->
                Toast.makeText(
                    applicationContext, "Вы выбрали "
                            + parent.getItemAtPosition(position).toString(),
                    Toast.LENGTH_SHORT
                ).show()
            }
        countriesList.onItemClickListener = itemListener
    }
}