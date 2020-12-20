package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;

@Autonomous(name="Scanteie")
public class Hautonomie_buna extends LinearOpMode {


    static final double     COUNTS_PER_MOTOR_REV    = 1680 ;    // eg: TETRIX Motor Encoder
    static final double     DRIVE_GEAR_REDUCTION    = 1 ;     // This is < 1.0 if geared UP
    static final double     WHEEL_DIAMETER_INCHES   = 10 ;     // For figuring circumference
    static final double     COUNTS_PER_INCH         = (COUNTS_PER_MOTOR_REV * DRIVE_GEAR_REDUCTION)
            / (WHEEL_DIAMETER_INCHES * 3.1415);
    Robot falcon = new Robot();

    int recunoastere;
    @Override
    public void runOpMode() throws InterruptedException {

        falcon.init(hardwareMap);

        waitForStart();
        if(opModeIsActive()){}


        // recunoastere care da return 1 2  3 in functie de ce a b c trebuie sa mergem


        if(recunoastere == 1){
            moveForwardBackward(135,1);
            moveLeftRight(-120,1);
            falcon.oabalGoal.setPower(-1);
            sleep(2000);
            moveForwardBackward(-30,1);
            falcon.aruncator.setPower(1);
            falcon.impingator.setPower(1);
            this.sleep(2000);
            falcon.impingator.setPower(0);
            sleep(3000);

            falcon.impingator.setPower(1);
            this.sleep(2000);
            falcon.impingator.setPower(0);

            sleep(3000);
            falcon.impingator.setPower(1);
            this.sleep(2000);
            falcon.impingator.setPower(0);

            sleep(3000);
            moveForwardBackward(30,1);

        } else
        if(recunoastere == 2){
            moveForwardBackward(195,1);
            moveLeftRight(-30,1);
            falcon.oabalGoal.setPower(-1);
            sleep(2000);
            moveForwardBackward(-60,1);
            falcon.aruncator.setPower(1);
            falcon.impingator.setPower(1);
            this.sleep(2000);
            falcon.impingator.setPower(0);
            sleep(3000);

            falcon.impingator.setPower(1);
            this.sleep(2000);
            falcon.impingator.setPower(0);

            sleep(3000);
            falcon.impingator.setPower(1);
            this.sleep(2000);
            falcon.impingator.setPower(0);

            sleep(3000);
            moveForwardBackward(30,1);
        } else {
            moveForwardBackward(255,1);
            moveLeftRight(-120,1);
            falcon.oabalGoal.setPower(-1);
            sleep(2000);
            moveForwardBackward(-150,1);
            falcon.aruncator.setPower(1);
            falcon.impingator.setPower(1);
            this.sleep(2000);
            falcon.impingator.setPower(0);
            sleep(3000);

            falcon.impingator.setPower(1);
            this.sleep(2000);
            falcon.impingator.setPower(0);

            sleep(3000);
            falcon.impingator.setPower(1);
            this.sleep(2000);
            falcon.impingator.setPower(0);

            sleep(3000);
            moveForwardBackward(30,1);
        }

        falcon.stop();


    }
    
    private void moveForwardBackward(int distanceCM, double speed) throws InterruptedException {
        int distance = (int)(distanceCM * COUNTS_PER_INCH);

        Thread.sleep(100);
        falcon.stangaSpate.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        falcon.dreaptaSpate.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        falcon.dreaptaFata.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        falcon.stangaFata.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);

        Thread.sleep(100);
        falcon.stangaSpate.setTargetPosition(distance);
        falcon.dreaptaSpate.setTargetPosition(distance);
        falcon.dreaptaFata.setTargetPosition(distance);
        falcon.stangaFata.setTargetPosition(distance);

        falcon.stangaSpate.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        falcon.dreaptaSpate.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        falcon.dreaptaFata.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        falcon.stangaFata.setMode(DcMotor.RunMode.RUN_TO_POSITION);

        falcon.dreaptaSpate.setPower(speed);
        falcon.stangaSpate.setPower(speed);
        falcon.stangaFata.setPower(speed);
        falcon.dreaptaFata.setPower(speed);

        while (falcon.stangaSpate.isBusy() && falcon.dreaptaSpate.isBusy() && falcon.dreaptaFata.isBusy() && falcon.stangaFata.isBusy()){

        }

        falcon.stangaSpate.setPower(0);
        falcon.dreaptaSpate.setPower(0);
        falcon.stangaFata.setPower(0);
        falcon.dreaptaFata.setPower(0);

        falcon.stangaSpate.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        falcon.dreaptaSpate.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        falcon.dreaptaFata.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        falcon.stangaFata.setMode(DcMotor.RunMode.RUN_USING_ENCODER);

    }
    private void moveLeftRight(int distanceCM, double speed) throws InterruptedException {
        int distance = (int)(distanceCM * COUNTS_PER_INCH);

        Thread.sleep(100);
        falcon.dreaptaFata.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        falcon.dreaptaSpate.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        falcon.stangaFata.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        falcon.stangaSpate.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);

        Thread.sleep(100);

        falcon.dreaptaFata.setTargetPosition(-distance);
        falcon.stangaSpate.setTargetPosition(distance);
        falcon.stangaFata.setTargetPosition(-distance);
        falcon.dreaptaSpate.setTargetPosition(distance);

        falcon.dreaptaSpate.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        falcon.stangaSpate.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        falcon.stangaFata.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        falcon.dreaptaFata.setMode(DcMotor.RunMode.RUN_TO_POSITION);


        falcon.dreaptaSpate.setPower(speed);
        falcon.stangaSpate.setPower(speed);
        falcon.stangaFata.setPower(speed);
        falcon.dreaptaFata.setPower(speed);

        while (falcon.stangaSpate.isBusy() && falcon.dreaptaSpate.isBusy() && falcon.dreaptaFata.isBusy() && falcon.stangaFata.isBusy()) {

        }

        falcon.stangaSpate.setPower(0);
        falcon.dreaptaSpate.setPower(0);
        falcon.stangaFata.setPower(0);
        falcon.dreaptaFata.setPower(0);

        falcon.stangaSpate.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        falcon.dreaptaSpate.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        falcon.dreaptaFata.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        falcon.stangaFata.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
    }
}
