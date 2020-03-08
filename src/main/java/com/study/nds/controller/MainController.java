package com.study.nds.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/main")
    public String greeting( Model model) {
        model.addAttribute("title", "Main page");
        return "main";
    }

}
