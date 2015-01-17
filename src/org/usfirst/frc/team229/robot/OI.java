package org.usfirst.frc.team229.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;;





/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
	 Joystick DriverPad = new Joystick(0);
	 Joystick OperatorPad = new Joystick(2);
	 Double strafe;
	 SmartDashboard dash;

	 
    public OI() {

        
    }
    

    public double getStrafe() {  	
    	return (DriverPad.getRawAxis(2) - DriverPad.getRawAxis(3));
       
    }
    public double getSpeed() {
    	System.out.println(DriverPad.getRawAxis(1));
        return DriverPad.getRawAxis(5);
    }
    
    public double getTurn() {
        return DriverPad.getRawAxis(4);
    }
}

