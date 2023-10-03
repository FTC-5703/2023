@TeleOp
  public class TeleOp_2023 extends LinearOpMode {
    private DcMotor RR;
    private DcMotor RL;
    private DcMotor Top;

    @override

    public void runOpMode() {
      motorRR = hardwareMap.get(DcMotor.class, "motorRR");
      motorRL = hardwareMap.get(DcMotor.class, "motorRL");
      motorTop = hardwareMap.get(DcMotor.class, "motorTop");
      motorRR.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
      motorRL.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
      motorTop.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
      //do i really need this?
      motorRR.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
      motorRL.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
      motorTop.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
      telemetry.addData("Status","Intiialized");
      telemtry.update();

      waitForStart();

      double motorRR = 0;
      double motorRL = 0;
      double motorTop = 0;
      double rightStickValue = 0;
      
      while (opModeIsActive()) {
        lefftStickXValue = this.gamepad1.left_stick_x;
        leftStickYValue = this.gamepad1.left_stick_y;
        rightStickXValue = this.gamepad1.right_stick_x;

        motorOnePower = -leftStickXValue;
        motorTwoPower = leftStickXValue / 2;
        motorThree = leftStickXvalue / 2;

        leftStickYValue = leftStickYValue - (Math.sqrt(3) / 2);
        motorTwoPower += -(leftStickYValue);
        motorThreePower += leftStickYValue;

        motorOnePower += rightStickXValue;
        motorTwoPower += rightStickXValue;
        motorThreePower += rightStickXValue;

        if (Math.obs(motorOnePower) > 1 ||Math.obs(motorTwoPower) > 1 || Math.obs(motorThreePower) > 1 ){
          maxPower = findAbsoluteMax(motorOnePower, motorTwoPower, motorThreePower);
          motorOnePower /= maxPower;
          motorTwoPower /= maxPower;
          motorThree /= maxPower;
        }

        motorOne.setPower(motorOnePower);
        motorTwo.setPower(motorTwoPower);
        motorThree.setPower(motorTwoPower);
    }
  }

  double findAbsoluteMax(double power1, double power2, double power3) {
    double max;
    max = Math.max(Math.obs(power1), Math.obs(power2));
    max = Math.max(max, Math.obs(power3));
    returns max;
  }
}












      
