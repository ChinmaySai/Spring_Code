package com.chinmay.main;

import com.chinmay.beans.Person;
import com.chinmay.beans.Vehicle;
import com.chinmay.config.ProjectConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Ex_19_Proto_Type_Scope {
    public static void main(String[] args) {

        ApplicationContext context=new AnnotationConfigApplicationContext(ProjectConfig.class);
        System.out.println("Above are the Beans created during the startup : \n");
        Vehicle vehicle=context.getBean("vehicleBean", Vehicle.class);
        Vehicle vehicle1=context.getBean("vehicleBean", Vehicle.class);

        if(vehicle1==vehicle)
        {
            System.out.println("Beans created are of singleton Scope");
        }
        else {
            System.out.println("Beans created are of prototype Scope");
        }
    }
}
