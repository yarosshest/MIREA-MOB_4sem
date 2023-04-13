package com.example.mirea_mob_4sem.work5

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.mirea_mob_4sem.R


class Work52 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_work52)
        val editText = findViewById<EditText>(R.id.f_input)

        editText.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(s: Editable) {}
            override fun beforeTextChanged(
                s: CharSequence, start: Int,
                count: Int, after: Int
            ) {
            }

            override fun onTextChanged(s: CharSequence, start: Int, before: Int, count: Int) {
                val editTextF = findViewById<EditText>(R.id.f_input)
                val editTextS = findViewById<EditText>(R.id.s_input)
                val text = editTextS.text
                text.replace(0, text.length, editTextF.text)
                editTextS.setText(text)
            }
        })
    }

}