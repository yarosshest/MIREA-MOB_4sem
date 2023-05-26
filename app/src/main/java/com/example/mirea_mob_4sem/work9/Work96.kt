package com.example.mirea_mob_4sem.work9

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ListView
import android.widget.Toast
import com.example.mirea_mob_4sem.R

class Work96 : AppCompatActivity() {
    var states = ArrayList<State>()
    var countriesList: ListView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_work96)
        setInitialData()
        // получаем элемент ListView
        countriesList = findViewById<View>(R.id.countriesList) as ListView?
        // создаем адаптер
        val work96StateAdapter = Work96StateAdapter(this, R.layout.work_95_list_item, states)
        // устанавливаем адаптер
        countriesList?.adapter = work96StateAdapter
        // слушатель выбора в списке
        val itemListener =
            AdapterView.OnItemClickListener { parent, v, position, id -> // получаем выбранный пункт
                val selectedState = parent.getItemAtPosition(position) as State
                Toast.makeText(
                    applicationContext, "Был выбран пункт " + selectedState.getName(),
                    Toast.LENGTH_SHORT
                ).show()
            }
        countriesList?.onItemClickListener = itemListener
    }

    private fun setInitialData() {
        states.add(State("Бразилия", "Бразилиа", R.drawable.brazilia))
        states.add(State("Аргентина", "Буэнос-Айрес", R.drawable.argentina))
        states.add(State("Колумбия", "Богота", R.drawable.columbia))
        states.add(State("Уругвай", "Монтевидео", R.drawable.uruguai))
        states.add(State("Чили", "Сантьяго", R.drawable.chile))
    }
}