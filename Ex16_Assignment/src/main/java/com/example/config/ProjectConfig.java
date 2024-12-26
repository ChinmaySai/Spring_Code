package com.example.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.example.beans","com.example.implementation"})
@ComponentScan(basePackageClasses = {com.example.services.VehicleService.class})
public class ProjectConfig {
}
