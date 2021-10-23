import acm.program.*;
import acm.graphics.*;
import java.awt.event.*;
import java.awt.*;


public class Target extends GraphicsProgram {

	public void init(){
		addMouseListeners();
		addKeyListeners();
	}
	public void mousePressed(MouseEvent e){
		last = new GPoint(e.getPoint());
		gobj = getElementAt(last);
	}
	public void mouseDragged(MouseEvent e){
				if(gobj != null){
			gobj.move(e.getX() -last.getX(),e.getY()-last.getY());
			last = new GPoint(e.getPoint());
		}
		
		
	}
	public void mouseReleased(MouseEvent e){
	}
	public void mouseClicked(MouseEvent e){
		if(gobj != null) gobj.sendToFront();
	}
	public void keyPressed(KeyEvent e){
		if(gobj != null){
			switch (e.getKeyCode()){
				case KeyEvent.VK_UP: gobj.move(0,-1);break;
				case KeyEvent.VK_DOWN: gobj.move(0,+1);break;
				case KeyEvent.VK_LEFT: gobj.move(-1,0);break;
				case KeyEvent.VK_RIGHT: gobj.move(+1,0);break;
			}
		}
	}
	private GObject gobj;
	private GPoint last;
	public void run(){
		GOval outer = new GOval(100,100,120,120);
		outer.setColor(Color.RED);
		outer.setFilled(true);
		GOval semi = new GOval(115,115,90,90);
		semi.setColor(Color.WHITE);
		semi.setFilled(true);
		GOval semi2 = new GOval(130,130,60,60);
		semi2.setColor(Color.RED);
		semi2.setFilled(true);
		GOval center = new GOval(145,145,30,30);
		center.setFilled(true);
		add(outer);
		add(semi);
		add(semi2);
		add(center);


	}
}
