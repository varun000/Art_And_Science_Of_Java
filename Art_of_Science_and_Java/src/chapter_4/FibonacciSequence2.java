/*
 * File: FibonacciSequence2.java
 * -----------------------------------------------------------
 * This program displays fibonacci sequence numbers that are 
 * smaller than 10,000.
 */
package chapter_4;

import acm.program.*;

public class FibonacciSequence2 extends ConsoleProgram {

	public void run() {
		println ("This program generates Fibonacci sequence below 10,000.");

		int a = 0;
		int b = 1;

		while (a < 10000) {
			println (a); // 0, 1, 1, 2, 3, 5, 
			a += b; // a = 0 + 1 = 1, 1 + 0 = 1, 1 + 1 = 2, 2 + 1 = 3, 3 + 2 = 5, 
			b = a - b; // b = 1 - 1 = 0, 1 - 0 = 1, 2 - 1 = 1, 3 - 1 = 2, 5 - 2 = 3
		}		
	}
}
