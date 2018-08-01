package com.doors.styles;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Handler;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        checkTheme();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(SplashActivity.this, MainActivity.class));
                finish();
            }
        }, 500);
    }

    private void checkTheme() {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(this);
        Boolean darkMode = preferences.getBoolean("dark_mode", false);
        if (darkMode)
            setTheme(R.style.DoorsTheme_Dark_NoActionBar);
        else if(!darkMode)
            setTheme(R.style.DoorsTheme_Light_NoActionBar);
    }
}
