package com.controle_despesa.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello") // path (endereço do recurso)

public class HelloController {

    @GetMapping
    public String getHello(){
        return "Hello Spring";
    }

    @GetMapping("/nome")
    public String nome(){
        return "Alice Moraes";
    }
}
