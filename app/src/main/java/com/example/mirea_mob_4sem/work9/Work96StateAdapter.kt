package com.example.mirea_mob_4sem.work9

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import com.example.mirea_mob_4sem.R


class Work96StateAdapter(context: Context, resource: Int, states: List<State>) :
    ArrayAdapter<State>(context, resource, states) {
    private var inflater: LayoutInflater
    private var layout = resource
    private val states: List<State> = states

    init {
        this.inflater = LayoutInflater.from(context)
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
        val state = states[position]
        viewHolder.imageView.setImageResource(state.getFlagResource())
        viewHolder.nameView.text = state.getName()
        viewHolder.capitalView.text = state.getCapital()
        return convertView!!
    }

    private class ViewHolder constructor(view: View?) {
        val imageView: ImageView
        val nameView: TextView
        val capitalView: TextView

        init {
            imageView = view!!.findViewById(R.id.flag)
            nameView = view.findViewById(R.id.name)
            capitalView = view.findViewById(R.id.capital)
        }
    }
}