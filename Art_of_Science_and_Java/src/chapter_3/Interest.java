/*
 * File: Interest.java
 * -----------------------------------------------------------
 * This program calculates the given annual interest for the 
 * given account balance. 
 */

package chapter_3;

import acm.program.*;

public class Interest extends ConsoleProgram {
	public void run() {
		
		println ("Interest calculation program.");
		double accountBalance = readDouble ("Enter starting balance: ");
		double annualInterest = readDouble ("Enter annual interest rate: ");
		double balance = ((accountBalance * annualInterest) / 100) + accountBalance;
		println ("Balance after one year = " + balance);
	}
}
