/*
 * File: CountingDigitsInInteger.java
 * ---------------------------------------------------------
 * This program calculates the number of digits in the given
 * integer.
 */
package chapter_5;

import acm.program.*;

public class CountingDigitsInInteger extends ConsoleProgram {
	public void run() {
		println ("Enter a positive integer and this program will tell you how many digits are in your integer.");
		int value = readInt("Positive Integer: ");
		countDigits(value);
	}

	private void countDigits(int value) {
		int n = 0;
		int counter = 0;
		while (value > 0) {
			n = n + value % 10;
			value /= 10;
			counter++;
		}
		println ("The number of digits in your integer is " + counter);
	}
}
