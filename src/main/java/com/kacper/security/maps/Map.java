package com.kacper.security.maps;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Map {

    @GetMapping("/registerpage")
    public String register(){
        return "registerpage";
    }

    @GetMapping("/loginpage")
    public String login(){
        return "loginpage";
    }

    @GetMapping("/mainpage")
    public String mainpage(){
        return "mainpage";
    }

    @GetMapping("/contacts")
    public String contacts(){
        return "contacts";
    }
}
