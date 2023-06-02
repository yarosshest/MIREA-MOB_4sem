package com.example.mirea_mob_4sem.work13


import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.AdapterView.OnItemClickListener
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity
import com.example.mirea_mob_4sem.R


class Work1311 : AppCompatActivity() {

    private lateinit var userList: ListView
    private lateinit var arrayAdapter: ArrayAdapter<User4>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_work1311)

        userList = findViewById<ListView>(R.id.list)

        userList.onItemClickListener =
            OnItemClickListener { parent, view, position, id ->
                val user: User4? = arrayAdapter.getItem(position)
                if (user != null) {
                    val intent = Intent(applicationContext, UserActivity::class.java)
                    intent.putExtra("id", user.id)
                    startActivity(intent)
                }
            }
    }

    override fun onResume() {
        super.onResume()
        val adapter = DatabaseAdapter4(this)
        adapter.open()
        val users: List<User4> = adapter.users
        arrayAdapter = ArrayAdapter<User4>(this, android.R.layout.simple_list_item_1, users)
        userList.adapter = arrayAdapter
        adapter.close()
    }

    // по нажатию на кнопку запускаем UserActivity для добавления данных
    fun add(view: View?) {
        val intent = Intent(this, UserActivity::class.java)
        startActivity(intent)
    }
}