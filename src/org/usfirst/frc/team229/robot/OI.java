package org.usfirst.frc.team229.robot;

import edu.wpi.first.wpilibj.Joystick;





/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
	 Joystick DriverPad = new Joystick(0);
	 Joystick OperatorPad = new Joystick(2);
	 Double strafe;

	 
    public OI() {

        
    }
    

    public double getStrafe() {
    	return (DriverPad.getRawAxis(2) - DriverPad.getRawAxis(3));
       
    }
    public double getSpeed() {
        return DriverPad.getRawAxis(1);
    }
    
    public double getTurn() {
        return DriverPad.getRawAxis(4);
    }
}

