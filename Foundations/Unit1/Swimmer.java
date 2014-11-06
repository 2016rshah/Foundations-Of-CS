	//Name______________________________ Date_____________
   import edu.fcps.karel2.Display;
   import edu.fcps.karel2.Robot;
   public class Swimmer extends Robot implements Runnable
   {
      public Swimmer(int x)
      {
         super(x, 1, Display.NORTH, 0);
      }
      public void run() //not swim
      {
		
		for (int x=1; x<=10; x++)
		{
			for (int y =1; y<=8; y++)
				move();
			turnLeft();
			turnLeft();
			for (int z=1; z<=8; z++)
				move();
			turnLeft();
		}
		
      }
   }