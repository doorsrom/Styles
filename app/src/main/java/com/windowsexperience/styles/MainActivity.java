package com.windowsexperience.styles;

import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(this);
        Boolean darkMode = preferences.getBoolean("dark_mode", false);
        if (darkMode)
            setTheme(R.style.WindowsTheme_Dark);
        else if (!darkMode)
            setTheme(R.style.WindowsTheme_Light);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button pref = findViewById(R.id.pref);
        pref.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Preferences.class));
            }
        });
    }
}
