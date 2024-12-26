package com.example.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Person {

    private String name="Chinmay";
    private final Vehicle vehicle;

    @Autowired
    public Person(@Qualifier("vehicle2") Vehicle vehicle){
        System.out.println("Vehicle bean Autowired by Spring");
        this.vehicle = vehicle;
    }

    /*Bean will be injected
    @Autowired
    public Person(@Qualifier("vehicle1") Vehicle vehicle){
        System.out.println("Vehicle bean Autowired by Spring");
        this.vehicle = vehicle;
    }

     */

    /*bean with vehicle3 will be injected
    @Autowired
    public Person(Vehicle vehicle3){
        System.out.println("Vehicle bean Autowired by Spring");
        this.vehicle = vehicle3;
    }
*/
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

}