/*
 * File: FibonacciSequence.java
 * --------------------------------------------------------
 * This program creates fibonacci sequence for the first 
 * 15 numbers.
 */
package chapter_4;

import acm.program.*;

public class FibonacciSequence extends ConsoleProgram {
	private static final int END_NUMBER = 15;

	public void run() {
		println ("This program generates Fibonacci sequence.");
		
		int a = 0;
		int b = 1;
		
		for (int i = 0; i <= END_NUMBER; i++) {
			
			println ("F" + i + " = " + a); // 0, 1, 1, 2, 3, 5, 
			a += b; // a = 0 + 1 = 1, 1 + 0 = 1, 1 + 1 = 2, 2 + 1 = 3, 3 + 2 = 5, 
			b = a - b; // b = 1 - 1 = 0, 1 - 0 = 1, 2 - 1 = 1, 3 - 1 = 2, 5 - 2 = 3
		}
	}
}
