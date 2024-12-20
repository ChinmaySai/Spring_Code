package com.example.beans;

public class Person {
    public String name;
    Vehicle vehicle;

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public void setName(String name) {
           this.name=name;
    }
    public String getName() {
        return name;
    }

}
