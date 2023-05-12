package com.example.mirea_mob_4sem.work8

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.mirea_mob_4sem.R


class Work82 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_work82)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .add(R.id.fragment_container_view, Fragment81::class.java, null)
                .commit()
        }
    }
}