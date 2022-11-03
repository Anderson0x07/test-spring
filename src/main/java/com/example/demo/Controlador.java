/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author estudiante       
 */
@Controller
public class Controlador {
    @GetMapping("/")
    public String inicio(Model model){
        
        String saludo = "Hola mundo";

        model.addAttribute("saludo",saludo);
        
        
        return "index";
    }
}
