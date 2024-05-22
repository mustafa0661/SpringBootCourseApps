package com.spring.deneme.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BirinciUygulamaController {
    @GetMapping("ilk")
    public String ilkUygulama(){
        return "Merhaba Mustafa";
    }

}
