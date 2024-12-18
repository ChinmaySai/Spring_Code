package com.example.beans;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

@Component
public class Vehicle {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @PostConstruct
    public void initalize()
    {
        this.name="Audi";
    }
    public void sayHello()
    {
        System.out.println("Printing Hello in Post Constructor Example");
    }
}
