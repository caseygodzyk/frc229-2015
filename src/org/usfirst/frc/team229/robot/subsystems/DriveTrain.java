
package org.usfirst.frc.team229.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.RobotDrive;
//import org.usfirst.frc.team229.robot.RobotMap;
import org.usfirst.frc.team229.robot.commands.HaloDrive;
//import edu.wpi.first.wpilibj.Encoder;
import org.usfirst.frc.team229.robot.subsystems.DriveTrain;

/**
 *
 */
public class DriveTrain extends Subsystem {
	RobotDrive drivebase;
	
    public DriveTrain() {
        drivebase = new RobotDrive(0,1,2,3);
        drivebase.setSafetyEnabled(true);
        
    }
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    public void halo(double Speed, double Turn){
        drivebase.arcadeDrive(-Speed*Math.abs(Speed), -Turn*Math.abs(Turn));
    }

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    	 setDefaultCommand(new HaloDrive());
    }
}

