/*
 * File: RandomCard.java
 * -------------------------------------------------------
 * This program displays the name of a card randomly chosen
 * from a complete deck of 52 playing cards.
 */

package chapter_6.Programming_Exercises.Exercise_1;

import acm.program.*;
import acm.util.*;

public class RandomCard extends ConsoleProgram {

	/* Create an instance variable for the random number generator */
	private RandomGenerator rgen = RandomGenerator.getInstance();

	/**
	 * Main method starts here.
	 */
	public void run() {
		println("This program displays a randomly chosen card.");
		
		int r = findRank();
		int s = findSuit();;
		
		if (r > 1 && r < 11) {
			println(r + " of " + convertSuit(s));
		} else {
			println(convertRank(r) + " of " + convertSuit(s));
		}
	}
	
	/**
	 * Converts the randomly generated value to string
	 * @param r Randomly generated value
	 * @return Returns a string value rank
	 */
	private String convertRank(int r) {
		String rank = null;
				
		switch (r) {
		case 1:
			rank = "Ace";
			break;
		case 11:
			rank = "Jack";
			break;
		case 12:
			rank = "Queen";
			break;
		case 13:
			rank = "King";
			break;
		}
		
		return rank;
	}

	/**
	 * Converts the randomly generated value to string
	 * @param s Randomly generated value
	 * @return Returns a string value suit
	 */
	private String convertSuit(int s) {
		String suit = null;
		
		switch (s) {
		case 1:
			suit = "Clubs";
			break;
		case 2:
			suit = "Diamonds";
			break;
		case 3:
			suit = "Hearts";
			break;
		case 4:
			suit = "Spades";
			break;
		}
		
		return suit;
	}
	
	/**
	 * Returns a random number between 1 and 13 representing the rank of the cards.
	 * @return Returns a random number between 1 and 13
	 */
	private int findRank() {
		int rank = rgen.nextInt(1, 13);
		return rank;
	}

	/**
	 * Returns a random number between 1 and 4 representing the suit of the cards.
	 * @return Returns a random number between 1 and 4
	 */
	private int findSuit() {
		int suit = rgen.nextInt(1, 4);
		return suit;
	}
}
