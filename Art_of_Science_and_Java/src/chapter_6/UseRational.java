/*
 * File: UseRational.java
 * ---------------------------------------------------
 * This file uses the Rational.java class
 */

package chapter_6;

import acm.program.*;

public class UseRational extends ConsoleProgram {
	public void run() {
		Rational a = new Rational(3, 5);
		Rational b = new Rational(4, 2);
		Rational c = new Rational(1, 6);
		Rational sum = a.add(b).add(c);
		println(a + " + " + b + " + " + c + " = " + sum);
	}
}
