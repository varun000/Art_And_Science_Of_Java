/*
 * File: DrawTrain.java
 * ----------------------------------------------------------
 * This program draws a train with an engine, a box car and a caboose.
 */

package chapter_5;

import acm.program.*;
import acm.graphics.*;
import java.awt.*;

public class DrawTrain extends GraphicsProgram {
	
	/* Dimensions of the frame of a train car */
	private static final double CAR_WIDTH = 75;
	private static final double CAR_HEIGHT = 36;
	
	/* Distance from bottom of a train car to the track below it. */
	private static final double CAR_BASELINE = 10;
	
	/* Width of the connector, which overlaps between successive cars. */
	private static final double CONNECTOR = 6;
	
	/* Radius of the wheels on each car */
	private static final double WHEEL_RADIUS = 8;
	
	/* Distance from the edge of the frame to the center of the wheel */
	private static final double WHEEL_INSET = 16;
	
	/* Dimensions of the cab on the engine */
	private static final double CAB_WIDTH = 35;
	private static final double CAB_HEIGHT = 8;
	
	/* Dimensions of the smokestack and its distance from the front */
	private static final double SMOKESTACK_WIDTH = 8;
	private static final double SMOKESTACK_HEIGHT = 8;
	private static final double SMOKESTACK_INSET = 8;
	
	/* Dimensions of the door panels on the boxcar */
	private static final double DOOR_WIDTH = 18;
	private static final double DOOR_HEIGHT = 32;
	
	/* Dimensions of the cupola on the caboose */
	private static final double CUPOLA_WIDTH = 35;
	private static final double CUPOLA_HEIGHT = 8;
	
	public void run() {
		
		double trainWidth = 3 * CAR_WIDTH + 4 * CONNECTOR;
		double x = (getWidth() - trainWidth) / 2;
		double y = getHeight();
		double dx = CAR_WIDTH + CONNECTOR;
		
		drawEngine(x, y);
		drawBoxcar(x + dx, y, Color.GREEN);
		drawCaboose(x + (2 * dx), y);
		
	}

	private void drawCarFrame(double x, double y, Color color) {
		double x0 = x + CONNECTOR;
		double y0 = y - CAR_BASELINE;
		double top = y0 - CAR_HEIGHT;
		
		add (new GLine(x, y0, x + CAR_WIDTH + 2 * CONNECTOR, y0));
		drawWheel(x0 + WHEEL_INSET, y - WHEEL_RADIUS);
		drawWheel(x0 + CAR_WIDTH - WHEEL_INSET, y - WHEEL_RADIUS);
		
		GRect r = new GRect(x0, top, CAR_WIDTH, CAR_HEIGHT);
		r.setFilled(true);
		r.setFillColor(color);
		add(r);
	}

	private void drawWheel(double x, double y) {
		double r = WHEEL_RADIUS;
		GOval wheel = new GOval(x - r, y - r, 2 * r, 2 * r);
		wheel.setFilled(true);
		wheel.setFillColor(Color.GRAY);
		add(wheel);
	}

	private void drawEngine(double x, double y) {
		drawCarFrame(x, y, Color.BLACK);
		drawSmokestack(x, y);
		drawCab(x, y);
		drawCowcatcher(x, y);
	}

	private void drawSmokestack(double x, double y) {
		double xPosSmokestack = x + CONNECTOR + SMOKESTACK_INSET;
		double yPosSmokestack = y - CAR_BASELINE - CAR_HEIGHT - SMOKESTACK_HEIGHT;
		
		GRect smokestack = new GRect(xPosSmokestack, yPosSmokestack, SMOKESTACK_WIDTH, SMOKESTACK_HEIGHT);
		smokestack.setFilled(true);
		smokestack.setFillColor(Color.BLACK);
		add(smokestack);
		
	}
	
	private void drawCab(double x, double y) {
		double xPosCab = x + CONNECTOR + CAR_WIDTH - CAB_WIDTH;
		double yPosCab = y - CAR_BASELINE - CAR_HEIGHT - CAB_HEIGHT;
		
		GRect cab = new GRect(xPosCab, yPosCab, CAB_WIDTH, CAB_HEIGHT);
		cab.setFilled(true);
		cab.setFillColor(Color.BLACK);
		add(cab);
	}

	private void drawCowcatcher(double x, double y) {
		double xPosCowcatcher = x + CONNECTOR / 2;
		double xPosToSecondEnd = x + CONNECTOR;
		double yPosToOneEnd = y - CAR_BASELINE;
		double yPosToSecondEnd = y - CAR_BASELINE - (CAR_HEIGHT / 2);
		
		add(new GLine(x, yPosToOneEnd, xPosToSecondEnd, yPosToSecondEnd));
		add(new GLine(xPosCowcatcher, yPosToOneEnd, xPosToSecondEnd, yPosToSecondEnd));
	}
	
	private void drawBoxcar(double x, double y, Color color) {
		drawCarFrame(x, y, color);
		double xRight = x + CONNECTOR + CAR_WIDTH / 2;
		double xLeft = xRight - DOOR_WIDTH;
		double yDoor = y - CAR_BASELINE - DOOR_HEIGHT;
		add(new GRect(xLeft, yDoor, DOOR_WIDTH, DOOR_HEIGHT));
		add(new GRect(xRight, yDoor, DOOR_WIDTH, DOOR_HEIGHT));
	}
	
	private void drawCaboose(double x, double y) {
		drawCarFrame(x, y, Color.RED);
		drawCupola(x, y);
	}

	private void drawCupola(double x, double y) {
		double xPosCupola = x + ((CAR_WIDTH - CUPOLA_WIDTH) / 2) + CONNECTOR;
		double yPosCupola = y - CAR_BASELINE - CAR_HEIGHT - CUPOLA_HEIGHT;
		
		GRect cupola = new GRect(xPosCupola, yPosCupola, CUPOLA_WIDTH, CUPOLA_HEIGHT);
		cupola.setFilled(true);
		cupola.setFillColor(Color.RED);
		add(cupola);
	}
	
}














