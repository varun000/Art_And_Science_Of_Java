/*
 * File: SlotMachine.java
 * -------------------------------------------------------------------
 * A Casino slot machine game which has three wheels to spin and has 
 * a initial stake of $50 for the player to use. Each spin costs $1
 * and if the player wins any amount, it will be added to the initial
 * stake. It will ask the player whether he wants to play before every
 *  spin. Just need to answer yes or no. If the answer is other than
 *  that it will ask the player to answer yes or no.
 */

package chapter_6.Programming_Exercises.Exercise_5;

import acm.program.*;
import acm.util.*;

/**
 * 
 * @author SaiVarunVukkem
 *
 */
public class SlotMachine extends ConsoleProgram {

	/* Private constants */
	private static final int INITIAL_STAKE = 50;
	
	/* Private Instance Variables */
	private int initialStake = INITIAL_STAKE;
	private int winMoney = 0;
	private String winOrLose = null;

	/* Create an instance variable for the random number generator */
	private RandomGenerator rgen = RandomGenerator.getInstance();

	/**
	 * Main method starts here.
	 */
	public void run() {
		runTheGame();
	}

	/**
	 * This method starts the game by asking player some questions.
	 */
	private void runTheGame() {
		String question = readLine("Would you like instructions? ");
		if (question.equals("yes")) {
			giveInstructions();
		} else if (question.equals("no")) {
			askPlayerToPlay();
		} else {
			wrongInstructions();
		}
	}

	/**
	 * If user enters a wrong answer this method asks the user to input correct answer.
	 */
	private void wrongInstructions() {
		println("You have entered wrong answer. Please answer yes or no");
		runTheGame();
	}

	/**
	 * This method gives instructions for the player.
	 * Add additional instructions if required.
	 */
	private void giveInstructions() {
		println("The One-armed bandit.");
		println("1. Insert money to start the game.");
		println("2. You can as many rounds as you like. Each round costs $1.");
		println("3. If you win the game the money will be added to your account.");
		println("Thanks");
		
		askPlayerToPlay();
	}

	/**
	 * This method asks the player whether he is interested to play or not.
	 */
	private void askPlayerToPlay() {
		while(true) {
			String question = readLine("You have $" + initialStake + ". Would you like to play? ");
			if (question.equals("yes")) {
				generateSlots();
				initialStake--;
			} else if (question.equals("no")) {
				println("Thanks for playing.");
				break;
			} else {
				println("You have entered wrong answer. Please answer yes or no");
			}
		}
	}
	
	/**
	 * This method gets the random numbers and converts them to messages in the slot machine using 
	 * another method and displays the pattern.
	 * This method also displays whether the player has win or lose. If won how much he got.
	 */
	private void generateSlots() {
		int slot1 = generateSlotOne();
		int slot2 = generateSlotTwo();
		int slot3 = generateSlotThree();
		
		String slotOne = findPattern(slot1);
		String slotTwo = findPattern(slot2);
		String slotThree = findPattern(slot3);
		
		gameResult(slotOne, slotTwo, slotThree);
		
		if (winOrLose.equals("won")) {
			println(slotOne + "	   " + slotTwo + "	   " + slotThree + "   --   " + "You " + winOrLose + " $" + winMoney);
			println();
		} else {
			println(slotOne + "	   " + slotTwo + "	   " + slotThree + "   --   " + "You " + winOrLose);
			println();
		}
	}
	
	/**
	 * Generates a random number for slot1
	 * @return Returns a generated random number
	 */
	private int generateSlotOne() {
		int slot1 = rgen.nextInt(1, 6);
		return slot1;
	}
	
	/**
	 * Generates a random number for slot2
	 * @return Returns a generated random number
	 */
	private int generateSlotTwo() {
		int slot2 = rgen.nextInt(1, 6);
		return slot2;
	}
	
	/**
	 * Generates a random number for slot3
	 * @return Returns a generated random number
	 */
	private int generateSlotThree() {
		int slot3 = rgen.nextInt(1, 6);
		return slot3;
	}

	/**
	 * Converts the generated random number to message string which has to be displayed in the slots.
	 * @param pattern Takes the generated random number as a parameter
	 * @return Returns the message string
	 */
	private String findPattern(int pattern) {
		String convertedPattern = null;
		
		switch(pattern) {
		case 1:
			convertedPattern = "CHERRY";
			break;
		case 2:
			convertedPattern = "LEMON";
			break;
		case 3:
			convertedPattern = "ORANGE";
			break;
		case 4:
			convertedPattern = "PLUM";
			break;
		case 5:
			convertedPattern = "BELL";
			break;
		case 6:
			convertedPattern = "BAR";
			break;
		default:
			break;
		}
		return convertedPattern;
	}
	
	/**
	 * Uses all the three slot messages as parameters and matches the correct pattern.
	 * It also calculates the amount won if any.
	 * @param slot1 Message displayed in slot1
	 * @param slot2 Message displayed in slot2
	 * @param slot3 Message displayed in slot3
	 */
	private void gameResult(String slot1, String slot2, String slot3) {
		int addedMoney = initialStake;
		
		if (slot1.equals("BAR") && slot2.equals("BAR") && slot3.equals("BAR")) {
			winMoney = 250;
			initialStake = addedMoney + winMoney;
			winOrLose = "won";
		} else if (slot1.equals("BELL") && slot2.equals("BELL") && (slot3.equals("BELL") || slot3.equals("BAR"))) {
			winMoney = 20;
			initialStake = addedMoney + winMoney;
			winOrLose = "won";
		} else if (slot1.equals("PLUM") && slot2.equals("PLUM") && (slot3.equals("PLUM") || slot3.equals("BAR"))) {
			winMoney = 14;
			initialStake = addedMoney + winMoney;
			winOrLose = "won";
		} else if (slot1.equals("ORANGE") && slot2.equals("ORANGE") && (slot3.equals("ORANGE") || slot3.equals("BAR"))) {
			winMoney = 10;
			initialStake = addedMoney + winMoney;
			winOrLose = "won";
		} else if (slot1.equals("CHERRY") && slot2.equals("CHERRY") && slot3.equals("CHERRY")) {
			winMoney = 7;
			initialStake = addedMoney + winMoney;
			winOrLose = "won";
		} else if (slot1.equals("CHERRY") && slot2.equals("CHERRY") && !(slot3.equals("CHERRY"))) {
			winMoney = 5;
			initialStake = addedMoney + winMoney;
			winOrLose = "won";
		} else if (slot1.equals("CHERRY") && !(slot2.equals("CHERRY")) && !(slot3.equals("CHERRY"))) {
			winMoney = 2;
			initialStake = addedMoney + winMoney;
			winOrLose = "won";
		} else {
			winOrLose = "lose";
		}
	}
}