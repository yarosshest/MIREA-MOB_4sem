package com.example.mirea_mob_4sem

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RelativeLayout
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val relativeLayout = RelativeLayout(this)
        val editText = EditText(this)
        editText.id = EditText.generateViewId()
        val button = Button(this)
        button.setText("Отправить")
        val editTextParams = RelativeLayout.LayoutParams(
            RelativeLayout.LayoutParams.MATCH_PARENT,
            RelativeLayout.LayoutParams.WRAP_CONTENT
        )
        editTextParams.addRule(RelativeLayout.CENTER_IN_PARENT)
        relativeLayout.addView(editText, editTextParams)
        val buttonParams = RelativeLayout.LayoutParams(
            RelativeLayout.LayoutParams.WRAP_CONTENT,
            RelativeLayout.LayoutParams.WRAP_CONTENT
        )
        buttonParams.addRule(RelativeLayout.BELOW, editText.id)
        buttonParams.addRule(RelativeLayout.ALIGN_RIGHT, editText.id)
        relativeLayout.addView(button, buttonParams)
        setContentView(relativeLayout)
    }
}