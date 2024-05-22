package com.spring.deneme.JsonDondurme;

public class Ogrenci {
    private String ad;
    private String soyad;
    private Integer yas;

    public Ogrenci() {

    }

    public Ogrenci(String ad, String soyad, Integer yas) {
        this.ad = ad;
        this.soyad = soyad;
        this.yas = yas;
    }

    public Integer getYas() {
        return yas;
    }

    public void setYas(Integer yas) {
        this.yas = yas;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }
}
