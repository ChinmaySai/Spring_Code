package com.example.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Person {

    @Autowired
    public Vehicle veh;

    public Vehicle getVehicle() {

        return veh;
    }


    public void setVehicle(Vehicle veh) {
        this.veh = veh;
    }



    public void setName(String name) {
        this.name = name;
    }

    String name="Chinmay";

    public String getName() {
        return name;
    }


}
