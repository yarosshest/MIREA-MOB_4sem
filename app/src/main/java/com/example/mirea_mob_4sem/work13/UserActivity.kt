package com.example.mirea_mob_4sem.work13


import android.content.ContentValues
import android.content.Intent
import android.database.Cursor
import android.database.sqlite.SQLiteDatabase
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.example.mirea_mob_4sem.R


class UserActivity : AppCompatActivity() {
    private lateinit var nameBox: EditText
    private lateinit var yearBox: EditText
    private lateinit var delButton: Button
    private lateinit var saveButton: Button

    private lateinit var sqlHelper: DatabaseHelper1
    private lateinit var db: SQLiteDatabase
    private lateinit var userCursor: Cursor
    private var userId: Long = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user)
        nameBox = findViewById(R.id.name)
        yearBox = findViewById(R.id.year)
        delButton = findViewById(R.id.deleteButton)
        saveButton = findViewById(R.id.saveButton)
        sqlHelper = DatabaseHelper1(this)
        db = sqlHelper.writableDatabase
        val extras = intent.extras
        if (extras != null) {
            userId = extras.getLong("id")
        }
        // если 0, то добавление
        if (userId > 0) {
            // получаем элемент по id из бд
            userCursor = db.rawQuery(
                "select * from " + DatabaseHelper1.TABLE + " where " +
                        DatabaseHelper1.COLUMN_ID + "=?", arrayOf(userId.toString())
            )
            userCursor.moveToFirst()
            nameBox.setText(userCursor.getString(1))
            yearBox.setText(userCursor.getInt(2).toString())
            userCursor.close()
        } else {
            // скрываем кнопку удаления
            delButton.visibility = View.GONE
        }
    }

    fun save(view: View?) {
        val cv = ContentValues()
        cv.put(DatabaseHelper1.COLUMN_NAME, nameBox.text.toString())
        cv.put(DatabaseHelper1.COLUMN_YEAR, yearBox.text.toString().toInt())
        if (userId > 0) {
            db.update(DatabaseHelper1.TABLE, cv, DatabaseHelper1.COLUMN_ID + "=" + userId,
                null)
        } else {
            db.insert(DatabaseHelper1.TABLE, null, cv)
        }
        goHome()
    }

    fun delete(view: View?) {
        db.delete(DatabaseHelper1.TABLE, "_id = ?", arrayOf(userId.toString()))
        goHome()
    }

    private fun goHome() {
        // закрываем подключение
        db.close()
        // переход к главной activity
        val intent = Intent(this, Work138::class.java)
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_SINGLE_TOP)
        startActivity(intent)
    }
}