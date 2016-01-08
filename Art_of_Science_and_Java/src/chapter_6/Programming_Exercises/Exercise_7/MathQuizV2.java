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
			generateQuestions();
		}
	}

	/**
	 * This method creates two random integers and one random operator
	 * which has to be included in the question.
	 */
	private void generateQuestions() {
		while (true) {
			int integerOne = generateIntegerOne();
			int integerTwo = generateIntegerTwo();
			String operator = generateOperator();

			askQuestions(integerOne, integerTwo, operator);
			break;
		}
	}

	/**
	 * This method do the calculations depending on the random operator 
	 * and stores the answer in to a variable to be used for comparison 
	 * with the answer given by the student.
	 * @param integerOne A random integer generated between 0 and 20
	 * @param integer Two Second random integer generated between 0 and 20
	 * @param operator Random operator generated between + or -
	 */
	private void askQuestions(int integerOne, int integerTwo, String operator) {
		int addition = integerOne + integerTwo;
		int subtraction = integerOne - integerTwo;

		if (operator.equals("+"))  {
			isPlus(addition, subtraction, integerOne, integerTwo, operator);
		} else {
			isMinus(subtraction, addition, integerOne, integerTwo, operator);
		}		
	}

	/**
	 * This method decides that the question has to use the generated random numbers or not
	 * when the question includes addition.
	 * @param subtraction Subtraction of generated integers
	 * @param addition Addition of generated integers
	 * @param integer One Random integer generated
	 * @param integer Two Second random integer generated
	 * @param operator Random operator generated
	 */
	private void isPlus(int addition, int subtraction, int integerOne, int integerTwo, String operator) {
		if (addition < 20) {
			int question = readInt("What is " + integerOne + " " + operator + " " + integerTwo + "? ");
			checkCorrectAnswer(addition, subtraction, question, operator);
		} else {
			generateQuestions();
		}
	}

	/**
	 * This method decides that the question has to use the generated random numbers or not
	 * when the question includes subtraction.
	 * @param subtraction Subtraction of generated integers
	 * @param addition Addition of generated integers
	 * @param integer One Random integer generated
	 * @param integer Two Second random integer generated
	 * @param operator Random operator generated
	 */
	private void isMinus(int subtraction, int addition, int integerOne, int integerTwo, String operator) {
		if (subtraction > 0 && subtraction < 20) {
			int question = readInt("What is " + integerOne + " " + operator + " " + integerTwo + "? ");
			checkCorrectAnswer(addition, subtraction, question, operator);
		} else {
			generateQuestions();
		}
	}

	/**
	 * This method is the main logic which set some particular rules to the student
	 * and also displays the messages when user inputs an answer.
	 * @param subtraction Subtraction of generated integers
	 * @param addition Addition of generated integers
	 * @param question User answer is stored in this variable
	 * @param operator Random operator generated
	 */
	private void checkCorrectAnswer(int addition, int subtraction, int question, String operator) {
		int tryAgain = 0;
		int displayFeedback = generateRandomMessage();
		String feedback = displayMessage(displayFeedback);
		for (int i = 0; i < TRIES; i++) {
			if (operator.equals("+")) {
				if (question == addition) {
					println(feedback);
					break;
				} else {
					if (tryAgain == 2) {
						println("The correct answer is " + addition);
					} else {
						question = readInt("That's incorrect - try a different answer: ");
						tryAgain++;
					}
				}
			} else if (operator.equals("-")) {
				if (question == subtraction) {
					println(feedback);
					break;
				} else {
					if (tryAgain == 2) {
						println("The correct answer is " + subtraction);
					} else {
						question = readInt("That's incorrect - try a different answer: ");
						tryAgain++;
					}
				}
			}
		}
	}

	/**
	 * This method returns a message which has to be displayed when user gives the correct answer.
	 * @param feedback Generated random integer
	 * @return Returns a message stored in the string
	 */
	private String displayMessage(int feedback) {
		String convertedFeedback = null;
		switch(feedback) {
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
	private int generateIntegerOne() {
		int integerOne = rgen.nextInt(0, 20);
		return integerOne;
	}

	/**
	 * Generates and returns random integer between 0 and 20.
	 * @return Returns an integer
	 */
	private int generateIntegerTwo() {
		int integerTwo = rgen.nextInt(0, 20);
		return integerTwo;
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
