package net.javaguides.springannoations.service;

import org.springframework.stereotype.Component;

@Component
public class NonVegPizza implements Pizza{

    @Override
    public String getPizza() {
        return "Non veg pizza";
    }
}
