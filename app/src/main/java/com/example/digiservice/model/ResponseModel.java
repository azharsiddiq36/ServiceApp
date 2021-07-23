package com.example.digiservice.model;

import com.google.gson.annotations.SerializedName;

public class ResponseModel {
    @SerializedName("kode")
    public Integer kode;
    @SerializedName("success")
    public Boolean success;
    @SerializedName("message")
    public String message;

    public Integer getKode() {
        return kode;
    }

    public void setKode(Integer kode) {
        this.kode = kode;
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
