package com.example.mirea_mob_4sem.work12

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.mirea_mob_4sem.R


class Work127 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_work127)
    }

    fun showDialog(v: View?) {
        val dialog = CustomDialogFragment()
        dialog.show(supportFragmentManager, "custom")
    }
}