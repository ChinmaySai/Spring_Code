package com.chinmay.main;

import com.chinmay.beans.Vehicle;
import com.chinmay.config.ProjectConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Ex_17_SingleTon_Bean_Scope {
    public static void main(String[] args) {
        ApplicationContext context=new AnnotationConfigApplicationContext(ProjectConfig.class);
        Vehicle veh=context.getBean(Vehicle.class);
        Vehicle veh1=context.getBean("VehicleServices", Vehicle.class);
        System.out.println("Hash Code of Object 1: "+veh.hashCode());
        System.out.println("Hash Code of Object 2 :"+veh1.hashCode());

        if(veh==veh1)
        {
            System.out.println("Same bean is returned from the context");
        }
    }
}
