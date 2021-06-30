package com.example.digiservice;

public class CombineApi {
    public static final String BASE_URL = "http://digi-service.azharsiddiq.site/";
//    public static final String img_url = "http://azharsiddiq.site/assets/img/upload/";
    public static ServiceInterface getApiService(){
        return ApiClient.getApiClient(BASE_URL).create(ServiceInterface.class);
    }
}
