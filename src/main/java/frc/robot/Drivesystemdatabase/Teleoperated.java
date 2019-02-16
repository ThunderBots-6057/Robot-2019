/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.Drivesystemdatabase;

import edu.wpi.first.wpilibj.Joystick;


/**
 * Add your docs here.
 */
public class Teleoperated {
    
 
    private Joystick  stick1;
    //private Joystick  stick5;
    private DriveTrain rbtDrivetrain1;

    public Teleoperated(Joystick stick1, DriveTrain rbtDrivetrain){
        this.stick1 = stick1;
        this.rbtDrivetrain1 = rbtDrivetrain; 
    }

    public void update(){
        //How does this call work?
        rbtDrivetrain1.setDrive(stick1.getY()-stick1.getX(), stick1.getY()+stick1.getX());
        System.out.println("Stick1 -- Y : " + stick1.getY() +
                          "Stick1 -- X : " + stick1.getX());
                        //"Stick2 -- Y : " + stick2.getY() +
                        // "Stick2 -- X : " + stick2.getX() )
    }
}
