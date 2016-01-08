/*
 * File: RandomCard.java
 * --------------------------------------------------------------------
 * This program makes use of Card.java class. It supplies the parameters
 * and displays the card generated.
 */
package chapter_6.Programming_Exercises.Exercise_8;

import acm.program.*;
import acm.util.RandomGenerator;

public class RandomCard extends ConsoleProgram {
	
	/* Create an instance variable for the random number generator */
	private RandomGenerator rgen = RandomGenerator.getInstance();
	
	/**
	 * Main method starts here.
	 */
	public void run() {
		int rank = generateRank();
		int suit = generateSuit();
		Card playCard = new Card(rank, suit);
		println(playCard.toString());
	}

	/**
	 * Generates a random integer between 1 and 13.
	 * @return Returns the generated random value
	 */
	private int generateRank() {
		int rank = rgen.nextInt(1, 13);
		return rank;
	}
	
	/**
	 * Generates a random integer between 1 and 4.
	 * @return Returns the generated random value
	 */
	private int generateSuit() {
		int suit = rgen.nextInt(1, 4);
		return suit;
	}
}
