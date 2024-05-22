package com.spring.deneme.controller;

import com.spring.deneme.JsonDondurme.Ogrenci;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BirincilUygulamaPathVariableDondurmeController {
    @GetMapping("ilkPathVar/{yas}")
    public Ogrenci pathVariableOgrenci(@PathVariable("yas") Integer ogrenciYas){
        return new Ogrenci("Mustafa","UZUN",ogrenciYas);
    }
}
