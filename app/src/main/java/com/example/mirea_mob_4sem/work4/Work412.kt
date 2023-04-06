package com.example.mirea_mob_4sem.work4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TableLayout
import android.widget.TableRow
import android.widget.TextView

class Work412 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val tableLayout = TableLayout(this)

        val tableRow1 = TableRow(this)
        val textView1 = TextView(this)
        textView1.text = "Логин"
        tableRow1.addView(
            textView1, TableRow.LayoutParams(
                TableRow.LayoutParams.WRAP_CONTENT,
                TableRow.LayoutParams.WRAP_CONTENT, 0.5f
            )
        )
        val editText1 = EditText(this)
        tableRow1.addView(
            editText1, TableRow.LayoutParams(
                TableRow.LayoutParams.WRAP_CONTENT,
                TableRow.LayoutParams.WRAP_CONTENT, 1.0f
            )
        )

        val tableRow2 = TableRow(this)
        val textView2 = TextView(this)
        textView2.text = "Email"
        tableRow2.addView(
            textView2, TableRow.LayoutParams(
                TableRow.LayoutParams.WRAP_CONTENT,
                TableRow.LayoutParams.WRAP_CONTENT, 0.5f
            )
        )
        val editText2 = EditText(this)
        tableRow2.addView(
            editText2, TableRow.LayoutParams(
                TableRow.LayoutParams.WRAP_CONTENT,
                TableRow.LayoutParams.WRAP_CONTENT, 1f
            )
        )
        tableLayout.addView(tableRow1)
        tableLayout.addView(tableRow2)
        setContentView(tableLayout)
    }
}