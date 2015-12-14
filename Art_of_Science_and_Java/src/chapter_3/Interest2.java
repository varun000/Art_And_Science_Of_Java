/*
 * File: Interest2.java
 * ------------------------------------------------------------
 * This program calculates the interest for the give account 
 * balance for one year and then it calculates the interest 
 * for second year for the whole balance.
 */
package chapter_3;

import acm.program.*;

public class Interest2 extends ConsoleProgram {
	public void run() {
		println ("Interest calculation program.");
		double startingBalance = readDouble ("Enter Starting balance: ");
		double annualInterest = readDouble ("Enter annual interest rate: ");
		double oneYearBalance = ((startingBalance * annualInterest) / 100) + startingBalance;
		println ("Balance after one year: " + oneYearBalance);
		double twoYearBalance = ((oneYearBalance * annualInterest) / 100) + oneYearBalance;
		println ("Balance after two years: " + twoYearBalance);
	}
}
