package com.spring.deneme.controller;

import com.spring.deneme.JsonDondurme.Ogrenci;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BirincilUygulamaPostDondurmeController {
    @PostMapping("ilkOlustur")
    public Ogrenci postOgrenci(@RequestBody Ogrenci ogrenci){
        System.out.println(ogrenci.getAd());
        System.out.println(ogrenci.getSoyad());
        System.out.println(ogrenci.getYas());
        return ogrenci;
    }
}
