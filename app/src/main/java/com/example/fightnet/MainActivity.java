package com.example.fightnet;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.fightnet.NetWork.Api;
import com.example.fightnet.NetWork.Controller;
import com.example.fightnet.NetWork.Login;
import com.example.fightnet.NetWork.PreferenceMeneger;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    EditText editText;
    TextView textView;
    private EditText email;
    private EditText password;
    private Button button;
    PreferenceMeneger preferenceMeneger;
    Api api;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        email=findViewById(R.id.email);
        password=findViewById(R.id.password);
        button=findViewById(R.id.button);
        api= Controller.getApi();
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                login(email.getText().toString(),password.getText().toString());
            }
        });
    }
    private void login (final String userName, String password){
        preferenceMeneger=new PreferenceMeneger(this);

        //создали переменную login с двумя параметрами
        Login login= new Login(userName,password);
        api.login(login).enqueue(new Callback<ResponseBody>() {
            @Override
            //что произойдет в случаи успеха
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                System.out.println(response.body());
                String token = response.headers().get("Authorization");
                preferenceMeneger.setAuthToken(token);
                preferenceMeneger.setEmail(userName);
                System.out.println(token+"!!!!!");
                Intent intent = new Intent(MainActivity.this,UserActivity.class);
                startActivity(intent);
            }

            @Override
            //что произойдет в случи неудачи
            public void onFailure(Call<ResponseBody> call, Throwable t) {
                System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!");
            }
        });
        api.countries().enqueue(new Callback<ResponseBody>() {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                System.out.println("counry!!!!!!!!!!");
            }

            @Override
            public void onFailure(Call<ResponseBody> call, Throwable t) {
                System.out.println("counry???????????");
            }
        });

    }

}