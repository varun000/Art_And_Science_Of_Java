/*
 * File: LeapYear.java
 * -----------------------------------------------------
 * This program reads in a year and determines whether 
 * it is a leap year. A year is a leap year if it is 
 * divisible by four, unless it is divisible by 100 are
 * leap years only if divisible by 400.
 */

package chapter_4;

import acm.program.*;

public class LeapYear extends ConsoleProgram {
	private static final int SENTINEL = 0;

	public void run() {
		println ("This program checks for leap years.");
		
		while (true) {
			int year = readInt ("Enter the year: ");
			
			if (year == SENTINEL) {
				println ("Good Bye....!");
				break;
			}
			else {
				boolean isLeapYear = ((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0);
				
				if (isLeapYear) {
					println (year + " is a leap year.");
				}
				else {
					println (year + " is not a leap year.");
				}
			}
			println ("------------------XXX------------------");
		}
	}
}
