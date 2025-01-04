package com.chinmay.beans;

import org.springframework.stereotype.Component;

@Component("vehicleBean")
public class Vehicle {

    public Vehicle()
    {
        System.out.println("Vehicle is created");
    }
}
