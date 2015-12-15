/*
 * File: CheckerboardCoins.java
 * ---------------------------------------------------------
 * This class draws a checkerboard on the graphics window.
 * The size of the checkerboard is specified by the
 * constants NROWS and NCOLUMNS, and the checkboard fills
 * the vertical space available.
 */

package chapter_4;

import acm.graphics.*;
import acm.program.*;
import java.awt.*;;

public class CheckerboardCoins extends GraphicsProgram {

	/* Number of rows */
	private static final int NROWS = 8;

	/* Number of columns */
	private static final int NCOLUMNS = 8;



	/* Runs the program */
	public void run() {
		int sqSize = getHeight() / NROWS;
		int coinSize = sqSize / 2;
		for (int i = 0; i < NROWS; i++) {
			for (int j = 0; j < NCOLUMNS; j++) {
				int x = j * sqSize;
				int y = i * sqSize;
				GRect sq = new GRect(x, y, sqSize, sqSize);
				sq.setFilled(((i + j) % 2) != 0);
				sq.setFillColor(Color.LIGHT_GRAY);
				add(sq);
				
				/*int coinX = x + (coinSize - (coinSize / 2));
				int coinY = y + (coinSize - (coinSize / 2));
				GOval coins = new GOval (coinX, coinY, coinSize, coinSize);*/
				
				GOval coins = new GOval (x + 10, y + 10, sqSize - 20, sqSize - 20);
				if (((i + j) % 2) != 0) {
					if (i < 3) {
						coins.setFilled(((i + j) % 2) != 0);
						coins.setFillColor(Color.RED);
						add (coins);
					} else if (i > 4) {
						coins.setFilled(((i + j) % 2) != 0);
						coins.setFillColor(Color.BLACK);
						add (coins);
					}
				}
			}
		}
	}
}