package com.example.mirea_mob_4sem.work13


import android.content.Intent
import android.database.Cursor
import android.database.sqlite.SQLiteDatabase
import android.os.Bundle
import android.view.View
import android.widget.AdapterView.OnItemClickListener
import android.widget.ListView
import android.widget.SimpleCursorAdapter
import androidx.appcompat.app.AppCompatActivity
import com.example.mirea_mob_4sem.R


class Work139 : AppCompatActivity() {

    private lateinit var userList: ListView
    private lateinit var DatabaseHelper: DatabaseHelper2
    private lateinit var db: SQLiteDatabase
    private lateinit var userCursor: Cursor
    private lateinit var userAdapter: SimpleCursorAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_work139)

        userList = findViewById<ListView>(R.id.list)
        userList.onItemClickListener =
            OnItemClickListener { parent, view, position, id ->
                val intent = Intent(applicationContext, UserActivity::class.java)
                intent.putExtra("id", id)
                startActivity(intent)
            }

        DatabaseHelper = DatabaseHelper2(applicationContext)
        // создаем базу данных
        DatabaseHelper.create_db()
    }

    override fun onResume() {
        super.onResume()
        // открываем подключение
        db = DatabaseHelper.open()
        //получаем данные из бд в виде курсора
        userCursor = db.rawQuery("select * from " + DatabaseHelper2.TABLE, null)
        // определяем, какие столбцы из курсора будут выводиться в ListView
        val headers = arrayOf<String>(DatabaseHelper2.COLUMN_NAME, DatabaseHelper2.COLUMN_YEAR)
        // создаем адаптер, передаем в него курсор
        userAdapter = SimpleCursorAdapter(
            this, android.R.layout.two_line_list_item,
            userCursor, headers, intArrayOf(android.R.id.text1, android.R.id.text2), 0
        )
        userList.adapter = userAdapter
    }

    // по нажатию на кнопку запускаем UserActivity для добавления данных
    fun add(view: View?) {
        val intent = Intent(this, UserActivity::class.java)
        startActivity(intent)
    }

    override fun onDestroy() {
        super.onDestroy()
        // Закрываем подключение и курсор
        db.close()
        userCursor.close()
    }
}