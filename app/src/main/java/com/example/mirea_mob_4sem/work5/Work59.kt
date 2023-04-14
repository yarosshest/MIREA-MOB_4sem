package com.example.mirea_mob_4sem.work5


import android.os.Bundle
import android.widget.CheckBox
import android.widget.CompoundButton
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.mirea_mob_4sem.R


class Work59 : AppCompatActivity() {
    private val checkedBoxes : ArrayList<String> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_work59)

        val enableJavaBox = findViewById<CheckBox>(R.id.java)
        enableJavaBox.setOnCheckedChangeListener{buttonView, isChecked ->
            onCheckedChanged(buttonView, isChecked)}

        val enableKotlinBox = findViewById<CheckBox>(R.id.kotlin)
        enableKotlinBox.setOnCheckedChangeListener{buttonView, isChecked ->
            onCheckedChanged(buttonView, isChecked)}
    }

    private fun onCheckedChanged(buttonView: CompoundButton?, isChecked: Boolean) {
        if (buttonView != null) {
            if (buttonView.text !in checkedBoxes && isChecked){
                checkedBoxes.add(buttonView.text as String)
            } else if(buttonView.text in checkedBoxes && !isChecked) {
                checkedBoxes.remove(buttonView.text as String)
            }

        var str = ""
        for ( i in checkedBoxes){
            str += "$i "
        }

        val selection = findViewById<TextView>(R.id.selection)
        selection.text = str
        }
    }


}