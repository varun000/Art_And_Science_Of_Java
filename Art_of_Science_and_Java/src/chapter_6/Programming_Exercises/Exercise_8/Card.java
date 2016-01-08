/*
 * File: Card.java
 * ---------------------------------------------------------
 * This Card class is used to represent deck of cards, which 
 * displays the rank and suit. 
 */
package chapter_6.Programming_Exercises.Exercise_8;

public class Card {

	/* Private Constants */
	private static final int CLUBS = 1;
	private static final int DIAMONDS = 2;
	private static final int HEARTS = 3;
	private static final int SPADES = 4;

	private static final int ACE = 1;
	private static final int JACK = 11;
	private static final int QUEEN = 12;
	private static final int KING = 13;

	/**
	 * Constructor of the class.
	 * @param rank Integer between 1 and 14 which represents Rank of cards
	 * @param suit Integer between 1 and 4 which represents Suit of cards
	 */
	public Card(int rank, int suit) {
		cardRank = convertRank(rank);
		cardSuit = convertSuit(suit);
	}

	/**
	 * Gets the rank of the card.
	 * @return Returns the rank of the card
	 */
	public String getRank() {
		return cardRank;
	}

	/**
	 * Gets the suit of the card.
	 * @return Returns the suit of the card
	 */
	public String getSuit() {
		return cardSuit;
	}

	/**
	 * Converts the integer to rank of the cards.
	 * @param r Takes a random integer as input
	 * @return Returns the converted rank
	 */
	private String convertRank(int r) {
		String rank = null;

		switch (r) {
		case ACE:
			rank = "Ace";
			break;
		case 2:
			rank = "2";
			break;
		case 3:
			rank = "3";
			break;
		case 4:
			rank = "4";
			break;
		case 5:
			rank = "5";
			break;
		case 6:
			rank = "6";
			break;
		case 7:
			rank = "7";
			break;
		case 8:
			rank = "8";
			break;
		case 9:
			rank = "9";
			break;
		case 10:
			rank = "10";
			break;
		case JACK:
			rank = "Jack";
			break;
		case QUEEN:
			rank = "Queen";
			break;
		case KING:
			rank = "King";
			break;
		}

		return rank;
	}

	/**
	 * Converts the integer to suit of the cards.
	 * @param s Takes a random integer as input
	 * @return Returns the converted suit
	 */
	private String convertSuit(int s) {
		String suit = null;

		switch (s) {
		case CLUBS:
			suit = "Clubs";
			break;
		case DIAMONDS:
			suit = "Diamonds";
			break;
		case HEARTS:
			suit = "Hearts";
			break;
		case SPADES:
			suit = "Spades";
			break;
		}

		return suit;
	}

	/**
	 * Creates a string identifying the card.
	 * @return The string used to display the card selected.
	 */
	public String toString() {
		return cardRank + " of " + cardSuit;
	}

	/* Private instance variables */
	private String cardRank;
	private String cardSuit;
}
