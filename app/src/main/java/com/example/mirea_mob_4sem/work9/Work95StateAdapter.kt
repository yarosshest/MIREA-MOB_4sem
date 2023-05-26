package com.example.mirea_mob_4sem.work9

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import com.example.mirea_mob_4sem.R


class Work95StateAdapter(context: Context, resource: Int, states: List<State>) :
    ArrayAdapter<State>(context, resource, states) {
    private var inflater: LayoutInflater
    private var layout = resource
    private val states: List<State> = states

    init {
        this.inflater = LayoutInflater.from(context)
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val view = inflater.inflate(layout, parent, false)
        val flagView = view.findViewById<ImageView>(R.id.flag)
        val nameView = view.findViewById<TextView>(R.id.name)
        val capitalView = view.findViewById<TextView>(R.id.capital)
        val state = states[position]
        flagView.setImageResource(state.getFlagResource())
        nameView.text = state.getName()
        capitalView.text = state.getCapital()
        return view
    }
}