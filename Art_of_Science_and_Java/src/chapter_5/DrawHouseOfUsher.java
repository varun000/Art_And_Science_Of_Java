/*
 * File: DrawHouseOfUsher.java
 * ----------------------------------------------------
 * This program draws a house of Usher.
 */

package chapter_5;

import acm.program.*;
import acm.graphics.*;

public class DrawHouseOfUsher extends GraphicsProgram {
	/*
	 * Private constants.
	 * Height and width of frame of the house.
	 * Gap from the ground.
	 */
	private static final double HOUSE_FRAME_WIDTH = 200;
	private static final double HOUSE_FRAME_HEIGHT = 300;
	public static final double HOUSE_GAP = 10;
	
	/* Height and width of the trunks beside the house */
	private static final double BIG_TRUNK_WIDTH = 80;
	private static final double BIG_TRUNK_HEIGHT = 350;
	
	/* Height and width of the trunks located to the right side of the house */
	private static final double SMALL_TRUNK_WIDTH = 40;
	private static final double SMALL_TRUNK_HEIGHT = 250;
	
	/* Gap between house and trunks to the right of the house
	 * and in between the trunks.
	 */
	private static final double GAP = 80;
	
	/* Radius of the circular windows */
	private static final double WINDOW_RADIUS = 30;
	
	public void run() {
		double x = (getWidth() / 2) - ((HOUSE_FRAME_WIDTH + (2 * BIG_TRUNK_WIDTH) + (3 * (GAP + SMALL_TRUNK_WIDTH))) / 2);
		double y = (getHeight() - BIG_TRUNK_HEIGHT - HOUSE_GAP);
		
		
		drawHouse(x, y);
		//drawTrunksOfDecayedTrees(x, y);
	}

	private void drawHouse(double x, double y) {
		drawTrunks(x, y);
		drawHouseFrame(x, y);
	}

	private void drawTrunks(double x, double y) {
		double x2 = x + BIG_TRUNK_WIDTH + HOUSE_FRAME_WIDTH;
		
		add(new GRect (x, y, BIG_TRUNK_WIDTH, BIG_TRUNK_HEIGHT));
		add(new GRect (x2, y, BIG_TRUNK_WIDTH, BIG_TRUNK_HEIGHT));
		
		drawTrunkRoof(x, y);
		drawTrunkRoof(x2, y);
	}

	private void drawTrunkRoof(double x, double y) {
		double xPos = (x + BIG_TRUNK_WIDTH) / 2;
		double yPos = y - (BIG_TRUNK_HEIGHT / 4);
		double x2Pos = x + HOUSE_FRAME_WIDTH;
		
		add(new GLine (x, y, xPos, yPos));
		add(new GLine (xPos, yPos, x2Pos, y));
	}
	
	private void drawHouseFrame(double x, double y) {
		double xPos = x + BIG_TRUNK_WIDTH;
		double yPos = y + BIG_TRUNK_HEIGHT - HOUSE_FRAME_HEIGHT;
		
		add(new GRect (xPos, yPos, HOUSE_FRAME_WIDTH, HOUSE_FRAME_HEIGHT));
		/*drawHouseRoof(xPos, yPos);
		drawWindows(xPos, yPos);
		drawDoor(xPos, yPos);*/
	}

}











