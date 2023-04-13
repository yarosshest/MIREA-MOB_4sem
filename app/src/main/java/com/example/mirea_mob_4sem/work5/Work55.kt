package com.example.mirea_mob_4sem.work5

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.mirea_mob_4sem.R


class Work55 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_work55)
    }

    fun onClick(view: View?) {
        val toast = Toast.makeText(this, "Hello Android!", Toast.LENGTH_LONG)
        toast.show()
    }
}