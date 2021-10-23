/*
 * File: Pyramid.java
 * Name: 
 * Section Leader: 
 * ------------------
 * This file is the starter file for the Pyramid problem.
 * It includes definitions of the constants that match the
 * sample run in the assignment, but you should make sure
 * that changing these values causes the generated display
 * to change accordingly.
 */

import acm.graphics.*;
import acm.program.*;
import java.awt.*;

public class Pyramid extends GraphicsProgram {

/** Width of each brick in pixels */
	private static final int BRICK_WIDTH = 30;

/** Width of each brick in pixels */
	private static final int BRICK_HEIGHT = 12;

/** Number of bricks in the base of the pyramid */
	private static final int BRICKS_IN_BASE = 14;
	
	public void run() {
		double Window_width = getWidth();
		int brick_count = BRICKS_IN_BASE;

		/* for changing variables horizontially */
		for(int t = 1;t<BRICKS_IN_BASE+1;t++){
		double starting_point = (Window_width - (BRICK_WIDTH*brick_count))/2;

		/* for printing each row of bricks */

			for(int i = 1;i<brick_count+1;i++){
				pause(20);//to animate
				AddBrick(starting_point+(i*BRICK_WIDTH),(getHeight()-BRICK_HEIGHT*t));
			}
			brick_count -= 1;
		}
		add(new GImage("uhmm.gif"));//meme and GIMage test
	}



	public void AddBrick(double x , double y){
		GRect brick = new GRect(x,y,BRICK_WIDTH,BRICK_HEIGHT);
		add(brick);


	}
}

