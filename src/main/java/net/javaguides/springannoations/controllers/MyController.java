package net.javaguides.springannoations.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {
public String hello(){
    return "Hello from Controller";
}
}
