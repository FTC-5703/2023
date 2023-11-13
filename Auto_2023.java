package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.hardware.CRServo;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor.ZeroPowerBehavior; 

@Autonomous(name="Auto_2023", group = "OpMode" )
public class Auto_2023 extends LinearOpMode {
   DcMotor Liftmotor;
   DcMotor motorTop;
   DcMotor motorRR;
   DcMotor motorRF;
   Servo Pullservo;
   Servo Spinservo;
  
  public void runOpMode() throws InterruptedException {
      motorLR = hardwareMap.dcMotor.get("motorTop");
      motorLF = hardwareMap.dcMotor.get("motorRF");
      motorRR = hardwareMap.dcMotor.get("motorRR");
      Liftmotor = hardwareMap.dcMotor.get("Liftmotor");
      PullServo = hardwareMap.servo.get("PullServo");
      Spinservo = hardwareMap.crservo.get("Spinservo");
      
      telemetry.addData("Mode", "New");
      telemetry.update();
      
      //ConeServo.setPower(.6);
      
      waitForStart();
      
      telemetry.addData("Mode", "New");
      telemetry.update();

















    

  
