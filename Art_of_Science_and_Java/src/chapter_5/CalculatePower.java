/*
 * File: CalculatePower.java
 * ---------------------------------------------------------
 * This program asks user to input two values n and k and 
 * returns n to the power of k.
 */
package chapter_5;

import acm.program.*;

public class CalculatePower extends ConsoleProgram {
	public void run() {
		println ("Please enter the values n and k.");
		int n = readInt("n: ");
		int k = readInt("k: ");
		println ("The answer is " + raiseIntToPower(n, k));
		
	}

	private int raiseIntToPower(int n, int k) {
		int answer = (int) Math.pow(n, k);
		return answer;
	}
}
