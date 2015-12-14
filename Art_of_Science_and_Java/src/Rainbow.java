import acm.graphics.*;
import acm.program.*;
import java.awt.*;

public class Rainbow extends GraphicsProgram {
	public void run() {
		GRect background = new GRect (0,0,800,800);
		background.setColor(Color.CYAN);
		background.setFilled(true);
		add(background);
		
		GOval redOval = new GOval (-250,30,1250,1250);
		redOval.setColor(Color.RED);
		redOval.setFilled(true);
		add(redOval);
		
		GOval orangeOval = new GOval (-230,50,1210,1210);
		orangeOval.setColor(Color.ORANGE);
		orangeOval.setFilled(true);
		add(orangeOval);
		
		GOval yellowOval = new GOval (-210,70,1170,1170);
		yellowOval.setColor(Color.YELLOW);
		yellowOval.setFilled(true);
		add(yellowOval);
		
		GOval greenOval = new GOval (-190,90,1130,1130);
		greenOval.setColor(Color.GREEN);
		greenOval.setFilled(true);
		add(greenOval);
		
		GOval blueOval = new GOval (-170,110,1090,1090);
		blueOval.setColor(Color.BLUE);
		blueOval.setFilled(true);
		add(blueOval);
		
		GOval magentaOval = new GOval (-150,130,1050,1050);
		magentaOval.setColor(Color.MAGENTA);
		magentaOval.setFilled(true);
		add(magentaOval);
		
		GOval cyanfill = new GOval (-130,150,1010,1010);
		cyanfill.setColor(Color.CYAN);
		cyanfill.setFilled(true);
		add(cyanfill);
		
	}
}
