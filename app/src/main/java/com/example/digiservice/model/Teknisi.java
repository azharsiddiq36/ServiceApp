package com.example.digiservice.model;

import com.google.gson.annotations.SerializedName;

public class Teknisi {
    @SerializedName("teknisi_id")
    public Integer teknisiId;
    @SerializedName("teknisi_nama")
    public String teknisiNama;
    @SerializedName("teknisi_alamat")
    public String teknisiAlamat;
    @SerializedName("teknisi_lat")
    public String teknisiLat;
    @SerializedName("teknisi_lng")
    public String teknisiLng;
    @SerializedName("teknisi_hp")
    public String teknisiHp;
    @SerializedName("teknisi_date_created")
    public String teknisiDateCreated;
    @SerializedName("teknisi_total_score")
    public Integer teknisiTotalScore;
    @SerializedName("teknisi_total_responden")
    public Integer teknisiTotalResponden;
    @SerializedName("teknisi_deskripsi")
    public String teknisiDeskripsi;
    @SerializedName("teknisi_foto")
    public String teknisiFoto;
    @SerializedName("teknisi_sertifikat")
    public String teknisiSertifikat;

    public Integer getTeknisiId() {
        return teknisiId;
    }

    public void setTeknisiId(Integer teknisiId) {
        this.teknisiId = teknisiId;
    }

    public String getTeknisiNama() {
        return teknisiNama;
    }

    public void setTeknisiNama(String teknisiNama) {
        this.teknisiNama = teknisiNama;
    }

    public String getTeknisiAlamat() {
        return teknisiAlamat;
    }

    public void setTeknisiAlamat(String teknisiAlamat) {
        this.teknisiAlamat = teknisiAlamat;
    }

    public String getTeknisiLat() {
        return teknisiLat;
    }

    public void setTeknisiLat(String teknisiLat) {
        this.teknisiLat = teknisiLat;
    }

    public String getTeknisiLng() {
        return teknisiLng;
    }

    public void setTeknisiLng(String teknisiLng) {
        this.teknisiLng = teknisiLng;
    }

    public String getTeknisiHp() {
        return teknisiHp;
    }

    public void setTeknisiHp(String teknisiHp) {
        this.teknisiHp = teknisiHp;
    }

    public String getTeknisiDateCreated() {
        return teknisiDateCreated;
    }

    public void setTeknisiDateCreated(String teknisiDateCreated) {
        this.teknisiDateCreated = teknisiDateCreated;
    }

    public Integer getTeknisiTotalScore() {
        return teknisiTotalScore;
    }

    public void setTeknisiTotalScore(Integer teknisiTotalScore) {
        this.teknisiTotalScore = teknisiTotalScore;
    }

    public Integer getTeknisiTotalResponden() {
        return teknisiTotalResponden;
    }

    public void setTeknisiTotalResponden(Integer teknisiTotalResponden) {
        this.teknisiTotalResponden = teknisiTotalResponden;
    }

    public String getTeknisiDeskripsi() {
        return teknisiDeskripsi;
    }

    public void setTeknisiDeskripsi(String teknisiDeskripsi) {
        this.teknisiDeskripsi = teknisiDeskripsi;
    }

    public String getTeknisiFoto() {
        return teknisiFoto;
    }

    public void setTeknisiFoto(String teknisiFoto) {
        this.teknisiFoto = teknisiFoto;
    }

    public String getTeknisiSertifikat() {
        return teknisiSertifikat;
    }

    public void setTeknisiSertifikat(String teknisiSertifikat) {
        this.teknisiSertifikat = teknisiSertifikat;
    }
}
