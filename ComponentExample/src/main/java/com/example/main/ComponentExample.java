package com.example.main;

import com.example.beans.Vehicle;
import com.example.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ComponentExample {

    public static void main(String[] args) {

        var context=new AnnotationConfigApplicationContext(ProjectConfig.class);
        Vehicle veh=context.getBean(Vehicle.class);
        System.out.println("Vehicle from the Spring Container "+veh.getName());
        veh.sayHello();

    }
}
