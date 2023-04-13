package com.example.mirea_mob_4sem.work5

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.mirea_mob_4sem.R
import com.google.android.material.snackbar.Snackbar


class Work56 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_work56)
    }

    fun onClick(view: View?) {
        if (view != null) {
            Snackbar.make(view, "Hello Android", Snackbar.LENGTH_LONG)
                .show()
        }
    }
}