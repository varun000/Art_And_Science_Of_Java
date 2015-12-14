/*
 * File: KilogramsToPoundsAndOunces.java
 * ----------------------------------------------------------
 * This program converts a metric weight in kilograms to the 
 * corresponding English weight in pounds and ounces.
 */
package chapter_3;

import acm.program.*;

public class KilogramsToPoundsAndOunces extends ConsoleProgram {
	private static final double POUNDS_PER_KILOGRAM = 2.2;
	private static final double OUNCES_PER_POUND = 16;

	public void run() {
		
		println ("This program converts kilograms to pounds and ounces.");
		double kilograms = readDouble ("Enter number of kilograms: ");
		double pounds = kilograms * POUNDS_PER_KILOGRAM;
		double ounces = pounds * OUNCES_PER_POUND;
		println (kilograms + " kg = " + pounds + " pounds." );
		println (pounds + " pounds = " + ounces + " ounces.");
	}
}
