package com.example.mirea_mob_4sem.work13

import android.database.Cursor
import android.database.sqlite.SQLiteDatabase
import android.os.Bundle
import android.widget.ListView
import android.widget.SimpleCursorAdapter
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.mirea_mob_4sem.R


class Work137 : AppCompatActivity() {

    private lateinit var userList: ListView
    private lateinit var header: TextView
    private lateinit var databaseHelper: DatabaseHelper1
    private lateinit var db: SQLiteDatabase
    private lateinit var userCursor: Cursor
    private lateinit var userAdapter: SimpleCursorAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_work137)

        header = findViewById(R.id.header);
        userList = findViewById(R.id.list);

        databaseHelper = DatabaseHelper1(applicationContext);
    }

    override fun onResume() {
        super.onResume()
        // открываем подключение
        db = databaseHelper.getReadableDatabase()

        //получаем данные из бд в виде курсора
        userCursor = db.rawQuery("select * from " + DatabaseHelper1.TABLE, null)
        // определяем, какие столбцы из курсора будут выводиться в ListView
        val headers = arrayOf<String>(DatabaseHelper1.COLUMN_NAME, DatabaseHelper1.COLUMN_YEAR)
        // создаем адаптер, передаем в него курсор
        userAdapter = SimpleCursorAdapter(
            this, android.R.layout.two_line_list_item,
            userCursor, headers, intArrayOf(android.R.id.text1, android.R.id.text2), 0
        )
        header.setText("Найдено элементов: " + userCursor.getCount())
        userList.setAdapter(userAdapter)
    }

    override fun onDestroy() {
        super.onDestroy()
        // Закрываем подключение и курсор
        db.close()
        userCursor.close()
    }
}