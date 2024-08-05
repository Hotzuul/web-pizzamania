package com.example.Pizza;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Controlador {
    
    @GetMapping("/")
    public String inicio(Model model) {
        return "login";
    }
}
