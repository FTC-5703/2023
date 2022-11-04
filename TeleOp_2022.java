package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpmode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.CRServo;
import com.qualcomm.robotcore.hardware.HDHexMotor;

@TeleOp(name = "wheels", group= "")

public class Wheels extends LinearOpMode {

private DcMotor motorRR;
private DcMotor motorRF;
private DcMotor motorLR;
private DcMotor motorLF;
private DcMotor Duckmotor;
private CRServo ConeServo;
private HDHexMotor Arm1;
private HDHexMotor Arm2;
private HDHexMotor Arm3;


private final double power = 1;

// RUN ONCE ON INIT()
 @Override
   public void runOpMode() {
    motorRR = hardwareMap.DcMotor.get("motorRR");
    motorRF = hardwareMap.DcMotor.get("motorRF");
    motorLR = hardwareMap.DcMotor.get("motorLR");
    Coneservo = hardwareMap.DcMotor.get("coneservo);
    
     waitForStart();
      while (opModeIsActive()) {
      
      double y = -gamepad1.left_stick_y; //Remember, this is reversed!
      double x =  gamepad1.left_stick_x * 1.4; // Counteract imperfect strafting 
      double rx = gamepad1.right_stick_x;
      
// Denominator is the largest motor power (abosolut value or 1
//This ensures all the powers maitain the same ratio, but only when
// at least one is out of range [-1,1]

    double denominator = Math.max(Mathabs(y) + Math.abs(x) + Math.abs(x) + Math.abs(rx), 1);
    double frontLeftPower = (y + x + rx) / denominator;
    double backLeftPower = (y - x + rx) / denomintor;
    double frontRightPower = (y -x -rx) / denominator;
    double backRightPower = (y + x _rx) / denominator;
   
  motorLF.setPower(frontLeftPower):
  motorLR.setPower(backLeftPower);
  motorRF.setPower(frontRightPower);
  motorRR.setPower(backRightPower);
 
     if(gamepad1.right_trigger!=0){
        motorLF.setPower(-power*1.4);
        motorRF.setPower(-power*1.5);
        motorLR.setPower(power*1.4);
        motorRR.setPower(power*1.4);
      }else{
        motorLF.setPower(0);
        motorRF.setPower(0);
        motorLR.setPower(0);
        motorRR.setPower(0);
       }
        
//These are the controls for "spin" mode, it uses the right instead of the left stick.

   if(gamepad1.right_stick_y!=0){
      motorLF.setPower(gamepad1.right_stick_y*power);
      motorRF.setPower(-gamepad.right_stick_y*(power*0.4));
      motorLR.setPower(gamepad.right_stick_y*power);
      motorRR.setPower(-gamepad1.right_stick_y*power);
   }else{
      motorLF.setPower(0);
      motorRF.setPower(0);
      motorLR.setPower(0);
      motorRR.setPower(0);
     }
 

private void setMotors (float power){
  motorRR.setPower(power);
  motorRF.setPower(power);
  motorLR.setPower(power * -1);
  motorLF.setPower(power * -1);
  
  
 private void strafe(int dir){
   
    if (dir == 0){
      motorRR.setPower(-1);
      motorRF.setPower(1);
      motorLR.setPower(-1);
      motorLF.setPower(1);
   }else if (dir == 1){
      motorRR.setPower(1);
      motorRF.setPower(1);
      motorLR.setPower(-1);
      motorLF.setPower(1);
     }
     
  if (gamepad1.a) {
   ConeServo.setPower(0.7)
 }else if (gamepad1.b){
   orgServo.setPower(-0.7);
 }else{
   ConeServo.setPower(0);
 }
 
  if (gamepad.dpad_up) {
    Arm1.setPower(.7);
    Arm2.setPower(.7);
    Arm3.setPower(0);
  }else{
    Amr1.setPower(0);
    Amr2.setPower(0);
    Amr3.setPower(0);
  } 
  
  if (gamepad.dpad_down){
    Amr1.setPower(-.7);
    Amm2.setPower(-.7);
    Amr3.setPower(0);
  }else{
    Amr1.setPower(0);
    Arm2.setPower(0);
    Arm3.setPower(0);
  }
    
    
 
 }}    
