// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.

package org.usfirst.frc2876.Steamworks2017.subsystems;

import org.usfirst.frc2876.Steamworks2017.RobotMap;

import org.usfirst.frc2876.Steamworks2017.commands.*;

import edu.wpi.first.wpilibj.I2C;
import edu.wpi.first.wpilibj.I2C.Port;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 */
public class Vision extends Subsystem {

	// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

	// END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

	// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

	// END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

	// public PixyI2C pixy;
	public PixyI2C pixy1;
	public PixyI2C pixy2;
	Port port = Port.kOnboard;
	String print;
	public PixyPacket[] packet1 = new PixyPacket[7];
	public PixyPacket[] packet2 = new PixyPacket[7];

	public Vision() {
		// pixy = new PixyI2C();
		pixy1 = new PixyI2C(new I2C(port, 0x54), packet1, new PixyException(print), new PixyPacket());
		pixy2 = new PixyI2C(new I2C(port, 0x55), packet2, new PixyException(print), new PixyPacket());
	}

	// Put methods for controlling this subsystem
	// here. Call these from Commands.

	public void initDefaultCommand() {
		// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND

		// END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND

		// Set the default command for a subsystem here.
		// setDefaultCommand(new MySpecialCommand());
	}
	// public void testPixy(){
	// for(int i = 0; i < packet.length; i++)
	// packet[i] = null;
	// SmartDashboard.putString("Pixy hello", "working");
	// for(int i = 1; i < 8; i++) {
	// try {
	// packet[i - 1] = pixy.readPacket(i);
	// } catch (PixyException e) {
	// SmartDashboard.putString("Pixy Error: " + i, "exception");
	// }
	// if(packet[i - 1] == null){
	// SmartDashboard.putString("Pixy Error: " + i, "True");
	// continue;
	// }
	// SmartDashboard.putNumber("Pixy X Value: " + i, packet[i - 1].X);
	// SmartDashboard.putNumber("Pixy Y Value: " + i, packet[i - 1].Y);
	// SmartDashboard.putNumber("Pixy Width Value: " + i, packet[i - 1].Width);
	// SmartDashboard.putNumber("Pixy Height Value: " + i, packet[i -
	// 1].Height);
	// SmartDashboard.putString("Pixy Error: " + i, "False");
	// }
	//
	// }

	public void testPixy1() {
		for (int i = 0; i < packet1.length; i++)
			packet1[i] = null;
		SmartDashboard.putString("Pixy1 hello", "working");
		for (int i = 1; i < 8; i++) {
			try {
				packet1[i - 1] = pixy1.readPacket(i);
			} catch (PixyException e) {
				SmartDashboard.putString("Pixy1 Error: " + i, "exception");
			}
			if (packet1[i - 1] == null) {
				SmartDashboard.putString("Pixy1 Error: " + i, "True");
				continue;
			}
			SmartDashboard.putNumber("Pixy1 X Value: " + i, packet1[i - 1].X);
			SmartDashboard.putNumber("Pixy1 Y Value: " + i, packet1[i - 1].Y);
			SmartDashboard.putNumber("Pixy1 Width Value: " + i, packet1[i - 1].Width);
			SmartDashboard.putNumber("Pixy1 Height Value: " + i, packet1[i - 1].Height);
			SmartDashboard.putString("Pixy1 Error: " + i, "False");
		}
	}

	public void testPixy2() {
		for (int i = 0; i < packet2.length; i++)
			packet2[i] = null;
		SmartDashboard.putString("Pixy2 hello", "working");
		for (int i = 1; i < 8; i++) {
			try {
				packet2[i - 1] = pixy2.readPacket(i);
			} catch (PixyException e) {
				SmartDashboard.putString("Pixy2 Error: " + i, "exception");
			}
			if (packet2[i - 1] == null) {
				SmartDashboard.putString("Pixy2 Error: " + i, "True");
				continue;
			}
			SmartDashboard.putNumber("Pixy2 X Value: " + i, packet2[i - 1].X);
			SmartDashboard.putNumber("Pixy2 Y Value: " + i, packet2[i - 1].Y);
			SmartDashboard.putNumber("Pixy2 Width Value: " + i, packet2[i - 1].Width);
			SmartDashboard.putNumber("Pixy2 Height Value: " + i, packet2[i - 1].Height);
			SmartDashboard.putString("Pixy2 Error: " + i, "False");
		}

	}

	public void pegTarget() {
		PixyPacket peg1 = null, peg2 = null;
		try {
			peg1 = pixy1.readPacket(1);
		} catch (PixyException e) {
			SmartDashboard.putString("PixyPeg1 Exception: ", e.toString());
		}
		try {
			peg2 = pixy1.readPacket(1);
		} catch (PixyException e) {
			SmartDashboard.putString("PixyPeg2 Exception: ", e.toString());
		}
		SmartDashboard.putString("PixyPeg1", peg1.toString());
		SmartDashboard.putString("PixyPeg2", peg2.toString());
		
	}

}
