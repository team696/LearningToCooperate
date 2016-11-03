package org.usfirst.frc.team696.robot;
/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    // For example to map the left and right motors, you could define the
    // following variables to use with your drivetrain subsystem.
    // public static int leftMotor = 1;
    // public static int rightMotor = 2;
    
    // If you are using multiple modules, make sure to define both the port
    // number and the module. For example you with a rangefinder:
    // public static int rangefinderPort = 1;
    // public static int rangefinderModule = 1;
	
	/*
	 * setting up victors
	 */
	public static int leftFront = 0;
	public static int leftRear = 1;
	public static int shooterTop = 2;
	public static int winchBot = 3;
	public static int winchTop = 4;
	public static int pivotTop = 5;
	public static int pivotBot = 6;
	public static int shooterBot = 7;
	public static int rightRear = 8;
	public static int rightFront = 9;
	
	public static int PDPleftFront = 14;
	public static int PDPleftRear = 13;
	public static int PDPshooterTop = 12;
	public static int PDPwinchBot = 9;
	public static int PDPwinchTop = 8;
	public static int PDPpivotTop = 7;
	public static int PDPpivotBot = 6;
	public static int PDPshooterBot = 3;
	public static int PDPrightRear = 2;
	public static int PDPrightFront = 1;
	
	/*
	 * Solenoids
	 */
	public static int pivotRachet = 4;
	public static int winchRachet = 5;
	public static int shoot = 6;
	public static int shift = 7;
	
	/*
	 * Encoders
	 */
	public static int rightEncA = 1;
	public static int rightEncB = 0;
	public static int leftEncA = 2;
	public static int leftEncB = 3;
	public static int pivotEncA = 4;
	public static int pivotEncB = 5;
	public static int botShooterA = 6;
	public static int botShooterB = 7;
	public static int topShooterA = 8;
	public static int topShooterB = 9;
	public static int telescopingA = 10;
	public static int telescopingB = 11;
}
