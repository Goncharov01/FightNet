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
import com.example.fightnet.NetWork.Pojo.Overview.UserOverview;
import com.example.fightnet.NetWork.PreferenceMeneger;
import com.example.fightnet.R;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class OverviewFragment extends Fragment {

    Api api;
    PreferenceMeneger preferenceMeneger;

    public OverviewFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        overview();

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        preferenceMeneger=new PreferenceMeneger(getContext());
        api= Controller.getApi();

        return inflater.inflate(R.layout.fragment_overview, container, false);
    }
    public void onButtonPressed(Uri uri) {

    }
    public void overview(){

        api.userOverview(new Email( preferenceMeneger.getEmail())).enqueue(new Callback<List<UserOverview>>() {
            @Override
            public void onResponse(Call<List<UserOverview>> call, Response<List<UserOverview>> response) {
                System.out.println("Response"+ response.body());
            }

            @Override
            public void onFailure(Call<List<UserOverview>> call, Throwable t) {

            }
        });

    }
}
