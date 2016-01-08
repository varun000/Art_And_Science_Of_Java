/*
 * File: MathQuiz.java
 * -------------------------------------------------------------
 * This program generates a math quiz for first and second grade
 *  students. It consists of only additions and subtractions. 
 *  It will choose the questions randomly. It is same as 
 *  MathQuiz.java but displays a different message when user gives
 *  correct answer.
 */

package chapter_6.Programming_Exercises.Exercise_7;

import acm.program.*;
import acm.util.RandomGenerator;

public class MathQuizV2 extends ConsoleProgram {
	/* Private constants */
	private static final int NQUESTIONS = 5;
	private static final int TRIES = 3;

	/* Create an instance variable for the random number generator */
	private RandomGenerator rgen = RandomGenerator.getInstance();

	/**
	 * Main method starts here.
	 */
	public void run() {
		println("Welcome to Math Quiz.");
		formAQuestion();
	}

	/**
	 * This method will create questions according to the number of questions
	 * given in the constant NQUESTIONS.
	 */
	private void formAQuestion() {
		for (int i = 0; i < NQUESTIONS; i++) {
			generateQuestion();
		}
	}

	/**
	 * This method creates two random integers and one random operator which has
	 * to be included in the question.
	 */
	private void generateQuestion() {
		while (true) {
			int integerOne = generateIntegers();
			int integerTwo = generateIntegers();
			String operator = generateOperator();

			if (validNumbers(integerOne, integerTwo, operator)) {
				validateUserAnswers(integerOne, integerTwo, operator);
				break;
			}
		}
	}

	/**
	 * 
	 * @param integerOne Random integer between 0 and 20
	 * @param integerTwo Random integer between 0 and 20
	 * @param operator An operator generated randomly between + or -
	 * @return Returns true or false by checking the given condition
	 */
	private boolean validNumbers(int integerOne, int integerTwo, String operator) {
		if (operator.equals("+")) {
			return integerOne + integerTwo <= 20;
		} else if (operator.equals("-")) {
			return integerOne - integerTwo <= 20 && integerOne - integerTwo >= 0;
		}
		println("Unsupported operator");
		return false;
	}

	
	/**
	 * This method validates the user input and displays the message according to the user input.
	 * @param integerOne Random integer between 0 and 20
	 * @param integerTwo Random integer between 0 and 20
	 * @param operator Random operator generated
	 */
	private void validateUserAnswers(int integerOne, int integerTwo, String operator) {
		int actualAnswer;
		
		if (operator.equals("+")) {
			actualAnswer = integerOne + integerTwo;
		} else {
			actualAnswer = integerOne - integerTwo;
		}
		
		int displayFeedback = generateRandomMessage();
		String feedback = displayMessage(displayFeedback);
		int givenAnswer = readInt("What is " + integerOne + " " + operator + " " + integerTwo + "? ");
		
		for (int tryAgain = 0; tryAgain < TRIES; tryAgain++) {
			if (actualAnswer == givenAnswer) {
				println(feedback);
				break;
			} else {
				if (tryAgain == 2) {
					println("The correct answer is " + actualAnswer);
				} else {
					givenAnswer = readInt("That's incorrect - try a different answer: ");
				}
			}
		}
	}

	/**
	 * This method returns a message which has to be displayed when user gives
	 * the correct answer.
	 * @param feedback Generated random integer
	 * @return Returns a message stored in the string
	 */
	private String displayMessage(int feedback) {
		String convertedFeedback = null;
		switch (feedback) {
		case 1:
			convertedFeedback = "Correct!";
			break;
		case 2:
			convertedFeedback = "You got it!";
			break;
		case 3:
			convertedFeedback = "Thats the answer!";
			break;
		case 4:
			convertedFeedback = "You are genius!";
			break;
		default:
			break;
		}

		return convertedFeedback;
	}

	/**
	 * Generates and returns random integer between 0 and 20.
	 * @return Returns an integer
	 */
	private int generateIntegers() {
		int integerOne = rgen.nextInt(0, 20);
		return integerOne;
	}

	/**
	 * Generates and returns random operator.
	 * @return Returns a string contains + or -
	 */
	private String generateOperator() {
		String operator = rgen.nextBoolean() ? "+" : "-";
		return operator;
	}

	/**
	 * Generates and returns random integer between 1 and 4.
	 * @return Returns an integer
	 */
	private int generateRandomMessage() {
		int randomMessage = rgen.nextInt(1, 4);
		return randomMessage;
	}
}
