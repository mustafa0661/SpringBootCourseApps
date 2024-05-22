package com.spring.deneme.controller;

import com.spring.deneme.JsonDondurme.Ogrenci;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BirincilUygulamaPutDondurmeController {
    @PutMapping("ilk/{yas}")
    public Ogrenci putOgrenci(@RequestBody Ogrenci ogrenci, @PathVariable("yas") Integer yasBir){
        System.out.println(ogrenci.getAd());
        System.out.println(ogrenci.getSoyad());
        return ogrenci;
    }

}
