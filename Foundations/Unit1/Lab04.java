import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot; 


public class Lab04
{
	public static void takeTheField(Athlete arg)
	{
	arg.move();
	arg.move();
	arg.move();
	arg.move();
	arg.turnRight();
	arg.move();
	arg.move();
	}
	public static void main (String[] args)
	{
	Display.openWorld("maps/arena.map");
	Display.setSize(10, 10);
	Display.setSpeed(10);
	
	Athlete a= new Athlete();
	Athlete b= new Athlete();
	Athlete c= new Athlete();
	Athlete d= new Athlete();
	Athlete e= new Athlete();
	Athlete f= new Athlete();
	Athlete coach= new Athlete(2, 7, Display.EAST, 5);
	
	takeTheField (a);
	takeTheField (b);
	takeTheField (c);
	takeTheField (d);
	takeTheField (e);
	takeTheField (f);
	d.move();
	d.move();
	d.turnRight();
	e.move();
	e.move();
	e.move();
	e.turnRight();
	f.move();
	f.move();
	f.move();
	f.move();
	f.turnRight();
	a.move();
	a.turnLeft();
	a.move();
	a.turnAround();
	b.move();
	b.move();
	b.move();
	b.turnLeft();
	b.move();
	b.move();
	b.turnAround();
	c.move();
	c.move();
	c.move();
	c.move();
	c.move();
	c.turnLeft();
	c.move();
	c.turnAround();

	}
	
}