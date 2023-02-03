package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.hardware.CRServo;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.Gyroscope;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.hardware.Blinker;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.ColorSensor;

@Disabled
@Autonomous(name="ColorSensor2", group = "OpMode" )

public class ColorTester2 extends LinearOpMode {
    //Defines the hardware map
    private Servo ColorSensorservo;
    private Blinker control_Hub;
    private Blinker expansion_Hub_1;
    private DcMotor liftmotor;
    private CRServo ConeServo;
    private ColorSensor colorSensor;
    private Gyroscope imu;
    private DcMotor motorLF;
    private DcMotor motorLR;
    private DcMotor motorRF;
    private DcMotor motorRR;

    int r;
    int g;
    int b;

    public void runOpMode() throws InterruptedException{
        colorSensor = hardwareMap.colorSensor.get("colorSensor");
        motorLF = hardwareMap.dcMotor.get("motorLF");
        motorLR = hardwareMap.dcMotor.get("motorLR");
        motorRF = hardwareMap.dcMotor.get("motorRF");
        motorRR = hardwareMap.dcMotor.get("motorRR");
        ColorSensorservo = hardwareMap.servo.get("ColorSensorservo");
        ConeServo = hardwareMap.crservo.get("ConeServo");
        
        motorRF.setDirection(DcMotorSimple.Direction.REVERSE);
        motorRR.setDirection(DcMotorSimple.Direction.REVERSE);
        
      telemetry.addData("Mode", "New");
      telemetry.update();
      
      waitForStart();
        
        //green(200,600,400)
        //oragne(750,740,300)
        //purple(400,450,700)
        
        telemetry.addData("r", r);
        telemetry.addData("g", g);
        telemetry.addData("b", b);
        telemetry.update();
        
        //Moves the arm in front of the robot to read the RGB vaules
        ColorSensorservo.setPosition(.73);
        sleep(4500);
        
        //Collect the RGB values 
        r = colorSensor.red();
        g = colorSensor.green();
        b = colorSensor.blue();
        
        
        if ((r<g) && (g<b) && (r<b)){
            //drives into zone 3
          telemetry.addLine("purple");
          ColorSensorservo.setPosition(0);
          sleep(3000);
          //drives forward 2ft
            motorLF.setPower(.4);
            motorRF.setPower(.4);
            motorLR.setPower(.4);
            motorRR.setPower(.4);
            sleep(800);
           //Applies brakes to all motors 
            motorLF.setPower(.010);
            motorRF.setPower(.010);
            motorLR.setPower(.010);
            motorRR.setPower(.010);
            sleep(300);
           //stops all motors
            motorLF.setPower(0);
            motorRF.setPower(0);
            motorLR.setPower(0);
            motorRR.setPower(0);
            sleep(300);
           //turns left 90 degrees
            motorLF.setPower(.7);
            motorRF.setPower(-.7);
            motorLR.setPower(.7);
            motorRR.setPower(-.7);
            sleep(645);
            motorLF.setPower(.010);
            motorRF.setPower(.010);
            motorLR.setPower(.010);
            motorRR.setPower(.010);
            sleep(300);
            motorLF.setPower(0);
            motorRF.setPower(0);
            motorLR.setPower(0);
            motorRR.setPower(0);
            sleep(300);
           // drives forwad about 2ft
            motorLF.setPower(.5);
            motorLR.setPower(.5);
            motorRF.setPower(.5);
            motorRR.setPower(.5);
            sleep(520);
            motorLF.setPower(.010);
            motorRF.setPower(.010);
            motorLR.setPower(.010);
            motorRR.setPower(.010);
            sleep(300);
            motorLF.setPower(0);
            motorRF.setPower(0);
            motorLR.setPower(0);
            motorRR.setPower(0);
            sleep(200);
           //turns right 90 degrees
            motorLF.setPower(-.7);
            motorRF.setPower(.7);
            motorLR.setPower(-.7);
            motorRR.setPower(.7);
            sleep(645);
        }else{
            //flips ColorSensor arm back down and does nothing
            ColorSensorservo.setPosition(0);
            sleep(2000);
            motorLF.setPower(0);
            motorRF.setPower(0);
            motorLR.setPower(0);
            motorRR.setPower(0);
            sleep(2000);
        }   
           
        if ((g > r) && (b < r) && (b < g)){
          //drives into Zone 1
            telemetry.addLine("orange");
            ColorSensorservo.setPosition(0);
            sleep(2000);
           //drives forward about 2ft
            motorLF.setPower(.4);
            motorRF.setPower(.4);
            motorLR.setPower(.4);
            motorRR.setPower(.4);
            sleep(800);
           //brakes than stops
            motorLF.setPower(.010);
            motorRF.setPower(.010);
            motorLR.setPower(.010);
            motorRR.setPower(.010);
            sleep(400);
            motorLF.setPower(0);
            motorRF.setPower(0);
            motorLR.setPower(0);
            motorRR.setPower(0);
            sleep(400);
           //turns left about 90 degrees
            motorLF.setPower(-.7);
            motorRF.setPower(.7);
            motorLR.setPower(-.7);
            motorRR.setPower(.7);
            sleep(645);
            motorLF.setPower(.010);
            motorRF.setPower(.010);
            motorLR.setPower(.010);
            motorRR.setPower(.010);
            sleep(400);
            motorLF.setPower(0);
            motorRF.setPower(0);
            motorLR.setPower(0);
            motorRR.setPower(0);
            sleep(400);
           //drives forward about 2ft
            motorLF.setPower(.5);
            motorLR.setPower(.5);
            motorRF.setPower(.5);
            motorRR.setPower(.5);
            sleep(520);
           //stops all motors
            motorLF.setPower(0);
            motorRF.setPower(0);
            motorLR.setPower(0);
            motorRR.setPower(0);
            sleep(400);
           //turns right about 90 degrees
            motorLF.setPower(.7);
            motorRF.setPower(-.7);
            motorLR.setPower(.7);
            motorRR.setPower(-.7);
            sleep(652);
        }else{
            //flips ColorSensor arm back down and does nothing
            ColorSensorservo.setPosition(0);
            sleep(2000);
            motorLF.setPower(0);
            motorRF.setPower(0);
            motorLR.setPower(0);
            motorRR.setPower(0);
            sleep(800);
        }
        
        if ((r < g) && (b < g)){
        // drives into zone 2
            telemetry.addLine("green");
            //pulls arm back down
            ColorSensorservo.setPosition(0);
            sleep(3000);
            //drivesforward 2ft
            motorLF.setPower(.45);
            motorLR.setPower(.45);
            motorRF.setPower(.45);
            motorRR.setPower(.45);
            sleep(800);
            //brakes all motors than stops
            motorLF.setPower(.010);
            motorLR.setPower(.010);
            motorRF.setPower(.010);
            motorRR.setPower(.010);
            sleep(200);
            motorLF.setPower(0);
            motorLR.setPower(0);
            motorRF.setPower(0);
            motorRR.setPower(0);
            sleep(200);
        }else{
            ColorSensorservo.setPosition(0);
            sleep(2000);
            motorLF.setPower(0);
            motorLR.setPower(0);
            motorRF.setPower(0);
            motorRR.setPower(0);
            sleep(2000); 
        }
    }
} 
