package com.example.main;

import com.example.beans.Vehicle;
import com.example.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example3 {

    public static void main(String[] args) {

        var context=new AnnotationConfigApplicationContext(ProjectConfig.class);
        Vehicle veh=context.getBean("Audi",Vehicle.class);
        System.out.println("Vehicle from the Spring Container "+veh.getName());

        Vehicle veh1=context.getBean("Ferrari",Vehicle.class);
        System.out.println("Vehicle from the Spring Container "+veh1.getName());

        Vehicle veh2 =context.getBean("BMW",Vehicle.class);
        System.out.println("Vehicle from the Spring Container "+ veh2.getName());

    }
}
