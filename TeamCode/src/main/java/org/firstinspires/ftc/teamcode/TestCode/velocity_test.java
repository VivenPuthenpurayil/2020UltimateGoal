package org.firstinspires.ftc.teamcode.TestCode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;

import org.firstinspires.ftc.robotcore.external.Func;
import org.firstinspires.ftc.robotcore.external.navigation.AngleUnit;
import org.firstinspires.ftc.robotcore.external.navigation.AxesOrder;
import org.firstinspires.ftc.robotcore.external.navigation.AxesReference;
import org.firstinspires.ftc.robotcore.external.navigation.Orientation;
import org.firstinspires.ftc.teamcode.Control.AutonomousControl;
import org.firstinspires.ftc.teamcode.Control.Goal;

import java.util.ArrayList;
import java.util.Locale;

@Autonomous(name="velocity", group = "basic")

public class velocity_test extends AutonomousControl {


    @Override

    public void runOpMode() throws InterruptedException {

        setup(runtime, Goal.setupType.autonomous);
        telemetry.addLine("Start!");

        telemetry.update();
        if (opModeIsActive()) {


            while (true){

                rob.fly.setPower(-.715);
                sleep(250);
                rob.lifter.setPosition(.86);
                sleep(500);
                for (int i = 0; i <= 100; i++) {

                    telemetry.addData("Velocity", rob.velocityFly());
                    telemetry.update();

                    rob.whack.setPosition(0.45);
                    sleep(500);



                    rob.whack.setPosition(0);
                    sleep(750);


                }

//                rob.fly.setPower(-.625);
//                rob.velocityFly();
//                telemetry.addData("Velocity", rob.velocityFly());
//                telemetry.update();

    //            ArrayList<Double> a = new ArrayList<>();
        //        rob.velocityFlyYashAndAniketitty(a);
               telemetry.addData("Velocity", rob.velocityFly());
               telemetry.update();

            }






            //  rob.driveTrainIMUSwingTurnMovement(0.4, Goal.movements.backward, 3000, 90, 0.02, Goal.turnside.cw);


        }
    }
}


