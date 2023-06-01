package com.example.mirea_mob_4sem.work12

import android.os.Bundle
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.example.mirea_mob_4sem.R


class Work124 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_work124)

        val img = findViewById<ImageView>(R.id.animationView)
        // определим для ImageView какое-нибудь изображение
        img.setImageResource(R.drawable.columbia)
        // создаем анимацию
        // создаем анимацию
        val animation: Animation = AnimationUtils.loadAnimation(this, R.anim.common_animation)
        // запуск анимации
        img.startAnimation(animation)
    }
}