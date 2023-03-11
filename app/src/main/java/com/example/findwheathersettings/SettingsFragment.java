package com.example.findwheathersettings;


import android.os.Bundle;
import androidx.preference.PreferenceFragmentCompat;

import com.example.newfindwheather.R;

public class SettingsFragment extends PreferenceFragmentCompat {
    @Override
    public void onCreatePreferences(Bundle bundle, String s) {
        addPreferencesFromResource(R.xml.pref_weatherapp);

    }
}
