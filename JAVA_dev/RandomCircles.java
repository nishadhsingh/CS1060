/*
 * File:RandomCircles.java
 * -----------------------
 * This program generates circles at random positions
 * with random radius and color
 */

import java.awt.Color;
import acm.program.*;
import acm.graphics.*;
import acm.util.*;


public class RandomCircles extends GraphicsProgram{
	
	public void run(){
		for(int i=0;i<10;i++){
			add(addCircle());
		}
		
		}		
	public GOval addCircle(){
		/* local variables */
		int xord = rgen.nextInt(00,getWidth());
		int yord = rgen.nextInt(00,getHeight());
		double radius = rgen.nextDouble(0.00,size);
		GOval circle = new GOval(xord,yord,radius,radius);
		int red = rgen.nextInt(0,255);
		int blue = rgen.nextInt(0,255);
		int green = rgen.nextInt(0,255);
		Color cl = new Color(red,blue,green);


		
		circle.setFilled(true);
		circle.setColor(cl);
		return circle;
	}
	

	/*private instance variables*/
	private RandomGenerator rgen = RandomGenerator.getInstance();
	private double size = 200.00;

}

