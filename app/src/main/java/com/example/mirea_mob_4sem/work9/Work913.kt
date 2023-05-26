package com.example.mirea_mob_4sem.work9

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.example.mirea_mob_4sem.R


class Work913 : AppCompatActivity() {

    var states = ArrayList<State>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_work913)

        // начальная инициализация списка
        setInitialData()
        val recyclerView = findViewById<RecyclerView>(R.id.list)
        // создаем адаптер
        val adapter = Work913StateAdapter(this, states)
        // устанавливаем для списка адаптер
        recyclerView.adapter = adapter
    }

    private fun setInitialData() {
        states.add(State("Бразилия", "Бразилиа", R.drawable.brazilia))
        states.add(State("Аргентина", "Буэнос-Айрес", R.drawable.argentina))
        states.add(State("Колумбия", "Богота", R.drawable.columbia))
        states.add(State("Уругвай", "Монтевидео", R.drawable.uruguai))
        states.add(State("Чили", "Сантьяго", R.drawable.chile))
    }
}