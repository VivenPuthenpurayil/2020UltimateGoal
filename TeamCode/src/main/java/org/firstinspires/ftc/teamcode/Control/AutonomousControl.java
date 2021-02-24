package org.firstinspires.ftc.teamcode.Control;

import org.firstinspires.ftc.robotcore.external.navigation.DistanceUnit;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;

import org.firstinspires.ftc.robotcore.external.navigation.AngleUnit;
import org.firstinspires.ftc.robotcore.external.navigation.AxesOrder;
import org.firstinspires.ftc.robotcore.external.navigation.AxesReference;
import org.firstinspires.ftc.robotcore.external.navigation.DistanceUnit;
import org.firstinspires.ftc.teamcode.Control.AutonomousControl;
import org.firstinspires.ftc.teamcode.Control.Goal;
import org.firstinspires.ftc.robotcore.external.navigation.Orientation;


public abstract class AutonomousControl extends Central {

    public void dropgoal() {
        //drop wobble goal
        rob.claw.setPower(0.4);
        sleep(200);
        rob.claw.setPower(0);
        sleep(100);
        rob.pinch.setPosition(0.8);
        sleep(200);
    }

    public void pickupgoal() {
        sleep(400);
        rob.claw.setPower(-0.4);
        sleep(250);
        rob.claw.setPower(0);
        sleep(100);
        rob.pinch.setPosition(0);
        sleep(100);
    }

    public boolean outlier(){
        return rob.rightBack.getDistance(DistanceUnit.CM) >= 1000 ||
                rob.rightFront.getDistance(DistanceUnit.CM) >= 1000 ||
                rob.Back.getDistance(DistanceUnit.CM) >= 1000;
    }

    public void zero() throws InterruptedException {
        //move to red square
        rob.driveTrainEncoderMovement(1, 66, 20, 0, Goal.movements.forward);
        // previous 63

        dropgoal();

        //move back to pick up second wobble goal

        rob.driveTrainEncoderMovement(1, 46, 20, 0, Goal.movements.backward);

        second_goal();

        // move backwards to go back to red square
        rob.driveTrainEncoderMovement(1, 23, 20, 0, Goal.movements.ccw);
        rob.driveTrainEncoderMovement(1, 23, 20, 0, Goal.movements.right);
        rob.driveTrainEncoderMovement(1, 42, 20, 0, Goal.movements.forward);

        //drop wobble goal
        dropgoal();

        // start flywheel
        rob.fly.setPower(-0.73);
        sleep(1500);


        // move backwards a bit so you dont hit the wobble goal
//        rob.driveTrainEncoderMovement(1, 7, 20, 0, Goal.movements.backward);
//
//        // move towards wall
//        rob.driveTrainEncoderMovement(1, 9, 20, 0, Goal.movements.right);
//
//        // move to the left, to align shots
//        rob.driveTrainEncoderMovement(1, 22, 20, 0, Goal.movements.left);
//
//        // move to right behind white line
//        rob.driveTrainEncoderMovement(1, 9, 20, 0, Goal.movements.forward);

        rob.driveTrainEncoderMovement(1, 7, 20, 0, Goal.movements.backward);
        rob.driveTrainEncoderMovement(1, 13, 20, 0, Goal.movements.left);
        rob.driveTrainEncoderMovement(1, 9, 20, 0, Goal.movements.forward);


        // shoot your shots
        shoot();
    }

