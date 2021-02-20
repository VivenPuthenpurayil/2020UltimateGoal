package org.firstinspires.ftc.teamcode.Control;

import org.firstinspires.ftc.robotcore.external.navigation.DistanceUnit;

public abstract class AutonomousControl extends Central {
    public boolean outlier(){
        if(rob.rightBack.getDistance(DistanceUnit.CM) >= 1000 ||
       rob.rightFront.getDistance(DistanceUnit.CM) >= 1000 ||
       rob.Back.getDistance(DistanceUnit.CM) >= 1000){
            return true;
        }
        else{
            return false;
        }
    }

}






