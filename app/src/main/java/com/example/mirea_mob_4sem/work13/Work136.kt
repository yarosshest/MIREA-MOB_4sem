package com.example.mirea_mob_4sem.work13


import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.mirea_mob_4sem.R


class Work136 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_work136)
    }

    fun onClick(view: View?) {
        val db = baseContext.openOrCreateDatabase("app.db", MODE_PRIVATE, null)
        db.execSQL("CREATE TABLE IF NOT EXISTS users (name TEXT, age INTEGER, UNIQUE(name))")
        db.execSQL("INSERT OR IGNORE INTO users VALUES ('Tom Smith', 23), ('John Dow', 31);")
        val query = db.rawQuery("SELECT * FROM users;", null)
        val textView = findViewById<TextView>(R.id.textView)
        textView.text = ""
        while (query.moveToNext()) {
            val name = query.getString(0)
            val age = query.getInt(1)
            textView.append("Name: $name Age: $age\n")
        }
        query.close()
        db.close()
    }
}