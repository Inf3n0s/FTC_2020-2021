package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.CRServo;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;

public class Robot {


    public DcMotor stangaFata = null;
    public DcMotor stangaSpate = null;
    public DcMotor dreaptaFata = null;
    public DcMotor dreaptaSpate = null;
    public DcMotor aruncator = null;
    public DcMotor oabalGoal = null;
    public DcMotor colector = null;    public DcMotor ruleta = null;

    public CRServo impingator = null;
    public Servo inaltime = null;

    public Robot(){

    }

    public void init(HardwareMap hwMap){

        stangaFata = hwMap.get(DcMotor.class, "stangafata");
        stangaSpate = hwMap.get(DcMotor.class, "stangaspate");
        dreaptaFata = hwMap.get(DcMotor.class, "dreaptaFata");
        dreaptaSpate = hwMap.get(DcMotor.class, "dreaptaSpate");
        aruncator = hwMap.get(DcMotor.class, "aruncator");
        oabalGoal = hwMap.get(DcMotor.class, "oabalGoal");
        colector = hwMap.get(DcMotor.class, "colector");
        ruleta = hwMap.get(DcMotor.class, "ruleta");

        impingator = hwMap.get(CRServo.class, "impingator");
        inaltime = hwMap.get(Servo.class, "inaltime");

        stangaFata.setDirection(DcMotorSimple.Direction.FORWARD);
        stangaSpate.setDirection(DcMotorSimple.Direction.FORWARD);
        dreaptaFata.setDirection(DcMotorSimple.Direction.REVERSE);
        dreaptaSpate.setDirection(DcMotorSimple.Direction.REVERSE);
        aruncator.setDirection(DcMotorSimple.Direction.FORWARD);
        oabalGoal.setDirection(DcMotorSimple.Direction.FORWARD);
        colector.setDirection(DcMotorSimple.Direction.FORWARD);
        ruleta.setDirection(DcMotorSimple.Direction.FORWARD);


        stangaFata.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        stangaSpate.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        dreaptaFata.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        dreaptaSpate.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        aruncator.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        oabalGoal.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        colector.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        ruleta.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);


        stangaFata.setPower(0);
        stangaSpate.setPower(0);
        dreaptaFata.setPower(0);
        dreaptaSpate.setPower(0);
        aruncator.setPower(0);
        oabalGoal.setPower(0);
        colector.setPower(0);
        ruleta.setPower(0);


        stangaFata.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        stangaSpate.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        dreaptaFata.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        dreaptaSpate.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        aruncator.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        oabalGoal.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        colector.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        ruleta.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);

    }

    public void stop(){
        stangaFata.setPower(0);
        stangaSpate.setPower(0);
        dreaptaFata.setPower(0);
        dreaptaSpate.setPower(0);
        aruncator.setPower(0);
        oabalGoal.setPower(0);
        colector.setPower(0);
        ruleta.setPower(0);
    }

}
