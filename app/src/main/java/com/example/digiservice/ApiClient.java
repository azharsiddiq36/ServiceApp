package com.example.digiservice;
import retrofit2.Retrofit;

public class ApiClient {
    public static Retrofit retrofit = null;
    public static Retrofit getApiClient(String BASE_URL){
        if(retrofit==null){
            retrofit = new Retrofit.Builder().baseUrl(BASE_URL)
                    .build();
        }
        return retrofit;
    }
}
