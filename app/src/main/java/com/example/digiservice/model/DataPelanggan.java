package com.example.digiservice.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class DataPelanggan {
    @SerializedName("kode")
    public Integer kode;
    @SerializedName("result")
    public List<Pelanggan> result = null;

    public Integer getKode() {
        return kode;
    }

    public void setKode(Integer kode) {
        this.kode = kode;
    }

    public List<Pelanggan> getResult() {
        return result;
    }

    public void setResult(List<Pelanggan> result) {
        this.result = result;
    }
}
