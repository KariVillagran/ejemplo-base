package com.example.demo.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClienteController {

    @GetMapping("/")
    public String getUsuarios(){
        return "Hello world";
    }
    
    @PostMapping("/")
    public String crearUsuario(){
        return "Crear un usuario";
    }

}
