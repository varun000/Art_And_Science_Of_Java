/*
 * File: UseFilledRect.java
 * --------------------------------------------------------
 * This file uses the class FilledRect.java
 */

package chapter_6;

import acm.program.*;
import java.awt.*;

public class UseFilledRect extends GraphicsProgram {
	public void run() {
		double width = getWidth();
		double height = getHeight();
		double stripe = height / 3;
		
		add(new FilledRect(0, 0, width, stripe, Color.ORANGE));
		add(new FilledRect(0, stripe, width, stripe, Color.WHITE));
		add(new FilledRect(0, 2 * stripe, width, stripe, Color.GREEN));
	}
}
