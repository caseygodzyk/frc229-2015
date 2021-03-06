
package org.usfirst.frc.team229.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Talon;

//import org.usfirst.frc.team229.robot.RobotMap;
import org.usfirst.frc.team229.robot.commands.HaloDrive;
//import edu.wpi.first.wpilibj.Encoder;
import org.usfirst.frc.team229.robot.subsystems.DriveTrain;

/**
 *
 */
public class DriveTrain extends Subsystem {
	RobotDrive drivebase;
	Talon Batman;
	Talon Robin;
	
    public DriveTrain() {
        drivebase = new RobotDrive(0,1,2,3);
        drivebase.setSafetyEnabled(true);
        Batman = new Talon(5);
    	Robin = new Talon(4);
    }
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    public void halo(double Speed, double Turn){
        drivebase.arcadeDrive(-Speed*Math.abs(Speed), -Turn*Math.abs(Turn));
    }
    
    public void Strafing(double Strafe){
 	   Robin.set(Strafe);
    }

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    	 setDefaultCommand(new HaloDrive());
    }
}

