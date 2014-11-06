
import edu.fcps.karel2.Robot;
import edu.fcps.karel2.Display;
import javax.swing.JOptionPane;
public class Lab09
	{       
		
		
		
		
		public static void put(Athlete arg)
			{
				while (arg.hasBeepers())
				{
				arg.putBeeper();
				}
			}
		public static void pick(Athlete arg)
			{
				while (arg.nextToABeeper())
				{
				arg.pickBeeper();
				}
			}
		public static void move(Athlete arg, int spaces)
			{
			for (int k= 1; k<=spaces ; k++)
				arg.move();
			}
		public static void moveRight(Athlete arg, int times)
			{
				{
				for (int k= 1; k<=times ; k++)
				{
				pick(arg);
				arg.move();
				put(arg);
				arg.turnAround();
				move(arg, 2);
				arg.turnAround();
				}
				}
			}
				
			
		
		public static void main(String[] args) 
      {
         String filename = JOptionPane.showInputDialog("What robot world?");
              
       	Display.openWorld("maps/"+filename+".map");
         Display.setSize(10, 10);
         Display.setSpeed(10);
			
			Athlete a= new Athlete(1, 1, Display.EAST, 0);
			
			a.move();
			a.move();
			a.move();
			a.move();
			a.move();
			a.move();
			a.move();
			a.turnAround();
			a.move();
			a.turnAround();
			moveRight(a, 6);
			pick(a);
			if (a.hasBeepers())
			{
			a.move();
			put(a);
			a.turnAround();
			a.move();
			a.turnAround();
			}
						
		}
	}
