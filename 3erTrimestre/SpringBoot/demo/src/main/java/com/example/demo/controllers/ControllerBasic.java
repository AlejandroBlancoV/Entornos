package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerBasic {
    @GetMapping(path = "/hola")
    public String hola() {
        return "Hola Mundo, desde spring boot";
    }

    @GetMapping(path = "/")
    public String isOn() {
        return "CEBEM server starter";
    }
}
