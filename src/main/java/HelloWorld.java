package main.java;

import lejos.hardware.BrickFinder;
import lejos.hardware.Keys;
import lejos.hardware.ev3.EV3;
import lejos.hardware.lcd.TextLCD;
import lejos.hardware.motor.Motor;
import lejos.robotics.RegulatedMotor;


/**
 * Example leJOS EV3 Project with an ant build file
 *
 */
public class HelloWorld {

	public static void main(String[] args) {
		EV3 ev3 = (EV3) BrickFinder.getLocal();
		TextLCD lcd = ev3.getTextLCD();
		Keys keys = ev3.getKeys();
		
		lcd.drawString("Hello World", 4, 4);
		keys.waitForAnyPress();
		
		RegulatedMotor moto = Motor.A;
		float maxSpeed = moto.getMaxSpeed();
		lcd.drawString("Max speed: " + maxSpeed, 4, 4);
		keys.waitForAnyPress();
	}
	
}
