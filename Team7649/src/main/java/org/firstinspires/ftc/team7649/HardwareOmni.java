/* Copyright (c) 2017 FIRST. All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without modification,
 * are permitted (subject to the limitations in the disclaimer below) provided that
 * the following conditions are met:
 *
 * Redistributions of source code must retain the above copyright notice, this list
 * of conditions and the following disclaimer.
 *
 * Redistributions in binary form must reproduce the above copyright notice, this
 * list of conditions and the following disclaimer in the documentation and/or
 * other materials provided with the distribution.
 *
 * Neither the name of FIRST nor the names of its contributors may be used to endorse or
 * promote products derived from this software without specific prior written permission.
 *
 * NO EXPRESS OR IMPLIED LICENSES TO ANY PARTY'S PATENT RIGHTS ARE GRANTED BY THIS
 * LICENSE. THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS
 * "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO,
 * THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE
 * FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL
 * DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
 * SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER
 * CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY,
 * OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE
 * OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */

package org.firstinspires.ftc.team7649;

import android.app.ApplicationErrorReport;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.util.ElapsedTime;
import  com.qualcomm.robotcore.hardware.CRServo;

/**
 * This is NOT an opmode.
 *
 * This class can be used to define all the specific hardware for a single robot.
 * In this case that robot is a Pushbot.
 * See PushbotTeleopTank_Iterative and others classes starting with "Pushbot" for usage examples.
 *
 * This hardware class assumes the following device names have been configured on the robot:
 * Note:  All names are lower case and some have single spaces between words.
 *
 * Motor channel:  Left  drive motor:        "left_drive"
 * Motor channel:  Right drive motor:        "right_drive"
 * Motor channel:  Manipulator drive motor:  "left_arm"
 * Servo channel:  Servo to open left claw:  "left_hand"
 * Servo channel:  Servo to open right claw: "right_hand"
 */
public class HardwareOmni {
    /* Public OpMode members. */
    public DcMotor frontLeftDrive = null;
    public DcMotor frontRightDrive = null;
    public DcMotor backLeftDrive = null;
    public DcMotor backRightDrive = null;
    public DcMotor lift = null;
    public DcMotor slider = null;
    public DcMotor arti = null;
    public DcMotor intake = null;
    public CRServo brazoR = null;
    public CRServo brazoL = null;
    public CRServo outtake = null;


    public double y1;
    public double x1;
    public double x2;
    public double frontRightPower;
    public double backRightPower;
    public double frontLeftPower;
    public double backLeftPower;
    public double max;
    public double turbo;


    /* local OpMode members. */
    HardwareMap hwMap = null;
    private ElapsedTime period = new ElapsedTime();

    /* Constructor */
    public HardwareOmni() {
    }

    /* Initialize standard Hardware interfaces */
    public void init(HardwareMap ahwMap) {
        // Save reference to Hardware map
        hwMap = ahwMap;

        // Define and Initialize Motors
        frontLeftDrive = hwMap.get(DcMotor.class, "FL");
        frontRightDrive = hwMap.get(DcMotor.class, "FR");
        backLeftDrive = hwMap.get(DcMotor.class, "BL");
        backRightDrive = hwMap.get(DcMotor.class, "BR");
        lift = hwMap.get(DcMotor.class, "LF");
        slider = hwMap.get(DcMotor.class, "SL");
        arti = hwMap.get(DcMotor.class, "AR");
        intake = hwMap.get(DcMotor.class, "IN");
        brazoR = hwMap.get(CRServo.class, "BRR");
        brazoL = hwMap.get(CRServo.class,"BRL");
        outtake = hwMap.get(CRServo. class,"OU");



        frontLeftDrive.setDirection(DcMotor.Direction.FORWARD); // Set to REVERSE if using AndyMark motors
        frontRightDrive.setDirection(DcMotor.Direction.REVERSE);// Set to FORWARD if using AndyMark motors
        backLeftDrive.setDirection(DcMotor.Direction.FORWARD); // Set to REVERSE if using AndyMark motors
        backRightDrive.setDirection(DcMotor.Direction.REVERSE);// Set to FORWARD if using AndyMark motors
        lift.setDirection(DcMotor.Direction.REVERSE);// Set to FORWARD if using AndyMark motors
        slider.setDirection(DcMotor.Direction.FORWARD);// Set to FORWARD if using AndyMark motors
        arti.setDirection(DcMotor.Direction.FORWARD);// Set to FORWARD if using AndyMark motors
        intake.setDirection(DcMotor.Direction.FORWARD);// Set to FORWARD if using AndyMark motors
        brazoR.setDirection(CRServo.Direction.FORWARD);
        brazoL.setDirection(CRServo.Direction.REVERSE);
        outtake.setDirection(CRServo.Direction.FORWARD);


        // Set all motors to zero power
        frontLeftDrive.setPower(0);
        frontRightDrive.setPower(0);
        backLeftDrive.setPower(0);
        backRightDrive.setPower(0);
        lift.setPower(0);
        slider.setPower(0);
        arti.setPower(0);
        intake.setPower(0);
        brazoR.setPower(0);
        brazoL.setPower(0);
        outtake.setPower(0);

        // Set all motors to run without encoders.
        // May want to use RUN_USING_ENCODERS if encoders are installed.
        frontLeftDrive.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        frontRightDrive.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        backLeftDrive.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        backRightDrive.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        lift.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        slider.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        arti.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        intake.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);





    }
}

        // Define and initialize ALL installed servos.
