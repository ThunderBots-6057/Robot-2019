/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.Drivesystemdatabase;

import edu.wpi.first.wpilibj.PWMVictorSPX;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import frc.robot.RobotMap;
import frc.robot.commands.ManualDriveCommand;
import edu.wpi.first.wpilibj.Joystick;



public class DriveSubsystem extends Subsystem {


  public PWMVictorSPX fLeftMotor = new  PWMVictorSPX(RobotMap.frontLeftMasterPort);
  public PWMVictorSPX rLeftMotor = new PWMVictorSPX(RobotMap.rearLeftSlavePort);
  public PWMVictorSPX fRightMotor = new PWMVictorSPX(RobotMap.frontRightMasterPort);
  public PWMVictorSPX rRightMotor = new PWMVictorSPX(RobotMap.rearRightSlavePort);

  SpeedControllerGroup rightMotors = new SpeedControllerGroup(fRightMotor,rRightMotor);
  SpeedControllerGroup leftMotors = new SpeedControllerGroup(fLeftMotor, rLeftMotor);


  public DifferentialDrive diffDriveGroup = new  DifferentialDrive(leftMotors, rightMotors);

    public DriveSubsystem () {

      //Resolve by making your own follow method for that object
    
    }
    //must pass values to make port # adhear to controls(joystick adhear to stearing)
    
    public void drive(double left, double right){
      diffDriveGroup.tankDrive(left, right);
    }
    public void drive(Joystick joy){
      drive(joy.getY(), joy.getThrottle());

    }
    public void driveArcade(Joystick joy){
      diffDriveGroup.arcadeDrive(-joy.getThrottle(), joy.getZ());
    } 
  

    @Override
    public void initDefaultCommand() {
      // Set the default command for a subsystem here.
      setDefaultCommand(new ManualDriveCommand());
    }
}
