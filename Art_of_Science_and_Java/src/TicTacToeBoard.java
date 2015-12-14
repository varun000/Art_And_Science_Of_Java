/*
 * File: TicTacToeBoard.java
 * ----------------------------------------
 * This program draws a Tic-Tac-Toe board.
 */


import acm.graphics.*;
import acm.program.*;

public class TicTacToeBoard extends GraphicsProgram {
	private static final int BOARD_SIZE = 500;

	public void run() {
		add (new GLine ((getWidth() / 2) - (BOARD_SIZE / 2) , (getHeight() / 2) - (BOARD_SIZE / 6) , 
				(getWidth() / 2) + (BOARD_SIZE / 2) , (getHeight() / 2) - (BOARD_SIZE / 6)));
		
		add (new GLine ((getWidth() / 2) - (BOARD_SIZE / 2) , (getHeight() / 2) + (BOARD_SIZE / 6) , 
				(getWidth() / 2) + (BOARD_SIZE / 2) , (getHeight() / 2) + (BOARD_SIZE / 6)));
		
		add (new GLine ((getWidth() / 2) - (BOARD_SIZE / 6) , (getHeight() / 2) - (BOARD_SIZE / 2) , 
				(getWidth() / 2) - (BOARD_SIZE / 6) , (getHeight() / 2) + (BOARD_SIZE / 2)));
		
		add (new GLine ((getWidth() / 2) + (BOARD_SIZE / 6) , (getHeight() / 2) - (BOARD_SIZE / 2) , 
				(getWidth() / 2) + (BOARD_SIZE / 6) , (getHeight() / 2) + (BOARD_SIZE / 2)));
	}
}
