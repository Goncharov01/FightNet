package com.example.fightnet.NetWork;


import com.example.fightnet.App;

import java.io.IOException;

import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

public class HeaderInterceptor implements Interceptor {

    @Override
    public Response intercept(Chain chain) throws IOException {
        PreferenceMeneger preferenceMeneger= new PreferenceMeneger(App.getContext());
        Request original = chain.request();
        System.out.println(original.url());

        Request.Builder requestBuilder;
        if(original.url().equals("https://fightnet.herokuapp.com/security/login")){
            requestBuilder = original.newBuilder();
        }else {
            requestBuilder = original.newBuilder()
                    .header("Bearer", preferenceMeneger.getAuthToken());
            System.out.println("Interceptor");
            System.out.println(preferenceMeneger.getAuthToken());
        }
        System.out.println("Interceptor");
        System.out.println(preferenceMeneger.getAuthToken());
        Request request = requestBuilder.build();
        return chain.proceed(request);

    }
}
