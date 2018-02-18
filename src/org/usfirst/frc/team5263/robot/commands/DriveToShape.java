package org.usfirst.frc.team5263.robot.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class DriveToShape extends CommandGroup {

	double turnPower;
	double drivePower;
	double degrees;
	double feet;
    public DriveToShape(double drivePower) {
    	
    	this.drivePower = drivePower;
    	
    	addSequential(new DriveTo(10, drivePower, 0));
    	addSequential(new RotatePID(90));
    	
    	addSequential(new DriveTo(1, drivePower, 90));
    	addSequential(new FlipBucket());
    }
}
