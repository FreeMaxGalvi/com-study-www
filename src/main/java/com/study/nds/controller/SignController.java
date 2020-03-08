package com.study.nds.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SignController {
    @GetMapping("/sign")
    public String signing( Model model) {
        model.addAttribute("title", "Sign in");
        return "sign";
    }
}
