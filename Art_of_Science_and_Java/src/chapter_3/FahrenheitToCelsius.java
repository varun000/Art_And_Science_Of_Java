/*
 * File: FahrenheitToCelsius.java
 * ----------------------------------------------------------
 * This program reads in a temperature  in degrees Fahrenheit 
 * and returns the corresponding temperatures in degrees Celsius.
 */
package chapter_3;

import acm.program.*;

public class FahrenheitToCelsius extends ConsoleProgram {
	public void run() {
		println ("This program converts Fahrenheit to Celsius.");
		double fahrenheit = readDouble ("Enter Fahrenheit temperature: ");
		double celsius = (5 * (fahrenheit - 32)) / 9;
		println ("Celsius equivalent = " + celsius);
	}
}
