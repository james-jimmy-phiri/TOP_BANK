package com.example.top_bank.API;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;


public interface API {

    @FormUrlEncoded
    @POST("/register")
    Call<ResponseBody> register(
      @Field("fname") String fname,
      @Field("lname") String lname,
      @Field("email") String email,
      @Field("phone") String phone,
      @Field("account") String account,
      @Field("pin") String pin

    );



}
