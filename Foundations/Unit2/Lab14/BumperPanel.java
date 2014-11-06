	// Phil Ero 15JUL08
	
   import javax.swing.*;
   import java.awt.*;
   import java.awt.event.*;
   import java.awt.image.*;
   
    public class BumperPanel extends JPanel
   {
      private static final int FRAME = 400;
      private static final Color BACKGROUND = new Color(204, 204, 204);
      private static final Color BALL_COLOR = Color.BLACK;
      private static final Color PRIZE_COLOR = Color.RED;
      private static final Color BUMPER_COLOR = Color.BLUE;
      private static final double BALL_DIAM = 50;
      private static final double PRIZE_DIAM = 25;
      private static final int BUMPER_X_WIDTH = 75;
      private static final int BUMPER_Y_WIDTH = 125;
   
      private BufferedImage myImage;
      private Graphics myBuffer;
      private Ball ball;
      private Polkadot prize;
      private Bumper bumper;
      private int hits;
      private Timer timer;    
      
       public BumperPanel()
      {
         myImage =  new BufferedImage(FRAME, FRAME, BufferedImage.TYPE_INT_RGB);
         myBuffer = myImage.getGraphics();
         
         // create ball and jump
         ball = new Ball(400, 200, 50, Color.BLACK);
			ball.move(400,400);
         
			
      
         // create prize and jump
      	prize = new Polkadot(100, 300, 10, Color.RED);
            
         // create bumper and jump
      	bumper=new Bumper();
      	
         // ensure ball is outside the bumper
      
        
      	if (bumper.inBumper(prize))
			{
			prize.jump(500,500);
			}
      
         hits = 0;
         timer = new Timer(5, new Listener());
         timer.start();
      }
      
       public void paintComponent(Graphics g)
      {
         g.drawImage(myImage, 0, 0, getWidth(), getHeight(), null);
      }
          
       private class Listener implements ActionListener
      {
          public void actionPerformed(ActionEvent e)
         {
            // clear buffer and move ball
            myBuffer.setColor(BACKGROUND);
            myBuffer.fillRect(0,0,FRAME,FRAME); 
            ball.move(FRAME, FRAME);
            
            // check for collisions
            collide(ball, prize);
            BumperCollision.collide(bumper, ball);
         
            // draw ball, bumper & prize
            ball.draw(myBuffer);
            prize.draw(myBuffer);
            bumper.draw(myBuffer);
            
         	// ensure the prize did not jump inside the bumper
            while(bumper.inBumper(prize))
               prize.jump(FRAME, FRAME);
         
            // update hits on buffer
            myBuffer.setColor(Color.black);
            myBuffer.setFont(new Font("Monospaced", Font.BOLD, 24));
            myBuffer.drawString("Count: " + hits, FRAME - 150, 25);
            
            repaint();
         }
      } 
      
   	// checks to see if the ball & prize collide
   	// if so, increments hits & relocates prize	
       public void collide(Ball b, Polkadot p)
      {
         // find distance between ball & prize centers
         double dist = distance(b.getX(), b.getY(), p.getX(), p.getY());
         
         if(dist < p.getRadius() + b.getRadius())
         {
            hits++;
            p.jump(FRAME,FRAME);    	// relocate prize
         }
      }
   		
       private double distance(double x1, double y1, double x2, double y2)
      {
         return Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
      }
   }