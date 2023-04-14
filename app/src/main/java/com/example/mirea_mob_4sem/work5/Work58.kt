package com.example.mirea_mob_4sem.work5


import android.os.Bundle
import android.view.View
import android.widget.CheckBox
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.mirea_mob_4sem.R


class Work58 : AppCompatActivity() {
    private val checkedBoxes : ArrayList<String> = arrayListOf()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_work58)
    }

    fun onCheckboxClicked(view: View) {
        val language = view as CheckBox
        if (language.text !in checkedBoxes && language.isChecked){
            checkedBoxes.add(language.text as String)
        } else if(language.text in checkedBoxes && !language.isChecked) {
            checkedBoxes.remove(language.text as String)
        }


        var str = ""
        for ( i in checkedBoxes){
            str += "$i "
        }

        val selection = findViewById<TextView>(R.id.selection)
        selection.text = str
    }
}