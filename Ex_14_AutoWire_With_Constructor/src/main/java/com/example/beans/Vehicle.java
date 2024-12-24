package com.example.beans;

import org.springframework.stereotype.Component;

@Component
public class Vehicle {

    private String name="Audi";
    public String getName() {
        return name;
    }
    public String toString()
    {
        return "[vehicle name="+name+"]";
    }

}
