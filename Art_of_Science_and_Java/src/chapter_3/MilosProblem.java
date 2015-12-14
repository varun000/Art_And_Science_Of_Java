/*
 * File: MilosProblem.java
 * --------------------------------------------------------------
 * This program checks what the answer would be if the 
 * Mathemagician's expression were evaluated using Java's precedence rules. 
 */
package chapter_3;

import acm.program.*;

public class MilosProblem extends ConsoleProgram {
	public void run() {
		println ("This program calculates the Mathemagician's problem given to Milo using Java precedence rules.");
		double mathemagiciansExpression = 4 + 9 - 2 * 16 + 1 / 3 * 6 - 67 + 8 * 2 - 3 + 26 - 1 / 34 + 3 / 7 + 2 - 5;
		println ("The answer is " + mathemagiciansExpression);
	}
}
