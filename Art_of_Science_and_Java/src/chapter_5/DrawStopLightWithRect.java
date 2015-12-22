/*
 * File: DrawStopLight.java
 * ------------------------------------------------
 * This program draws a traditional stoplight with a red,
 * yellow and green light in a gray rectangular frame.
 */

package chapter_5;

import acm.program.*;
import java.awt.Color;
import acm.graphics.*;

public class DrawStopLightWithRect extends GraphicsProgram {
	/* Private constants */
	private static final int FRAME_WIDTH = 150;
	private static final int FRAME_HEIGHT = 300;
	private static final int LAMP_RADIUS = 30;

	public void run() {
		double cx = getWidth() / 2;
		double cy = getHeight() / 2;
		double fx = cx - FRAME_WIDTH / 2;
		double fy = cy - FRAME_HEIGHT / 2;
		double dy = FRAME_HEIGHT / 4 + LAMP_RADIUS / 4;
		
		
		
		add (createFilledRect (fx, fy, FRAME_WIDTH, FRAME_HEIGHT));
		add (createFilledCircle (cx, cy - dy, LAMP_RADIUS, Color.RED));
		add (createFilledCircle (cx, cy, LAMP_RADIUS, Color.YELLOW));
		add (createFilledCircle (cx, cy + dy, LAMP_RADIUS, Color.GREEN));
	}

	/*
	 * Creates a rectangular GRect object centered at (x, y) with dimensions of 
	 * constants FRAME_WIDTH and FRAME_HEIGHT.
	 * The GRect is set to be filled and colored in the specified color.
	 */
	private GRect createFilledRect(double x, double y, double width, double height) {
		GRect frame = new GRect (x, y, width, height);
		frame.setFilled(true);
		frame.setFillColor(Color.LIGHT_GRAY);
		return frame;
	}

	/*
	 * Creates a circular GOval object centered at (x, y) with radius r.
	 * The GOval is set to be filled and colored in the specified color.
	 */
	private GOval createFilledCircle(double x, double y, double r, Color color) {
		GOval circle = new GOval (x - r, y - r, 2 * r, 2 * r);
		circle.setColor(color);
		circle.setFilled(true);
		return circle;
	}
}
