package com.chinmay.beans;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component(value="personbean")
public class Person {
    public Person()
    {
        System.out.println("Person bean is created");
    }
}
