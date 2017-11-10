package com.example.dhiviya.dhivya;

import retrofit2.Call;
import retrofit2.http.GET;


public interface ApiService {


   // @GET("interview_pickzy/interview.json")
   @GET("wpApp/api.php?format=json&mod=posts&method=getPostsList&format=json")
    Call<MyJson> getMyJSON();
}
