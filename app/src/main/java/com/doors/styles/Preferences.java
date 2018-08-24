package com.doors.styles;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.preference.PreferenceFragment;
import android.preference.PreferenceManager;
import android.support.v7.app.ActionBar;
import android.util.Log;

import java.io.File;

public class Preferences extends AppCompatPreferenceActivity {

    private final SharedPreferences.OnSharedPreferenceChangeListener spChanged = new
            SharedPreferences.OnSharedPreferenceChangeListener() {
                @Override
                public void onSharedPreferenceChanged(SharedPreferences sharedPreferences,
                                                      String key) {
                    startActivity(new Intent(Preferences.this, MainActivity.class));
                    finish();
                }
            };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        DoorsTheme.checkTheme(this);
        super.onCreate(savedInstanceState);
        setupActionBar();
        getFragmentManager().beginTransaction()
                .replace(android.R.id.content, new GeneralPreferenceFragment())
                .commit();
        getSharedPreferences("theme", Context.MODE_PRIVATE).registerOnSharedPreferenceChangeListener(spChanged);
    }

    private void setupActionBar() {
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
    }

    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public static class GeneralPreferenceFragment extends PreferenceFragment {
        @Override
        public void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            PreferenceManager prefMngr = getPreferenceManager();
            prefMngr.setSharedPreferencesName("theme");
            prefMngr.setSharedPreferencesMode(MODE_PRIVATE);
            addPreferencesFromResource(R.xml.pref_theme);
        }
    }

    @SuppressLint("SetWorldReadable")
    private void grantRead(){
        String dataDir = this.getApplicationInfo().dataDir;
        String prefFile = "/shared_prefs/theme.xml";

        File f = new File(dataDir + prefFile);
        if (f.exists()) {
            if(!f.setReadable(true, false)){
                Log.e("DoorsThemeError", "Setting MODE_WORLD_READABLE failed");
            }
        }

        f = new File(dataDir);
        if (f.exists() && f.isDirectory()) {
            if(!f.setReadable(true, false) || ! f.setExecutable(true, false)){
                Log.e("DoorsThemeError", "Setting MODE_WORLD_READABLE failed");
            }
        }
    }

    @Override
    protected void onStop(){
        super.onStop();
        grantRead();
    }
}
