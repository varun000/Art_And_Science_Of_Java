/*
 * File: AddIntegers.java
 * ------------------------------------------------
 * A simple ConsoleProgram to add two integers
 * and display their total.
 */

import acm.program.*;

public class AddIntegers extends ConsoleProgram {
	public void run() {
		println ("This program adds two numbers.");
		int n1 = readInt ("Enter num1: ");
		int n2 = readInt ("Enter num2: ");
		int n3 = getWidth();
		int total = n1 + n2 + n3;
		println ("The total is " + total + " . " + n3 + ".");
	}
}
