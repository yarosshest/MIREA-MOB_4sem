package com.example.mirea_mob_4sem.work7

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.SeekBar
import androidx.appcompat.app.AppCompatActivity
import com.example.mirea_mob_4sem.R
import com.example.mirea_mob_4sem.work7.Msg as Msg
import java.time.LocalDateTime

class Work73 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_work73)
    }

    fun transition(v : View){
        val seekBar = findViewById<SeekBar>(R.id.seekBar)
        val intent = Intent(this, Work74::class.java)

        val msg = Msg(seekBar.progress, LocalDateTime.now())
        intent.putExtra("msg", msg)
        startActivity(intent)
    }
}