
package org.usfirst.frc.team229.robot.commands;
//import org.usfirst.frc.team229.robot.OI;
import edu.wpi.first.wpilibj.command.Command;

import org.usfirst.frc.team229.robot.subsystems.DriveTrain;
import org.usfirst.frc.team229.robot.Robot;
//import org.usfirst.frc.team229.robot.OI;


/**
 *
 */
public class HaloDrive extends Command {
	
//git test
	public HaloDrive() {
        requires(Robot.drivetrain);

	}

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	
    		Robot.drivetrain.halo(Robot.oi.getSpeed(),
               Robot.oi.getTurn());
    		Robot.drivetrain.Strafing(Robot.oi.getStrafe());


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
