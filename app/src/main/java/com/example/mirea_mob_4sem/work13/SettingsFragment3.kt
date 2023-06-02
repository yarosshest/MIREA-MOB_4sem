package com.example.mirea_mob_4sem.work13

import android.os.Bundle
import androidx.preference.PreferenceFragmentCompat;
import com.example.mirea_mob_4sem.R

class SettingsFragment3 : PreferenceFragmentCompat() {
    override fun onCreatePreferences(savedInstanceState: Bundle?, rootKey: String?) {
        addPreferencesFromResource(R.xml.settings)
    }
}