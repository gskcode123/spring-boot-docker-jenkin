package com.docker.jenkin.Springbootdockerjenkin;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

    @GetMapping("/index")
    public String getWelcomeMessage(){
        return "Welcome to docker with jenkins.";
    }
}
