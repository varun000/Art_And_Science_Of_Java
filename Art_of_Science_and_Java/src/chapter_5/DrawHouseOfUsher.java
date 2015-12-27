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
	private static final double HOUSE_FRAME_HEIGHT = 250;
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
	private static final double WINDOW_RADIUS = 15;
	
	/* Door height and width */
	private static final double DOOR_WIDTH = 40;
	private static final double DOOR_HEIGHT = 70;
	
	/* Decayed trees in the house */
	private static final int DECAYED_TREES = 3; 
	
	/* Main method starts here with x and y positions */
	public void run() {
		double x = (getWidth() / 2) - ((HOUSE_FRAME_WIDTH + (2 * BIG_TRUNK_WIDTH) 
				+ (DECAYED_TREES * (GAP + SMALL_TRUNK_WIDTH))) / 2);
		double y = (getHeight() - BIG_TRUNK_HEIGHT - HOUSE_GAP);
		
		drawHouse(x, y);
		drawTrunksOfDecayedTrees(x, y);
	}

	/* 
	 * Method to draw the house. Calls the methods to draw main frame and two trunk like 
	 * structures to either side 
	 */
	private void drawHouse(double x, double y) {
		drawTrunks(x, y);
		drawHouseFrame(x, y);
	}

	/* Method to draw trunk like structures and also calls the drawTrunkRoof method */
	private void drawTrunks(double x, double y) {
		double x2 = x + BIG_TRUNK_WIDTH + HOUSE_FRAME_WIDTH;
				
		add(new GRect (x, y, BIG_TRUNK_WIDTH, BIG_TRUNK_HEIGHT));
		add(new GRect (x2, y, BIG_TRUNK_WIDTH, BIG_TRUNK_HEIGHT));
		
		drawTrunkRoof(x, y);
		drawTrunkRoof(x2, y);
	}

	/* Method to draw the roof for two trunk structures which calls the common method to draw roof */
	private void drawTrunkRoof(double x, double y) {
		double xPos = x + (BIG_TRUNK_WIDTH / 2);
		double yPos = y - (BIG_TRUNK_HEIGHT / 4);
		double x2Pos = x + BIG_TRUNK_WIDTH;
		
		drawRoof(xPos, yPos, x, y, x2Pos);
	}
	
	/* 
	 * Method to draw the house frame. This method calls helper methods like drawRoof, 
	 * drawWindows and drawDoor. 
	 */
	private void drawHouseFrame(double x, double y) {
		double xPos = x + BIG_TRUNK_WIDTH;
		double yPos = y + BIG_TRUNK_HEIGHT - HOUSE_FRAME_HEIGHT;
		
		double xRoofPos = xPos + (HOUSE_FRAME_WIDTH / 2);
		double yRoofPos = yPos - (HOUSE_FRAME_HEIGHT / 2);
		double x2RoofPos = xPos + HOUSE_FRAME_WIDTH;
		
		add(new GRect (xPos, yPos, HOUSE_FRAME_WIDTH, HOUSE_FRAME_HEIGHT));
		
		drawRoof(xRoofPos, yRoofPos, xPos, yPos, x2RoofPos);
		drawWindows(xPos, yPos);
		drawDoor(xPos, yPos);
	}

	/* Method to draw circular windows */
	private void drawWindows(double x, double y) {
		double xPos = x + (HOUSE_FRAME_WIDTH / 5);
		double yPos = y + (HOUSE_FRAME_HEIGHT / 5);
		double x2Pos = x + HOUSE_FRAME_WIDTH - (HOUSE_FRAME_WIDTH / 5) - (2 * WINDOW_RADIUS);
		
		add(new GOval (xPos, yPos, 2 * WINDOW_RADIUS, 2 * WINDOW_RADIUS));
		add(new GOval (x2Pos, yPos, 2 * WINDOW_RADIUS, 2 * WINDOW_RADIUS));
	}

	/* Method to draw the door and calls a method to draw its roof */
	private void drawDoor(double x, double y) {
		double xPos = x + (HOUSE_FRAME_WIDTH / 2) - (DOOR_WIDTH / 2);
		double yPos = y + HOUSE_FRAME_HEIGHT - DOOR_HEIGHT;
		
		double xRoofPos = xPos + (DOOR_WIDTH / 2);
		double yRoofPos = yPos - (DOOR_HEIGHT / 3);
		double x2RoofPos = xPos + DOOR_WIDTH;
		
		add(new GRect (xPos, yPos, DOOR_WIDTH, DOOR_HEIGHT));
		drawRoof(xRoofPos, yRoofPos, xPos, yPos, x2RoofPos);
	}
	
	/*
	 * This method adds the trunks of decayed tree like structures to the canvas and also 
	 * calls draw roof method 
	 */
	private void drawTrunksOfDecayedTrees(double x, double y) {
		double xPos = x + (2 * BIG_TRUNK_WIDTH) + HOUSE_FRAME_WIDTH + GAP;
		double yPos = y + BIG_TRUNK_HEIGHT - SMALL_TRUNK_HEIGHT;
		double treeXPos = GAP + SMALL_TRUNK_WIDTH;
		
		double roofYpos = yPos - (SMALL_TRUNK_HEIGHT / 2);
		
		for (int i = 0; i < DECAYED_TREES; i++) {
			add(new GRect(xPos + (i * treeXPos), yPos, SMALL_TRUNK_WIDTH, SMALL_TRUNK_HEIGHT));
			
			drawRoof(xPos + (i * treeXPos) + (SMALL_TRUNK_WIDTH / 2), roofYpos, 
					xPos + (i * treeXPos), yPos, xPos + (i * treeXPos) + SMALL_TRUNK_WIDTH);
		}
	}
	
	/* Common method to draw the roof */
	private void drawRoof(double v, double w, double x, double y, double z) {
		add(new GLine (v, w, x, y));
		add(new GLine (v, w, z, y));
	}
}