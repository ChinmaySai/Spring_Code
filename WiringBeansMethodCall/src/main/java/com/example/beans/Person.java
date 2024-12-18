package com.example.beans;

public class Person {
    public Person()
    {
        System.out.println("Person Constructor created by Spring");
    }
    private String name;
    private Vehicle vehicle;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
    public Vehicle getVehicle()
    {
        return vehicle;

    }
}
