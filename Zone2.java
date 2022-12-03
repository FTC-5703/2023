package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor.com.qualcomm.robotcore.hardware.ZeroPostionBehavior;
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
     
     //drives forward about 2.5 feet
     {
       motorLR.setPower(-.65);
       motorLF.setPower(.65);
       motorRR.setPower(.65);
       motorRF.setPower(-.65);
       sleep(350);
     }
     
     //brakes
     {
       motorRR.setPower(-.010);
       motorLF.setPower(-.010);
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
     
     //turns about 45 dergrees
     {
      motorLF.setPower(-.5);
      motorRF.setPower(-.65);
      motorLR.setPower(-.5);
      motorRR.setPower(-.65);
      sleep(350);
     }
     
     {
       motorRR.setPower(-.010);
       motorLF.setPower(-.010);
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
     
     //lifts arm to the height of the middle pole
     {
       Liftmotor.setPower(.5);
       sleep(200);
     }
     
     //drops cone onto pole
     {
       ConeServo.setPower(.5);
       sleep(100);
     }
     
     //drops arm back down
     {
       Liftmotor.setPower(-.5);
       sleep(200);
     }
     //turns about 45 degrees back around
     {
       motorLF.setPower(-.5);
       motorRF.setPower(-.65);
       motorLR.setPower(-.5);
       motorRR.setPower(-.65);
       sleep(350);
     }
     {
       motorRR.setPower(-.010);
       motorLF.setPower(-.010);
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
     {
       motorLR.setPower(-.5);
       motorLF.setPower(.5);
       motorRR.setPower(.5);
       motorRF.setPower(-.5);
       sleep(200);
     }
   }
}
       
       
