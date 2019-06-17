package com.doors.styles;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.RadioButton;

import java.io.File;

import project.doors.theme.DoorsTheme;

public class ThemeChooser extends AppCompatActivity {

    private SharedPreferences prefs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        DoorsTheme.checkTheme(this);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_theme_chooser);

        //Variables
        prefs = getSharedPreferences("theme", Context.MODE_PRIVATE);
        RadioButton btnDark = findViewById(R.id.dark);
        RadioButton btnLight = findViewById(R.id.light);

        //Check prefs
        if (prefs.getBoolean("dark_mode", false)){
            btnDark.toggle();
        } else {
            btnLight.toggle();
        }

        //Clicks
        btnDark.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                prefs.edit().putBoolean("dark_mode", true).apply();
                startActivity(new Intent(v.getContext(), ThemeChooser.class).addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION));
                overridePendingTransition(0, 0);
            }
        });
        btnLight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                prefs.edit().putBoolean("dark_mode", false).apply();
                startActivity(new Intent(v.getContext(), ThemeChooser.class).addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION));
                overridePendingTransition(0, 0);
            }
        });

        squareClick(R.id.yellow_gold, "yellow_gold");
        squareClick(R.id.gold, "gold");
        squareClick(R.id.orange_bright, "orange_bright");
        squareClick(R.id.orange_dark, "orange_dark");
        squareClick(R.id.rust, "rust");
        squareClick(R.id.pale_rust, "pale_rust");
        squareClick(R.id.brick_red, "brick_red");
        squareClick(R.id.mod_red, "mod_red");

        squareClick(R.id.pale_red, "pale_red");
        squareClick(R.id.red, "red");
        squareClick(R.id.rose_bright, "rose_bright");
        squareClick(R.id.rose, "rose");
        squareClick(R.id.plum_light, "plum_light");
        squareClick(R.id.plum, "plum");
        squareClick(R.id.orchid_light, "orchid_light");
        squareClick(R.id.orchid, "orchid");

        squareClick(R.id.default_blue, "default_blue");
        squareClick(R.id.navy_blue, "navy_blue");
        squareClick(R.id.purple_shadow, "purple_shadow");
        squareClick(R.id.purple_shadow_dark, "purple_shadow_dark");
        squareClick(R.id.iris_pastel, "iris_pastel");
        squareClick(R.id.iris_spring, "iris_spring");
        squareClick(R.id.violet_red_light, "violet_red_light");
        squareClick(R.id.violet_red, "violet_red");

        squareClick(R.id.cool_blue_bright, "cool_blue_bright");
        squareClick(R.id.cool_blue, "cool_blue");
        squareClick(R.id.seafoam, "seafoam");
        squareClick(R.id.seafoam_teal, "seafoam_teal");
        squareClick(R.id.mint_light, "mint_light");
        squareClick(R.id.mint_dark, "mint_dark");
        squareClick(R.id.turf_green, "turf_green");
        squareClick(R.id.sport_green, "sport_green");

        squareClick(R.id.gray, "gray");
        squareClick(R.id.gray_brown, "gray_brown");
        squareClick(R.id.steel_blue, "steel_blue");
        squareClick(R.id.metal_blue, "metal_blue");
        squareClick(R.id.pale_moss, "pale_moss");
        squareClick(R.id.moss, "moss");
        squareClick(R.id.meadow_green, "meadow_green");
        squareClick(R.id.green, "green");

        squareClick(R.id.overcast, "overcast");
        squareClick(R.id.storm, "storm");
        squareClick(R.id.blue_gray, "blue_gray");
        squareClick(R.id.gray_dark, "gray_dark");
        squareClick(R.id.liddy_green, "liddy_green");
        squareClick(R.id.sage, "sage");
        squareClick(R.id.camouflage_desert, "camouflage_desert");
        squareClick(R.id.camouflage, "camouflage");
    }

    @Override
    public void onBackPressed() {
        startActivity(new Intent(this, MainActivity.class));
    }

    private void squareClick(int id,final String color){
        findViewById(id).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                prefs.edit().putString("color_accent", color).apply();
                startActivity(new Intent(v.getContext(), ThemeChooser.class).addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION));
                overridePendingTransition(0, 0);
            }
        });
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
