/*
 * File: SumOfNOddNumbers.java
 * -------------------------------------------------------------
 * This program asks the user a positive integer(N) as input and 
 * calculates the sum of first N odd numbers.
 */
package chapter_4;

import acm.program.*;

public class SumOfNOddNumbers extends ConsoleProgram {
	public void run() {
		println ("This program calculates sum of first N odd numbers.");
		int numN = readInt ("Enter a positive integer: ");
		int total = 0;
		int num = 1;
		while (numN > 0) {
			if (num % 2 != 0) {
				total = total + num;
				numN--;
			}
			num++;
		}
		
		println ("The sum of odd numbers is " + total + ".");
	}

}
