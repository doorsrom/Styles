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
        checkTheme();
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

    private void checkTheme() {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(this);
        Boolean darkMode = preferences.getBoolean("dark_mode", false);
        String colorAccent = preferences.getString("color_accent", "default_blue");
        if (darkMode) {
            switch (colorAccent) {
                case "yellow_gold":
                    setTheme(R.style.WindowsTheme_Dark_yellow_gold);
                    break;
                case "gold":
                    setTheme(R.style.WindowsTheme_Dark_gold);
                    break;
                case "orange_bright":
                    setTheme(R.style.WindowsTheme_Dark_orange_bright);
                    break;
                case "orange_dark":
                    setTheme(R.style.WindowsTheme_Dark_orange_dark);
                    break;
                case "rust":
                    setTheme(R.style.WindowsTheme_Dark_rust);
                    break;
                case "pale_rust":
                    setTheme(R.style.WindowsTheme_Dark_pale_rust);
                    break;
                case "brick_red":
                    setTheme(R.style.WindowsTheme_Dark_brick_red);
                    break;
                case "mod_red":
                    setTheme(R.style.WindowsTheme_Dark_mod_red);
                    break;
                case "pale_red":
                    setTheme(R.style.WindowsTheme_Dark_pale_red);
                    break;
                case "red":
                    setTheme(R.style.WindowsTheme_Dark_red);
                    break;
                case "rose_bright":
                    setTheme(R.style.WindowsTheme_Dark_rose_bright);
                    break;
                case "rose":
                    setTheme(R.style.WindowsTheme_Dark_rose);
                    break;
                case "plum_light":
                    setTheme(R.style.WindowsTheme_Dark_plum_light);
                    break;
                case "plum":
                    setTheme(R.style.WindowsTheme_Dark_plum);
                    break;
                case "orchid_light":
                    setTheme(R.style.WindowsTheme_Dark_orchid_light);
                    break;
                case "orchid":
                    setTheme(R.style.WindowsTheme_Dark_orchid);
                    break;
                case "default_blue":
                    setTheme(R.style.WindowsTheme_Dark_default_blue);
                    break;
                case "navy_blue":
                    setTheme(R.style.WindowsTheme_Dark_navy_blue);
                    break;
                case "purple_shadow":
                    setTheme(R.style.WindowsTheme_Dark_purple_shadow);
                    break;
                case "purple_shadow_dark":
                    setTheme(R.style.WindowsTheme_Dark_purple_shadow_dark);
                    break;
                case "iris_pastel":
                    setTheme(R.style.WindowsTheme_Dark_iris_pastel);
                    break;
                case "iris_spring":
                    setTheme(R.style.WindowsTheme_Dark_iris_spring);
                    break;
                case "violet_red_light":
                    setTheme(R.style.WindowsTheme_Dark_violet_red_light);
                    break;
                case "violet_red":
                    setTheme(R.style.WindowsTheme_Dark_violet_red);
                    break;
                case "cool_blue_bright":
                    setTheme(R.style.WindowsTheme_Dark_cool_blue_bright);
                    break;
                case "cool_blue":
                    setTheme(R.style.WindowsTheme_Dark_cool_blue);
                    break;
                case "seafoam":
                    setTheme(R.style.WindowsTheme_Dark_seafoam);
                    break;
                case "seafoam_teal":
                    setTheme(R.style.WindowsTheme_Dark_seafoam_teal);
                    break;
                case "mint_light":
                    setTheme(R.style.WindowsTheme_Dark_mint_light);
                    break;
                case "mint_dark":
                    setTheme(R.style.WindowsTheme_Dark_mint_dark);
                    break;
                case "turf_green":
                    setTheme(R.style.WindowsTheme_Dark_turf_green);
                    break;
                case "sport_green":
                    setTheme(R.style.WindowsTheme_Dark_sport_green);
                    break;
                case "gray":
                    setTheme(R.style.WindowsTheme_Dark_gray);
                    break;
                case "gray_brown":
                    setTheme(R.style.WindowsTheme_Dark_gray_brown);
                    break;
                case "steel_blue":
                    setTheme(R.style.WindowsTheme_Dark_steel_blue);
                    break;
                case "metal_blue":
                    setTheme(R.style.WindowsTheme_Dark_metal_blue);
                    break;
                case "pale_moss":
                    setTheme(R.style.WindowsTheme_Dark_pale_moss);
                    break;
                case "moss":
                    setTheme(R.style.WindowsTheme_Dark_moss);
                    break;
                case "meadow_green":
                    setTheme(R.style.WindowsTheme_Dark_meadow_green);
                    break;
                case "green":
                    setTheme(R.style.WindowsTheme_Dark_green);
                    break;
                case "overcast":
                    setTheme(R.style.WindowsTheme_Dark_overcast);
                    break;
                case "storm":
                    setTheme(R.style.WindowsTheme_Dark_storm);
                    break;
                case "blue_gray":
                    setTheme(R.style.WindowsTheme_Dark_blue_gray);
                    break;
                case "gray_dark":
                    setTheme(R.style.WindowsTheme_Dark_gray_dark);
                    break;
                case "liddy_green":
                    setTheme(R.style.WindowsTheme_Dark_liddy_green);
                    break;
                case "sage":
                    setTheme(R.style.WindowsTheme_Dark_sage);
                    break;
                case "camouflage_desert":
                    setTheme(R.style.WindowsTheme_Dark_camouflage_desert);
                    break;
                case "camouflage":
                    setTheme(R.style.WindowsTheme_Dark_camouflage);
                    break;
                default:
                    setTheme(R.style.WindowsTheme_Dark);
                    break;
            }
        } else if (!darkMode) {
            switch (colorAccent) {
                case "yellow_gold":
                    setTheme(R.style.WindowsTheme_Light_yellow_gold);
                    break;
                case "gold":
                    setTheme(R.style.WindowsTheme_Light_gold);
                    break;
                case "orange_bright":
                    setTheme(R.style.WindowsTheme_Light_orange_bright);
                    break;
                case "orange_dark":
                    setTheme(R.style.WindowsTheme_Light_orange_dark);
                    break;
                case "rust":
                    setTheme(R.style.WindowsTheme_Light_rust);
                    break;
                case "pale_rust":
                    setTheme(R.style.WindowsTheme_Light_pale_rust);
                    break;
                case "brick_red":
                    setTheme(R.style.WindowsTheme_Light_brick_red);
                    break;
                case "mod_red":
                    setTheme(R.style.WindowsTheme_Light_mod_red);
                    break;
                case "pale_red":
                    setTheme(R.style.WindowsTheme_Light_pale_red);
                    break;
                case "red":
                    setTheme(R.style.WindowsTheme_Light_red);
                    break;
                case "rose_bright":
                    setTheme(R.style.WindowsTheme_Light_rose_bright);
                    break;
                case "rose":
                    setTheme(R.style.WindowsTheme_Light_rose);
                    break;
                case "plum_light":
                    setTheme(R.style.WindowsTheme_Light_plum_light);
                    break;
                case "plum":
                    setTheme(R.style.WindowsTheme_Light_plum);
                    break;
                case "orchid_light":
                    setTheme(R.style.WindowsTheme_Light_orchid_light);
                    break;
                case "orchid":
                    setTheme(R.style.WindowsTheme_Light_orchid);
                    break;
                case "default_blue":
                    setTheme(R.style.WindowsTheme_Light_default_blue);
                    break;
                case "navy_blue":
                    setTheme(R.style.WindowsTheme_Light_navy_blue);
                    break;
                case "purple_shadow":
                    setTheme(R.style.WindowsTheme_Light_purple_shadow);
                    break;
                case "purple_shadow_dark":
                    setTheme(R.style.WindowsTheme_Light_purple_shadow_dark);
                    break;
                case "iris_pastel":
                    setTheme(R.style.WindowsTheme_Light_iris_pastel);
                    break;
                case "iris_spring":
                    setTheme(R.style.WindowsTheme_Light_iris_spring);
                    break;
                case "violet_red_light":
                    setTheme(R.style.WindowsTheme_Light_violet_red_light);
                    break;
                case "violet_red":
                    setTheme(R.style.WindowsTheme_Light_violet_red);
                    break;
                case "cool_blue_bright":
                    setTheme(R.style.WindowsTheme_Light_cool_blue_bright);
                    break;
                case "cool_blue":
                    setTheme(R.style.WindowsTheme_Light_cool_blue);
                    break;
                case "seafoam":
                    setTheme(R.style.WindowsTheme_Light_seafoam);
                    break;
                case "seafoam_teal":
                    setTheme(R.style.WindowsTheme_Light_seafoam_teal);
                    break;
                case "mint_light":
                    setTheme(R.style.WindowsTheme_Light_mint_light);
                    break;
                case "mint_dark":
                    setTheme(R.style.WindowsTheme_Light_mint_dark);
                    break;
                case "turf_green":
                    setTheme(R.style.WindowsTheme_Light_turf_green);
                    break;
                case "sport_green":
                    setTheme(R.style.WindowsTheme_Light_sport_green);
                    break;
                case "gray":
                    setTheme(R.style.WindowsTheme_Light_gray);
                    break;
                case "gray_brown":
                    setTheme(R.style.WindowsTheme_Light_gray_brown);
                    break;
                case "steel_blue":
                    setTheme(R.style.WindowsTheme_Light_steel_blue);
                    break;
                case "metal_blue":
                    setTheme(R.style.WindowsTheme_Light_metal_blue);
                    break;
                case "pale_moss":
                    setTheme(R.style.WindowsTheme_Light_pale_moss);
                    break;
                case "moss":
                    setTheme(R.style.WindowsTheme_Light_moss);
                    break;
                case "meadow_green":
                    setTheme(R.style.WindowsTheme_Light_meadow_green);
                    break;
                case "green":
                    setTheme(R.style.WindowsTheme_Light_green);
                    break;
                case "overcast":
                    setTheme(R.style.WindowsTheme_Light_overcast);
                    break;
                case "storm":
                    setTheme(R.style.WindowsTheme_Light_storm);
                    break;
                case "blue_gray":
                    setTheme(R.style.WindowsTheme_Light_blue_gray);
                    break;
                case "gray_dark":
                    setTheme(R.style.WindowsTheme_Light_gray_dark);
                    break;
                case "liddy_green":
                    setTheme(R.style.WindowsTheme_Light_liddy_green);
                    break;
                case "sage":
                    setTheme(R.style.WindowsTheme_Light_sage);
                    break;
                case "camouflage_desert":
                    setTheme(R.style.WindowsTheme_Light_camouflage_desert);
                    break;
                case "camouflage":
                    setTheme(R.style.WindowsTheme_Light_camouflage);
                    break;
                default:
                    setTheme(R.style.WindowsTheme_Light);
                    break;
            }
        }
    }
}
