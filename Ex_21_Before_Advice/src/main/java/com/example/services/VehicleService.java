package com.example.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Component
public class VehicleService {

    private Logger logger = Logger.getLogger(VehicleService.class.getName());


    public String playMusic(boolean vehicleStarted){
            return "Playing";

    }

    public String moveVehicle(boolean vehicleStarted){
            return "Vehicle is Moving";
    }

    public String applyBrake(boolean vehicleStarted){
        return "Breaks Applied";
    }
}