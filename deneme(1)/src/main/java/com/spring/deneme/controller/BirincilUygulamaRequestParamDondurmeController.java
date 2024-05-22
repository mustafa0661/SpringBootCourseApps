package com.spring.deneme.controller;

import com.spring.deneme.JsonDondurme.Ogrenci;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BirincilUygulamaRequestParamDondurmeController {
    @GetMapping("ilkReqPar")
    public Ogrenci requestParamOgrenci(@RequestParam Integer yas){
        return new Ogrenci("Sinan","Toklu",yas);
    }

}
