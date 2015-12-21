/*
 * File: Target.java
 * ------------------------------------------------
 * This file creates a target board using methods.
 */

package chapter_5;

import acm.program.*;
import java.awt.Color;
import acm.graphics.*;

public class Target extends GraphicsProgram {
	/* Private Constants */
	private static final int N_CIRCLES = 10;
	private static final double OUTER_RADIUS = 210;
	private static final double INNER_RADIUS = 5;
	
	public void run() {
		double cx = getWidth() / 2;
		double cy = getHeight() / 2;
		double radius = (OUTER_RADIUS - INNER_RADIUS) / N_CIRCLES;
		
		for (int i = 0; i < N_CIRCLES; i++) {
			add (createFilledCircle (cx, cy, OUTER_RADIUS - (i * radius), i));
		}
		
	}
	
	private GOval createFilledCircle(double x, double y, double r, int i) {
		GOval circle = new GOval (x - r, y - r, 2 * r, 2 * r);
		if (i % 2 != 0) {
			circle.setColor(Color.RED);			
		} else {
			circle.setColor(Color.WHITE);	
		}
		circle.setFilled(true);
		return circle;
	}
}
