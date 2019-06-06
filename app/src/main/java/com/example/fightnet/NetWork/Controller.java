package com.example.fightnet.NetWork;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Controller {
    //создали BASE_URL
    static final String BASE_URL ="https://fightnet.herokuapp.com/";
//производим настройку с помощью Retrofit.Builder
    private static Retrofit.Builder sBuilder =
            new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create());

//    OkHttpClient client = new OkHttpClient();
//    client.Builder()
//    client.add(new HeaderInterceptor());

    public static Api getApi(){
        Api api = sBuilder.build().create(Api.class);
        return api;
    }
}
