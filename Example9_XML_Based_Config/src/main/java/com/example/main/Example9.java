package com.example.main;

import com.example.beans.Vehicle;
import com.example.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Example9 {

    public static void main(String[] args) {

        var context=new ClassPathXmlApplicationContext("config.xml");
        Vehicle veh=context.getBean(Vehicle.class);
        System.out.println("Vehicle created by XML based Configuration "+veh.getName());

    }
}
