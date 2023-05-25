package com.example.mirea_mob_4sem.work9


import android.os.Bundle
import android.view.View
import android.widget.AdapterView.OnItemClickListener
import android.widget.ArrayAdapter
import android.widget.EditText
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity
import com.example.mirea_mob_4sem.R
import java.util.Collections


class Work94 : AppCompatActivity() {

    var users = ArrayList<String>()
    var selectedUsers = ArrayList<String>()
    var adapter: ArrayAdapter<String>? = null
    var usersList: ListView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_work94)

        Collections.addAll<String>(users, "Tom", "Bob", "Sam", "Alice")

        usersList = findViewById<View>(R.id.usersList) as ListView?

        adapter = ArrayAdapter<Any?>(this, android.R.layout.simple_list_item_multiple_choice, users).toString()


        usersList?.adapter = adapter

        usersList?.onItemClickListener = OnItemClickListener { parent, v, position, id ->
            val user: String = adapter.getItem(position)
            if (usersList.isItemChecked(position)) selectedUsers.add(user) else selectedUsers.remove(
                user
            )
        }
    }

    fun add(view: View?) {
        val userName = findViewById<EditText>(R.id.userName)
        val user = userName.text.toString()
        if (!user.isEmpty()) {
            adapter.add(user)
            userName.setText("")
            adapter.notifyDataSetChanged()
        }
    }

    fun remove(view: View?) {
        // получаем и удаляем выделенные элементы
        for (i in 0 until selectedUsers.size()) {
            adapter.remove(selectedUsers.get(i))
        }
        // снимаем все ранее установленные отметки
        usersList.clearChoices()
        // очищаем массив выбраных объектов
        selectedUsers.clear()
        adapter.notifyDataSetChanged()
    }
}