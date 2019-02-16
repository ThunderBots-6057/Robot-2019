/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;
import frc.robot.OI;

public class ManualDriveCommand extends Command {
  public ManualDriveCommand() {
    // Use requires() here to declare subsystem dependencies
    requires(Robot.driveSubsystem);
  }

  public ManualDriveCommand(OI entry){

  }

  // Called just before this Command runs the first time
  @Override
  protected void initialize() {
  }

  // Called repeatedly when this Command is scheduled to run
  @Override
  protected void execute() {

   
    Robot.driveSubsystem.drive(Robot.m_oi.getX(),Robot.m_oi.getY());
  }

  // Make this return true when this Command no longer needs to run execute()
  @Override
  protected boolean isFinished() {
    return false;
  }

  // Called once after isFinished returns true
  @Override
  protected void end() {
  }

  // Called when another command which requires one or more of the same
  // subsystems is scheduled to run
  @Override
  protected void interrupted() {
  }


 //public class manualdrivecustom { private oi m_oi; 



//ManualDriveCommand driveCommand = new
//ManualDriveCommand(m_oi); 

 //public manualdrivecustom ( oi m_oi) { this.m_oi=m_oi; 


 //}

  //protected void  execute() { double move = -1 * m_oi.stick1.getY();
  //double turn = m_oi.stick.getX();
  }
  