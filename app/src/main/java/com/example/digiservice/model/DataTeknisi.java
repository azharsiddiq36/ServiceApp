package com.example.digiservice.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class DataTeknisi {
    @SerializedName("kode")
    public Integer kode;
    @SerializedName("result")
    public List<Teknisi> result = null;

    public Integer getKode() {
        return kode;
    }

    public void setKode(Integer kode) {
        this.kode = kode;
    }

    public List<Teknisi> getResult() {
        return result;
    }

    public void setResult(List<Teknisi> result) {
        this.result = result;
    }
}
