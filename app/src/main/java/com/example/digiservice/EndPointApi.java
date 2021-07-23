package com.example.digiservice;

import com.example.digiservice.model.ResponseModel;

import java.util.ArrayList;

import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class EndPointApi {
    private ServiceInterface serviceInterface;
    protected ArrayList<ResponseModel> inserTechnician(MultipartBody.Part image,
                                                       MultipartBody.Part certificate,
                                                       RequestBody name,
                                                       RequestBody email,
                                                       RequestBody address,
                                                       RequestBody longitude,
                                                       RequestBody latitude,
                                                       RequestBody phone_number,
                                                       RequestBody total_score,
                                                       RequestBody responden,
                                                       RequestBody description){
        ArrayList<ResponseModel> a = new ArrayList<>();
        serviceInterface.registryAsTechnician(
                image,
                certificate,
                name,
                email,
                address,
                longitude,
                latitude,
                phone_number,
                total_score,
                responden,
                description).enqueue(new Callback<ResponseModel>() {
            @Override
            public void onResponse(Call<ResponseModel> call, Response<ResponseModel> response) {
                a.add(response.body());
            }

            @Override
            public void onFailure(Call<ResponseModel> call, Throwable t) {

            }
        });
        return a;
    }
}
