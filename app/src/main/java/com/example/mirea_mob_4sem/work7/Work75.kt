package com.example.mirea_mob_4sem.work7

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.SeekBar
import com.example.mirea_mob_4sem.R
import java.time.LocalDateTime
import com.example.mirea_mob_4sem.work7.MsgParce as Msg

class Work75 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_work75)
    }

    fun transition(v : View){
        val seekBar = findViewById<SeekBar>(R.id.seekBar)
        val intent = Intent(this, Work76::class.java)

        val msg = Msg(seekBar.progress, LocalDateTime.now())
        intent.putExtra("msg", msg)
        startActivity(intent)
    }
}