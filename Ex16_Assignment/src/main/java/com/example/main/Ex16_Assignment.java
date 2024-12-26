package com.example.main;

import com.example.beans.Person;
import com.example.beans.Vehicle;
import com.example.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Ex16_Assignment {

    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        String[] persons = context.getBeanNamesForType(Person.class);//Returns Name of beans matching with Person class
        Person person = context.getBean(Person.class);
        String[] names = context.getBeanNamesForType(Vehicle.class);//Returns Name of beans matching with Vehicle class
        /*Vehicle vehicle = context.getBean(Vehicle.class);
        vehicle.getVehicleServices().playMusic();
        vehicle.getVehicleServices().rotateTyres();*/
        person.getVehicle().getVehicleServices().playMusic();
        person.getVehicle().getVehicleServices().rotateTyres();
    }

}
