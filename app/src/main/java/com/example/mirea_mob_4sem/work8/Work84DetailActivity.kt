package com.example.mirea_mob_4sem.work8

import android.content.res.Configuration
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.mirea_mob_4sem.R


class Work84DetailActivity : AppCompatActivity() {
    val SELECTED_ITEM = "SELECTED_ITEM"
    var selectedItem: String? = "Не выбрано"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        if (resources.configuration.orientation == Configuration.ORIENTATION_LANDSCAPE) {
            finish()
            return
        }
        setContentView(R.layout.activity_work84_detail)
        val extras = intent.extras
        if (extras != null) selectedItem = extras.getString(SELECTED_ITEM)
    }

    override fun onResume() {
        super.onResume()
        (supportFragmentManager
            .findFragmentById(R.id.detailFragment) as Fragmet832?)?.setSelectedItem(selectedItem)
    }
}