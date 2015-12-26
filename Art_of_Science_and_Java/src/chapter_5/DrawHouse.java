/*
 * File: DrawHouse.java
 * -----------------------------------------------------
 * This program draws a house using stepwise refinement.
 */

package chapter_5;

import acm.program.*;
import acm.graphics.*;

public class DrawHouse extends GraphicsProgram {
	/*
	 *  Private Constants
	 *  House frame width and height.
	 *  House gap is the GAP between house and .
	 */
	public static final double HOUSE_WIDTH = 400;
	public static final double HOUSE_HEIGHT = 300;
	public static final double HOUSE_GAP = 10;

	public static final double WINDOW_BLOCK_WIDTH = 30;
	public static final double WINDOW_BLOCK_HEIGHT = 40;
	public static final double WINDOW_GAP = 70;

	public static final double DOOR_KNOB_RADIUS = 5;
	public static final double DOOR_KNOB_GAP = 10;
	
	public static final double DOOR_WIDTH = 60;
	public static final double DOOR_HEIGHT = 100;
	
	public void run() {
		
		double x = (getWidth() / 2) - (HOUSE_WIDTH / 2);
		double y = (getHeight() - HOUSE_HEIGHT - HOUSE_GAP);
		
		drawHouse(x, y);
		drawRoof(x, y);
		drawWindows(x, y);
		drawDoor(x, y);
	}
	
	/* Frame of the house */
	private void drawHouse (double x, double y) {
		
		add(new GRect(x, y, HOUSE_WIDTH, HOUSE_HEIGHT));
	}
	
	/* Roof of the house */
	private void drawRoof (double x, double y) {
		
		double rx = getWidth() / 2;
		double ry = getHeight() - HOUSE_HEIGHT - (2 * WINDOW_BLOCK_HEIGHT);
		double rx1 = x + HOUSE_WIDTH;
		
		add(new GLine (rx, ry, x, y));
		add(new GLine (rx, ry, rx1, y));
	}
	
	/* Door of the house */
	private void drawDoor(double x, double y) {
		
		double dx = x + (HOUSE_WIDTH / 2) - (DOOR_WIDTH / 2);
		double dy = y + HOUSE_HEIGHT - DOOR_HEIGHT;
		
		add(new GRect (dx, dy, DOOR_WIDTH, DOOR_HEIGHT));
		
		drawDoorKnob(dx, dy);
	}
	
	/* Door knob for the door */
	private void drawDoorKnob(double x, double y) {
		
		double kx = x + DOOR_WIDTH - DOOR_KNOB_GAP - (2 * DOOR_KNOB_RADIUS);
		double ky = y + (DOOR_HEIGHT / 2);
		
		add(new GOval (kx, ky, 2 * DOOR_KNOB_RADIUS, 2 * DOOR_KNOB_RADIUS));
	}
	
	/* Windows for the house Upper and Lower windows */
	private void drawWindows(double x, double y) {
		
		double ubx = x + (HOUSE_WIDTH / 6);
		double uby = y + (DOOR_HEIGHT / 4);
		double ubx1 = x + HOUSE_WIDTH - (HOUSE_WIDTH / 6) - (2 * WINDOW_BLOCK_WIDTH);
		
		double lbx = x + (HOUSE_WIDTH / 8);
		double lby = y + HOUSE_HEIGHT - DOOR_HEIGHT + (DOOR_HEIGHT / 10);
		double lbx1 = x + HOUSE_WIDTH - (HOUSE_WIDTH / 8) - (3 * WINDOW_BLOCK_WIDTH);
		
		drawUpperWindows(ubx, uby);
		drawUpperWindows(ubx1, uby);
		drawLowerWindows(lbx, lby);
		drawLowerWindows(lbx1, lby);
	}

	/* Upper windows */
	private void drawUpperWindows(double x, double y) {
		
		add(new GRect (x, y, WINDOW_BLOCK_WIDTH, WINDOW_BLOCK_HEIGHT));
		add(new GRect (x, y + WINDOW_BLOCK_HEIGHT, WINDOW_BLOCK_WIDTH, WINDOW_BLOCK_HEIGHT));
		add(new GRect (x + WINDOW_BLOCK_WIDTH, y, WINDOW_BLOCK_WIDTH, WINDOW_BLOCK_HEIGHT));
		add(new GRect (x + WINDOW_BLOCK_WIDTH, y + WINDOW_BLOCK_HEIGHT, WINDOW_BLOCK_WIDTH, WINDOW_BLOCK_HEIGHT));
	}
	
	/* Lower windows */
	private void drawLowerWindows(double x, double y) {
		
		drawUpperWindows(x, y);
		
		add(new GRect (x + (2 * WINDOW_BLOCK_WIDTH), y, WINDOW_BLOCK_WIDTH, WINDOW_BLOCK_HEIGHT));
		add(new GRect (x + (2 * WINDOW_BLOCK_WIDTH), y + WINDOW_BLOCK_HEIGHT, WINDOW_BLOCK_WIDTH, WINDOW_BLOCK_HEIGHT));
	}
}