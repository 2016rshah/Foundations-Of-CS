// Name: 				Date:

   import java.awt.*;
   
    public class Bumper
   {
    //private fields, all ints, for a Bumper
    //hint: the "location" of the bumper begins at its top left corner.      
	 
	 private int myX;
	 private int myXWidth;
    private int myY;
	 private int myWidth;
	 private Color myColor;
	 
   
     //constructors
       public Bumper()         //default constructor
      {
      myX= 10;
		myXWidth = 20;
		myY=100;
		myWidth=100;
		myColor=Color.BLUE;
		//random numbers -R

      }
       public Bumper(int x, int y, int xWidth, int yWidth, Color c)
      {
			myX=x;
			myY=y;
			myXWidth=xWidth;
			myWidth=yWidth;
			myColor=c;
					
      }
      
     // accessor methods  (one for each field)
	  public int getX()
	  {
	  	return myX;
	  }
	  public int getY()
	  {
	   return myY;
		}
	  public int getXWidth()
	  {
	  return myXWidth;
	  }
	  public int getYWidth()
	  {
	  return myWidth;
	  }
	  public Color getColor()
	  {
	  return myColor;
	  }
	  
   
     // modifier methods  (one for each field)
	  public void setY(int y)
	  {
	  	y=myY;
		getY();
	  }
   
     // instance methods
     // chooses a random (x,y) location.  Bumper stays entirely in the window.
        public void jump(int rightEdge, int bottomEdge)
      {
			myX = (int)(Math.random()* (rightEdge-myXWidth));
         myY = (int)(Math.random()* (bottomEdge-myWidth));
      
      }
      
       // draws a rectangular bumper on the buffer
       public void draw(Graphics myBuffer) 
      {
         myBuffer.setColor(getColor());
         myBuffer.fillRect(getX(), getY(), getXWidth(), getYWidth());
      }   
   	// returns true if any part of the polkadot is inside the bumper
       public boolean inBumper(Polkadot dot)
      {
         for(int x = getX(); x <= getX() + getXWidth(); x++)   //starts at upper left corner(x,y)
            for(int y = getY(); y <= getY() + getYWidth(); y++)
               if(distance(x, y, dot.getX(), dot.getY()) <= dot.getRadius() ) //checks every point on the bumper
                  return true;            
         return false;
      }  
      // returns distance between (x1, y1) and (x2, y2)
       private double distance(double x1, double y1, double x2, double y2)
      {
         return Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
      }	
   }
