package com.chinmay.georgeschool.controller;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class HomeController {

    @RequestMapping(value= {"","/","home","/login"})
    public String displayHomePage(Model model)
    {
    	model.addAttribute("username","Chinmay Sai");
        return "home";
    }
}
