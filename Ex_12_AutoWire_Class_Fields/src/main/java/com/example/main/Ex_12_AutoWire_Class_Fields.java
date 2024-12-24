package com.example.main;

import com.example.config.ProjectConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.example.beans.*;

public class Ex_12_AutoWire_Class_Fields {
    public static void main(String[] args) {


        ApplicationContext context= new AnnotationConfigApplicationContext(ProjectConfig.class);
        Vehicle veh=context.getBean(Vehicle.class);
        Person per=context.getBean(Person.class);

        System.out.println("Person bean from Spring context "+per.getName());
        System.out.println("Vehicle bean from Spring context "+veh.getName());
        System.out.println("Vehicle that person own is : "+per.getVehicle());



    }
}
