	//Name______________________________ Date_____________
   import edu.fcps.karel2.Display;
   import edu.fcps.karel2.Robot;
   public class Shifter extends Athlete implements Runnable, Workable
   {
      private int myBeepers;
      public Shifter(int y)
      {
         super(1, y, Display.EAST, 0);
      
      }
   	
		 public void put()
			{
				while (hasBeepers())
				{
				putBeeper();
				}
			}
		public void pick()
			{
				while (nextToABeeper())
				{
				pickBeeper();
				}
			}
		public void move(int spaces)
			{
			for (int k= 1; k<=spaces ; k++)
				move();
			}
		public void turnToTheRight()
			{
				turnRight();
			}
		public void moveOneBlock()
			{
				move();
			}
		public void workCorner()
			{
				if (nextToABeeper())
					{
					pickBeeper();
					}
			}
			
			
		public void moveRight(int times)
			{
				
				for (int k= 1; k<=times ; k++)
				{
				pick();
				move();
				put();
				turnAround();
				move(2);
				turnAround();
				}
			}
			
		public void turnToTheNorth()
			{
				while (!facingNorth())
					{
					turnRight();
					}
			}	
		
			
			public void run()
			{

 			move();
 			move();
 			move();
 			move();
 			move();
 			move();
 			move();
			turnAround();
 			move();
 			turnAround();
 			moveRight(6);
 			pick();
 			if (hasBeepers())
	 			{
	 			move();
	 			put();
	 			turnAround();
	 			move();
	 			turnAround();
				}
			}
   }