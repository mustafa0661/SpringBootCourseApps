package com.lab7.thymeleaf.controller;

import com.lab7.thymeleaf.ifadeler.Ogrenci;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class IfadeController {

    @GetMapping("/kosul")
    public String kosulOrnek(Model model) {
        Ogrenci ogrenci = new Ogrenci("Enes","UZUN",1071);
        Ogrenci ogrenci1 = new Ogrenci("Muhammet","UZUN",1571);
        Ogrenci ogrenci2 = new Ogrenci("Talha","ZEREN",22);
        Ogrenci ogrenci3 = new Ogrenci("Erkam","UÇAN",23);
        List<Ogrenci> liste = new ArrayList<>();
        liste.add(ogrenci);
        liste.add(ogrenci1);
        liste.add(ogrenci2);
        liste.add(ogrenci3);
        model.addAttribute("ogrenciKosul",liste);
        return "kosulSayfa";
    }

    @GetMapping("/iterasyon")
    public String iterasyonOrnek(Model model) {
        Ogrenci ogrenci = new Ogrenci("Enes","UZUN",1071);
        Ogrenci ogrenci1 = new Ogrenci("Muhammet","UZUN",1571);
        Ogrenci ogrenci2 = new Ogrenci("Talha","ZEREN",22);
        Ogrenci ogrenci3 = new Ogrenci("Erkam","UÇAN",23);
        List<Ogrenci> liste = new ArrayList<>();
        liste.add(ogrenci);
        liste.add(ogrenci1);
        liste.add(ogrenci2);
        liste.add(ogrenci3);
        model.addAttribute("ogrenciiter",liste);
        return "iterasyonSayfa";
    }

    @GetMapping("/parca")
    public String parcaIfade(){
        return "parcaSayfa";
    }

    @GetMapping("/link")
    public String linkIfade(Model model){
        model.addAttribute("ad","Mustafa");
        return "linkSayfa";
    }

    @GetMapping("/i18n")
    public String i18nIfade() {
        return "i18nSayfa";
    }

    @GetMapping("/secim")
    public String degiskenIfade(Model model) {
        Ogrenci ogrenci = new Ogrenci("Mustafa","UZUN",1461);
        model.addAttribute("secim", ogrenci);
        return "secimSayfa";
    }
}
