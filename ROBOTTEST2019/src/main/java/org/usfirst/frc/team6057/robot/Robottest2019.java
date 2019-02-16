//All sarcastic, grumpy, creepy, and general note taking comments are courtsey of Emma Hetrick (Luke, you weren't supposed to tell them that!)
/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team6057.robot;//look up what this is (google it)

import org.opencv.core.Mat;
import org.opencv.imgproc.Imgproc;
import edu.wpi.cscore.CvSink;
import edu.wpi.cscore.CvSource;
import edu.wpi.cscore.UsbCamera;
import edu.wpi.first.wpilibj.CameraServer;
import edu.wpi.first.wpilibj.IterativeRobot;//this is a library. somebody who knows what that is, figure out what library, and what it's supposed to do
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.PWMVictorSPX;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;

//If you are reading this, it worked

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the IterativeRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the build.properties file in the
 * project.
 */
public class Robottest2019 extends IterativeRobot {


	// private static final String kCenterAuto = "Center Auto";
	// private static final String kLeftAuto = "Left Auto";
	// private static final String kRightAuto = "Right Auto";
	// private String m_autoSelected;
	// private SendableChooser<String> m_chooser=new SendableChooser<>();

	// This line comments out the beginning code
	/*
	 * private static final String kDefaultAuto = "Default"; private static final
	 * String kCustomAuto = "My Auto"; private String m_autoSelected; private
	 * SendableChooser<String> m_chooser = new SendableChooser<>();
	 * 
	 * /** This function is run when the robot is first started up and should be
	 * used for any initialization code.
	 */
	Joystick controller = new Joystick(0);
	Joystick controller2 = new Joystick(1);
          
	double rightTog;
	double leftTog;
	double conveyorIn;
	double conveyorOut;


     double armUp;
	double armDown;



	double frontpUp;
	double frontpDown;



	double backpUp;
	double backpDown;



	Solenoid front = new Solenoid(1);
	Solenoid back = new Solenoid(0); 


	
	PWMVictorSPX frontLeft = new PWMVictorSPX(0);
	PWMVictorSPX rearLeft = new PWMVictorSPX(1);
	PWMVictorSPX frontRight = new PWMVictorSPX(2);
	PWMVictorSPX rearRight = new PWMVictorSPX(3);

	// Instantiation of collection and output systems
	// Conveytor Belt
	PWMVictorSPX leftConvey = new PWMVictorSPX(4);
	PWMVictorSPX rightConvey = new PWMVictorSPX(5);
	// Collector Arm extends up and down
	PWMVictorSPX armside1 = new PWMVictorSPX(6);
	PWMVictorSPX armside2= new PWMVictorSPX(7);// ----side of the arm
// ----side of the arm
	// PWMVictorSPX rightArm = new PWMVictorSPX(7);

	SpeedControllerGroup rightMotors = new SpeedControllerGroup(frontRight, rearRight);
	SpeedControllerGroup leftMotors = new SpeedControllerGroup(frontLeft, rearLeft);

	// Defines the variables as members of our Robot class

	// Timer timer;
	// private int switchside;

	// Initializes the variables in the robotInit method, this method is called when
	// the robot is initializing
	@Override
	public void robotInit() {

		new Thread(() ->

		{    UsbCamera camera = CameraServer.getInstance().startAutomaticCapture();

			UsbCamera camera1 = CameraServer.getInstance().startAutomaticCapture();

			camera.setResolution(640,480);

			camera1.setResolution(640, 480);

			CvSink cvSink = CameraServer.getInstance().getVideo();

			CvSource outputStream = CameraServer.getInstance().putVideo("Blur", 640, 480);

			Mat source = new Mat();

			Mat output = new Mat();

			while(!Thread.interrupted()){
cvSink.grabFrame(source); 

Imgproc.cvtColor(source,output, Imgproc.COLOR_BGR2GRAY);

outputStream.putFrame(output);
			}
		}).start();
	}

	


