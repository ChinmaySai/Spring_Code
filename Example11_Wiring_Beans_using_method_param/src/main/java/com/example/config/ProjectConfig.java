package com.example.config;

import com.example.beans.Person;
import com.example.beans.Vehicle;
import org.springframework.context.annotation.Bean;

public class ProjectConfig {

    @Bean
    Vehicle vehicle()
    {
        Vehicle vehicle= new Vehicle();
        vehicle.setName("BMW");
        return vehicle;

    }
    @Bean
    Person person(Vehicle vehicle)
    {
        Person person= new Person();
        person.setName("Chinmay");
        person.setVehicle(vehicle);
        return person;
    }
}
