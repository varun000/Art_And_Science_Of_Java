/*
 * File: FindLargest.java
 * ------------------------------------------------------------
 * This file reads a list of input from the user and finds the 
 * largest value entered.
 */

package chapter_4;

import acm.program.*;

public class FindLargest extends ConsoleProgram {
	private static final int SENTINEL = 0;

	public void run() {
		println ("This program finds the largest integer in a list.");
		println ("Enter values, one per line, using a " + SENTINEL + " to signal ");
		println ("the end of the list.");
		int max = 0;
		while (true) {
			int value = readInt ("?: ");
			if (value == SENTINEL) break;
			if (value > max) {
				max = value;
			}
		}
		println ("The largest value is " + max);
	}
}
