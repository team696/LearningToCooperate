package org.usfirst.frc.team696.robot.subsystems;

import org.usfirst.frc.team696.robot.RobotMap;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class ChassisSystem extends Subsystem {
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	
	RobotDrive drive = new RobotDrive(RobotMap.leftFront, RobotMap.leftRear, RobotMap.rightFront, RobotMap.rightRear);
	
	double leftDrive = 0;
	double rightDrive = 0;
	
	public ChassisSystem(){
		
	}

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public void setSpeed(double leftDrive, double rightDrive){
    	this.leftDrive = leftDrive;
    	this.rightDrive = rightDrive;
    	drive();
    }
    
    public double getLeftSpeed(){
    	return leftDrive;
    }
    
    public double getRightSpeed(){
    	return rightDrive;
    }
    
    public void drive(){
    	drive.tankDrive(leftDrive, rightDrive);
    	
    }
    
    public void stop(){
    	drive.tankDrive(0, 0);
    }
}

