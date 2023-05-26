package com.example.mirea_mob_4sem.work11

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.mirea_mob_4sem.R

class Work11Main : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_work11_main)
    }

    fun transition(v : View){
        val work = v.tag.toString()
        val c = Class.forName(work)
        val intent = Intent(this, c)
        startActivity(intent)
    }
}