package org.usfirst.frc.team696.robot.commands;

import org.usfirst.frc.team696.robot.PIDControl;
import org.usfirst.frc.team696.robot.Robot;
import org.usfirst.frc.team696.robot.Robot.*;

import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc.team696.robot.subsystems.*;

/**
 *
 */
public class TelescopingArmCommand extends Command {

	PIDControl PID = new PIDControl(0, 0, 0, 0);
	double target = 0 ;
	double location =  0;
	double current = 0;
	double topM = 0;
	double botM = 0;
	double error = 0;
	
    public TelescopingArmCommand(double target) {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(Robot.telescopingArmSystem);
    	this.target = target;
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	current = Robot.telescoping.get();
    	error = target - current;
    	PID.setError(error);
    	
    	Robot.telescopingArmSystem.setSpeed(topM, botM);
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
