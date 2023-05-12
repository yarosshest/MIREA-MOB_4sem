package com.example.mirea_mob_4sem.work8

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.mirea_mob_4sem.R


class Work83 : AppCompatActivity() ,Fragmet831.OnFragmentSendDataListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_work83)
    }

    override fun onSendData(data: String?) {
        (supportFragmentManager
            .findFragmentById(R.id.detailFragment) as Fragmet832?)?.setSelectedItem(data)
    }
}