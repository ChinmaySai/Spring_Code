package com.example.beans;

import org.springframework.stereotype.Component;

@Component
public class Vehicle {

    private String name="Toyata";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString(){
        return name;
    }


}
