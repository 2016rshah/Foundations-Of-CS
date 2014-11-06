//Rushi Shah 9/11/12	
import edu.fcps.karel2.Robot;
import edu.fcps.karel2.Display;
 public class Climber extends Athlete
 {
 	public Climber()
	{	
		super();
	}
	 public Climber (int x)
	{
		super (x, 1, Display.NORTH, 1);
	}
	public void climbUpRight()
	{
		//pseudocode: tL, m, m, tR, m
		turnLeft(); move(); move(); turnRight(); move(); 
	}
	public void climbUpLeft()
	{
		turnRight(); move(); move(); turnLeft(); move(); 
	}
	public void climbDownLeft()
	{
		move(); turnLeft(); move(); move(); turnRight();
	}
	public void climbDownRight()
	{
		move(); turnRight(); move(); move(); turnLeft();
	}
}