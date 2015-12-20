/*
 * File: Fibonacci.java
 * -----------------------------------------------------
 * This program gets a input from the user and creates 
 * fibonacci sequence until that number.
 */
package chapter_5;

import acm.program.*;

public class Fibonacci extends ConsoleProgram {
	public void run() {
		println ("This program generates Fibonacci sequence below n number.");
		int n = readInt("Enter the value of n: ");
		fibonacci(n);
	}

	private void fibonacci(int n) {
		int a = 0;
		int b = 1;
		
		for (int i = 0; i <= n; i++) {
			
			println ("F" + i + " = " + a); 
			a += b;
			b = a - b; 
		}
	}
}
