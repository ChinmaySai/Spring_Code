package com.example.main;

import com.example.beans.Person;
import com.example.beans.Vehicle;
import com.example.config.ProjectConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Ex_13_AutoWired_Setter_method {

    public static void main(String[] args) {

        ApplicationContext context=new AnnotationConfigApplicationContext(ProjectConfig.class);
        Person per=context.getBean(Person.class);
        Vehicle veh= context.getBean(Vehicle.class);
        System.out.println("Person in the Spring Context: "+per.getPersonname());
        System.out.println("Vehicle name in the Spring Context :"+veh.getName());
        System.out.println("Vehicle that person own is : "+per.getVehicle());

    }
}
