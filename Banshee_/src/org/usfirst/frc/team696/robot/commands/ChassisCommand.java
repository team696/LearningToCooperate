package org.usfirst.frc.team696.robot.commands;

import org.usfirst.frc.team696.robot.OI;
import org.usfirst.frc.team696.robot.Robot;
import org.usfirst.frc.team696.robot.subsystems.ChassisSystem;


import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class ChassisCommand extends Command {
	
	double leftDrive = 0;
	double rightDrive = 0;
	double speed = 0;
	double wheel = 0;

    public ChassisCommand() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(Robot.chassisSystem);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	
    	
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	speed = OI.driver.getRawAxis(1);
    	wheel = OI.driver.getRawAxis(4);
    	leftDrive = speed + wheel;
    	rightDrive = speed - wheel;
    	
    	Robot.chassisSystem.setSpeed(leftDrive, rightDrive);
    	
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
