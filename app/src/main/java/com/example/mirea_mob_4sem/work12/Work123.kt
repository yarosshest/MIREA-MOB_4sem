package com.example.mirea_mob_4sem.work12

import android.graphics.drawable.AnimationDrawable
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.example.mirea_mob_4sem.R


class Work123 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_work123)

        val img = findViewById<ImageView>(R.id.animationView)
        // устанавливаем ресурс анимации
        img.setBackgroundResource(R.drawable.dvorf_animation)
        // получаем объект анимации
        val frameAnimation = img.background as AnimationDrawable
        // по нажатию на ImageView
        img.setOnClickListener { // запускаем анимацию
            frameAnimation.start()
        }
    }
}