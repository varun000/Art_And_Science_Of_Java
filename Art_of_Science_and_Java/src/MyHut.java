/*
 * File: MyHut.java
 * --------------------------------------------
 * This is my dream house :-p
 */

import acm.graphics.*;
import acm.program.*;

public class MyHut extends GraphicsProgram {
	public void run() {
		add (new GLine (350, 30, 150, 100));
		add (new GLine (350, 30, 550, 100));
		add (new GRect (150, 100, 400, 200));
		add (new GRect (180, 120, 80, 80));
		add (new GRect (440, 120, 80, 80));
		add (new GRect (310, 150, 80, 150));
		add (new GOval (375, 220, 10, 10));
	}
}
