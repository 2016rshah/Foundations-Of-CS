//Rushi Shah 9/11/12	
import edu.fcps.karel2.Robot;
import edu.fcps.karel2.Display;
 public class Athlete extends Robot
 {
 	public Athlete()
	{	
		super(1, 1, Display.NORTH, Display.INFINITY);
	}
	 public Athlete (int x, int y, int dir, int beep)
	{
		super (x, y, dir, beep);
	}
	public void turnAround()
	{
		turnLeft(); turnLeft();
	}
	public void turnRight()
	{
		turnLeft(); turnLeft(); turnLeft();
	}
}