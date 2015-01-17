
package org.usfirst.frc.team229.robot.subsystems;

import org.usfirst.frc.team229.robot.commands.HaloDrive;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.Talon;

/**
 *
 * @author jmiller
 */
public class BatDrive extends Subsystem {
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	Talon Batman;
	Talon Robin;


    
    public BatDrive(){
    	Batman = new Talon(5);
    	Robin = new Talon(4);
    	

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