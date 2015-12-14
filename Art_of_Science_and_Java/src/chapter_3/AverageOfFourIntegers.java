/*
 * File: AverageOfFourIntegers.java
 * ---------------------------------------------------------
 * This program takes four integers as inputs from the user 
 * and calculates the average of them.
 */

package chapter_3;

import acm.program.*;

public class AverageOfFourIntegers extends ConsoleProgram {
	public void run() {
		println ("This program takes 4 integers as inputs and computes the average.");
		int integerOne = readInt ("Enter first integer: ");
		int integerTwo = readInt ("Enter second integer: ");
		int integerThree = readInt ("Enter third integer: ");
		int integerFour = readInt ("Enter fourth integer: ");
		double average = ((double) (integerOne) + integerTwo + integerThree + integerFour) / 4;
		println ("The average of four integers is " + average);
	}
}
