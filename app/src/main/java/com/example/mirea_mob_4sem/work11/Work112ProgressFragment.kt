package com.example.mirea_mob_4sem.work11

import android.os.AsyncTask
import android.os.Bundle
import android.os.SystemClock
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ProgressBar
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.mirea_mob_4sem.R


class Work112ProgressFragment : Fragment() {
    lateinit var  integers: IntArray
    lateinit var indicatorBar: ProgressBar
    lateinit var statusView: TextView


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val view: View = inflater.inflate(R.layout.fragment_progress, container, false)
        integers = IntArray(100)
        for (i in 0..99) {
            integers[i] = i + 1
        }
        indicatorBar = view.findViewById(R.id.indicator)
        statusView = view.findViewById(R.id.statusView)
        val btnFetch : Button = view.findViewById(R.id.progressBtn)

        btnFetch.setOnClickListener { ProgressTask().execute(); }
        return view
    }

    inner  class ProgressTask : AsyncTask<Void?, Int?, Void?>() {
        override fun doInBackground(vararg p0: Void?): Void? {
            for (i in integers.indices) {
                publishProgress(i)
                SystemClock.sleep(400)
            }
            return null
        }

        override fun onProgressUpdate(vararg values: Int?) {
            indicatorBar.progress = values[0]!! + 1
            statusView.text = "Статус: " + (values[0]!! + 1).toString()
        }

        override fun onPostExecute(unused: Void?) {
            Toast.makeText(activity, "Задача завершена", Toast.LENGTH_SHORT)
                .show()
        }

    }
}

