/*
 * File: BouncingBall.java
 * -----------------------------------------------
 * This program creates a bouncing ball.
 */
package chapter_4;

import acm.program.*;
import acm.graphics.*;

public class BouncingBall extends GraphicsProgram {
	private static final double BALL_SIZE = 30;
	private static final int PAUSE_TIME = 20;

	public void run() {
		
		double x = (getWidth() / 2) - (BALL_SIZE / 2);
		double y = (getHeight() / 2) - (BALL_SIZE / 2);
		GOval ball = new GOval (x, y, BALL_SIZE, BALL_SIZE);
		ball.setFilled(true);
		add(ball);

		int dx = 1;
		int dy = 1;

		while (true) {
			ball.move(dx, dy);
			pause(PAUSE_TIME);

			if (ball.getY() > getHeight() - BALL_SIZE || ball.getY() == 0) {
				dy = -dy;
			}

			if (ball.getX() > getWidth() - BALL_SIZE || ball.getX() == 0) {
				dx = -dx;
			}
		}
	}
}
