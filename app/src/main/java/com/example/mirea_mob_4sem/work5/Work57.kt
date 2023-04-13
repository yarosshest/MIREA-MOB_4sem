package com.example.mirea_mob_4sem.work5

import android.graphics.Color.*
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.mirea_mob_4sem.R
import com.google.android.material.snackbar.Snackbar


class Work57 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_work57)
    }

    fun onClick(view: View?) {
        val snackbar = view?.let { Snackbar.make(it, "Hello Android", Snackbar.LENGTH_LONG) }
        snackbar?.setTextColor(CYAN)
        snackbar?.setBackgroundTint(GRAY)
        snackbar?.setActionTextColor(MAGENTA)
        snackbar?.setAction("Next...", View.OnClickListener {
            val toast = Toast.makeText(applicationContext, "Next clicked!", Toast.LENGTH_LONG)
            toast.show()
        })
        snackbar?.show()
    }
}