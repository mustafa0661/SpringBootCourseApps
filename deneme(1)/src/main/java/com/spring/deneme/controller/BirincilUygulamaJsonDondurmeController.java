package com.spring.deneme.controller;

import com.spring.deneme.JsonDondurme.Ogrenci;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class BirincilUygulamaJsonDondurmeController {

/*    @GetMapping("ilkJson")
    public Ogrenci getIlkUygulamaJson(){
        Ogrenci ogrenci = new Ogrenci("Mustafa","UZUN",1071);
        return ogrenci;
    }*/
    @GetMapping("ilkListe")
    public List<Ogrenci> getIlkUygulamaListe(){
        List<Ogrenci> ogrenciler = new ArrayList<>();
        ogrenciler.add(new Ogrenci("Mustafa","UZUN",1071));
        ogrenciler.add(new Ogrenci("Sinan","Toklu",1071));
        ogrenciler.add(new Ogrenci("Talha","Zeren",1071));
        return ogrenciler;
    }

}
