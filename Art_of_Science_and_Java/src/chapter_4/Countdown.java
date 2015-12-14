/*
 * File: Countdown.java
 * ---------------------------------------------------------
 * This program counts backwards from the value START to
 * ZERO, as in the countdown preceding a rocket launch.
 */
package chapter_4;

import acm.program.*;

public class Countdown extends ConsoleProgram {
	/* Specifies the value from which to start counting down. */
	private static final int START = 10;

	public void run() {
		
		int t = START;
		while (t >= 0) {
			println (t);
			t--;
		}
		println ("Liftoff...!");
	}
}
