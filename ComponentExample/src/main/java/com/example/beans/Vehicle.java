package com.example.beans;

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

    public void sayHello()
    {
        System.out.println("Inside sayHello() method after creating bean using @Component Annotation");
    }
}
