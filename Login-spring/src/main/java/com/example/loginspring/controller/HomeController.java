package com.example.loginspring.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {


    //logout
    @GetMapping("/home")
    public String showHome(){
        return "home-page";
    }
}
