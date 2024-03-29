package org.usfirst.frc.team696.robot.commands;

import org.usfirst.frc.team696.robot.OI;
import org.usfirst.frc.team696.robot.Robot;
import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc.team696.robot.subsystems.ShifterSystem;


/**
 *
 */
//public class ShifterCommand extends Command {
//
//	boolean shiftHigh = true;
//	
//    public ShifterCommand(boolean shiftHigh) {
//        // Use requires() here to declare subsystem dependencies
//        // eg. requires(chassis);
//    	requires(Robot.shifterSystem);
//    	this.shiftHigh = shiftHigh;
//    }
//
//    // Called just before this Command runs the first time
//    protected void initialize() {
//    }
//
//    // Called repeatedly when this Command is scheduled to run
//    protected void execute() {
//    	if(shiftHigh)Robot.shifterSystem.shiftHigh();
//    	else Robot.shifterSystem.shiftLow();


/**
 *
 */
      
public class ShifterCommand extends Command {


	public ShifterCommand(boolean b) {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis)
		requires(Robot.shifterSystem);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	if(OI.driver.getRawButton(4) == true){
    		Robot.shifterSystem.shiftHigh();
    	} 
    	    
    	if(OI.driver.getRawButton(5) == true){
    		Robot.shifterSystem.shiftLow(); 	
    	}
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
