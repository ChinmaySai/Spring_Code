package com.chinmay.georgeschool.controller;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HomeController {

    @RequestMapping(value= {"","/","home","/login"})
    public String displayHomePage()
    {
        return "home.html";
    }
}
