package com.example.mirea_mob_4sem.work13

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper


class DatabaseHelper1(context: Context) :
    SQLiteOpenHelper(context, DATABASE_NAME, null, SCHEMA) {
    override fun onCreate(db: SQLiteDatabase) {
        db.execSQL(
            "CREATE TABLE users (" + COLUMN_ID
                    + " INTEGER PRIMARY KEY AUTOINCREMENT," + COLUMN_NAME
                    + " TEXT, " + COLUMN_YEAR + " INTEGER);"
        )
        // добавление начальных данных
        db.execSQL(
            ("INSERT INTO " + TABLE + " (" + COLUMN_NAME
                    + ", " + COLUMN_YEAR + ") VALUES ('Том Смит', 1981);")
        )
    }

    override fun onUpgrade(db: SQLiteDatabase, oldVersion: Int, newVersion: Int) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE)
        onCreate(db)
    }

    companion object {
        private val DATABASE_NAME = "userstore.db" // название бд
        private val SCHEMA = 1 // версия базы данных
        val TABLE = "users" // название таблицы в бд

        // названия столбцов
        val COLUMN_ID = "_id"
        val COLUMN_NAME = "name"
        val COLUMN_YEAR = "year"
    }
}