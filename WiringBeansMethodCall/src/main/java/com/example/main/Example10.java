package com.example.main;

import com.example.beans.Person;
import com.example.beans.Vehicle;
import com.example.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example10 {

    public static void main(String[] args) {

        var context=new AnnotationConfigApplicationContext(ProjectConfig.class);
        Vehicle veh=context.getBean(Vehicle.class);
        Person person=context.getBean(Person.class);
        System.out.println("Vehicle from the Spring Container "+person.getName());
        System.out.println("Person from the Spring Container "+person.getName());
        System.out.println("Person that person owns is "+person.getVehicle().getName());
    }
}
