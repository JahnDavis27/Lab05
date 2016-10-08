package com.example.jahn3423music.lab5;

import android.os.Bundle;
import android.preference.PreferenceFragment;

/**
 * Created by Jahn3423Music on 10/7/2016.
 */
public class SettingsFragment extends PreferenceFragment {

    /**
     * Create part of the settings page
     *
     * @param savedInstanceState
     */
    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.preferences);
    }

}