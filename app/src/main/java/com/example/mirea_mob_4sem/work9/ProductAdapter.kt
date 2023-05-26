package com.example.mirea_mob_4sem.work9


import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.TextView
import com.example.mirea_mob_4sem.R


internal class ProductAdapter(
    context: Context?,
    private val layout: Int,
    private val productList: ArrayList<Product>
) :
    ArrayAdapter<Product?>(context!!, layout, productList as List<Product?>) {
    private val inflater: LayoutInflater

    init {
        inflater = LayoutInflater.from(context)
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var convertView = convertView
        val viewHolder: ViewHolder
        if (convertView == null) {
            convertView = inflater.inflate(layout, parent, false)
            viewHolder = ViewHolder(convertView)
            convertView.tag = viewHolder
        } else {
            viewHolder = convertView.tag as ViewHolder
        }
        val product = productList[position]
        viewHolder.nameView.text = product.name
        viewHolder.countView.text = product.count.toString() + " " + product.unit
        viewHolder.removeButton.setOnClickListener {
            var count = product.count - 1
            if (count < 0) count = 0
            product.count = count
            viewHolder.countView.text = count.toString() + " " + product.unit
        }
        viewHolder.addButton.setOnClickListener {
            val count = product.count + 1
            product.count = count
            viewHolder.countView.text = count.toString() + " " + product.unit
        }
        return convertView!!
    }

    private inner class ViewHolder constructor(view: View) {
        val addButton: Button
        val removeButton: Button
        val nameView: TextView
        val countView: TextView

        init {
            addButton = view.findViewById(R.id.addButton)
            removeButton = view.findViewById(R.id.removeButton)
            nameView = view.findViewById(R.id.nameView)
            countView = view.findViewById(R.id.countView)
        }
    }
}