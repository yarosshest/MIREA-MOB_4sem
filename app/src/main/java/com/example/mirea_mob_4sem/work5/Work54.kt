package com.example.mirea_mob_4sem.work5

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout


class Work54 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val constraintLayout = ConstraintLayout(this)

        val textView = TextView(this)
        textView.setId(View.generateViewId())
        val textViewLayout = ConstraintLayout.LayoutParams(
            ConstraintLayout.LayoutParams.MATCH_CONSTRAINT,
            ConstraintLayout.LayoutParams.WRAP_CONTENT
        )
        textViewLayout.topToTop = ConstraintLayout.LayoutParams.PARENT_ID
        textViewLayout.leftToLeft = ConstraintLayout.LayoutParams.PARENT_ID
        textViewLayout.rightToRight = ConstraintLayout.LayoutParams.PARENT_ID
        textView.setLayoutParams(textViewLayout)
        constraintLayout.addView(textView)

        val editText = EditText(this)
        editText.setId(View.generateViewId())
        editText.setHint("Введите имя")
        val editTextLayout = ConstraintLayout.LayoutParams(
            ConstraintLayout.LayoutParams.MATCH_CONSTRAINT,
            ConstraintLayout.LayoutParams.WRAP_CONTENT
        )
        editTextLayout.topToBottom = textView.getId()
        editTextLayout.leftToLeft = ConstraintLayout.LayoutParams.PARENT_ID
        editTextLayout.rightToRight = ConstraintLayout.LayoutParams.PARENT_ID
        editText.setLayoutParams(editTextLayout)
        constraintLayout.addView(editText)

        val button = Button(this)
        button.setText("Ввод")
        val buttonLayout = ConstraintLayout.LayoutParams(
            ConstraintLayout.LayoutParams.WRAP_CONTENT, ConstraintLayout.LayoutParams.WRAP_CONTENT
        )
        buttonLayout.topToBottom = editText.getId()
        buttonLayout.leftToLeft = ConstraintLayout.LayoutParams.PARENT_ID
        button.setLayoutParams(buttonLayout)
        constraintLayout.addView(button)

        button.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                textView.setText("Добро пожаловать, " + editText.getText())
            }
        })

        setContentView(constraintLayout)
    }
}