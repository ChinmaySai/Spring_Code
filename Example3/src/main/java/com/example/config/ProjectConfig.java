package com.example.config;

import com.example.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {

    @Bean(name="Audi")
    Vehicle vehicle1()
    {
        var veh=new Vehicle();
        veh.setName("Audi");
        return veh;
    }
    @Bean(value="Ferrari")
    Vehicle vehicle2()
    {
        var veh=new Vehicle();
        veh.setName("Ferrari");
        return veh;
    }
    @Bean("BMW")
    Vehicle vehicle3()
    {
        var veh=new Vehicle();
        veh.setName("BMW");
        return veh;
    }
}
