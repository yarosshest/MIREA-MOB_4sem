package com.example.mirea_mob_4sem.work8


import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView.OnItemClickListener
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ListAdapter
import android.widget.ListView
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.mirea_mob_4sem.R
import java.util.Date


class Fragmet831 : Fragment() {

    internal interface OnFragmentSendDataListener {
        fun onSendData(data: String?)
    }

    private var fragmentSendDataListener: OnFragmentSendDataListener? = null
    var countries = arrayOf("Бразилия", "Аргентина", "Колумбия", "Чили", "Уругвай")

    override fun onAttach(context: Context) {
        super.onAttach(context)
        fragmentSendDataListener = try {
            context as OnFragmentSendDataListener
        } catch (e: ClassCastException) {
            throw ClassCastException(
                context.toString()
                        + " должен реализовывать интерфейс OnFragmentInteractionListener"
            )
        }
    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_fragmet831, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val countriesList = view.findViewById<ListView>(R.id.countriesList)
        val adapter: Any =
            ArrayAdapter<Any?>(requireContext(), android.R.layout.simple_list_item_1, countries)
        countriesList.adapter = adapter as ListAdapter?
        countriesList.onItemClickListener =
            OnItemClickListener { parent, v, position, id -> // получаем выбранный элемент
                val selectedItem = parent.getItemAtPosition(position) as String
                fragmentSendDataListener!!.onSendData(selectedItem)
            }
    }

}