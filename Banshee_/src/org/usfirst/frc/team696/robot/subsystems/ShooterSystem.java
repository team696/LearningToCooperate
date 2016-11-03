package org.usfirst.frc.team696.robot.subsystems;

import org.usfirst.frc.team696.robot.RobotMap;

import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class ShooterSystem extends Subsystem {
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	
	Victor topShooter = new Victor(RobotMap.shooterTop);
	Victor botShooter = new Victor(RobotMap.shooterBot);
	
	double speed = 0;
	
	public ShooterSystem(){
		
	}

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

