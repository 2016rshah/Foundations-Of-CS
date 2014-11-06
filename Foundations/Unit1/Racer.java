//Shah, email:rushi.shah@ymail.com
import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot; 



public class Racer extends Athlete
{
	public Racer (int y)
	{ 
		super(1, y, Display.EAST, Display.INFINITY);
	}
	public void jumpRight()
	{
		turnLeft();
		move();
		turnRight();
		move();
		turnRight();
		move();
		turnLeft();
	}
	public void jumpLeft()
	{
		turnRight();
		move();
		turnLeft();
		move();
		turnLeft();
		move();
		turnRight();
	}
	public void run()
	{
		move();
		jumpRight();
		shuttle(2,7);
	 	jumpLeft();
		move();
		put(7);
		turnAround();
		move();
		jumpRight();
		shuttle(2,7);
	 	jumpLeft();
		move();
		put(7);
		turnAround();
		move();
		jumpRight();
		shuttle(2,7);
	 	jumpLeft();
		move();
		put(7);
		turnAround();
		move();
		jumpRight();
		shuttle(4,5);
	 	jumpLeft();
		move();
		put(5);
		turnAround();
		move();
		jumpRight();
		shuttle(4,5);
	 	jumpLeft();
		move();
		put(5);
		turnAround();
		move();
		jumpRight();
		shuttle(4,5);
	 	jumpLeft();
		move();
		put(5);
		turnAround();
		move();
		jumpRight();
		shuttle(6,3);
	 	jumpLeft();
		move();
		put(3);
		turnAround();
		move();
		move();
		jumpRight();
		shuttle(6,3);
	 	jumpLeft();
		move();
		put(3);
		turnAround();
		move();
		move();
		jumpRight();
		shuttle(6,3);
	 	jumpLeft();
		move();
		put(3);
		turnAround();
		move();
	}

	public void sprint (int n)
	{
	for (int k=1; k<=n; k++)
		move();
	}
	public void put (int n)
	{
	for (int k=1; k<=n; k++)
		putBeeper();
	}
	public void pick (int n)
	{
	for (int k=1; k<=n; k++)
		pickBeeper();
	}		
	public void shuttle (int spaces, int beepers)
	{
	for (int k= 1; k<=spaces ; k++)
		move();
	for (int k= 1; k<=beepers; k++)
		pickBeeper(); 
		
	turnAround();
	
	for (int k= 1; k<=spaces ; k++)
		move();

	
	}
	
}