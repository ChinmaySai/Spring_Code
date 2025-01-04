package com.chinmay.main;

import com.chinmay.beans.Person;
import com.chinmay.beans.Vehicle;
import com.chinmay.config.ProjectConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Ex_18_Eazy_Lazy_Instantiation {
    public static void main(String[] args) {

        ApplicationContext context=new AnnotationConfigApplicationContext(ProjectConfig.class);
        System.out.println("Above displayed are the Beans created during the startup  \n");
        Vehicle vehicle=context.getBean("vehicleBean", Vehicle.class);
        System.out.println("Beans Created after the startup : ");
        Person person=context.getBean("personbean", Person.class);
    }
}
