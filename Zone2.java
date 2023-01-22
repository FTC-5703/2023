package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor.ZeroPowerBehavior; 
import com.qualcomm.robotcore.hardware.CRServo;

@Autonomous(name="Zone2_points", group = "OpMode" )
public class Zone2_Points extends LinearOpMode {
   
    DcMotor motorLR;
    DcMotor motorLF;
    DcMotor motorRR;
    DcMotor motorRF;
    DcMotor Liftmotor;
    CRServo ConeServo;
   
    public void runOpMode() throws InterruptedException {
      motorLR = hardwareMap.dcMotor.get("motorLR");
      motorLF = hardwareMap.dcMotor.get("motorLF");
      motorRR = hardwareMap.dcMotor.get("motorRR");
      motorRF = hardwareMap.dcMotor.get("motorRF");
      Liftmotor = hardwareMap.dcMotor.get("Liftmotor");
      ConeServo = hardwareMap.crservo.get("ConeServo");
      motorRF.setDirection(DcMotorSimple.Direction.REVERSE);
      motorRR.setDirection(DcMotorSimple.Direction.REVERSE);
      
      telemetry.addData("Mode", "New");
      telemetry.update();
      
      ConeServo.setPower(.6);
      
      waitForStart();
      
      telemetry.addData("Mode", "New");
      telemetry.update();

//drives forward
      
      {
         motorLR.setPower(.75);
         motorLF.setPower(.7);
         motorRR.setPower(.7);
         motorRF.setPower(.75);
         sleep(350);
      }
      
      {
        motorRR.setPower(.010);
        motorLF.setPower(.010);
        motorRF.setPower(.010);
        motorLR.setPower(.010);
      }
      {
        motorRR.setPower(0);
        motorRF.setPower(0);
        motorLR.setPower(0);
        motorLF.setPower(0);
       }
    }
}
