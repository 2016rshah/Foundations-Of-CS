import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot; 


public class Lab05
{
	public static void main (String[] args)
	{
	Display.openWorld("maps/shuttle.map");
	Display.setSize(10, 10);
	Display.setSpeed(10);
	
	Racer a = new Racer(1);
	Racer b = new Racer(4);
	Racer c = new Racer(7);
	
	
	a.move();
	a.jumpRight();
	a.shuttle(2,7);
 	a.jumpLeft();
	a.move();
	a.put(7);
	a.turnAround();
	b.move();
	b.jumpRight();
	b.shuttle(2,7);
 	b.jumpLeft();
	b.move();
	b.put(7);
	b.turnAround();
	c.move();
	c.jumpRight();
	c.shuttle(2,7);
 	c.jumpLeft();
	c.move();
	c.put(7);
	c.turnAround();
	a.move();
	a.jumpRight();
	a.shuttle(4,5);
 	a.jumpLeft();
	a.move();
	a.put(5);
	a.turnAround();
	b.move();
	b.jumpRight();
	b.shuttle(4,5);
 	b.jumpLeft();
	b.move();
	b.put(5);
	b.turnAround();
	c.move();
	c.jumpRight();
	c.shuttle(4,5);
 	c.jumpLeft();
	c.move();
	c.put(5);
	c.turnAround();
	a.move();
	a.jumpRight();
	a.shuttle(6,3);
 	a.jumpLeft();
	a.move();
	a.put(3);
	a.turnAround();
	a.move();
	b.move();
	b.jumpRight();
	b.shuttle(6,3);
 	b.jumpLeft();
	b.move();
	b.put(3);
	b.turnAround();
	b.move();
	c.move();
	c.jumpRight();
	c.shuttle(6,3);
 	c.jumpLeft();
	c.move();
	c.put(3);
	c.turnAround();
	c.move();
	
	
	}
	
}