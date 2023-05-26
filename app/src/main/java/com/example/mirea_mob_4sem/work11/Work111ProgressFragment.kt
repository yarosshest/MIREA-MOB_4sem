package com.example.mirea_mob_4sem.work11

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ProgressBar
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.mirea_mob_4sem.R


class Work111ProgressFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val view: View = inflater.inflate(R.layout.fragment_progress, container, false)

        val indicatorBar: ProgressBar = view.findViewById(R.id.indicator)
        val statusView: TextView = view.findViewById(R.id.statusView)
        val btnFetch: Button = view.findViewById(R.id.progressBtn)
        val model: Work111MyViewModel = ViewModelProvider(requireActivity())[Work111MyViewModel::class.java]
        model.getValue().observe(viewLifecycleOwner) { value ->
            indicatorBar.progress = value
            statusView.text = "Статус: $value"
        }
        btnFetch.setOnClickListener { model.execute() }
        return view
    }
}