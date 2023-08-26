package com.proyecto1.Proyecto1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/inicio")
public class ControllerSaludar {
    @GetMapping("/saludar")
    public String saludar(){
        return "Hola caracola";
    }
    @GetMapping("/despedir")
    public String depedir(){
        return ("adios caracolo");
    }
}
