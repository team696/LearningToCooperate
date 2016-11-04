package org.usfirst.frc.team696.robot.subsystems;

import edu.wpi.first.wpilibj.command.*;

import org.usfirst.frc.team696.robot.RobotMap;

import edu.wpi.first.wpilibj.*;

/**
 *
 */
public class PivotArmSystem extends Subsystem {
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	double botM = 0;
	double topM = 0;
	
	Victor botMotor = new Victor(RobotMap.pivotBot);
	Victor topMotor = new Victor(RobotMap.pivotTop);
	Solenoid pivotRachet = new Solenoid(RobotMap.pivotRachet);
	
	public PivotArmSystem(){
		
	}
	
	

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public void setSpeed(double botM, double topM){
    	this.botM = botM;
    	this.topM = topM;
    	pivotArm();
    	
    }
    
    public void pivotArm(){
    	botMotor.set(botM);
    	topMotor.set(topM);
    	
    }
}

