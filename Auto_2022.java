package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.CRServo;
@Autonomous(name="Moving_two_wheels21", group = "OpMode" )

public class Moving_two_wheels21 extends LinearOpMode {
   DcMotor motorRR;
   DcMotor LiftMotor;
   DcMotor motorLF;
   DcMotor motorRF;
   DcMotor motorLR;
   CRServo ConeServo;
   
   public void runOpMode() throws InterruptedException 
   {
      motorRR = hardwareMap.dcMotor.get("motorRR");
      LiftMotor = hardwareMap.dcMotor.get("LiftMotor");
      motorLF = hardwareMap.dcMotor.get("motorLF");
      motorRF = hardwareMap.dcMotor.get("motorRF");
      motorLR = hardwareMap.dcMotor.get("motorLR");
      ConeServo = hardwareMap.crservo.get("orgServo");
      
       motorRR.setDirection(DcMotor.Direction.REVERSE);
       motorRF.setDirection(DcMotor.Direction.REVERSE);
      
      telemetry.addData("Mode", "New");
      telemetry.update();
      
      waitForStart();
      
      telemetry.addData("Mode", "New");
      telemetry.update();
     
     //strafes to the left
     {
        motorLF.setPower(-1*1.5);
        motorRF.setPower(-1*1.5);
        motorLR.setPower(1*1.5);
        motorRR.setPower(1);
        sleep(800);
     }
     //brakes
     {
       motorRR.setPower(.010);
       motorLF.setPower(.010);
       motorRF.setPower(.010);
       motorLR.setPower(.010);
      sleep(100);
     }
     
     {
       motorLR.setPower(0);
       motorLF.setPower(0);
       motorRR.setPower(0);
       motorRF.setPower(0);
       sleep(200);
     }
     //drives forward to the tall junction
     {
       motorLF.setPower(.8);
       motorLR.setPower(-.8);
       motorRR.setPower(.8);
       motorRF.setPower(-.8);
       sleep(650);
     }
     //brakes
     {
       motorRR.setPower(.010);
       motorLF.setPower(.010);
       motorRF.setPower(.010);
       motorLR.setPower(.010);
      sleep(100);
     }
     
     {
       motorLR.setPower(0);
       motorLF.setPower(0);
       motorRR.setPower(0);
       motorRF.setPower(0);
       sleep(200);
     }
     
     //turns about 45 degrees to the left
     {
      Liftmotor.setPower(.6);
      motorLF.setPower(-.5);
      motorRF.setPower(-.65);
      motorLR.setPower(-.5);
      motorRR.setPower(-.65);
      sleep(1000);
     }
     //drops cone on the junction
     {
       ConeServo.setPower(-.5);
       sleep(250);
     }
      
      
      
}}        
