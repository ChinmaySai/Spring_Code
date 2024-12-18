package com.example.config;

import com.example.beans.Person;
import com.example.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ProjectConfig {

    @Primary
    @Bean("BMW")
    public Vehicle vehicle()
    {
        var veh=new Vehicle();
        veh.setName("BMW");
        return veh;
    }
    @Bean
   public Person person()
    {
        var p=new Person();
        p.setName("Chinmay");
        p.setVehicle(vehicle());
        return p;
    }
}
