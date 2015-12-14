/*
 * File: CentimetersToFeetAndInches.java
 * --------------------------------------------------------------
 * This program converts centimeters to an integral number of feet
 *  and any remaining inches.
 */

import acm.program.*;

public class CentimetersToFeetAndInches extends ConsoleProgram {
	private static final double CENTIMETERS_PER_INCH = 2.54;
	private static final double INCHES_PER_FOOT = 12;

	public void run() {
		println ("This program converts centimeters to feet and inches.");
		double cm = readDouble ("Enter Value in centimeters: ");
		double totalInches = cm / CENTIMETERS_PER_INCH;
		int feet = (int) (totalInches / INCHES_PER_FOOT);
		double inches = totalInches - INCHES_PER_FOOT * feet;
		println (cm + "cm = " + feet + "ft + " + inches + "in");
	}
}
