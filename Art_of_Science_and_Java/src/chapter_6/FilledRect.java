/*
 * File: FilledRect.java
 * --------------------------------------------------------
 * This file defines a graphical object that appears as 
 * a filled rectangle.
 */

package chapter_6;

import acm.graphics.*;
import java.awt.*;

/**
 * This class is a GObject subclass that is almost identical 
 * to GRect except that it starts out filled instead of 
 * outlined
 * 
 * @author Sai Varun Vukkem
 */
public class FilledRect extends GRect {

	/**
	 * Creates a new FilledRect with the specified bounds.
	 * @param x X position
	 * @param y Y position
	 * @param width Width of the rectangle
	 * @param height Height of the rectangle
	 */
	public FilledRect(double x, double y, double width, double height) {
		super(x, y, width, height);
		setFilled(true);
	}
	
	/**
	 * Creates a new FilledRect with the specified bounds and color.
	 * @param x X position
	 * @param y Y position
	 * @param width Width of the rectangle
	 * @param height Height of the rectangle
	 * @param color Color of the rectangle
	 */
	public FilledRect(double x, double y, double width, double height, Color color) {
		this(x, y, width, height);
		setColor(color);
	}
}
