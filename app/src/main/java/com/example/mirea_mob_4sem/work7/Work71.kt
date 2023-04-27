package com.example.mirea_mob_4sem.work7


import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.SeekBar
import androidx.appcompat.app.AppCompatActivity
import com.example.mirea_mob_4sem.R
import java.time.LocalDateTime


class Work71 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_work71)
    }

    fun transition(v : View){
        val seekBar = findViewById<SeekBar>(R.id.seekBar)
        val intent = Intent(this, Work72::class.java)

        intent.putExtra("progress", seekBar.progress)
        startActivity(intent)
    }
}