package com.example.mirea_mob_4sem.work12

import android.app.AlertDialog
import android.app.Dialog
import android.os.Bundle
import androidx.fragment.app.DialogFragment

class CustomDialogFragment2 : DialogFragment() {
    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        val phone = requireArguments().getString("phone")
        val builder: AlertDialog.Builder = AlertDialog.Builder(activity)
        return builder
            .setTitle("Диалоговое окно")
            .setIcon(android.R.drawable.ic_dialog_alert)
            .setMessage("Вы хотите удалить " + phone + "?")
            .setPositiveButton("OK", null)
            .setNegativeButton("Отмена", null)
            .create()
    }
}