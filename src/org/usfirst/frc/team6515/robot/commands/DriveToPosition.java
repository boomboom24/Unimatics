package org.usfirst.frc.team6515.robot.commands;

import org.usfirst.frc.team6515.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class DriveToPosition extends Command {

	private double targetPosition;
	
    public DriveToPosition(double distance) {
    	//We require the driveTrain to drive, obviously
    	requires(Robot.driveTrain);
    	
    	//So we can use this variable in the execute() function
    	targetPosition = distance;
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	//Let's drive!
    	Robot.driveTrain.driveToPosition(targetPosition);
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {	
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
    	end();
    }
}