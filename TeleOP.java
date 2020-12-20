package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp(name="TeleOP al meu")
public class TeleOP extends LinearOpMode {

    Robot falcon = new Robot();

    @Override
    public void runOpMode() throws InterruptedException {

        falcon.init(hardwareMap);

        waitForStart();
        while(opModeIsActive() && !isStopRequested()){

            double r = Math.hypot(gamepad1.left_stick_x, -gamepad1.left_stick_y);
            double robotAngle = Math.atan2(gamepad1.left_stick_y, -gamepad1.left_stick_x) - Math.PI / 4;
            double rightX = -gamepad1.right_stick_x;
            final double v1 = r * Math.cos(robotAngle) + rightX;
            final double v2 = r * Math.sin(robotAngle) - rightX;
            final double v3 = r * Math.sin(robotAngle) + rightX;
            final double v4 = r * Math.cos(robotAngle) - rightX;
            falcon.stangaFata.setPower(v1);
            falcon.dreaptaFata.setPower(v2);
            falcon.stangaSpate.setPower(v3);
            falcon.dreaptaSpate.setPower(v4);

            // sistem colectare
            if(gamepad2.right_stick_x > 0){
                falcon.colector.setPower(1);
            } else if(gamepad2.right_stick_x < 0){
                falcon.colector.setPower(-1);
            } else falcon.colector.setPower(0);

            /*
            if(gamepad2.right_stick_x != 0)
                falcon.colector.setPower(this.gamepad2.right_stick_x);
            */

            // sistem aruncare
            if(gamepad2.right_stick_y > 0 )
                falcon.aruncator.setPower(1);
            else falcon.aruncator.setPower(0);

            // oable goal
            if(gamepad2.left_stick_x > 0){
                falcon.oabalGoal.setPower(1);
            } else if(gamepad2.left_stick_x < 0){
                falcon.oabalGoal.setPower(-1);
            } else falcon.oabalGoal.setPower(0);

            // ruleta
            if(gamepad2.left_stick_y > 0){
                falcon.ruleta.setPower(1);
            } else if(gamepad2.left_stick_y < 0){
                falcon.ruleta.setPower(-1);
            } else falcon.ruleta.setPower(0);

            // ce inaltime doriti
            if(gamepad2.a){
                falcon.inaltime.setPosition(0.5);
            }
            if(gamepad2.b){
                falcon.inaltime.setPosition(0.25);
            }

            // daca doriti sa aruncati
            if(gamepad2.x){
                falcon.impingator.setPower(1);
                this.sleep(2000);
                falcon.impingator.setPower(0);
            }
        }
    }
}
