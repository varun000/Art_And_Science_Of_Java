/*
 * File: OldNurseryRhyme.java
 * --------------------------------------------------------
 * 
 */
package chapter_3;

import acm.program.*;

public class OldNurseryRhyme extends ConsoleProgram {
	public void run() {
		/*
		 * As I was going to St.Ives,
		 * I met a man with seven wives,
		 * Each wife had seven sacks,
		 * Each sack had seven cats,
		 * Each cat had seven kits,
		 * Kits, cats, sacks and wives,
		 * How many were going to St.Ives.
		 */
		
		println ("This program calculates how many representatives of the assembled multitude were coming from St.Ives.");
		println ("The author met a person with seven wives.");
		int person = 1;
		int wives = 7;
		println ("Each wife had seven sacks.");
		int sacks = wives * 7;
		println ("So the total sacks are " + sacks);
		println ("Each sack had seven cats.");
		int cats = sacks * 7;
		println ("So the total cats are " + cats);
		println ("Each cat had seven kits.");
		int kits = cats * 7;
		println ("So the total kits are " + kits);
		println ("So the total number of multitude of kits, cats, sacks and wives including man are " + (kits + person));
	}
}
