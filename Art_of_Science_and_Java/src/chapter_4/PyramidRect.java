
/*
 * File: PyramidRect.java
 * -----------------------------------------------------
 * This program generates a pyramid.
 */
package chapter_4;

import acm.program.*;
import acm.graphics.*;

public class PyramidRect extends GraphicsProgram {

	/** Width of each brick in pixels */
	private static final int BRICK_WIDTH = 30;

	/** Height of each brick in pixels */
	private static final int BRICK_HEIGHT = 12;

	/** Number of bricks in the base of the pyramid */
	private static final int BRICKS_IN_BASE = 14;

	public void run() {
		putAllBricks();
	}
	
	private void putAllBricks() {
		
		//Rows in a Pyramid.
		for (int row = 0; row < BRICKS_IN_BASE; row++) {
			int bricksInRow = BRICKS_IN_BASE - row;
			
			for (int brickNum = 0; brickNum < bricksInRow; brickNum++) {
				
				//Calculate the x position.
				int x = ( getWidth()/2 ) - (BRICK_WIDTH * bricksInRow) / 2 + brickNum * BRICK_WIDTH;
				
				//Calculate the y position.
				int y = getHeight() - BRICK_HEIGHT * (row+1);
				
				GRect brick = new GRect (x, y, BRICK_WIDTH, BRICK_HEIGHT);
				add(brick);
			}
		}
	}
}
