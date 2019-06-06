package com.example.fightnet;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

public class App extends Application {
    private static SharedPreferences sharedPreferences;
    private static Context context;

    @Override
    public void onCreate() {
        super.onCreate();
        sharedPreferences= PreferenceManager.getDefaultSharedPreferences(this);
        context=this;
    }
    public static Context getContext() {
        return context;
    }

    public static SharedPreferences getSharedPreferences() {
        System.out.println("!!!!!!!!!!!!!"+sharedPreferences);
        return sharedPreferences;
    }
}
