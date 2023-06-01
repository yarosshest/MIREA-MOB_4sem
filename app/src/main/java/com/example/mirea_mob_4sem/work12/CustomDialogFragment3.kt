package com.example.mirea_mob_4sem.work12

import android.R
import android.app.AlertDialog
import android.app.Dialog
import android.content.Context
import android.os.Bundle
import androidx.fragment.app.DialogFragment


class CustomDialogFragment3  : DialogFragment() {
    private lateinit var removable: Removable

    override fun onAttach(context: Context) {
        super.onAttach(requireContext())
        removable = context as Removable
    }

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        val phone = requireArguments().getString("phone")
        val builder = AlertDialog.Builder(activity)
        return builder
            .setTitle("Диалоговое окно")
            .setIcon(R.drawable.ic_dialog_alert)
            .setMessage("Вы хотите удалить $phone?")
            .setPositiveButton(
                "OK"
            ) { _, _ -> removable.remove(phone!!) }
            .setNegativeButton("Отмена", null)
            .create()
    }
}