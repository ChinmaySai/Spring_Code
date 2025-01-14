package com.example.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Component
public class VehicleServices {

    private Logger logger = Logger.getLogger(VehicleServices.class.getName());


    public String playMusic(boolean vehicleStarted){

        if(vehicleStarted)
        {
            return "Playing";
        }
        else {
            return "Vehicle not started";
        }
    }

    public String moveVehicle(boolean vehicleStarted){

        if(vehicleStarted)
        {
            return "Vehicle is Moving";
        }
        else {
            return "Vehicle not started";
        }
    }

    public String applyBrake(boolean vehicleStarted){

        if(vehicleStarted)
        {
            return "Brakes Applied";
        }
        else {
            return "Vehicle not started";
        }
    }
}