package com.example.config;

import com.example.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan(basePackages="com.example.beans")
public class ProjectConfig {

    @Bean
    public Vehicle vehicle1() {
        Vehicle veh=new Vehicle();
        veh.setName("Honda City");
        return veh;
    }

    @Bean
    //@Primary
    public Vehicle vehicle2() {
        Vehicle veh=new Vehicle();
        veh.setName("BMW");
        return veh;
    }

    @Bean
    public Vehicle vehicle3() {
        Vehicle veh=new Vehicle();
        veh.setName("Lamborghini");
        return veh;
    }


}