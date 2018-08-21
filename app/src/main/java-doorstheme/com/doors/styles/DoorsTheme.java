package com.doors.styles;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.Context;
import android.graphics.BitmapFactory;
import android.preference.PreferenceManager;
import android.support.v4.content.ContextCompat;

public class DoorsTheme {

    public static boolean isDarkMode(Context context){
        return PreferenceManager.getDefaultSharedPreferences(context).getBoolean("dark_mode", false);
    }

    public static String getColorAccent(Context context){
        return PreferenceManager.getDefaultSharedPreferences(context).getString("color_accent", "default_blue");
    }

    public static void checkTheme(Context context) {
        if (isDarkMode(context)) {
            recent(context, R.color.DoorsTheme_black);
            switch (getColorAccent(context)) {
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
        } else {
            recent(context, R.color.DoorsTheme_white);
            switch (getColorAccent(context)) {
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

    public static void checkDialogTheme(Context context) {
        if (isDarkMode(context)) {
            recent(context, R.color.DoorsTheme_black);
            switch (getColorAccent(context)) {
                case "yellow_gold":
                    context.setTheme(R.style.DoorsTheme_Dark_DialogTheme_yellow_gold);
                    break;
                case "gold":
                    context.setTheme(R.style.DoorsTheme_Dark_DialogTheme_gold);
                    break;
                case "orange_bright":
                    context.setTheme(R.style.DoorsTheme_Dark_DialogTheme_orange_bright);
                    break;
                case "orange_dark":
                    context.setTheme(R.style.DoorsTheme_Dark_DialogTheme_orange_dark);
                    break;
                case "rust":
                    context.setTheme(R.style.DoorsTheme_Dark_DialogTheme_rust);
                    break;
                case "pale_rust":
                    context.setTheme(R.style.DoorsTheme_Dark_DialogTheme_pale_rust);
                    break;
                case "brick_red":
                    context.setTheme(R.style.DoorsTheme_Dark_DialogTheme_brick_red);
                    break;
                case "mod_red":
                    context.setTheme(R.style.DoorsTheme_Dark_DialogTheme_mod_red);
                    break;
                case "pale_red":
                    context.setTheme(R.style.DoorsTheme_Dark_DialogTheme_pale_red);
                    break;
                case "red":
                    context.setTheme(R.style.DoorsTheme_Dark_DialogTheme_red);
                    break;
                case "rose_bright":
                    context.setTheme(R.style.DoorsTheme_Dark_DialogTheme_rose_bright);
                    break;
                case "rose":
                    context.setTheme(R.style.DoorsTheme_Dark_DialogTheme_rose);
                    break;
                case "plum_light":
                    context.setTheme(R.style.DoorsTheme_Dark_DialogTheme_plum_light);
                    break;
                case "plum":
                    context.setTheme(R.style.DoorsTheme_Dark_DialogTheme_plum);
                    break;
                case "orchid_light":
                    context.setTheme(R.style.DoorsTheme_Dark_DialogTheme_orchid_light);
                    break;
                case "orchid":
                    context.setTheme(R.style.DoorsTheme_Dark_DialogTheme_orchid);
                    break;
                case "default_blue":
                    context.setTheme(R.style.DoorsTheme_Dark_DialogTheme_default_blue);
                    break;
                case "navy_blue":
                    context.setTheme(R.style.DoorsTheme_Dark_DialogTheme_navy_blue);
                    break;
                case "purple_shadow":
                    context.setTheme(R.style.DoorsTheme_Dark_DialogTheme_purple_shadow);
                    break;
                case "purple_shadow_dark":
                    context.setTheme(R.style.DoorsTheme_Dark_DialogTheme_purple_shadow_dark);
                    break;
                case "iris_pastel":
                    context.setTheme(R.style.DoorsTheme_Dark_DialogTheme_iris_pastel);
                    break;
                case "iris_spring":
                    context.setTheme(R.style.DoorsTheme_Dark_DialogTheme_iris_spring);
                    break;
                case "violet_red_light":
                    context.setTheme(R.style.DoorsTheme_Dark_DialogTheme_violet_red_light);
                    break;
                case "violet_red":
                    context.setTheme(R.style.DoorsTheme_Dark_DialogTheme_violet_red);
                    break;
                case "cool_blue_bright":
                    context.setTheme(R.style.DoorsTheme_Dark_DialogTheme_cool_blue_bright);
                    break;
                case "cool_blue":
                    context.setTheme(R.style.DoorsTheme_Dark_DialogTheme_cool_blue);
                    break;
                case "seafoam":
                    context.setTheme(R.style.DoorsTheme_Dark_DialogTheme_seafoam);
                    break;
                case "seafoam_teal":
                    context.setTheme(R.style.DoorsTheme_Dark_DialogTheme_seafoam_teal);
                    break;
                case "mint_light":
                    context.setTheme(R.style.DoorsTheme_Dark_DialogTheme_mint_light);
                    break;
                case "mint_dark":
                    context.setTheme(R.style.DoorsTheme_Dark_DialogTheme_mint_dark);
                    break;
                case "turf_green":
                    context.setTheme(R.style.DoorsTheme_Dark_DialogTheme_turf_green);
                    break;
                case "sport_green":
                    context.setTheme(R.style.DoorsTheme_Dark_DialogTheme_sport_green);
                    break;
                case "gray":
                    context.setTheme(R.style.DoorsTheme_Dark_DialogTheme_gray);
                    break;
                case "gray_brown":
                    context.setTheme(R.style.DoorsTheme_Dark_DialogTheme_gray_brown);
                    break;
                case "steel_blue":
                    context.setTheme(R.style.DoorsTheme_Dark_DialogTheme_steel_blue);
                    break;
                case "metal_blue":
                    context.setTheme(R.style.DoorsTheme_Dark_DialogTheme_metal_blue);
                    break;
                case "pale_moss":
                    context.setTheme(R.style.DoorsTheme_Dark_DialogTheme_pale_moss);
                    break;
                case "moss":
                    context.setTheme(R.style.DoorsTheme_Dark_DialogTheme_moss);
                    break;
                case "meadow_green":
                    context.setTheme(R.style.DoorsTheme_Dark_DialogTheme_meadow_green);
                    break;
                case "green":
                    context.setTheme(R.style.DoorsTheme_Dark_DialogTheme_green);
                    break;
                case "overcast":
                    context.setTheme(R.style.DoorsTheme_Dark_DialogTheme_overcast);
                    break;
                case "storm":
                    context.setTheme(R.style.DoorsTheme_Dark_DialogTheme_storm);
                    break;
                case "blue_gray":
                    context.setTheme(R.style.DoorsTheme_Dark_DialogTheme_blue_gray);
                    break;
                case "gray_dark":
                    context.setTheme(R.style.DoorsTheme_Dark_DialogTheme_gray_dark);
                    break;
                case "liddy_green":
                    context.setTheme(R.style.DoorsTheme_Dark_DialogTheme_liddy_green);
                    break;
                case "sage":
                    context.setTheme(R.style.DoorsTheme_Dark_DialogTheme_sage);
                    break;
                case "camouflage_desert":
                    context.setTheme(R.style.DoorsTheme_Dark_DialogTheme_camouflage_desert);
                    break;
                case "camouflage":
                    context.setTheme(R.style.DoorsTheme_Dark_DialogTheme_camouflage);
                    break;
                default:
                    context.setTheme(R.style.DoorsTheme_Dark_DialogTheme);
                    break;
            }
        } else {
            recent(context, R.color.DoorsTheme_white);
            switch (getColorAccent(context)) {
                case "yellow_gold":
                    context.setTheme(R.style.DoorsTheme_Light_DialogTheme_yellow_gold);
                    break;
                case "gold":
                    context.setTheme(R.style.DoorsTheme_Light_DialogTheme_gold);
                    break;
                case "orange_bright":
                    context.setTheme(R.style.DoorsTheme_Light_DialogTheme_orange_bright);
                    break;
                case "orange_dark":
                    context.setTheme(R.style.DoorsTheme_Light_DialogTheme_orange_dark);
                    break;
                case "rust":
                    context.setTheme(R.style.DoorsTheme_Light_DialogTheme_rust);
                    break;
                case "pale_rust":
                    context.setTheme(R.style.DoorsTheme_Light_DialogTheme_pale_rust);
                    break;
                case "brick_red":
                    context.setTheme(R.style.DoorsTheme_Light_DialogTheme_brick_red);
                    break;
                case "mod_red":
                    context.setTheme(R.style.DoorsTheme_Light_DialogTheme_mod_red);
                    break;
                case "pale_red":
                    context.setTheme(R.style.DoorsTheme_Light_DialogTheme_pale_red);
                    break;
                case "red":
                    context.setTheme(R.style.DoorsTheme_Light_DialogTheme_red);
                    break;
                case "rose_bright":
                    context.setTheme(R.style.DoorsTheme_Light_DialogTheme_rose_bright);
                    break;
                case "rose":
                    context.setTheme(R.style.DoorsTheme_Light_DialogTheme_rose);
                    break;
                case "plum_light":
                    context.setTheme(R.style.DoorsTheme_Light_DialogTheme_plum_light);
                    break;
                case "plum":
                    context.setTheme(R.style.DoorsTheme_Light_DialogTheme_plum);
                    break;
                case "orchid_light":
                    context.setTheme(R.style.DoorsTheme_Light_DialogTheme_orchid_light);
                    break;
                case "orchid":
                    context.setTheme(R.style.DoorsTheme_Light_DialogTheme_orchid);
                    break;
                case "default_blue":
                    context.setTheme(R.style.DoorsTheme_Light_DialogTheme_default_blue);
                    break;
                case "navy_blue":
                    context.setTheme(R.style.DoorsTheme_Light_DialogTheme_navy_blue);
                    break;
                case "purple_shadow":
                    context.setTheme(R.style.DoorsTheme_Light_DialogTheme_purple_shadow);
                    break;
                case "purple_shadow_dark":
                    context.setTheme(R.style.DoorsTheme_Light_DialogTheme_purple_shadow_dark);
                    break;
                case "iris_pastel":
                    context.setTheme(R.style.DoorsTheme_Light_DialogTheme_iris_pastel);
                    break;
                case "iris_spring":
                    context.setTheme(R.style.DoorsTheme_Light_DialogTheme_iris_spring);
                    break;
                case "violet_red_light":
                    context.setTheme(R.style.DoorsTheme_Light_DialogTheme_violet_red_light);
                    break;
                case "violet_red":
                    context.setTheme(R.style.DoorsTheme_Light_DialogTheme_violet_red);
                    break;
                case "cool_blue_bright":
                    context.setTheme(R.style.DoorsTheme_Light_DialogTheme_cool_blue_bright);
                    break;
                case "cool_blue":
                    context.setTheme(R.style.DoorsTheme_Light_DialogTheme_cool_blue);
                    break;
                case "seafoam":
                    context.setTheme(R.style.DoorsTheme_Light_DialogTheme_seafoam);
                    break;
                case "seafoam_teal":
                    context.setTheme(R.style.DoorsTheme_Light_DialogTheme_seafoam_teal);
                    break;
                case "mint_light":
                    context.setTheme(R.style.DoorsTheme_Light_DialogTheme_mint_light);
                    break;
                case "mint_dark":
                    context.setTheme(R.style.DoorsTheme_Light_DialogTheme_mint_dark);
                    break;
                case "turf_green":
                    context.setTheme(R.style.DoorsTheme_Light_DialogTheme_turf_green);
                    break;
                case "sport_green":
                    context.setTheme(R.style.DoorsTheme_Light_DialogTheme_sport_green);
                    break;
                case "gray":
                    context.setTheme(R.style.DoorsTheme_Light_DialogTheme_gray);
                    break;
                case "gray_brown":
                    context.setTheme(R.style.DoorsTheme_Light_DialogTheme_gray_brown);
                    break;
                case "steel_blue":
                    context.setTheme(R.style.DoorsTheme_Light_DialogTheme_steel_blue);
                    break;
                case "metal_blue":
                    context.setTheme(R.style.DoorsTheme_Light_DialogTheme_metal_blue);
                    break;
                case "pale_moss":
                    context.setTheme(R.style.DoorsTheme_Light_DialogTheme_pale_moss);
                    break;
                case "moss":
                    context.setTheme(R.style.DoorsTheme_Light_DialogTheme_moss);
                    break;
                case "meadow_green":
                    context.setTheme(R.style.DoorsTheme_Light_DialogTheme_meadow_green);
                    break;
                case "green":
                    context.setTheme(R.style.DoorsTheme_Light_DialogTheme_green);
                    break;
                case "overcast":
                    context.setTheme(R.style.DoorsTheme_Light_DialogTheme_overcast);
                    break;
                case "storm":
                    context.setTheme(R.style.DoorsTheme_Light_DialogTheme_storm);
                    break;
                case "blue_gray":
                    context.setTheme(R.style.DoorsTheme_Light_DialogTheme_blue_gray);
                    break;
                case "gray_dark":
                    context.setTheme(R.style.DoorsTheme_Light_DialogTheme_gray_dark);
                    break;
                case "liddy_green":
                    context.setTheme(R.style.DoorsTheme_Light_DialogTheme_liddy_green);
                    break;
                case "sage":
                    context.setTheme(R.style.DoorsTheme_Light_DialogTheme_sage);
                    break;
                case "camouflage_desert":
                    context.setTheme(R.style.DoorsTheme_Light_DialogTheme_camouflage_desert);
                    break;
                case "camouflage":
                    context.setTheme(R.style.DoorsTheme_Light_DialogTheme_camouflage);
                    break;
                default:
                    context.setTheme(R.style.DoorsTheme_Light_DialogTheme);
                    break;
            }
        }
    }

    public static void checkNoActionBar(Context context) {
        if (isDarkMode(context)) {
            recent(context, R.color.DoorsTheme_black);
            switch (getColorAccent(context)) {
                case "yellow_gold":
                    context.setTheme(R.style.DoorsTheme_Dark_NoActionBar_yellow_gold);
                    break;
                case "gold":
                    context.setTheme(R.style.DoorsTheme_Dark_NoActionBar_gold);
                    break;
                case "orange_bright":
                    context.setTheme(R.style.DoorsTheme_Dark_NoActionBar_orange_bright);
                    break;
                case "orange_dark":
                    context.setTheme(R.style.DoorsTheme_Dark_NoActionBar_orange_dark);
                    break;
                case "rust":
                    context.setTheme(R.style.DoorsTheme_Dark_NoActionBar_rust);
                    break;
                case "pale_rust":
                    context.setTheme(R.style.DoorsTheme_Dark_NoActionBar_pale_rust);
                    break;
                case "brick_red":
                    context.setTheme(R.style.DoorsTheme_Dark_NoActionBar_brick_red);
                    break;
                case "mod_red":
                    context.setTheme(R.style.DoorsTheme_Dark_NoActionBar_mod_red);
                    break;
                case "pale_red":
                    context.setTheme(R.style.DoorsTheme_Dark_NoActionBar_pale_red);
                    break;
                case "red":
                    context.setTheme(R.style.DoorsTheme_Dark_NoActionBar_red);
                    break;
                case "rose_bright":
                    context.setTheme(R.style.DoorsTheme_Dark_NoActionBar_rose_bright);
                    break;
                case "rose":
                    context.setTheme(R.style.DoorsTheme_Dark_NoActionBar_rose);
                    break;
                case "plum_light":
                    context.setTheme(R.style.DoorsTheme_Dark_NoActionBar_plum_light);
                    break;
                case "plum":
                    context.setTheme(R.style.DoorsTheme_Dark_NoActionBar_plum);
                    break;
                case "orchid_light":
                    context.setTheme(R.style.DoorsTheme_Dark_NoActionBar_orchid_light);
                    break;
                case "orchid":
                    context.setTheme(R.style.DoorsTheme_Dark_NoActionBar_orchid);
                    break;
                case "default_blue":
                    context.setTheme(R.style.DoorsTheme_Dark_NoActionBar_default_blue);
                    break;
                case "navy_blue":
                    context.setTheme(R.style.DoorsTheme_Dark_NoActionBar_navy_blue);
                    break;
                case "purple_shadow":
                    context.setTheme(R.style.DoorsTheme_Dark_NoActionBar_purple_shadow);
                    break;
                case "purple_shadow_dark":
                    context.setTheme(R.style.DoorsTheme_Dark_NoActionBar_purple_shadow_dark);
                    break;
                case "iris_pastel":
                    context.setTheme(R.style.DoorsTheme_Dark_NoActionBar_iris_pastel);
                    break;
                case "iris_spring":
                    context.setTheme(R.style.DoorsTheme_Dark_NoActionBar_iris_spring);
                    break;
                case "violet_red_light":
                    context.setTheme(R.style.DoorsTheme_Dark_NoActionBar_violet_red_light);
                    break;
                case "violet_red":
                    context.setTheme(R.style.DoorsTheme_Dark_NoActionBar_violet_red);
                    break;
                case "cool_blue_bright":
                    context.setTheme(R.style.DoorsTheme_Dark_NoActionBar_cool_blue_bright);
                    break;
                case "cool_blue":
                    context.setTheme(R.style.DoorsTheme_Dark_NoActionBar_cool_blue);
                    break;
                case "seafoam":
                    context.setTheme(R.style.DoorsTheme_Dark_NoActionBar_seafoam);
                    break;
                case "seafoam_teal":
                    context.setTheme(R.style.DoorsTheme_Dark_NoActionBar_seafoam_teal);
                    break;
                case "mint_light":
                    context.setTheme(R.style.DoorsTheme_Dark_NoActionBar_mint_light);
                    break;
                case "mint_dark":
                    context.setTheme(R.style.DoorsTheme_Dark_NoActionBar_mint_dark);
                    break;
                case "turf_green":
                    context.setTheme(R.style.DoorsTheme_Dark_NoActionBar_turf_green);
                    break;
                case "sport_green":
                    context.setTheme(R.style.DoorsTheme_Dark_NoActionBar_sport_green);
                    break;
                case "gray":
                    context.setTheme(R.style.DoorsTheme_Dark_NoActionBar_gray);
                    break;
                case "gray_brown":
                    context.setTheme(R.style.DoorsTheme_Dark_NoActionBar_gray_brown);
                    break;
                case "steel_blue":
                    context.setTheme(R.style.DoorsTheme_Dark_NoActionBar_steel_blue);
                    break;
                case "metal_blue":
                    context.setTheme(R.style.DoorsTheme_Dark_NoActionBar_metal_blue);
                    break;
                case "pale_moss":
                    context.setTheme(R.style.DoorsTheme_Dark_NoActionBar_pale_moss);
                    break;
                case "moss":
                    context.setTheme(R.style.DoorsTheme_Dark_NoActionBar_moss);
                    break;
                case "meadow_green":
                    context.setTheme(R.style.DoorsTheme_Dark_NoActionBar_meadow_green);
                    break;
                case "green":
                    context.setTheme(R.style.DoorsTheme_Dark_NoActionBar_green);
                    break;
                case "overcast":
                    context.setTheme(R.style.DoorsTheme_Dark_NoActionBar_overcast);
                    break;
                case "storm":
                    context.setTheme(R.style.DoorsTheme_Dark_NoActionBar_storm);
                    break;
                case "blue_gray":
                    context.setTheme(R.style.DoorsTheme_Dark_NoActionBar_blue_gray);
                    break;
                case "gray_dark":
                    context.setTheme(R.style.DoorsTheme_Dark_NoActionBar_gray_dark);
                    break;
                case "liddy_green":
                    context.setTheme(R.style.DoorsTheme_Dark_NoActionBar_liddy_green);
                    break;
                case "sage":
                    context.setTheme(R.style.DoorsTheme_Dark_NoActionBar_sage);
                    break;
                case "camouflage_desert":
                    context.setTheme(R.style.DoorsTheme_Dark_NoActionBar_camouflage_desert);
                    break;
                case "camouflage":
                    context.setTheme(R.style.DoorsTheme_Dark_NoActionBar_camouflage);
                    break;
                default:
                    context.setTheme(R.style.DoorsTheme_Dark_NoActionBar);
                    break;
            }
        } else {
            recent(context, R.color.DoorsTheme_white);
            switch (getColorAccent(context)) {
                case "yellow_gold":
                    context.setTheme(R.style.DoorsTheme_Light_NoActionBar_yellow_gold);
                    break;
                case "gold":
                    context.setTheme(R.style.DoorsTheme_Light_NoActionBar_gold);
                    break;
                case "orange_bright":
                    context.setTheme(R.style.DoorsTheme_Light_NoActionBar_orange_bright);
                    break;
                case "orange_dark":
                    context.setTheme(R.style.DoorsTheme_Light_NoActionBar_orange_dark);
                    break;
                case "rust":
                    context.setTheme(R.style.DoorsTheme_Light_NoActionBar_rust);
                    break;
                case "pale_rust":
                    context.setTheme(R.style.DoorsTheme_Light_NoActionBar_pale_rust);
                    break;
                case "brick_red":
                    context.setTheme(R.style.DoorsTheme_Light_NoActionBar_brick_red);
                    break;
                case "mod_red":
                    context.setTheme(R.style.DoorsTheme_Light_NoActionBar_mod_red);
                    break;
                case "pale_red":
                    context.setTheme(R.style.DoorsTheme_Light_NoActionBar_pale_red);
                    break;
                case "red":
                    context.setTheme(R.style.DoorsTheme_Light_NoActionBar_red);
                    break;
                case "rose_bright":
                    context.setTheme(R.style.DoorsTheme_Light_NoActionBar_rose_bright);
                    break;
                case "rose":
                    context.setTheme(R.style.DoorsTheme_Light_NoActionBar_rose);
                    break;
                case "plum_light":
                    context.setTheme(R.style.DoorsTheme_Light_NoActionBar_plum_light);
                    break;
                case "plum":
                    context.setTheme(R.style.DoorsTheme_Light_NoActionBar_plum);
                    break;
                case "orchid_light":
                    context.setTheme(R.style.DoorsTheme_Light_NoActionBar_orchid_light);
                    break;
                case "orchid":
                    context.setTheme(R.style.DoorsTheme_Light_NoActionBar_orchid);
                    break;
                case "default_blue":
                    context.setTheme(R.style.DoorsTheme_Light_NoActionBar_default_blue);
                    break;
                case "navy_blue":
                    context.setTheme(R.style.DoorsTheme_Light_NoActionBar_navy_blue);
                    break;
                case "purple_shadow":
                    context.setTheme(R.style.DoorsTheme_Light_NoActionBar_purple_shadow);
                    break;
                case "purple_shadow_dark":
                    context.setTheme(R.style.DoorsTheme_Light_NoActionBar_purple_shadow_dark);
                    break;
                case "iris_pastel":
                    context.setTheme(R.style.DoorsTheme_Light_NoActionBar_iris_pastel);
                    break;
                case "iris_spring":
                    context.setTheme(R.style.DoorsTheme_Light_NoActionBar_iris_spring);
                    break;
                case "violet_red_light":
                    context.setTheme(R.style.DoorsTheme_Light_NoActionBar_violet_red_light);
                    break;
                case "violet_red":
                    context.setTheme(R.style.DoorsTheme_Light_NoActionBar_violet_red);
                    break;
                case "cool_blue_bright":
                    context.setTheme(R.style.DoorsTheme_Light_NoActionBar_cool_blue_bright);
                    break;
                case "cool_blue":
                    context.setTheme(R.style.DoorsTheme_Light_NoActionBar_cool_blue);
                    break;
                case "seafoam":
                    context.setTheme(R.style.DoorsTheme_Light_NoActionBar_seafoam);
                    break;
                case "seafoam_teal":
                    context.setTheme(R.style.DoorsTheme_Light_NoActionBar_seafoam_teal);
                    break;
                case "mint_light":
                    context.setTheme(R.style.DoorsTheme_Light_NoActionBar_mint_light);
                    break;
                case "mint_dark":
                    context.setTheme(R.style.DoorsTheme_Light_NoActionBar_mint_dark);
                    break;
                case "turf_green":
                    context.setTheme(R.style.DoorsTheme_Light_NoActionBar_turf_green);
                    break;
                case "sport_green":
                    context.setTheme(R.style.DoorsTheme_Light_NoActionBar_sport_green);
                    break;
                case "gray":
                    context.setTheme(R.style.DoorsTheme_Light_NoActionBar_gray);
                    break;
                case "gray_brown":
                    context.setTheme(R.style.DoorsTheme_Light_NoActionBar_gray_brown);
                    break;
                case "steel_blue":
                    context.setTheme(R.style.DoorsTheme_Light_NoActionBar_steel_blue);
                    break;
                case "metal_blue":
                    context.setTheme(R.style.DoorsTheme_Light_NoActionBar_metal_blue);
                    break;
                case "pale_moss":
                    context.setTheme(R.style.DoorsTheme_Light_NoActionBar_pale_moss);
                    break;
                case "moss":
                    context.setTheme(R.style.DoorsTheme_Light_NoActionBar_moss);
                    break;
                case "meadow_green":
                    context.setTheme(R.style.DoorsTheme_Light_NoActionBar_meadow_green);
                    break;
                case "green":
                    context.setTheme(R.style.DoorsTheme_Light_NoActionBar_green);
                    break;
                case "overcast":
                    context.setTheme(R.style.DoorsTheme_Light_NoActionBar_overcast);
                    break;
                case "storm":
                    context.setTheme(R.style.DoorsTheme_Light_NoActionBar_storm);
                    break;
                case "blue_gray":
                    context.setTheme(R.style.DoorsTheme_Light_NoActionBar_blue_gray);
                    break;
                case "gray_dark":
                    context.setTheme(R.style.DoorsTheme_Light_NoActionBar_gray_dark);
                    break;
                case "liddy_green":
                    context.setTheme(R.style.DoorsTheme_Light_NoActionBar_liddy_green);
                    break;
                case "sage":
                    context.setTheme(R.style.DoorsTheme_Light_NoActionBar_sage);
                    break;
                case "camouflage_desert":
                    context.setTheme(R.style.DoorsTheme_Light_NoActionBar_camouflage_desert);
                    break;
                case "camouflage":
                    context.setTheme(R.style.DoorsTheme_Light_NoActionBar_camouflage);
                    break;
                default:
                    context.setTheme(R.style.DoorsTheme_Light_NoActionBar);
                    break;
            }
        }
    }

    private static void recent(Context context, int color){
        ActivityManager.TaskDescription taskDescription = new ActivityManager.TaskDescription(
                context.getString(R.string.app_name),
                BitmapFactory.decodeResource(context.getResources(), R.mipmap.ic_launcher),
                ContextCompat.getColor(context, color)
        );
        ((Activity)context).setTaskDescription(taskDescription);
    }
}
