package com.example.main;

import com.example.beans.Vehicle;
import com.example.config.ProjectConfig;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Random;
import java.util.function.Supplier;

public class  Example8 {

    public static void main(String[] args) {

        var context=new AnnotationConfigApplicationContext(ProjectConfig.class);
        Vehicle shine=new Vehicle();
        shine.setName("Shine");
        Supplier<Vehicle> shineSupplier=() ->shine;

        Supplier<Vehicle> javaSupplier=() ->{
            Vehicle javaSup=new Vehicle();
            javaSup.setName("Java_Bike");
            return javaSup;
        };
        Vehicle shineBike= null;
        Vehicle javaBike = null;
        Random rnd=new Random();
        int randomNumber=rnd.nextInt(10);
        if(randomNumber%2==0)
        {
            context.registerBean("Java Bike", Vehicle.class,javaSupplier);
        }
        else
        {
            context.registerBean("Shine Bike", Vehicle.class,shineSupplier);
        }
        Vehicle veh=context.getBean(Vehicle.class);
        System.out.println("Random number "+randomNumber);
        System.out.println("Vehicle from the Spring Container "+veh.getName());

        try {
            shineBike = context.getBean("Java Bike",Vehicle.class);
        }catch (NoSuchBeanDefinitionException noSuchBeanDefinitionException){
            System.out.println("Error while creating Volkswagen vehicle");
        }
        try {
            javaBike = context.getBean("Shine Bike",Vehicle.class);
        }catch (NoSuchBeanDefinitionException noSuchBeanDefinitionException){
            System.out.println("Error while creating Audi vehicle");
        }

        if(null != shineBike){
            System.out.println("Programming Vehicle name from Spring Context is: " + shineBike.getName());
        }else{
            System.out.println("Programming Vehicle name from Spring Context is: " + javaBike.getName());
        } context.close();
    }
}
