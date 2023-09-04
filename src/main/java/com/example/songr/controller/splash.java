package com.example.songr.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class splash {
    @GetMapping("/")
    public String showSplashPage() {
        return "splash";
    }
}
