package com.example.mirea_mob_4sem.work12


import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.mirea_mob_4sem.R


class Work125 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_work125)
    }
    fun click(v: View) {
        val i = Intent(this, MediaService::class.java)
        if (v.id == R.id.start) {
            startService(i)
        } else {
            stopService(i)
        }
    }
}