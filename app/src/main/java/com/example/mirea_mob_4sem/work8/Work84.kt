package com.example.mirea_mob_4sem.work8

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mirea_mob_4sem.R

class Work84 : AppCompatActivity() ,Fragmet831.OnFragmentSendDataListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_work84)
    }

    override fun onSendData(data: String?) {
        (supportFragmentManager
            .findFragmentById(R.id.detailFragment) as Fragmet832?)?.setSelectedItem(data)
    }
}