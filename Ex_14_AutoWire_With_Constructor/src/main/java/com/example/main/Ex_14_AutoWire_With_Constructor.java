package com.example.main;

import com.example.beans.Person;
import com.example.beans.Vehicle;
import com.example.config.ProjectConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.w3c.dom.ls.LSOutput;

public class Ex_14_AutoWire_With_Constructor {

    public static void main(String[] args) {
        ApplicationContext context=new AnnotationConfigApplicationContext(ProjectConfig.class);
        Person person=context.getBean(Person.class);
        Vehicle veh=context.getBean(Vehicle.class);
        System.out.println(person.getName());
        System.out.println("Vehicle that is injected is "+person.getVehicle());
        System.out.println("Vehcile present in context is "+veh);

    }
}
