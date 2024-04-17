package br.com.santander.mssx.mssx.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Produtos {
    @GetMapping("/ap1")
    public String HelloWorld(){
        return "Matheus";
    }
}
