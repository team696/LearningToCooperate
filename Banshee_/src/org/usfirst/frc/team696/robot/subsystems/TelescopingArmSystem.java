package org.usfirst.frc.team696.robot.subsystems;

import org.usfirst.frc.team696.robot.RobotMap;

import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class TelescopingArmSystem extends Subsystem {
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	
	double speed = 0;
	double currentLoc = 0;
	double target = 0;
	double topM = 0;
	double botM = 0;
	
	Victor top = new Victor(RobotMap.telescopingA);
	Victor bot = new Victor(RobotMap.telescopingB);

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public void setSpeed(double top, double bot){
    	this.topM = top;
    	this.botM = bot;
    	teleArm();
    }
    
    public void teleArm(){
    	top.set(topM);
    }
}