		// m_chooser.addDefault(kLeftAuto, kLeftAuto);
		// m_chooser.addObject(kCenterAuto, kCenterAuto);
		// m_chooser.addObject(kRightAuto, kRightAuto);
		// SmartDashboard.putData("Auto Choice", m_chooser);
	

	// @Override

	/*
	 * This autonomous (along with the chooser code above) shows how to select
	 * between different autonomous modes using the dashboard. The sendable chooser
	 * code works with the Java SmartDashboard. If you prefer the LabVIEW Dashboard,
	 * remove all of the chooser code and uncomment the getString line to get the
	 * auto name from the text box below the Gyro
	 *
	 * <p>You can add additional auto modes by adding additional comparisons to the
	 * switch structure below with additional strings. If using the SendableChooser
	 * make sure to add them to the chooser code above as well.
	 */

	@Override

	public void autonomousInit() {

		// m_autoSelected=m_chooser.getSelected();

		// System.out.println("Auto Selected: "+m_autoSelected);

		// timer = new Timer();
		// timer.reset();
		// timer.start();
		// String get_signal = null;

		// while (get_signal == null) {

		// Timer.delay(0.020);
		// get_signal = DriverStation.getInstance().getGameSpecificMessage();

		// if (get_signal.charAt(0) == 'L')

		{
			// switchside = 1;// signal indicates left switch is ours
			// DriverStation.reportWarning("Left detected", false);

		} // else {
			// switchside = 0; // signal indicates right switch is ours
			// DriverStation.reportWarning("Right detected", false);
			// }

	}
	// return;//I would see if there's a use for this return statement. Right now it
	// looks unneccessary. Create a branch in GitHub and see what happens without
	// it.

	// }

	// public int get_switchside() {

	// return switchside;

	// }

	/*
	 * This function is called periodically during autonomous.
	 */
	@Override

	public void autonomousPeriodic() {

		// switch (m_autoSelected) {

		// case kLeftAuto://If the robot starts from the left and...
		// default:
		// if(switchside==1)//your switch is the left
		{
			// if(timer.get()<4)
			// backUp();
			// if(timer.get()>4)
			{
				// driveStop();
				// conveyor(1);
			}
			// else
			// conveyor(0);
		}
		// else// your switch is the right
		{
			// if(timer.get()<4)
			// backUp();
			// if(timer.get()>4)
			{
				// driveStop();
			}
		}

		// break;

		// case kRightAuto://same thing as above, but starting from the right
		// if(switchside==0)
		{
			// if(timer.get()<4)
			// backUp();
			// if(timer.get()>4&& timer.get()<5)
			{
				// driveStop();
				// conveyor(1);
			}
			// else
			// conveyor(0);
		}
		// else
		{
			// if(timer.get()<4)
			// backUp();
			// if(timer.get()>4)
			{
				// driveStop();
			}
		}
		// break;
		// case kCenterAuto://you should know the drill by now, but in case it's a bad
		// day, this is if you're starting from the center
		// if(timer.get()<2)
		{
			// if(switchside == 1)
			// turnLeft();
			// else
			// turnRight();
		}
		// if(timer.get()>2 &&timer.get()<5)
		{
			// backUp();
		}
		// if(timer.get()>5 &&timer.get()<6)
		{
			// conveyor(1);
			// driveStop();
		}
		// else
		// conveyor(0);
		// break;
	}
	// }
	// driving direction methods

	public void backUp() {

		rearLeft.set(-.25);
		frontLeft.set(-.25);

		rearRight.set(.25);
		frontRight.set(.25);

	}

	public void turnRight() { // turns right going forward

		rearLeft.set(.25);
		frontLeft.set(.25);

		rearRight.set(.3);
		frontRight.set(.3);
	}

	public void turnLeft() { // Okay, this looks suspect to me, because of the positive/negative difference
								// in the speed. Test, create a new branch to fix it, test again, repeat

		rearLeft.set(-.3);
		frontLeft.set(-.3);

		rearRight.set(0.2);
		frontRight.set(0.2);
	}

