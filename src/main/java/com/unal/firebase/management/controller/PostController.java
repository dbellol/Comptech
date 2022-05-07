package com.unal.firebase.management.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/post")
public class PostController{ 
    
    @GetMapping(value = "/greet")
    public String greet()
   {
       return "Hello world"; 
   }
}