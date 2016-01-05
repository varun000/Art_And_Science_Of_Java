/*
 * File: ConsecutiveHeads.java
 * ------------------------------------------------
 * This program simulates flipping a coin repeatedly 
 * and continues until three consecutive heads are 
 * tossed. It also displays the total number of times 
 * the coin was flipped.
 */

package chapter_6.Programming_Exercises;

import acm.program.*;
import acm.util.*;

public class ConsecutiveHeads extends ConsoleProgram {
	
	/* Create an instance variable for the random number generator */
	private RandomGenerator rgen = RandomGenerator.getInstance();
	
	public void run() {
		int counter = 1;
		int headCounter = 0;
		
		while (true) {
			String toss = flipCoin();
			
			if (toss.equals("Heads")) {
				println(toss);
				headCounter++;
				if (headCounter == 3) break;
			} else {
				headCounter = 0;
				println(toss);
			}
			
			counter++;
		}
		
		println("It took " + counter + " flips to get 3 consecutive heads.");
	}

	/**
	 * Toss the coin to find Heads or Tails.
	 * @return Returns the value of toss
	 */
	private String flipCoin() {
		String toss = rgen.nextBoolean() ? "Heads" : "Tails";
		return toss;
	}
}