	public void driveForward() {

		rearLeft.set(.25);
		frontLeft.set(.25);

		rearRight.set(-.25);
		frontRight.set(-.25);

	}

	public void driveStop()

	{
		rearLeft.set(0);
		frontLeft.set(0);

		rearRight.set(0);
		frontRight.set(0);

	}

	public void conveyor(int speed) {
		leftConvey.set(speed);
		rightConvey.set(-speed);
	}

	//public void armExtend(int speed) {
		//armside1.set(speed);
	 

		// public void pneumaticExtend1(int speed) {
		//  	frontRightP.set(speed);
		// 	frontLeftP.set(-speed);

		//}


	//}
	
//Note to those who come after:
	//as far as I can tell, getRawAxis(int) calls up a specific button/toggle on the controller; different buttons/toggles have different ints assigned to them
	
	void drive() {
		leftTog = controller.getRawAxis(1) * -0.75;//  for the controller and sets drive speed at 75%
		rightTog = controller.getRawAxis(5) * 0.75;

		// DriverStation.reportWarning("$L" + leftTog, false);
		// DriverStation.reportWarning("$R" + rightTog, false);

		rearLeft.set(leftTog);
		frontLeft.set(leftTog);

		rearRight.set(rightTog);
		frontRight.set(rightTog);
	}

	void conveyorBelt() {
		conveyorIn = controller2.getRawAxis(3);
		conveyorOut = controller2.getRawAxis(2);

		 
		if (conveyorIn >= 0.1) {// if you tell the conveyor to pull something in, this sets the motors 
			leftConvey.set(1);
			System.out.println(leftConvey.get());
			rightConvey.set(-1);
			System.out.println(rightConvey.get());
			//conveyorIn = controller.getRawAxis(3);
		}
		else if (conveyorOut >= 0.1) {//Same thing as above, except opposite
			leftConvey.set(-1);
			rightConvey.set(1);
			//conveyorOut = controller.getRawAxis(2);
		}
		else {//the conveyor is doing nothing
			leftConvey.set(0);
			rightConvey.set(0);
		
		}

		}
		
	void armExtend (){
		armUp =  controller2.getRawAxis(1);
	

		if (armUp>= 0.1){//sets motorsto help with going up 
			armside1.set(1);
			armside2.set(1);
			//System.out.println
	}

	else if(armUp <=-0.1){//sets motors to help with going down
		armside1.set(-1);
		armside2.set(-1);
	}
	else {//sets motors to  do nothing 
		armside1.set(0);
		armside2.set(0);
	}
}



void pneumaticExtend1 (){// Pnematics go out 
boolean ExtendUp1 = controller.getRawButton(4);
boolean Retreat1 =  controller.getRawButton(1); 

if (Retreat1){
front.set(false);

}
else if (ExtendUp1){//Pnematics go in

front.set(true);

}
}

 void pneumaticExtend2(){// Pnematics go out 
	boolean ExtendUp2 = controller.getRawButton(2);
	boolean Retreat2 =  controller.getRawButton(3); 
	
	if (Retreat2){
   back.set(false);

	}
	else if (ExtendUp2){//Pnematics go in
	
	back.set(true);
	
	}
}
	
	/**
	 * This function is called periodically during operator control.
	 */
	@Override

	public void teleopPeriodic() { //this would be the draw portion of Processing (I know you've used Processing, Joe)
		    drive();
		 conveyorBelt();
	     armExtend();
	  pneumaticExtend1();; 
	  pneumaticExtend2();
	
	}

	/**
	 * This function is called periodically during test mode.
	 */
	@SuppressWarnings("deprecation")
	@Override
	public void testPeriodic() {

		LiveWindow.run();//Okay, you need to figure out why the run has a line through it. 
		teleopPeriodic();

	}

}