/*
 * File: Headline.java
 * ---------------------------------------------
 * This program shows headlines of New York's 
 * Time Square news of the day.
 */

package chapter_4;

import acm.program.*;
import java.awt.*;
import acm.graphics.*;

public class Headline extends GraphicsProgram {
	/*
	 * Private Constants.
	 */
	private static final double PAUSE_TIME = 5;

	public void run() {
		/*
		 * Create GLable and add it to the canvas.
		 */
		GLabel headline = new GLabel ("DEWEY DEFEATS TRUMAN", 0, 0);
		headline.setFont("Sans Serif-300");
		headline.setColor(Color.RED);
		add(headline);
		double x = getWidth();
		double y = (getHeight()/2) + (headline.getAscent()/2);
		headline.setLocation(x, y);
		
		/*
		 * Loop starts here.
		 * To move from right to left, it decreases 1 pixel every time on the x axis.
		 */
		int dx = -1;
		int dy = 0;
		while (true) {
			headline.move(dx, dy);
			pause(PAUSE_TIME);
		}
	}
}
