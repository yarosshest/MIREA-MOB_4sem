package com.example.mirea_mob_4sem.work12

import android.app.Dialog
import android.os.Bundle
import androidx.fragment.app.DialogFragment
import android.app.AlertDialog
import com.example.mirea_mob_4sem.R

class CustomDialogFragment : DialogFragment() {
    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        val builder: AlertDialog.Builder = AlertDialog.Builder(activity)
        return builder
            .setTitle("Диалоговое окно")
            .setIcon(android.R.drawable.ic_dialog_alert)
            .setView(R.layout.work_127_dialog)
            .setPositiveButton("OK", null)
            .setNegativeButton("Отмена", null)
            .create();
    }
}