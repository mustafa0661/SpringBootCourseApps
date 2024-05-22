package com.lab7.thymeleaf.controller;

import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ilkKontroller {

    @GetMapping("/ilk")
    public String ilkMetod(Model model){
        model.addAttribute("mesaj","Merhaba Mustafa UZUN");
        return "sayfa";
    }
}
