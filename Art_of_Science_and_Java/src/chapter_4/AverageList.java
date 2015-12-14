/*
 * File: AverageList.java
 * ---------------------------------------------------
 * This program reads a list of integers from the user 
 * and prints out the average.
 */
package chapter_4;

import acm.program.*;

public class AverageList extends ConsoleProgram {
	private static final int SENTINEL = -1;

	public void run() {
		println ("Enter numbers and get the average.");
		println ("Enter values, one per line, using " + SENTINEL);
		println ("to signal the end of the list.");
		int count = 0;
		int total = 0;
		
		while (true) {
			int value = readInt ("Enter a positive integer: ");
			if (value == SENTINEL) break;
			total += value;
			count++;
		}
		
		double average = (double) total / count;
		
		println ("The average is " + average + ".");
		
	}
}
