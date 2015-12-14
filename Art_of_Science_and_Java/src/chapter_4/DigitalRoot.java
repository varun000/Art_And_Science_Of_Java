/*
 * File: DigitalRoot.java
 * ------------------------------------------------------
 * This program calculates the digital root of a give number.
 */

package chapter_4;

import acm.program.*;

public class DigitalRoot extends ConsoleProgram {
	public void run() {
		println ("This program calculates digital root to a given number.");
		int input = readInt ("Enter a positive integer: ");
		int num = input;
		int value = 0;
		while (num > 9) { //num = 1729, 
			while (num > 0) { // num = 1729, 172, 17
				value += num % 10; // value = 0 + 9 = 9, 9 + 2 = 11, 11 + 7 = 18, 18 + 1 = 19
				num /= 10; // num = 1729, 172, 17, 1
			}
			num = value; // value = 19
			value = 0;
		}
		
		println ("The digital root of " + input + " is " + num + ".");
	}
}
