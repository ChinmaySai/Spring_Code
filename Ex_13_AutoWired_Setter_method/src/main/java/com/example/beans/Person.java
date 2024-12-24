package com.example.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Person {

    private Vehicle vehicle;

    public Vehicle getVehicle()
    {
        return vehicle;
    }
    @Autowired
    public void setVehicle(Vehicle vehicle)
    {
        System.out.println("Inside the set Vehicle Setter method");
        this.vehicle=vehicle;
    }
   private String person_name="Chinmay Sai";

    public String getPersonname() {
        return person_name;
    }

    public void setPersonname(String person_name) {
        this.person_name = person_name;
    }
}
