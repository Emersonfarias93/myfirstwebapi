package br.com.emersonfarias.myfirstwebapi.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelComeController {
    @GetMapping
    public String welcome(){
        return "Welcome to MyFirst Web API";
    }
}
