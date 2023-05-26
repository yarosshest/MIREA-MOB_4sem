package com.example.mirea_mob_4sem.work9


import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.mirea_mob_4sem.R


class Work913StateAdapter internal constructor(context: Context?, private val states: List<State>) :
    RecyclerView.Adapter<Work913StateAdapter.ViewHolder>() {
    private val inflater: LayoutInflater

    init {
        inflater = LayoutInflater.from(context)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view: View = inflater.inflate(R.layout.work_913_list_item, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val state = states[position]
        holder.flagView.setImageResource(state.getFlagResource())
        holder.nameView.text = state.getName()
        holder.capitalView.text = state.getCapital()
    }

    override fun getItemCount(): Int {
        return states.size
    }

    class ViewHolder internal constructor(view: View) : RecyclerView.ViewHolder(view) {
        val flagView: ImageView
        val nameView: TextView
        val capitalView: TextView

        init {
            flagView = view.findViewById<ImageView>(R.id.flag)
            nameView = view.findViewById<TextView>(R.id.name)
            capitalView = view.findViewById<TextView>(R.id.capital)
        }
    }
}