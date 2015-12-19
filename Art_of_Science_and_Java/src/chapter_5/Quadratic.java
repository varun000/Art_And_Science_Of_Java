/*
 * File: Quadratic.java
 * -------------------------------------------------------
 * This program asks user to input values for a, b and c
 * and then calculates the standard quadratic equation and
 * displays the two results.
 */

package chapter_5;

import acm.program.*;

public class Quadratic extends ConsoleProgram {
	public void run() {
		println ("Enter coefficients for the quadratic equation:");
		double a = readDouble("a: ");
		double b = readDouble("b: ");
		double c = readDouble("c: ");

		if (discriminant(a, b, c) < 0) {
			println("The equation has no real solutions.");
		} else {
			positiveQuadratic(a, b, c);
			negativeQuadratic(a, b, c);
		}
	}

	/*
	 * The standard quadratic equation has two solutions given by the formula.
	 * The method below is used to obtain a solution by using + in place of +/-
	 */
	private void positiveQuadratic(double a, double b, double c) {
		double x = (- b + addSqrtToDiscriminant(a, b, c)) / (2 * a);
		println("The first solution is " + x);
	}

	/* The method below is used to obtain a solution by using - in place of +/- */
	private void negativeQuadratic(double a, double b, double c) {
		double x = (- b - addSqrtToDiscriminant(a, b, c)) / (2 * a);
		println("The second solution is " + x);
	}

	/* Calculate Discriminant. */
	private double discriminant(double a, double b, double c) {
		double discriminant = (b * b) - (4 * a * c);
		return discriminant;
	}

	/* Add square root to the discriminant if it is positive. */
	private double addSqrtToDiscriminant(double a, double b, double c) {
		double realValue = Math.sqrt(discriminant(a, b, c));
		return realValue;
	}
}
