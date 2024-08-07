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

    @GetMapping("/registrar")
    public String inicio1(Model model) {
        return "registrar";
    }

    @GetMapping("/index")
    public String inicio2(Model model) {
        return "index";
    }
}
