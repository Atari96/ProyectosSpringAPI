package com.practica2.Proyecto2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/inicio")
public class controller1 {

    @GetMapping("/saludar")
    public String saludar(){
        return "Hola;";
        }
    @GetMapping("/despedir")
    public String despedir(){
        return "ciao;";
    }

}
