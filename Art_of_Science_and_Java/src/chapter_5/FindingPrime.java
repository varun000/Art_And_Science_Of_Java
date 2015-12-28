/*
 * File: FindingPrime.java
 * -------------------------------------------------
 * This program tells you whether the given number 
 * is a prime or not.
 */

package chapter_5;

import acm.program.*;

public class FindingPrime extends ConsoleProgram {
	public void run() {
		println ("Please enter a positive integet greater than 1 ");
		println ("to find whether it is a prime or not.");
		int prime = readInt("? ");
		println (isPrime(prime));
	}

	private boolean isPrime(int n) {
		for(int i = 2; 2 * i < n; i++) {
			if(n % i == 0)
				return false;
		}
		return true;
	}
}
