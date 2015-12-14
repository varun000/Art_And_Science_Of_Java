/*
 * File: AreaOfCircle.java
 * ----------------------------------------------------------
 * This program asks the user for the radius of a circle and 
 * then computes the area of that circle using the formula.
 */
package chapter_3;

import acm.program.*;

public class AreaOfCircle extends ConsoleProgram {
	
	private static final double PI = 3.14159265358979323846;

	public void run() {
		
		println ("Area of the Circle.");
		double radius = readDouble ("Enter the radius of a circle: ");
		double areaOfCircle = PI * (radius * radius); 
		println ("The area of the Circle is: " + areaOfCircle);
	}
}
