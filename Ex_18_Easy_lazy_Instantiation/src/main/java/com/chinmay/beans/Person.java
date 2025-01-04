package com.chinmay.beans;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component(value="personbean")
@Lazy
public class Person {
    public Person()
    {
        System.out.println("Person bean is created");
    }
}
