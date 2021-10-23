import acm.program.*;
import acm.graphics.*;
import java.awt.*;

public class HelloProgram extends GraphicsProgram{
	public void run(){
		GLabel msg = new GLabel("hello, world" , 100 ,75);
		msg.setFont("Pacifico-48");
		msg.setColor(Color.CYAN);
		GRect rect = new GRect(100,50,125,60);
		rect.setFilled(false);
		rect.setColor(Color.RED);
		add(rect);
		add(msg);
		

	}


}
