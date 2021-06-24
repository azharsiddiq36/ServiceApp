package com.example.digiservice.model;

import com.google.gson.annotations.SerializedName;

public class Pelanggan {
    @SerializedName("pelanggan_id")
    public Integer pelangganId;
    @SerializedName("pelanggan_nama")
    public String pelangganNama;
    @SerializedName("pelanggan_hp")
    public String pelangganHp;
    @SerializedName("pelanggan_alamat")
    public String pelangganAlamat;
    @SerializedName("pelanggan_foto")
    public String pelangganFoto;
    @SerializedName("pelanggan_date_created")
    public String pelangganDateCreated;
    @SerializedName("pelanggan_date_updated")
    public String pelangganDateUpdated;
    @SerializedName("pelanggan_lat")
    public String pelangganLat;
    @SerializedName("pelanggan_lng")
    public String pelangganLng;

    public Integer getPelangganId() {
        return pelangganId;
    }

    public void setPelangganId(Integer pelangganId) {
        this.pelangganId = pelangganId;
    }

    public String getPelangganNama() {
        return pelangganNama;
    }

    public void setPelangganNama(String pelangganNama) {
        this.pelangganNama = pelangganNama;
    }

    public String getPelangganHp() {
        return pelangganHp;
    }

    public void setPelangganHp(String pelangganHp) {
        this.pelangganHp = pelangganHp;
    }

    public String getPelangganAlamat() {
        return pelangganAlamat;
    }

    public void setPelangganAlamat(String pelangganAlamat) {
        this.pelangganAlamat = pelangganAlamat;
    }

    public String getPelangganFoto() {
        return pelangganFoto;
    }

    public void setPelangganFoto(String pelangganFoto) {
        this.pelangganFoto = pelangganFoto;
    }

    public String getPelangganDateCreated() {
        return pelangganDateCreated;
    }

    public void setPelangganDateCreated(String pelangganDateCreated) {
        this.pelangganDateCreated = pelangganDateCreated;
    }

    public String getPelangganDateUpdated() {
        return pelangganDateUpdated;
    }

    public void setPelangganDateUpdated(String pelangganDateUpdated) {
        this.pelangganDateUpdated = pelangganDateUpdated;
    }

    public String getPelangganLat() {
        return pelangganLat;
    }

    public void setPelangganLat(String pelangganLat) {
        this.pelangganLat = pelangganLat;
    }

    public String getPelangganLng() {
        return pelangganLng;
    }

    public void setPelangganLng(String pelangganLng) {
        this.pelangganLng = pelangganLng;
    }
}
