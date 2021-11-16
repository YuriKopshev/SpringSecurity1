package ru.netology.SpringSecurity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyWebController {

    //this endpoint without authenticated
    @GetMapping("/account")
    private String hello(){
       return "Hello from user account!";
    }

    //this endpoint only with authenticated
    @GetMapping("/account-edit")
    private String edit(){
        return "Welcome to account options!";
    }

    //this endpoint only with authenticated
    @GetMapping("/database")
    private String dataAccess(){
        return "Welcome to database!";
    }

}
