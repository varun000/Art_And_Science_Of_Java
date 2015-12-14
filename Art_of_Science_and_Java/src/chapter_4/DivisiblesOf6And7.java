/*
 * File: DivisiblesOf6And7.java
 * -----------------------------------------------------
 * This program displays the integers between 1 and 100 
 * that are divisible by 6 and 7 but not both.
 */
package chapter_4;

import acm.program.*;

public class DivisiblesOf6And7 extends ConsoleProgram {
	
	private static final int MAX_NUM = 100;

	public void run() {
		for (int i = 1; i < MAX_NUM; i++) {
			if ((i % 6 == 0 || i % 7 == 0) && !(i % 6 == 0 && i % 7 == 0)) {
				println (i);
			}
		}
	}
}

/*if (i % 6 == 0) {
if (i % 7 != 0) {
	println (i);
}
}
else if (i % 7 == 0) {
if (i % 6 != 0) {
	println (i);
}
}*/