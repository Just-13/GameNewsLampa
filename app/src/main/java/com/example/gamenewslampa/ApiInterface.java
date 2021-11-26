package com.example.gamenewslampa;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiInterface {

    String BASE_URL = "http://188.40.167.45:3001/";

    @GET()
    Call<mainNews> getNews();
}
