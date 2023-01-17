package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.hardware.bosch.BNO055IMU;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor.ZeroPowerBehavior;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.CRServo;
import com.qualcomm.robotcore.hardware.Servo;

@TeleOp
public class CalebsBetterTeleOp extends LinearOpMode {
    @Override
    public void runOpMode() throws InterruptedException {
    // Declare our motors
        DcMotor motorLF = hardwareMap.dcMotor.get("motorLF");
        DcMotor motorLR = hardwareMap.dcMotor.get("motorLR");
        DcMotor motorRF = hardwareMap.dcMotor.get("motorRF");
        DcMotor motorRR = hardwareMap.dcMotor.get("motorRR");
        CRServo ConeServo = hardwareMap.crservo.get("ConeServo");
        DcMotor Liftmotor = hardwareMap.dcMotor.get("Liftmotor");
        

        // Reverse the right side motors
        motorRF.setDirection(DcMotorSimple.Direction.REVERSE);
        motorRR.setDirection(DcMotorSimple.Direction.REVERSE);
        
        // Set zero power behavior of the lift
        Liftmotor.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        
        // Retrieve the IMU from the hardware map
        BNO055IMU imu = hardwareMap.get(BNO055IMU.class, "imu");
        BNO055IMU.Parameters parameters = new BNO055IMU.Parameters();
        // Technically this is the default, however specifying it is clearer
        parameters.angleUnit = BNO055IMU.AngleUnit.RADIANS;
        // Without this, data retrieving from the IMU throws an exception
        imu.initialize(parameters);

        waitForStart();

        if (isStopRequested()) return;

        while (opModeIsActive()) {
            double y = -gamepad1.left_stick_y; // Remember, this is reversed!
            double x = gamepad1.left_stick_x; // Counteract imperfect strafing
            double rx = gamepad1.right_stick_x;

            // Read inverse IMU heading, as the IMU heading is CW positive
            double botHeading = -imu.getAngularOrientation().firstAngle;

            double rotX = x * Math.cos(botHeading) - y * Math.sin(botHeading);
            double rotY = x * Math.sin(botHeading) + y * Math.cos(botHeading);

            // Denominator is the largest motor power (absolute value) or 1
            // This ensures all the powers maintain the same ratio, but only when
            // at least one is out of the range [-1, 1]
            double denominator = Math.max(Math.abs(y) + Math.abs(x)+ Math.abs(rx), 1);
            double frontLeftPower = (rotY + rotX + rx) / denominator;
            double backLeftPower = (rotY - rotX + rx) / denominator;
            double frontRightPower = (rotY - rotX - rx) / denominator;
            double backRightPower = (rotY + rotX - rx) / denominator;

            motorLF.setPower(frontLeftPower);
            motorLR.setPower(backLeftPower);
            motorRF.setPower(frontRightPower);
            motorRR.setPower(backRightPower);
            


        if (gamepad1.a){
            ConeServo.setPower(.5);
        } else if (gamepad1.x){
            ConeServo.setPower(-.5);
        }else{
            ConeServo.setPower(0);
        }
        
        if (gamepad1.dpad_up)
            Liftmotor.setPower(-1*1.8);
        else if (gamepad1.dpad_down){
            Liftmotor.setPower(1*1.8);
        }else{
            Liftmotor.setPower(0);
        }
        
        if(gamepad1.right_trigger!=0){
            motorLF.setPower(-.7*1.4);
            motorRF.setPower(-.7*1.5);
            motorLR.setPower(.7*1.4);
            motorRR.setPower(.7*1.4);
        }else{
            motorLF.setPower(0);
            motorRF.setPower(0);
            motorLR.setPower(0);
            motorRR.setPower(0);
        }
            
        if(gamepad1.left_trigger!=0){
            motorLF.setPower(.7*1.4);
            motorRF.setPower(.7*1.6);
            motorLR.setPower(-.7*1.4);
            motorRR.setPower(-.7*1.6);
        }else{
            motorLF.setPower(0);
            motorRF.setPower(0);
            motorLR.setPower(0);
            motorRR.setPower(0);
        }
        
        }
    }
}
