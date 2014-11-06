import edu.fcps.karel2.Robot;
import edu.fcps.karel2.Display;
import javax.swing.JOptionPane;
public class Lab10
{       
		
		public static void escape (Athlete arg)
			{
			while (!arg.nextToABeeper())
				{
					{
					while (arg.rightIsClear() && !arg.nextToABeeper())
						{
						arg.turnRight();
						arg.move();
						}
					while (!arg.rightIsClear() && arg.frontIsClear()&& !arg.nextToABeeper())
						{
						arg.move();
						
						}
					while (!arg.frontIsClear() && arg.rightIsClear()&& !arg.nextToABeeper())
						{
						arg.turnRight();
						arg.move();
						
						}
					while (!arg.frontIsClear() && !arg.rightIsClear() && arg.leftIsClear()&& !arg.nextToABeeper())
						{
						arg.turnLeft();
						arg.move();
						
						}
					while (!arg.rightIsClear() && !arg.frontIsClear() && !arg.leftIsClear()&& !arg.nextToABeeper())
						{
						arg.turnAround();
						
						}
					}
				}
		
			}		
		

			

	public static void main(String[] args) 
      {
         String filename = JOptionPane.showInputDialog("What robot world?");
              
       	Display.openWorld("maps/"+filename+".map");
         Display.setSize(10, 10);
         Display.setSpeed(10);
			
			Athlete a= new Athlete(1, 1, Display.NORTH, Display.INFINITY);
				
			escape(a);	
			 
		}
}
	