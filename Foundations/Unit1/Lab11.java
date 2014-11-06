import edu.fcps.karel2.Robot;
import edu.fcps.karel2.Display;
import javax.swing.JOptionPane;
import edu.fcps.karel2.Display;
import edu.fcps.Digit;

public class Lab11
{       
	public static void main (String[] args)
	{
		Display.setSize(42, 37);
		Display.setSpeed(10);
		
		Digit first = new One (1,9);
		Digit second = new Five(7,9);
		Digit third = new Eight(13,9);
		Digit fourth = new Eight(19,9);
		Digit fifth = new Four (25, 9);
		Digit sixth = new Two (31, 9);
		Digit seventh = new Six (37, 9);
		
		first.display();
		second.display();
		third.display();
		fourth.display();
		fifth.display();
		sixth.display();
		seventh.display();
		
	}
}
		
		
