/*
 * File: OlympicRings.java
 * ----------------------------------------------
 * This GraphicsProgram draws Olympic Rings to the canvas.
 */

import acm.graphics.*;
import acm.program.*;
import java.awt.*;

public class OlympicRings extends GraphicsProgram {
	public void run() {
				
		GOval blueRing = new GOval (200, 100, 200, 200);
		blueRing.setColor(Color.BLUE);
		add(blueRing);
		
		GOval blackRing = new GOval (450, 100, 200, 200);
		blackRing.setColor(Color.BLACK);
		add(blackRing);
		
		GOval redRing = new GOval (700, 100, 200, 200);
		redRing.setColor(Color.RED);
		add(redRing);
		
		GOval yellowRing = new GOval (325, 220, 200, 200);
		yellowRing.setColor(Color.YELLOW);
		add(yellowRing);
		
		GOval greenRing = new GOval (575, 220, 200, 200);
		greenRing.setColor(Color.GREEN);
		add(greenRing);
		
	}
}
