package com.spring.deneme.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BirincilUygulamaDeleteDondurmeController {
    @DeleteMapping("ilk/{yas}")
    public String silOgrenci(@PathVariable("yas") Integer yasBir){
        return "Silindi!!";
    }

}
