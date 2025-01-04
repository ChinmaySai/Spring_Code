package com.chinmay.beans;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("vehicleBean")
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class Vehicle {

    public Vehicle()
    {
        System.out.println("Vehicle is created");
    }
}
