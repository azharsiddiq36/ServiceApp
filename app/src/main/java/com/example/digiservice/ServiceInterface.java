package com.example.digiservice;

import com.example.digiservice.model.ResponseModel;

import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;

public interface ServiceInterface {
    @FormUrlEncoded
//    @POST("api/teknisi-all")
//    Call<ResponsePengguna> loginRequest(@Field("pengguna_username") String username,
//                                        @Field("pengguna_password") String password);


    @Multipart
    @POST("api/teknisi-insert")
    Call<ResponseModel> registryAsTechnician(@Part MultipartBody.Part image, 
                                             @Part MultipartBody.Part certificate,
                                             @Part("teknisi_nama") RequestBody name,
                                             @Part("teknisi_email") RequestBody email,
                                             @Part("teknisi_alamat") RequestBody address,
                                             @Part("teknisi_lng") RequestBody longitude,
                                             @Part("teknisi_lat") RequestBody latitude,
                                             @Part("teknisi_hp") RequestBody phone_number,
                                             @Part("teknisi_total_score") RequestBody total_score,
                                             @Part("teknisi_total_responden") RequestBody responden,
                                             @Part("teknisi_deskripsi") RequestBody description);

}
