/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.Drivesystemdatabase;

//import com.ctre.phoenix.motorcontrol.ControlMode;

//import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.PWMVictorSPX;

/**
 * Add your docs here.
 */
public class DriveTrain {



    private  PWMVictorSPX  lDrive1; //Or whatever motor you would use
    private  PWMVictorSPX  rDrive1; //Modify this file based on how many motors you want to use.

    private double lPower = 0.0;
    private double rPower = 0.0;


    public DriveTrain(PWMVictorSPX lDrive1,PWMVictorSPX  rDrive1){
        this.lDrive1 = lDrive1;
        this.rDrive1 = rDrive1;
    }

    public void setDrive(double lPower, double rPower){
        this.lPower = lPower;
        this.rPower = rPower;
    }

    public void update(){

        lDrive1.set(0 * lPower);
        rDrive1.set(0 * rPower);   
    }
}

 
