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


class Work138 : AppCompatActivity() {
    private lateinit var userList: ListView
    private lateinit var databaseHelper: DatabaseHelper1
    private lateinit var db: SQLiteDatabase
    private lateinit var userCursor: Cursor
    private lateinit var userAdapter: SimpleCursorAdapter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_work138)

        userList = findViewById(R.id.list)
        userList.onItemClickListener = OnItemClickListener { _, _, _, id ->
            val intent = Intent(applicationContext, UserActivity::class.java)
            intent.putExtra("id", id)
            startActivity(intent)
        }

        databaseHelper = DatabaseHelper1(applicationContext)
    }

    override fun onResume() {
        super.onResume()
        // открываем подключение
        db = databaseHelper.readableDatabase

        //получаем данные из бд в виде курсора
        userCursor = db.rawQuery("select * from " + DatabaseHelper1.TABLE, null)
        // определяем, какие столбцы из курсора будут выводиться в ListView
        val headers = arrayOf(DatabaseHelper1.COLUMN_NAME, DatabaseHelper1.COLUMN_YEAR)
        // создаем адаптер, передаем в него курсор
        userAdapter = SimpleCursorAdapter(
            this, android.R.layout.two_line_list_item,
            userCursor, headers, intArrayOf(android.R.id.text1, android.R.id.text2), 0
        )
        userList.setAdapter(userAdapter)
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