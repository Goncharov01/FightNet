package com.example.fightnet.NetWork;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

import com.example.fightnet.App;


public class PreferenceMeneger {
    private SharedPreferences sharedPreferences;
    private PreferenceMeneger preferenceMeneger;
    SharedPreferences.Editor editor;
    public PreferenceMeneger(Context context) {
        this.sharedPreferences =PreferenceManager.getDefaultSharedPreferences(context);

        editor=sharedPreferences.edit();
    }

    public void setAuthToken(String token){
        editor.putString("token", token);
        editor.apply();

    }

    public String getAuthToken(){
        return sharedPreferences.getString("token","null");

    }

    public void setEmail(String userName) {
      editor.putString("email",userName);
      editor.apply();
    }

    public String getEmail(){
        String email=sharedPreferences.getString ( "email","r.lukashenko@mail.ru");
        return email;

    }
}
