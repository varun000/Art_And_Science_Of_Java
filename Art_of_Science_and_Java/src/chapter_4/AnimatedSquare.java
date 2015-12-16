package chapter_4;
/*
 * File: AnimatedSquare.java
 * ------------------------------------------------
 * This program animates a square so that it moves 
 * from the upper left
 */


import acm.program.*;
import acm.graphics.*;
import java.awt.*;

public class AnimatedSquare extends GraphicsProgram {
	/* Private constants */
	private static final double SQUARE_SIZE = 50;
	private static final int N_STEPS = 1000;
	private static final double PAUSE_TIME = 20;

	public void run() {
		GRect square = new GRect (0, 0, SQUARE_SIZE, SQUARE_SIZE);
		square.setFilled(true);
		add(square);
		
		double dx = (getWidth() - SQUARE_SIZE) / N_STEPS;
		double dy = (getHeight() - SQUARE_SIZE) / N_STEPS;
		for (int i = 0; i < N_STEPS; i++) {
			square.move(dx, dy);
			pause(PAUSE_TIME);
		}
	}
}
