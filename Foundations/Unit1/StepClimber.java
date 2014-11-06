//Shah, email:rushi.shah@ymail.com
import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot; 



public class StepClimber extends Climber
{
	public StepClimber (int x)
	{ 
		super(x);
	}
	public void climbDownLeft()
	{
	move();
	turnLeft();
	move();
	turnRight();
	}
	public void climbDownRight()
	{
	move();
	turnRight();
	move();
	turnLeft();
	}
	public void climbUpLeft()
	{
	turnRight();
	move();
	turnLeft();
	move();
	}
	public void climbUpRight()
	{
	turnLeft();
	move();
	turnLeft();
	move();
	}
}