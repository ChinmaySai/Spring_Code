package com.chinmay.beans;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("VehicleServices")
@Scope(BeanDefinition.SCOPE_SINGLETON)

public class Vehicle {

    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
