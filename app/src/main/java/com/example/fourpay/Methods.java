package com.example.fourpay;

import retrofit2.Call;
import retrofit2.http.GET;

public interface Methods {

    @GET("ApiFourpay/api.json")
    Call<Model> getAllData();

}


