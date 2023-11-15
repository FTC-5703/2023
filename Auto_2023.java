package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.hardware.CRServo;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.ColorSensor;
import com.qualcomm.robotcore.hardware.DcMotor.ZeroPowerBehavior; 
//NEED TO IMPORT MATH AND COS/SIN
import com.qualcomm.robotcore.cos;


@Autonomous(name="Auto_2023", group = "OpMode" )
public class Auto_2023 extends LinearOpMode {
   private DcMotor Liftmotor;
   private DcMotor motorTop;
   private DcMotor motorRR;
   private DcMotor motorRF;
   private CRServo Pullservo;
   private Servo Spinservo;
   private ColorSensor colorSensor;

    int r;
    int g;
    int b;
  
  public void runOpMode() throws InterruptedException {
      colorSensor = hardwareMap.colorSensor.get("colorSensor");
      motorLR = hardwareMap.dcMotor.get("motorTop");
      motorLF = hardwareMap.dcMotor.get("motorRF");
      motorRR = hardwareMap.dcMotor.get("motorRR");
      Liftmotor = hardwareMap.dcMotor.get("Liftmotor");
      PullServo = hardwareMap.crservo.get("PullServo");
      Spinservo = hardwareMap.servo.get("Spinservo");
      
      telemetry.addData("Mode", "New");
      telemetry.update();
      
      //ConeServo.setPower(.6);
      
      waitForStart();
             
        //green(200,600,400)
        //oragne(750,740,300)
        //purple(400,450,700)
        
        telemetry.addData("r", r);
        telemetry.addData("g", g);
        telemetry.addData("b", b);
        telemetry.update();

      //Collect the RGB values 
        r = colorSensor.red();
        g = colorSensor.green();
        b = colorSensor.blue();

     //drives forward to middle spik
     {
        motorTop.setPower(0);
        motorRR.setPower(sin(60));
        motorRL.setPower(sin(120));
        sleep(300)
      }

     //drops purple pixel on middle spik or flips servo and then drops
      if ((r<g) && (g<b) && (r<b)){
         telemetry.addLine("purple");
         Pullservo.setPower(-.5);
         sleep(100)
         Spinservo.setPosition(180)
      }else{
         Pullservo.setPower(0);
         Spinservo.setPosition(0);
         sleep(1000)
      }

     //reverses the robot
      }
         motorTop.setPower(0);
         motorRR.setPower(sin(-60));
         motorRL.setPower(sin(-120));

     


















    

  
