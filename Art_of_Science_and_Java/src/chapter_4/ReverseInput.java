/*
 * File: ReverseInput.java
 * --------------------------------------------------
 * This program reads user input and prints it in 
 * reversed format.
 */
package chapter_4;

import acm.program.*;

public class ReverseInput extends ConsoleProgram {
	public void run() {
		println ("This program reverses the digits in an integer.");
		int n = readInt ("Enter a positive integer: ");
		int value = 0;
		while (n > 0) { //   1729, 172, 17, 1, 0
			value = value * 10; // 0, 90, 920, 9270
			value = value + n % 10; // 90 + 2 = 92, 920 + 7 = 927, 9270 + 1 = 9271
			n = n / 10;
		}
		
		println ("The reversed integer is " + value);
	}
}
