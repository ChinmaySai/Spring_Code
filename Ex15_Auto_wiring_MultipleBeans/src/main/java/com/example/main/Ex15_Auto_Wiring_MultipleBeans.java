package com.example.main;

import com.example.beans.Vehicle;
import com.example.config.ProjectConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.example.beans.Person;

public class Ex15_Auto_Wiring_MultipleBeans {
    public static void main(String[] args) {

        ApplicationContext context=new AnnotationConfigApplicationContext(ProjectConfig.class);
        Person per=context.getBean(Person.class);
        System.out.println(per.getName());
        System.out.println("Vehicle that is owned by "+per.getName()+" is "+per.getVehicle());
    }
}
