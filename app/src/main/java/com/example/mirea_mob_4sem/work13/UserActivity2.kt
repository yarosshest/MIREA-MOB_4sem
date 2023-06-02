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
import com.example.mirea_mob_4sem.MainActivity
import com.example.mirea_mob_4sem.R


class UserActivity2 : AppCompatActivity() {
    private lateinit var nameBox: EditText
    private lateinit var yearBox: EditText
    private lateinit var delButton: Button
    private var saveButton: Button? = null
    private lateinit var sqlHelper: DatabaseHelper2
    private lateinit var db: SQLiteDatabase
    private lateinit var userCursor: Cursor
    private var userId: Long = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user)
        nameBox = findViewById<EditText>(R.id.name)
        yearBox = findViewById<EditText>(R.id.year)
        delButton = findViewById<Button>(R.id.deleteButton)
        saveButton = findViewById<Button>(R.id.saveButton)
        sqlHelper = DatabaseHelper2(this)
        db = sqlHelper.open()
        val extras = intent.extras
        if (extras != null) {
            userId = extras.getLong("id")
        }
        // если 0, то добавление
        if (userId > 0) {
            // получаем элемент по id из бд
            userCursor = db.rawQuery(
                (("select * from " + DatabaseHelper2.TABLE).toString() + " where " +
                        DatabaseHelper2.COLUMN_ID).toString() + "=?",
                arrayOf<String>(userId.toString())
            )
            userCursor.moveToFirst()
            nameBox.setText(userCursor.getString(1))
            yearBox.setText(userCursor.getInt(2).toString())
            userCursor.close()
        } else {
            // скрываем кнопку удаления
            delButton.setVisibility(View.GONE)
        }
    }

    fun save(view: View?) {
        val cv = ContentValues()
        cv.put(DatabaseHelper2.COLUMN_NAME, nameBox.text.toString())
        cv.put(DatabaseHelper2.COLUMN_YEAR, yearBox.text.toString().toInt())
        if (userId > 0) {
            db.update(DatabaseHelper2.TABLE, cv, DatabaseHelper2.COLUMN_ID + "=" + userId, null)
        } else {
            db.insert(DatabaseHelper2.TABLE, null, cv)
        }
        goHome()
    }

    fun delete(view: View?) {
        db.delete(DatabaseHelper2.TABLE, "_id = ?", arrayOf<String>(userId.toString()))
        goHome()
    }

    private fun goHome() {
        // закрываем подключение
        db.close()
        // переход к главной activity
        val intent = Intent(this, MainActivity::class.java)
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_SINGLE_TOP)
        startActivity(intent)
    }
}