    public void one() throws InterruptedException {
        // 1 ring
        //move to red square
        rob.driveTrainEncoderMovement(1, 86, 20, 0, Goal.movements.forward);
        rob.driveTrainEncoderMovement(1, 20, 20, 0, Goal.movements.left);

        //drop wobble goal
        dropgoal();

        //move back to pick up second wobble goal
        rob.driveTrainEncoderMovement(1, 5, 20, 0, Goal.movements.backward);
        sleep(150);
        rob.driveTrainEncoderMovement(1, 20, 20, 0, Goal.movements.right);
        sleep(150);
        rob.driveTrainEncoderMovement(1, 61, 20, 0, Goal.movements.backward);

        second_goal();

        //return to red square
        rob.driveTrainEncoderMovement(1, 23, 20, 0, Goal.movements.ccw);
        rob.driveTrainEncoderMovement(1, 63, 20, 0, Goal.movements.forward);

        //drop wobble goal
        dropgoal();

        // start flywheel
        rob.fly.setPower(-0.73);
        sleep(1500);

        // move backwards a bit so you dont hit the wobble goal
//        rob.driveTrainEncoderMovement(1, 31, 20, 0, Goal.movements.backward);

//        // move towards wall
//        rob.driveTrainEncoderMovement(1, 29, 20, 0, Goal.movements.right);
//
//        // move to the left, to align shots
//        rob.driveTrainEncoderMovement(1, 22, 20, 0, Goal.movements.left);

        // move to right behind white line
//        rob.driveTrainEncoderMovement(1, 9, 20, 0, Goal.movements.forward);

        rob.driveTrainEncoderMovement(1, 19, 20, 0, Goal.movements.backward);
        rob.driveTrainEncoderMovement(1, 9, 20, 0, Goal.movements.right);

        shoot();

    }

    public void four() throws InterruptedException {
        //move to red square
        rob.driveTrainEncoderMovement(1, 107, 20, 0, Goal.movements.forward);

        //drop wobble goal
        dropgoal();

        //move back to pick up second wobble goal

        rob.driveTrainEncoderMovement(1, 87, 20, 0, Goal.movements.backward);

        second_goal();

        // move backwards to go back to red square
        rob.driveTrainEncoderMovement(1, 23, 20, 0, Goal.movements.ccw);
        rob.driveTrainEncoderMovement(1, 23, 20, 0, Goal.movements.right);
        rob.driveTrainEncoderMovement(1, 84, 20, 0, Goal.movements.forward);

        //drop wobble goal
        dropgoal();

        // start flywheel
        rob.fly.setPower(-0.73);
        sleep(2000);

        // move backwards a bit so you dont hit the wobble goal
//        rob.driveTrainEncoderMovement(1, 43, 20, 0, Goal.movements.backward);
//
//        // move towards wall
//        rob.driveTrainEncoderMovement(1, 9, 20, 0, Goal.movements.right);
//
//        // move to the left, to align shots
//        rob.driveTrainEncoderMovement(1, 22, 20, 0, Goal.movements.left);
//
//        // move to right behind white line
//        rob.driveTrainEncoderMovement(1, 9, 20, 0, Goal.movements.forward);

        rob.driveTrainEncoderMovement(1, 38, 20, 0, Goal.movements.backward);
        rob.driveTrainEncoderMovement(1, 13, 20, 0, Goal.movements.left);

        // shoot your shots
        shoot();
    }

    public void second_goal() throws InterruptedException {
        rob.lifter.setPosition(.86);
        sleep(150);

        rob.driveTrainEncoderMovement(1, 6, 20, 0, Goal.movements.left);

        // turn to face second wobble goal
        rob.driveTrainEncoderMovement(1, 23, 20, 0, Goal.movements.cw);

        rob.pinch.setPosition(0.8);
        sleep(500);
        rob.claw.setPower(-0.4);
        sleep(200);
        rob.claw.setPower(0);
        sleep(100);

        // move to second wobble goal
        rob.driveTrainEncoderMovement(1, 16, 20, 0, Goal.movements.forward);

        // pick up second wobble goal
        pickupgoal();
    }

    public void pickupgoal() {
        sleep(100);
        rob.pinch.setPosition(0);
        sleep(400);
        rob.claw.setPower(-0.4);
        sleep(250);
        rob.claw.setPower(0);
        sleep(100);
    }

    public void dropgoal() {
        //drop wobble goal
        rob.pinch.setPosition(0.8);
        sleep(200);
        rob.claw.setPower(0.4);
        sleep(200);
        rob.claw.setPower(0);
        sleep(100);
    }

    public void shoot() throws InterruptedException {
        sleep(1500);
        for (int i = 0; i <= 2; i++) {
            rob.fly.setPower(-0.73);
            sleep(100);

            rob.whack.setPosition(0.4);
            sleep(500);

            rob.whack.setPosition(0);
            sleep(500);
        }

        // move to Launch Line
        rob.driveTrainEncoderMovement(1, 5, 100, 100, Goal.movements.forward);
    }
}