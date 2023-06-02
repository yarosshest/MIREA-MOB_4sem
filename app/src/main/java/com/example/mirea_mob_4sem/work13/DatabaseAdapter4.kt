package com.example.mirea_mob_4sem.work13

import android.annotation.SuppressLint
import android.content.ContentValues
import android.content.Context
import android.database.Cursor
import android.database.DatabaseUtils
import android.database.sqlite.SQLiteDatabase


class DatabaseAdapter4(context: Context) {
    private val dbHelper: DatabaseHelper4
    private var database: SQLiteDatabase? = null

    init {
        dbHelper = DatabaseHelper4(context.applicationContext)
    }

    fun open(): DatabaseAdapter4 {
        database = dbHelper.writableDatabase
        return this
    }

    fun close() {
        dbHelper.close()
    }

    private val allEntries: Cursor
        private get() {
            val columns = arrayOf<String>(
                DatabaseHelper4.COLUMN_ID,
                DatabaseHelper4.COLUMN_NAME,
                DatabaseHelper4.COLUMN_YEAR
            )
            return database!!.query(DatabaseHelper4.TABLE, columns, null, null, null, null, null)
        }
    val users: List<User4>
        @SuppressLint("Range")
        get() {
            val users: ArrayList<User4> = ArrayList<User4>()
            val cursor = allEntries
            while (cursor.moveToNext()) {
                val id = cursor.getInt(cursor.getColumnIndex(DatabaseHelper4.COLUMN_ID))
                val name = cursor.getString(cursor.getColumnIndex(DatabaseHelper4.COLUMN_NAME))
                val year = cursor.getInt(cursor.getColumnIndex(DatabaseHelper4.COLUMN_YEAR))
                users.add(User4(id.toLong(), name, year))
            }
            cursor.close()
            return users
        }
    val count: Long
        get() = DatabaseUtils.queryNumEntries(database, DatabaseHelper4.TABLE)

    @SuppressLint("Range")
    fun getUser(id: Long): User4? {
        var user: User4? = null
        val query = java.lang.String.format(
            "SELECT * FROM %s WHERE %s=?",
            DatabaseHelper4.TABLE,
            DatabaseHelper4.COLUMN_ID
        )
        val cursor = database!!.rawQuery(query, arrayOf(id.toString()))
        if (cursor.moveToFirst()) {
            val name = cursor.getString(cursor.getColumnIndex(DatabaseHelper4.COLUMN_NAME))
            val year = cursor.getInt(cursor.getColumnIndex(DatabaseHelper4.COLUMN_YEAR))
            user = User4(id, name, year)
        }
        cursor.close()
        return user
    }

    fun insert(user: User4): Long {
        val cv = ContentValues()
        cv.put(DatabaseHelper4.COLUMN_NAME, user.name)
        cv.put(DatabaseHelper4.COLUMN_YEAR, user.year)
        return database!!.insert(DatabaseHelper4.TABLE, null, cv)
    }

    fun delete(userId: Long): Long {
        val whereClause = "_id = ?"
        val whereArgs = arrayOf(userId.toString())
        return database!!.delete(DatabaseHelper4.TABLE, whereClause, whereArgs).toLong()
    }

    fun update(user: User4): Long {
        val whereClause: String = DatabaseHelper4.COLUMN_ID + "=" + user.id
        val cv = ContentValues()
        cv.put(DatabaseHelper4.COLUMN_NAME, user.name)
        cv.put(DatabaseHelper4.COLUMN_YEAR, user.year)
        return database!!.update(DatabaseHelper4.TABLE, cv, whereClause, null).toLong()
    }
}