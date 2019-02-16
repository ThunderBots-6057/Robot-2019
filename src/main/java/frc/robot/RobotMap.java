/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
  //For example to map the left and right motors, you could define the
  //following variables to use with your drivetrain subsystem.
  //public static int leftMotor = 1;
  //public static int rightMotor = 2;

//constant for joystick port interchangable if needed

public static int joystickPort1 = 1;
public static int joystickPort5 = 5;

public static int frontLeftMasterPort = 0; //assigned to PWMVictorSPX1
public static int rearLeftSlavePort = 1; //assigned to  PWMVictorSPX2 
public static int frontRightMasterPort= 3; //assigned to PWMVictorSPX3
public static int rearRightSlavePort = 2; //assigned to   PWMVictorSPX4

//NOTE: When installed, must change port numbers to match wiring and future  motors
//constants for right and left conveytor belt system (grabbing ball)

// Defines the variables as members of our Robot class
  // If you are using multiple modules, make sure to define both the port
  // number and the module. For example you with a rangefinder:
  // public static int rangefinderPort = 1;
  // public static int rangefinderModule = 1;
}
