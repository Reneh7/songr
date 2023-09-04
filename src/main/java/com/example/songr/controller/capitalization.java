package com.example.songr.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class capitalization {
    @GetMapping("/capitalize/{text}")
    public String capitalize(Model m , @PathVariable String text)
    {
        System.out.println("print text: "+text);
        String uppercaseText = text.toUpperCase();

        m.addAttribute("uppercaseText", uppercaseText);

        return "capitalization.html";
    }
}
