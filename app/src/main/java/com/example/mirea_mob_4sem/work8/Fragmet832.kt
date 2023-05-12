package com.example.mirea_mob_4sem.work8

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.mirea_mob_4sem.R


class Fragmet832 : Fragment() {

    fun setSelectedItem(selectedItem: String?) {
        val view = requireView().findViewById<TextView>(R.id.detailsText)
        view.text = selectedItem
    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_fragmet832, container, false)
    }

}