/*
 * File: YesOrNoQuestion.java
 * -----------------------------------------------
 * This program asks user a question and if the user 
 * enters yes or no it will take the answer or if the
 * user enters anything else it repeats the question.
 */

package chapter_5;

import acm.program.*;

public class YesOrNoQuestion extends ConsoleProgram {
	
	private static final long serialVersionUID = 1L;

	public void run() {
		String prompt;
		while (true) {
			prompt = readLine("Would you like instructions? ");
			if (prompt.equals("yes") || prompt.equals("no")) {
				println(yesOrNoQuestion(prompt));
			} else
				println("Please enter 'yes' or 'no'");
		}
	}

	public boolean yesOrNoQuestion(String prompt) {

		switch (prompt) {
		case "yes":
			return true;

		case "no":
			return false;

		default:
			return false;
		}
	}
}
