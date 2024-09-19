package net.javaguides.springannoations.service;

import org.springframework.stereotype.Service;

@Service
public class MyService {
    public String hello(){
        return "Hello from My service";
    }
}
