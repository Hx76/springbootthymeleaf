package com.example.springbootthymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;

@Controller
public class PageController {
    @RequestMapping("/index")
    public String page(){
        return "index";
    }

    @GetMapping("/show")
    public String show(Model model){
        model.addAttribute("msg","helelelelle");
        model.addAttribute("date",new Date());
        return "index";
    }
}
