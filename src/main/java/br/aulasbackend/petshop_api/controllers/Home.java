package br.aulasbackend.petshop_api.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Home {
    @RequestMapping("/home")
    public String goHome() {
        return "Hello Home Page";
    }
}
