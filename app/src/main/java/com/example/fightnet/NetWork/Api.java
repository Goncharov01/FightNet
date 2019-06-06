package com.example.fightnet.NetWork;

import com.example.fightnet.NetWork.Pojo.Email;
import com.example.fightnet.NetWork.Pojo.EmailBody;
import com.example.fightnet.NetWork.Pojo.FightMarkers;
import com.example.fightnet.NetWork.Pojo.FindUser;
import com.example.fightnet.NetWork.Pojo.Overview.UserOverview;

import java.util.List;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

//интерфейс определяющий возможные API операции
public interface Api{
 @POST("security/login")
 Call<ResponseBody> login(@Body Login login);

 @GET("util/getCountries")
    Call<ResponseBody> countries();

 @POST("util/findUser")
    Call<FindUser> findUser(@Body EmailBody email);

 @POST("util/getMarkers")
    Call<List<FightMarkers>> fightMarkers(@Body Email email);

 @POST("util/findUser")
    Call<List<UserOverview>> userOverview (@Body Email email);
}
