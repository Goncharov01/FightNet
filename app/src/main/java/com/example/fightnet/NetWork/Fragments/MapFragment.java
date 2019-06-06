package com.example.fightnet.NetWork.Fragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.fightnet.NetWork.Api;
import com.example.fightnet.NetWork.Controller;
import com.example.fightnet.NetWork.Pojo.Email;
import com.example.fightnet.NetWork.Pojo.FightMarkers;
import com.example.fightnet.NetWork.PreferenceMeneger;
import com.example.fightnet.R;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class MapFragment extends Fragment {
    Api api;
    PreferenceMeneger preferenceMeneger;
    public MapFragment() {
        api= Controller.getApi();

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        preferenceMeneger=new PreferenceMeneger(getContext());
        getMarkers();
        return inflater.inflate(R.layout.fragment_map, container, false);
    }
    public void onButtonPressed(Uri uri) {

    }


    public void getMarkers(){

    api.fightMarkers(new Email(preferenceMeneger.getEmail())).enqueue(new Callback<List<FightMarkers>>() {
        @Override
        public void onResponse(Call<List<FightMarkers>> call, Response<List<FightMarkers>> response) {
            System.out.println("good"+ response.body());
        }

        @Override
        public void onFailure(Call<List<FightMarkers>> call, Throwable t) {

        }
    });


    }
}
