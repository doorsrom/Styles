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
                    context.setTheme(R.style.DoorsTheme_DialogTheme_Dark_yellow_gold);
                    break;
                case "gold":
                    context.setTheme(R.style.DoorsTheme_DialogTheme_Dark_gold);
                    break;
                case "orange_bright":
                    context.setTheme(R.style.DoorsTheme_DialogTheme_Dark_orange_bright);
                    break;
                case "orange_dark":
                    context.setTheme(R.style.DoorsTheme_DialogTheme_Dark_orange_dark);
                    break;
                case "rust":
                    context.setTheme(R.style.DoorsTheme_DialogTheme_Dark_rust);
                    break;
                case "pale_rust":
                    context.setTheme(R.style.DoorsTheme_DialogTheme_Dark_pale_rust);
                    break;
                case "brick_red":
                    context.setTheme(R.style.DoorsTheme_DialogTheme_Dark_brick_red);
                    break;
                case "mod_red":
                    context.setTheme(R.style.DoorsTheme_DialogTheme_Dark_mod_red);
                    break;
                case "pale_red":
                    context.setTheme(R.style.DoorsTheme_DialogTheme_Dark_pale_red);
                    break;
                case "red":
                    context.setTheme(R.style.DoorsTheme_DialogTheme_Dark_red);
                    break;
                case "rose_bright":
                    context.setTheme(R.style.DoorsTheme_DialogTheme_Dark_rose_bright);
                    break;
                case "rose":
                    context.setTheme(R.style.DoorsTheme_DialogTheme_Dark_rose);
                    break;
                case "plum_light":
                    context.setTheme(R.style.DoorsTheme_DialogTheme_Dark_plum_light);
                    break;
                case "plum":
                    context.setTheme(R.style.DoorsTheme_DialogTheme_Dark_plum);
                    break;
                case "orchid_light":
                    context.setTheme(R.style.DoorsTheme_DialogTheme_Dark_orchid_light);
                    break;
                case "orchid":
                    context.setTheme(R.style.DoorsTheme_DialogTheme_Dark_orchid);
                    break;
                case "default_blue":
                    context.setTheme(R.style.DoorsTheme_DialogTheme_Dark_default_blue);
                    break;
                case "navy_blue":
                    context.setTheme(R.style.DoorsTheme_DialogTheme_Dark_navy_blue);
                    break;
                case "purple_shadow":
                    context.setTheme(R.style.DoorsTheme_DialogTheme_Dark_purple_shadow);
                    break;
                case "purple_shadow_dark":
                    context.setTheme(R.style.DoorsTheme_DialogTheme_Dark_purple_shadow_dark);
                    break;
                case "iris_pastel":
                    context.setTheme(R.style.DoorsTheme_DialogTheme_Dark_iris_pastel);
                    break;
                case "iris_spring":
                    context.setTheme(R.style.DoorsTheme_DialogTheme_Dark_iris_spring);
                    break;
                case "violet_red_light":
                    context.setTheme(R.style.DoorsTheme_DialogTheme_Dark_violet_red_light);
                    break;
                case "violet_red":
                    context.setTheme(R.style.DoorsTheme_DialogTheme_Dark_violet_red);
                    break;
                case "cool_blue_bright":
                    context.setTheme(R.style.DoorsTheme_DialogTheme_Dark_cool_blue_bright);
                    break;
                case "cool_blue":
                    context.setTheme(R.style.DoorsTheme_DialogTheme_Dark_cool_blue);
                    break;
                case "seafoam":
                    context.setTheme(R.style.DoorsTheme_DialogTheme_Dark_seafoam);
                    break;
                case "seafoam_teal":
                    context.setTheme(R.style.DoorsTheme_DialogTheme_Dark_seafoam_teal);
                    break;
                case "mint_light":
                    context.setTheme(R.style.DoorsTheme_DialogTheme_Dark_mint_light);
                    break;
                case "mint_dark":
                    context.setTheme(R.style.DoorsTheme_DialogTheme_Dark_mint_dark);
                    break;
                case "turf_green":
                    context.setTheme(R.style.DoorsTheme_DialogTheme_Dark_turf_green);
                    break;
                case "sport_green":
                    context.setTheme(R.style.DoorsTheme_DialogTheme_Dark_sport_green);
                    break;
                case "gray":
                    context.setTheme(R.style.DoorsTheme_DialogTheme_Dark_gray);
                    break;
                case "gray_brown":
                    context.setTheme(R.style.DoorsTheme_DialogTheme_Dark_gray_brown);
                    break;
                case "steel_blue":
                    context.setTheme(R.style.DoorsTheme_DialogTheme_Dark_steel_blue);
                    break;
                case "metal_blue":
                    context.setTheme(R.style.DoorsTheme_DialogTheme_Dark_metal_blue);
                    break;
                case "pale_moss":
                    context.setTheme(R.style.DoorsTheme_DialogTheme_Dark_pale_moss);
                    break;
                case "moss":
                    context.setTheme(R.style.DoorsTheme_DialogTheme_Dark_moss);
                    break;
                case "meadow_green":
                    context.setTheme(R.style.DoorsTheme_DialogTheme_Dark_meadow_green);
                    break;
                case "green":
                    context.setTheme(R.style.DoorsTheme_DialogTheme_Dark_green);
                    break;
                case "overcast":
                    context.setTheme(R.style.DoorsTheme_DialogTheme_Dark_overcast);
                    break;
                case "storm":
                    context.setTheme(R.style.DoorsTheme_DialogTheme_Dark_storm);
                    break;
                case "blue_gray":
                    context.setTheme(R.style.DoorsTheme_DialogTheme_Dark_blue_gray);
                    break;
                case "gray_dark":
                    context.setTheme(R.style.DoorsTheme_DialogTheme_Dark_gray_dark);
                    break;
                case "liddy_green":
                    context.setTheme(R.style.DoorsTheme_DialogTheme_Dark_liddy_green);
                    break;
                case "sage":
                    context.setTheme(R.style.DoorsTheme_DialogTheme_Dark_sage);
                    break;
                case "camouflage_desert":
                    context.setTheme(R.style.DoorsTheme_DialogTheme_Dark_camouflage_desert);
                    break;
                case "camouflage":
                    context.setTheme(R.style.DoorsTheme_DialogTheme_Dark_camouflage);
                    break;
                default:
                    context.setTheme(R.style.DoorsTheme_DialogTheme_Dark);
                    break;
            }
        } else {
            recent(context, R.color.DoorsTheme_white);
            switch (getColorAccent(context)) {
                case "yellow_gold":
                    context.setTheme(R.style.DoorsTheme_DialogTheme_Light_yellow_gold);
                    break;
                case "gold":
                    context.setTheme(R.style.DoorsTheme_DialogTheme_Light_gold);
                    break;
                case "orange_bright":
                    context.setTheme(R.style.DoorsTheme_DialogTheme_Light_orange_bright);
                    break;
                case "orange_dark":
                    context.setTheme(R.style.DoorsTheme_DialogTheme_Light_orange_dark);
                    break;
                case "rust":
                    context.setTheme(R.style.DoorsTheme_DialogTheme_Light_rust);
                    break;
                case "pale_rust":
                    context.setTheme(R.style.DoorsTheme_DialogTheme_Light_pale_rust);
                    break;
                case "brick_red":
                    context.setTheme(R.style.DoorsTheme_DialogTheme_Light_brick_red);
                    break;
                case "mod_red":
                    context.setTheme(R.style.DoorsTheme_DialogTheme_Light_mod_red);
                    break;
                case "pale_red":
                    context.setTheme(R.style.DoorsTheme_DialogTheme_Light_pale_red);
                    break;
                case "red":
                    context.setTheme(R.style.DoorsTheme_DialogTheme_Light_red);
                    break;
                case "rose_bright":
                    context.setTheme(R.style.DoorsTheme_DialogTheme_Light_rose_bright);
                    break;
                case "rose":
                    context.setTheme(R.style.DoorsTheme_DialogTheme_Light_rose);
                    break;
                case "plum_light":
                    context.setTheme(R.style.DoorsTheme_DialogTheme_Light_plum_light);
                    break;
                case "plum":
                    context.setTheme(R.style.DoorsTheme_DialogTheme_Light_plum);
                    break;
                case "orchid_light":
                    context.setTheme(R.style.DoorsTheme_DialogTheme_Light_orchid_light);
                    break;
                case "orchid":
                    context.setTheme(R.style.DoorsTheme_DialogTheme_Light_orchid);
                    break;
                case "default_blue":
                    context.setTheme(R.style.DoorsTheme_DialogTheme_Light_default_blue);
                    break;
                case "navy_blue":
                    context.setTheme(R.style.DoorsTheme_DialogTheme_Light_navy_blue);
                    break;
                case "purple_shadow":
                    context.setTheme(R.style.DoorsTheme_DialogTheme_Light_purple_shadow);
                    break;
                case "purple_shadow_dark":
                    context.setTheme(R.style.DoorsTheme_DialogTheme_Light_purple_shadow_dark);
                    break;
                case "iris_pastel":
                    context.setTheme(R.style.DoorsTheme_DialogTheme_Light_iris_pastel);
                    break;
                case "iris_spring":
                    context.setTheme(R.style.DoorsTheme_DialogTheme_Light_iris_spring);
                    break;
                case "violet_red_light":
                    context.setTheme(R.style.DoorsTheme_DialogTheme_Light_violet_red_light);
                    break;
                case "violet_red":
                    context.setTheme(R.style.DoorsTheme_DialogTheme_Light_violet_red);
                    break;
                case "cool_blue_bright":
                    context.setTheme(R.style.DoorsTheme_DialogTheme_Light_cool_blue_bright);
                    break;
                case "cool_blue":
                    context.setTheme(R.style.DoorsTheme_DialogTheme_Light_cool_blue);
                    break;
                case "seafoam":
                    context.setTheme(R.style.DoorsTheme_DialogTheme_Light_seafoam);
                    break;
                case "seafoam_teal":
                    context.setTheme(R.style.DoorsTheme_DialogTheme_Light_seafoam_teal);
                    break;
                case "mint_light":
                    context.setTheme(R.style.DoorsTheme_DialogTheme_Light_mint_light);
                    break;
                case "mint_dark":
                    context.setTheme(R.style.DoorsTheme_DialogTheme_Light_mint_dark);
                    break;
                case "turf_green":
                    context.setTheme(R.style.DoorsTheme_DialogTheme_Light_turf_green);
                    break;
                case "sport_green":
                    context.setTheme(R.style.DoorsTheme_DialogTheme_Light_sport_green);
                    break;
                case "gray":
                    context.setTheme(R.style.DoorsTheme_DialogTheme_Light_gray);
                    break;
                case "gray_brown":
                    context.setTheme(R.style.DoorsTheme_DialogTheme_Light_gray_brown);
                    break;
                case "steel_blue":
                    context.setTheme(R.style.DoorsTheme_DialogTheme_Light_steel_blue);
                    break;
                case "metal_blue":
                    context.setTheme(R.style.DoorsTheme_DialogTheme_Light_metal_blue);
                    break;
                case "pale_moss":
                    context.setTheme(R.style.DoorsTheme_DialogTheme_Light_pale_moss);
                    break;
                case "moss":
                    context.setTheme(R.style.DoorsTheme_DialogTheme_Light_moss);
                    break;
                case "meadow_green":
                    context.setTheme(R.style.DoorsTheme_DialogTheme_Light_meadow_green);
                    break;
                case "green":
                    context.setTheme(R.style.DoorsTheme_DialogTheme_Light_green);
                    break;
                case "overcast":
                    context.setTheme(R.style.DoorsTheme_DialogTheme_Light_overcast);
                    break;
                case "storm":
                    context.setTheme(R.style.DoorsTheme_DialogTheme_Light_storm);
                    break;
                case "blue_gray":
                    context.setTheme(R.style.DoorsTheme_DialogTheme_Light_blue_gray);
                    break;
                case "gray_dark":
                    context.setTheme(R.style.DoorsTheme_DialogTheme_Light_gray_dark);
                    break;
                case "liddy_green":
                    context.setTheme(R.style.DoorsTheme_DialogTheme_Light_liddy_green);
                    break;
                case "sage":
                    context.setTheme(R.style.DoorsTheme_DialogTheme_Light_sage);
                    break;
                case "camouflage_desert":
                    context.setTheme(R.style.DoorsTheme_DialogTheme_Light_camouflage_desert);
                    break;
                case "camouflage":
                    context.setTheme(R.style.DoorsTheme_DialogTheme_Light_camouflage);
                    break;
                default:
                    context.setTheme(R.style.DoorsTheme_DialogTheme_Light);
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
