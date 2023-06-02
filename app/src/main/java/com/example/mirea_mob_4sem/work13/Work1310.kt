package com.example.mirea_mob_4sem.work13

import android.database.Cursor
import android.database.SQLException
import android.database.sqlite.SQLiteDatabase
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.EditText
import android.widget.FilterQueryProvider
import android.widget.ListView
import android.widget.SimpleCursorAdapter
import androidx.appcompat.app.AppCompatActivity
import com.example.mirea_mob_4sem.R


class Work1310 : AppCompatActivity() {

    private lateinit var userList: ListView
    private lateinit var sqlHelper: DatabaseHelper3
    private lateinit var db: SQLiteDatabase
    private lateinit var userCursor: Cursor
    private lateinit var userAdapter: SimpleCursorAdapter
    private lateinit var userFilter: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_work1310)

        userList = findViewById(R.id.userList)
        userFilter = findViewById(R.id.userFilter)

        sqlHelper = DatabaseHelper3(applicationContext)
        // создаем базу данных
        sqlHelper.create_db()
    }

    override fun onResume() {
        super.onResume()
        try {
            db = sqlHelper.open()
            userCursor = db.rawQuery("select * from " + DatabaseHelper3.TABLE, null)
            val headers = arrayOf<String>(DatabaseHelper3.COLUMN_NAME, DatabaseHelper3.COLUMN_YEAR)
            userAdapter = SimpleCursorAdapter(
                this, android.R.layout.two_line_list_item,
                userCursor, headers, intArrayOf(android.R.id.text1, android.R.id.text2), 0
            )

            // если в текстовом поле есть текст, выполняем фильтрацию
            // данная проверка нужна при переходе от одной ориентации экрана к другой
            if (!userFilter.text.toString()
                    .isEmpty()
            ) userAdapter.filter.filter(userFilter.text.toString())

            // установка слушателя изменения текста
            userFilter.addTextChangedListener(object : TextWatcher {
                override fun afterTextChanged(s: Editable) {}
                override fun beforeTextChanged(
                    s: CharSequence,
                    start: Int,
                    count: Int,
                    after: Int
                ) {
                }

                // при изменении текста выполняем фильтрацию
                override fun onTextChanged(s: CharSequence, start: Int, before: Int, count: Int) {
                    userAdapter.filter.filter(s.toString())
                }
            })

            // устанавливаем провайдер фильтрации
            userAdapter.filterQueryProvider = FilterQueryProvider { constraint ->
                if (constraint == null || constraint.isEmpty()) {
                    db.rawQuery("select * from " + DatabaseHelper3.TABLE, null)
                } else {
                    db.rawQuery(
                        "select * from " + DatabaseHelper3.TABLE + " where " +
                                DatabaseHelper3.COLUMN_NAME + " like ?",
                        arrayOf<String>("%$constraint%")
                    )
                }
            }
            userList.adapter = userAdapter
        } catch (_: SQLException) {
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        // Закрываем подключение и курсор
        db.close()
        userCursor.close()
    }
}