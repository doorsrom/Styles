package com.doors.styles;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class ThemeChooser extends AppCompatActivity {

    RadioGroup modeGroup;
    RadioButton btnDark;
    RadioButton btnLight;

    SharedPreferences prefs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        checkTheme(this);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_theme_chooser);

        checkPref();

        modeGroup = findViewById(R.id.mode);
        btnDark = findViewById(R.id.dark);
        btnLight = findViewById(R.id.light);

        prefs = PreferenceManager.getDefaultSharedPreferences(this);

        btnDark.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                prefs.edit().putBoolean("dark_mode", true).apply();
                startActivity(new Intent(v.getContext(), ThemeChooser.class).addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION));

            }
        });
        btnLight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                prefs.edit().putBoolean("dark_mode", false).apply();
                startActivity(new Intent(v.getContext(), ThemeChooser.class).addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION));
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

    private void squareClick(int id,final String color){
        findViewById(id).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                prefs.edit().putString("color_accent", color).apply();
                startActivity(new Intent(v.getContext(), ThemeChooser.class).addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION));
            }
        });
    }

    private void checkPref(){
        prefs = PreferenceManager.getDefaultSharedPreferences(this);
        Boolean darkMode = prefs.getBoolean("dark_mode", false);
        btnDark = findViewById(R.id.dark);
        btnLight = findViewById(R.id.light);
        if (darkMode){
            btnDark.toggle();
        } else if (!darkMode) {
            btnLight.toggle();
        }
    }

    public static void checkTheme(Context context) {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        Boolean darkMode = preferences.getBoolean("dark_mode", false);
        String colorAccent = preferences.getString("color_accent", "default_blue");
        if (darkMode) {
            switch (colorAccent) {
                case "yellow_gold":
                    context.setTheme(R.style.DoorsTheme_Dark_yellow_gold);
                    break;
                case "gold":
                    context.setTheme(R.style.DoorsTheme_Dark_gold);
                    break;
                case "orange_bright":
                    context.setTheme(R.style.DoorsTheme_Dark_orange_bright);
                    break;
                case "orange_dark":
                    context.setTheme(R.style.DoorsTheme_Dark_orange_dark);
                    break;
                case "rust":
                    context.setTheme(R.style.DoorsTheme_Dark_rust);
                    break;
                case "pale_rust":
                    context.setTheme(R.style.DoorsTheme_Dark_pale_rust);
                    break;
                case "brick_red":
                    context.setTheme(R.style.DoorsTheme_Dark_brick_red);
                    break;
                case "mod_red":
                    context.setTheme(R.style.DoorsTheme_Dark_mod_red);
                    break;
                case "pale_red":
                    context.setTheme(R.style.DoorsTheme_Dark_pale_red);
                    break;
                case "red":
                    context.setTheme(R.style.DoorsTheme_Dark_red);
                    break;
                case "rose_bright":
                    context.setTheme(R.style.DoorsTheme_Dark_rose_bright);
                    break;
                case "rose":
                    context.setTheme(R.style.DoorsTheme_Dark_rose);
                    break;
                case "plum_light":
                    context.setTheme(R.style.DoorsTheme_Dark_plum_light);
                    break;
                case "plum":
                    context.setTheme(R.style.DoorsTheme_Dark_plum);
                    break;
                case "orchid_light":
                    context.setTheme(R.style.DoorsTheme_Dark_orchid_light);
                    break;
                case "orchid":
                    context.setTheme(R.style.DoorsTheme_Dark_orchid);
                    break;
                case "default_blue":
                    context.setTheme(R.style.DoorsTheme_Dark_default_blue);
                    break;
                case "navy_blue":
                    context.setTheme(R.style.DoorsTheme_Dark_navy_blue);
                    break;
                case "purple_shadow":
                    context.setTheme(R.style.DoorsTheme_Dark_purple_shadow);
                    break;
                case "purple_shadow_dark":
                    context.setTheme(R.style.DoorsTheme_Dark_purple_shadow_dark);
                    break;
                case "iris_pastel":
                    context.setTheme(R.style.DoorsTheme_Dark_iris_pastel);
                    break;
                case "iris_spring":
                    context.setTheme(R.style.DoorsTheme_Dark_iris_spring);
                    break;
                case "violet_red_light":
                    context.setTheme(R.style.DoorsTheme_Dark_violet_red_light);
                    break;
                case "violet_red":
                    context.setTheme(R.style.DoorsTheme_Dark_violet_red);
                    break;
                case "cool_blue_bright":
                    context.setTheme(R.style.DoorsTheme_Dark_cool_blue_bright);
                    break;
                case "cool_blue":
                    context.setTheme(R.style.DoorsTheme_Dark_cool_blue);
                    break;
                case "seafoam":
                    context.setTheme(R.style.DoorsTheme_Dark_seafoam);
                    break;
                case "seafoam_teal":
                    context.setTheme(R.style.DoorsTheme_Dark_seafoam_teal);
                    break;
                case "mint_light":
                    context.setTheme(R.style.DoorsTheme_Dark_mint_light);
                    break;
                case "mint_dark":
                    context.setTheme(R.style.DoorsTheme_Dark_mint_dark);
                    break;
                case "turf_green":
                    context.setTheme(R.style.DoorsTheme_Dark_turf_green);
                    break;
                case "sport_green":
                    context.setTheme(R.style.DoorsTheme_Dark_sport_green);
                    break;
                case "gray":
                    context.setTheme(R.style.DoorsTheme_Dark_gray);
                    break;
                case "gray_brown":
                    context.setTheme(R.style.DoorsTheme_Dark_gray_brown);
                    break;
                case "steel_blue":
                    context.setTheme(R.style.DoorsTheme_Dark_steel_blue);
                    break;
                case "metal_blue":
                    context.setTheme(R.style.DoorsTheme_Dark_metal_blue);
                    break;
                case "pale_moss":
                    context.setTheme(R.style.DoorsTheme_Dark_pale_moss);
                    break;
                case "moss":
                    context.setTheme(R.style.DoorsTheme_Dark_moss);
                    break;
                case "meadow_green":
                    context.setTheme(R.style.DoorsTheme_Dark_meadow_green);
                    break;
                case "green":
                    context.setTheme(R.style.DoorsTheme_Dark_green);
                    break;
                case "overcast":
                    context.setTheme(R.style.DoorsTheme_Dark_overcast);
                    break;
                case "storm":
                    context.setTheme(R.style.DoorsTheme_Dark_storm);
                    break;
                case "blue_gray":
                    context.setTheme(R.style.DoorsTheme_Dark_blue_gray);
                    break;
                case "gray_dark":
                    context.setTheme(R.style.DoorsTheme_Dark_gray_dark);
                    break;
                case "liddy_green":
                    context.setTheme(R.style.DoorsTheme_Dark_liddy_green);
                    break;
                case "sage":
                    context.setTheme(R.style.DoorsTheme_Dark_sage);
                    break;
                case "camouflage_desert":
                    context.setTheme(R.style.DoorsTheme_Dark_camouflage_desert);
                    break;
                case "camouflage":
                    context.setTheme(R.style.DoorsTheme_Dark_camouflage);
                    break;
                default:
                    context.setTheme(R.style.DoorsTheme_Dark);
                    break;
            }
        } else if (!darkMode) {
            switch (colorAccent) {
                case "yellow_gold":
                    context.setTheme(R.style.DoorsTheme_Light_yellow_gold);
                    break;
                case "gold":
                    context.setTheme(R.style.DoorsTheme_Light_gold);
                    break;
                case "orange_bright":
                    context.setTheme(R.style.DoorsTheme_Light_orange_bright);
                    break;
                case "orange_dark":
                    context.setTheme(R.style.DoorsTheme_Light_orange_dark);
                    break;
                case "rust":
                    context.setTheme(R.style.DoorsTheme_Light_rust);
                    break;
                case "pale_rust":
                    context.setTheme(R.style.DoorsTheme_Light_pale_rust);
                    break;
                case "brick_red":
                    context.setTheme(R.style.DoorsTheme_Light_brick_red);
                    break;
                case "mod_red":
                    context.setTheme(R.style.DoorsTheme_Light_mod_red);
                    break;
                case "pale_red":
                    context.setTheme(R.style.DoorsTheme_Light_pale_red);
                    break;
                case "red":
                    context.setTheme(R.style.DoorsTheme_Light_red);
                    break;
                case "rose_bright":
                    context.setTheme(R.style.DoorsTheme_Light_rose_bright);
                    break;
                case "rose":
                    context.setTheme(R.style.DoorsTheme_Light_rose);
                    break;
                case "plum_light":
                    context.setTheme(R.style.DoorsTheme_Light_plum_light);
                    break;
                case "plum":
                    context.setTheme(R.style.DoorsTheme_Light_plum);
                    break;
                case "orchid_light":
                    context.setTheme(R.style.DoorsTheme_Light_orchid_light);
                    break;
                case "orchid":
                    context.setTheme(R.style.DoorsTheme_Light_orchid);
                    break;
                case "default_blue":
                    context.setTheme(R.style.DoorsTheme_Light_default_blue);
                    break;
                case "navy_blue":
                    context.setTheme(R.style.DoorsTheme_Light_navy_blue);
                    break;
                case "purple_shadow":
                    context.setTheme(R.style.DoorsTheme_Light_purple_shadow);
                    break;
                case "purple_shadow_dark":
                    context.setTheme(R.style.DoorsTheme_Light_purple_shadow_dark);
                    break;
                case "iris_pastel":
                    context.setTheme(R.style.DoorsTheme_Light_iris_pastel);
                    break;
                case "iris_spring":
                    context.setTheme(R.style.DoorsTheme_Light_iris_spring);
                    break;
                case "violet_red_light":
                    context.setTheme(R.style.DoorsTheme_Light_violet_red_light);
                    break;
                case "violet_red":
                    context.setTheme(R.style.DoorsTheme_Light_violet_red);
                    break;
                case "cool_blue_bright":
                    context.setTheme(R.style.DoorsTheme_Light_cool_blue_bright);
                    break;
                case "cool_blue":
                    context.setTheme(R.style.DoorsTheme_Light_cool_blue);
                    break;
                case "seafoam":
                    context.setTheme(R.style.DoorsTheme_Light_seafoam);
                    break;
                case "seafoam_teal":
                    context.setTheme(R.style.DoorsTheme_Light_seafoam_teal);
                    break;
                case "mint_light":
                    context.setTheme(R.style.DoorsTheme_Light_mint_light);
                    break;
                case "mint_dark":
                    context.setTheme(R.style.DoorsTheme_Light_mint_dark);
                    break;
                case "turf_green":
                    context.setTheme(R.style.DoorsTheme_Light_turf_green);
                    break;
                case "sport_green":
                    context.setTheme(R.style.DoorsTheme_Light_sport_green);
                    break;
                case "gray":
                    context.setTheme(R.style.DoorsTheme_Light_gray);
                    break;
                case "gray_brown":
                    context.setTheme(R.style.DoorsTheme_Light_gray_brown);
                    break;
                case "steel_blue":
                    context.setTheme(R.style.DoorsTheme_Light_steel_blue);
                    break;
                case "metal_blue":
                    context.setTheme(R.style.DoorsTheme_Light_metal_blue);
                    break;
                case "pale_moss":
                    context.setTheme(R.style.DoorsTheme_Light_pale_moss);
                    break;
                case "moss":
                    context.setTheme(R.style.DoorsTheme_Light_moss);
                    break;
                case "meadow_green":
                    context.setTheme(R.style.DoorsTheme_Light_meadow_green);
                    break;
                case "green":
                    context.setTheme(R.style.DoorsTheme_Light_green);
                    break;
                case "overcast":
                    context.setTheme(R.style.DoorsTheme_Light_overcast);
                    break;
                case "storm":
                    context.setTheme(R.style.DoorsTheme_Light_storm);
                    break;
                case "blue_gray":
                    context.setTheme(R.style.DoorsTheme_Light_blue_gray);
                    break;
                case "gray_dark":
                    context.setTheme(R.style.DoorsTheme_Light_gray_dark);
                    break;
                case "liddy_green":
                    context.setTheme(R.style.DoorsTheme_Light_liddy_green);
                    break;
                case "sage":
                    context.setTheme(R.style.DoorsTheme_Light_sage);
                    break;
                case "camouflage_desert":
                    context.setTheme(R.style.DoorsTheme_Light_camouflage_desert);
                    break;
                case "camouflage":
                    context.setTheme(R.style.DoorsTheme_Light_camouflage);
                    break;
                default:
                    context.setTheme(R.style.DoorsTheme_Light);
                    break;
            }
        }
    }
}
