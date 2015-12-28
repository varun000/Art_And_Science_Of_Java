/*
 * File: FindGCD.java
 * ------------------------------------------------------
 * This program finds the greatest common divisor of the
 * two given numbers.
 */

package chapter_5;

import acm.program.*;

public class FindGCD extends ConsoleProgram {
	public void run() {
		println ("Enter two positive integers to find the GCD.");
		int x = readInt("Int 1: ");
		int y = readInt("Int 2: ");
		println ("GCD(x, y) is " + gcd(x, y));
	}
	
	private int gcd(int x, int y) {
		int r = x % y;
		while (r != 0) {
			x = y;
			y = r;
			r = x % y;
		}
		return y;
	}
}
