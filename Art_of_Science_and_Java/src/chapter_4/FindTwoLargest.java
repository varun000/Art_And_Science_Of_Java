/*
 * File: FindTwoLargest.java
 * --------------------------------------------------------------
 * This program finds the two largest integers in a list entered.
 */

package chapter_4;

import acm.program.*;

public class FindTwoLargest extends ConsoleProgram {
	private static final int SENTINEL = 0;

	public void run() {
		println ("This program finds two largest integers in a list.");
		println ("Enter values, one per line, using a " + SENTINEL + " to signal the end of the list.");
		int max = 0;
		int secondMax = 0;
		
		while (true) {
			
			int value = readInt ("? ");
			
			if (value == SENTINEL) {
				break;
			} else if (value > max) {
				secondMax = max;
				max = value;
			} else if (value > secondMax) {
				secondMax = value;
			}
		}
		println ("The largest value is " + max);
		println ("The second largest value is " + secondMax);
	}
}
