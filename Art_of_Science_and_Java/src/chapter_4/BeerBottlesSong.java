/*
 * File: BeerBottlesSong.java
 * --------------------------------------------
 * This program generates lyrics for beer song.
 */
package chapter_4;

import acm.program.*;

public class BeerBottlesSong extends ConsoleProgram {
	private static final int INITIAL_BOTTLES = 99;

	public void run() {
		for (int i = INITIAL_BOTTLES; i >= 0; i--) {
			
			
			switch (i) {
				case 0:
					println ("No more bottles of beer on the wall, no more bottles of beer.");
					println ("Go to the store and buy some more, " + INITIAL_BOTTLES + " bottles of beer on the wall...");
					println ("--------------------------------------- X END X ---------------------------------------");
					break;
				
				case 1:
					println (i + " bottle of beer on the wall.");
					println (i + " bottle of beer.");
					println ("You take one down, pass it around.");
					int j = i - 1;
					println ();
					println (j + " bottles of beer on the wall....");
					println ("----------------------------------");
					break;
				
				default:
					println (i + " bottles of beer on the wall.");
					println (i + " bottles of beer.");
					println ("You take one down, pass it around.");
					j = i - 1;
					println ();
					println (j + " bottle" + (j == 1 ? "" : "s" ) +  " of Beer on the wall.");
					println ("----------------------------------");
					break;
			}
		}
	}
}
