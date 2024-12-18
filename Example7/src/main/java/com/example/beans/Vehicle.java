package com.example.beans;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
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

    @PreDestroy
    public void destroy()
    {
        System.out.println("Exceuting before deleting all the beans");
    }
    @PostConstruct
    public void intialize()
    {
    this.name="Honda";
    }
}
