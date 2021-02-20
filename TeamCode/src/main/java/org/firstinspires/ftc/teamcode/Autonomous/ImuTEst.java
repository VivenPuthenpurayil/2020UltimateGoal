package org.firstinspires.ftc.teamcode.Autonomous;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;

import org.firstinspires.ftc.robotcore.external.Func;
import org.firstinspires.ftc.robotcore.external.navigation.AngleUnit;
import org.firstinspires.ftc.robotcore.external.navigation.AxesOrder;
import org.firstinspires.ftc.robotcore.external.navigation.AxesReference;
import org.firstinspires.ftc.robotcore.external.navigation.Orientation;
import org.firstinspires.ftc.teamcode.Control.AutonomousControl;
import org.firstinspires.ftc.teamcode.Control.Goal;

import java.util.Locale;

@Autonomous(name="IMU test", group = "basic")

public class ImuTEst extends AutonomousControl {

    Orientation angles;

    @Override

    public void runOpMode() throws InterruptedException {

        setup(runtime, Goal.setupType.autonomous);
        telemetry.addLine("Start!");

        telemetry.update();

        if (opModeIsActive()) {

            angles = rob.imu.getAngularOrientation(AxesReference.INTRINSIC, AxesOrder.ZYX, AngleUnit.DEGREES);
            rob.driveTrainEncoderMovement(1,23,20,0,Goal.movements.cw);
            rob.driveTrainIMUSwingTurnMovement(0.4, Goal.movements.backward, 3000, 90, 0.02, Goal.turnside.cw);


        }
    }
}


