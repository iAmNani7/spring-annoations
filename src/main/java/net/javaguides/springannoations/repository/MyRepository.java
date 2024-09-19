package net.javaguides.springannoations.repository;

import org.springframework.stereotype.Repository;

@Repository
public class MyRepository {
    public String hello(){
        return "Hello from Repository";
    }
}
