package com.example.mirea_mob_4sem.work9

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.example.mirea_mob_4sem.R


class Work914 : AppCompatActivity() {
    var states = ArrayList<State>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_work914)

        // начальная инициализация списка
        setInitialData()
        val recyclerView = findViewById<RecyclerView>(R.id.list)
        // определяем слушателя нажатия элемента в списке
        val stateClickListener: Work914StateAdapter.OnStateClickListener = object :
            Work914StateAdapter.OnStateClickListener {
            override fun onStateClick(state: State?, position: Int) {
                if (state != null) {
                    Toast.makeText(
                        applicationContext, "Был выбран пункт " + state.getName(),
                        Toast.LENGTH_SHORT
                    ).show()
                }
            }
        }
        // создаем адаптер
        val adapter = Work914StateAdapter(this, states, stateClickListener)
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