package com.example.mirea_mob_4sem.work12

import android.os.Bundle
import android.widget.AdapterView.OnItemClickListener
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity
import com.example.mirea_mob_4sem.R


class Work128 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_work128)

        val phonesList = findViewById<ListView>(R.id.phonesList)
        val phones = ArrayList<String>()
        phones.add("Google Pixel")
        phones.add("Huawei P9")
        phones.add("LG G5")
        phones.add("Samsung Galaxy S8")

        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, phones)
        phonesList.adapter = adapter

        phonesList.onItemClickListener =
            OnItemClickListener { _, _, position, _ ->
                val selectedPhone = adapter.getItem(position)
                val dialog = CustomDialogFragment2()
                val args = Bundle()
                args.putString("phone", selectedPhone)
                dialog.arguments = args
                dialog.show(supportFragmentManager, "custom")
            }
    }
}