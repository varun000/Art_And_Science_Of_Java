/*
 * File: OlympicRingsExtended.java
 * ------------------------------------------------------------
 * This file draws the Olympic circles with 3 pixels to make it
 * clearly visible under light backgrounds.
 */

import acm.graphics.*;
import acm.program.*;
import java.awt.*;

public class OlympicRingsExtended extends GraphicsProgram {
	public void run() {
		
		for (int i = 0; i < 3; i++) {
			
			GOval blueRing = new GOval (200 + i, 100 + i, 200 - 2 * i, 200 - 2 * i);
			blueRing.setColor(Color.BLUE);
			add(blueRing);

			GOval yellowRing = new GOval (325 + i, 220 + i, 200 - 2 * i, 200 - 2 * i);
			yellowRing.setColor(Color.YELLOW);
			add(yellowRing);
			
			GOval blackRing = new GOval (450 + i, 100 + i, 200 - 2 * i, 200 - 2 * i);
			blackRing.setColor(Color.BLACK);
			add(blackRing);

			GOval greenRing = new GOval (575 + i, 220 + i, 200 - 2 * i, 200 - 2 * i);
			greenRing.setColor(Color.GREEN);
			add(greenRing);
			
			GOval redRing = new GOval (700 + i, 100 + i, 200 - 2 * i, 200 - 2 * i);
			redRing.setColor(Color.RED);
			add(redRing);
			
		}		
	}
}
