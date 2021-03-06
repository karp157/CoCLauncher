package com.shield.main;

import android.content.Context;
import android.content.SharedPreferences;

public class Prefs {

    private static final String PREFS_FILENAME = "ShieldPrefs";

    private static final String IS_DELAYING_TO_SEND = "IS_DELAYING_TO_SEND";

    private static final String USER_SCREEN_TIMEOUT = "USER_SCREEN_TIMEOUT";
    /* Have application changed screen sleep time to infinity? */
    private static final String IS_USER_SCREEN_TIMEOUT_OVERRIDDEN = "IS_USER_SCREEN_TIMEOUT_OVERRIDDEN";

    private static final String SHIELD_START_TIME = "SHIELD_START_TIME";
    private static final String SHIELD_END_TIME = "SHIELD_END_TIME";
    private static final String RESET_TIME = "RESET_TIME";
    private static final String IS_USER_WIFI_OVERRIDDEN = "IS_USER_WIFI_OVERRIDDEN";
    private static final String IS_USER_NETWORK_OVERRIDDEN = "IS_USER_NETWORK_OVERRIDDEN";

    public static final String IS_SCHEDULED = "IS_SCHEDULED";
    public static final String SCHEDULER_DUE_TIME = "SCHEDULER_DUE_TIME";

    public static void setIsDelayingToSend(Context context, boolean isDelayingToSend) {
        SharedPreferences settings = context.getSharedPreferences(PREFS_FILENAME, 0);
        SharedPreferences.Editor editor = settings.edit();
        editor.putBoolean(IS_DELAYING_TO_SEND, isDelayingToSend);
        editor.commit();
    }

    public static boolean getIsDelayingToSend(Context context) {
        SharedPreferences settings = context.getSharedPreferences(PREFS_FILENAME, 0);
        return settings.getBoolean(IS_DELAYING_TO_SEND, false);
    }

    public static void setUserScreenTimeout(Context context, int userScreenTimeout) {
        SharedPreferences settings = context.getSharedPreferences(PREFS_FILENAME, 0);
        SharedPreferences.Editor editor = settings.edit();
        editor.putInt(USER_SCREEN_TIMEOUT, userScreenTimeout);
        editor.commit();
    }

    public static int getUserScreenTimeout(Context context) {
        SharedPreferences settings = context.getSharedPreferences(PREFS_FILENAME, 0);
        return settings.getInt(USER_SCREEN_TIMEOUT, Shield.DEFAULT_SCREEN_OFF_TIMEOUT);
    }

    public static void setIsUserScreenTimeoutOverridden(Context context, boolean isUserScreenTimeoutOverridden) {
        SharedPreferences settings = context.getSharedPreferences(PREFS_FILENAME, 0);
        SharedPreferences.Editor editor = settings.edit();
        editor.putBoolean(IS_USER_SCREEN_TIMEOUT_OVERRIDDEN, isUserScreenTimeoutOverridden);
        editor.commit();
    }

    public static boolean getIsUserScreenTimeoutOverridden(Context context) {
        SharedPreferences settings = context.getSharedPreferences(PREFS_FILENAME, 0);
        return settings.getBoolean(IS_USER_SCREEN_TIMEOUT_OVERRIDDEN, false);
    }

    public static void setResetTime(Context context, long time) {
        SharedPreferences settings = context.getSharedPreferences(PREFS_FILENAME, 0);
        SharedPreferences.Editor editor = settings.edit();
        editor.putLong(RESET_TIME, time);
        editor.commit();
    }

    public static long getResetTime(Context context) {
        SharedPreferences settings = context.getSharedPreferences(PREFS_FILENAME, 0);
        return settings.getLong(RESET_TIME, 0);
    }

    public static void setShieldStartTime(Context context, long time) {
        SharedPreferences settings = context.getSharedPreferences(PREFS_FILENAME, 0);
        SharedPreferences.Editor editor = settings.edit();
        editor.putLong(SHIELD_START_TIME, time);
        editor.commit();
    }

    public static long getShieldStartTime(Context context) {
        SharedPreferences settings = context.getSharedPreferences(PREFS_FILENAME, 0);
        return settings.getLong(SHIELD_START_TIME, 0);
    }

    public static void setShieldEndTime(Context context, long time) {
        SharedPreferences settings = context.getSharedPreferences(PREFS_FILENAME, 0);
        SharedPreferences.Editor editor = settings.edit();
        editor.putLong(SHIELD_END_TIME, time);
        editor.commit();
    }

    public static long getShieldEndTime(Context context) {
        SharedPreferences settings = context.getSharedPreferences(PREFS_FILENAME, 0);
        return settings.getLong(SHIELD_END_TIME, 0);
    }

    public static void setIsUserWifiOverridden(Context context, boolean isUserWifiOverridden) {
        SharedPreferences settings = context.getSharedPreferences(PREFS_FILENAME, 0);
        SharedPreferences.Editor editor = settings.edit();
        editor.putBoolean(IS_USER_WIFI_OVERRIDDEN, isUserWifiOverridden);
        editor.commit();
    }

    public static boolean getIsUserWifiOverridden(Context context) {
        SharedPreferences settings = context.getSharedPreferences(PREFS_FILENAME, 0);
        return settings.getBoolean(IS_USER_WIFI_OVERRIDDEN, false);
    }

    public static void setIsUserNetworkOverridden(Context context, boolean isUserNetworkOverridden) {
        SharedPreferences settings = context.getSharedPreferences(PREFS_FILENAME, 0);
        SharedPreferences.Editor editor = settings.edit();
        editor.putBoolean(IS_USER_NETWORK_OVERRIDDEN, isUserNetworkOverridden);
        editor.commit();
    }

    public static boolean getIsUserNetworkOverridden(Context context) {
        SharedPreferences settings = context.getSharedPreferences(PREFS_FILENAME, 0);
        return settings.getBoolean(IS_USER_NETWORK_OVERRIDDEN, false);
    }

    public static void setBoolean(Context context, String key, boolean isUserNetworkOverridden) {
        SharedPreferences settings = context.getSharedPreferences(PREFS_FILENAME, 0);
        SharedPreferences.Editor editor = settings.edit();
        editor.putBoolean(key, isUserNetworkOverridden);
        editor.commit();
    }

    public static boolean getBoolean(Context context, String key) {
        SharedPreferences settings = context.getSharedPreferences(PREFS_FILENAME, 0);
        return settings.getBoolean(key, false);
    }

    public static void setLong(Context context, String key, long time) {
        SharedPreferences settings = context.getSharedPreferences(PREFS_FILENAME, 0);
        SharedPreferences.Editor editor = settings.edit();
        editor.putLong(key, time);
        editor.commit();
    }

    public static long getLong(Context context, String key) {
        SharedPreferences settings = context.getSharedPreferences(PREFS_FILENAME, 0);
        return settings.getLong(key, 0);
    }
}