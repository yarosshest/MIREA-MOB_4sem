package com.example.mirea_mob_4sem.work9

import android.os.Bundle
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity
import com.example.mirea_mob_4sem.R


class Work97 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_work97)

        val products = ArrayList<Product>()
        if (products.size == 0) {
            products.add(Product("Картофель", "кг."))
            products.add(Product("Чай", "шт."))
            products.add(Product("Яйца", "шт."))
            products.add(Product("Молоко", "л."))
            products.add(Product("Макароны", "кг."))
        }
        val productList = findViewById<ListView>(R.id.productList)
        val adapter = ProductAdapter(this, R.layout.work_97_list_item, products)
        productList.adapter = adapter
    }
}