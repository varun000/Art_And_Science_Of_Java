/*
 * File: InchesToCentimeters.java
 * --------------------------------------------------------------
 * This program converts feet and inches to centimeters.
 */

package chapter_3;

import acm.program.*;

public class InchesToCentimeters extends ConsoleProgram {
	private static final int INCHES_PER_FOOT = 12;
	private static final double CENTIMETERS_PER_INCH = 2.54;

	public void run() {
		println ("This program converts feet and inches to centimeters.");
		int feet = readInt ("Enter number of feet: ");
		int inches = readInt ("Enter number of inches: ");
		double cm = ((feet * INCHES_PER_FOOT) * CENTIMETERS_PER_INCH) + (inches * CENTIMETERS_PER_INCH);
		println (feet + "ft " + inches + "in " + "= " + cm + "cm.");
	}
}
