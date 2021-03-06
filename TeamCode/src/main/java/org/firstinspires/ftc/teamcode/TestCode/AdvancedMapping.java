package org.firstinspires.ftc.teamcode.TestCode;


import com.qualcomm.robotcore.eventloop.opmode.Autonomous;

import org.firstinspires.ftc.robotcore.external.navigation.DistanceUnit;
import org.firstinspires.ftc.teamcode.Control.AutonomousControl;
import org.firstinspires.ftc.teamcode.Control.Goal;

@Autonomous(name="AdvancedMapping", group = "basic")

public class AdvancedMapping extends AutonomousControl {

    @Override
    public void runOpMode() throws InterruptedException {

        setup(runtime, Goal.setupType.autonomous);
        telemetry.addLine("Start!");
        telemetry.update();
        if (opModeIsActive()) {
            int[][] squares = { {0,0},{0,24},{0,48},{0,72},{0,96},{0,120},{0,144},
                    {24,0},{24,24},{24,48},{24,72},{24,96},{24,120},{24,144},
                    {48,0},{48,24},{48,48},{48,72},{48,96},{48,120},{48,144},
                    {72,0},{72,24},{72,48},{72,72},{72,96},{72,120},{72,144},
                    {96,0},{96,24},{96,48},{96,72},{96,96},{96,120},{96,144}}; //list of x, and y coordinates of each square.
            int x = (int)(rob.Right.getDistance(DistanceUnit.CM)/2.54);
            int y = (int)(rob.Back.getDistance(DistanceUnit.CM)/2.54);
            //where the robot is right now.
            int i = 0; // we init the value here so that we can use this variable out of the for loop.
            for (i = 0; i < squares.length; i++){
                if (squares[i][0]>x){ // finding out which square the robot is in according to the array
                    break;
                }
            }
            i-=1;
            int j = 0; // we init the value here so that we can use this variable out of the for loop.
            for (j = 0; j < squares.length; j++){
                if (squares[j][0]>y){ // finding out which square the robot is in according to the array
                    break;
                }
            }
            j-=1;
            int x1 = squares[i][0]; // the x coordinate the robot is in
            int y1 = squares[j][1]; // the y coordinate the robot is in
        }
    }
}