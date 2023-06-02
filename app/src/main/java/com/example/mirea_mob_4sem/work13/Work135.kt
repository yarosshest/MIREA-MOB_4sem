package com.example.mirea_mob_4sem.work13


import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.mirea_mob_4sem.R
import java.io.FileInputStream
import java.io.FileOutputStream
import java.io.IOException


class Work135 : AppCompatActivity() {
    private val FILE_NAME = "content.txt"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_work135)
    }

    // сохранение файла
    fun saveText(view: View?) {
        var fos: FileOutputStream? = null
        try {
            val textBox = findViewById<EditText>(R.id.editor)
            val text = textBox.text.toString()
            fos = openFileOutput(FILE_NAME, MODE_PRIVATE)
            fos.write(text.toByteArray())
            Toast.makeText(this, "Файл сохранен", Toast.LENGTH_SHORT).show()
        } catch (ex: IOException) {
            Toast.makeText(this, ex.message, Toast.LENGTH_SHORT).show()
        } finally {
            try {
                fos?.close()
            } catch (ex: IOException) {
                Toast.makeText(this, ex.message, Toast.LENGTH_SHORT).show()
            }
        }
    }

    // открытие файла
    fun openText(view: View?) {
        var fin: FileInputStream? = null
        val textView = findViewById<TextView>(R.id.text)
        try {
            fin = openFileInput(FILE_NAME)
            val bytes = ByteArray(fin.available())
            fin.read(bytes)
            val text = String(bytes)
            textView.text = text
        } catch (ex: IOException) {
            Toast.makeText(this, ex.message, Toast.LENGTH_SHORT).show()
        } finally {
            try {
                fin?.close()
            } catch (ex: IOException) {
                Toast.makeText(this, ex.message, Toast.LENGTH_SHORT).show()
            }
        }
    }
}