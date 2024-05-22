package com.obs.obs.DataTransferObject;

public class OgrenciDTO {

    private Long num;
    private String ad;
    private String soyad;
    private int yas;

    public OgrenciDTO() {

    }

    public OgrenciDTO(Long num, String ad, int yas, String soyad) {
        this.num = num;
        this.ad = ad;
        this.yas = yas;
        this.soyad = soyad;
    }

    public Long getNum() {
        return num;
    }

    public void setNum(Long num) {
        this.num = num;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }
}
