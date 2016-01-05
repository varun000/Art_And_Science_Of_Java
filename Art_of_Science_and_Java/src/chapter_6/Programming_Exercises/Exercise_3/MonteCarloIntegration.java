/*
 * File: MonteCarloIntegration.java
 * 
 * This program simulates throwing darts and then uses the Monte
 * Carlo integration technique to generate and display an 
 * approximate value of π.
 */

package chapter_6.Programming_Exercises.Exercise_3;

import acm.program.*;
import acm.util.*;

public class MonteCarloIntegration extends ConsoleProgram {
	
	/* Private constants */
	private static final int THROWS = 10000;
	
	/* Create an instance variable for the random number generator */
	private RandomGenerator rgen = RandomGenerator.getInstance();
	
	/**
	 * Main method starts here.
	 */
	public void run() {
		double dartsInArea = countDartsInCircle() / THROWS;
		double valueOfPI = dartsInArea * 4;
		println("The value of PI is " + valueOfPI);
	}
	
	/**
	 * Returns the number of darts falling in the area of circle.
	 * @return Returns the count of darts falling in the area of circle
	 */
	private double countDartsInCircle() {
		double dartsInCircle = 0;
		
		for (int i = 0; i < THROWS; i++) {
			if (circleDarts() < 1) {
				dartsInCircle++;
			}
		}
		return dartsInCircle;
	}
	
	/**
	 * Returns the value for x2 + y2 which helps in finding the 
	 * darts falling in the circle
	 * @return Returns the value of x2 + y2
	 */
	private double circleDarts() {
		double x = xValue();
		double y = yValue();
		double pointInCircle = x * x + y * y;
		return pointInCircle;
	}

	/**
	 * Generates and returns a random x value ranging between -1 and 1.
	 * @return Returns the generated random value of x
	 */
	private double xValue() {
		double x = rgen.nextDouble(-1, 1);
		return x;
	}
	
	/**
	 * Generates and returns a random y value ranging between -1 and 1.
	 * @return Returns the generated random value of y
	 */
	private double yValue() {
		double y = rgen.nextDouble(-1, 1);
		return y;
	}
}