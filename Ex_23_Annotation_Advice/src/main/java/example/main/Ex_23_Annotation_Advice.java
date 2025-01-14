package example.main;

import example.config.ProjectConfig;
import example.service.VehicleService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Ex_23_Annotation_Advice
{
    public static void main(String[] args) {
        ApplicationContext context=new AnnotationConfigApplicationContext(ProjectConfig.class);
        var vehicleService=context.getBean(VehicleService.class);
        System.out.println(vehicleService.getClass());
        boolean vehicleStarted=true;
        String playMusicStatus=vehicleService.playMusic(vehicleStarted);
        String applyBrakeStatus =vehicleService.applyBrake(vehicleStarted);
        String movevehicleStatus=vehicleService.moveVehicle(vehicleStarted);
        System.out.println("Status of music : "+playMusicStatus);
        System.out.println(movevehicleStatus);
        System.out.println(applyBrakeStatus);

    }
}
