   import javax.swing.*;
   import java.awt.*;
   import java.awt.event.*;
   import java.awt.image.*;
   
    public class PongPanel extends JPanel
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
      //private Polkadot prize;
      private Bumper bumper, a, b;
      private int ptR, ptL;
		private int hits;
      private Timer timer;    
      
       public PongPanel()
      {
         myImage =  new BufferedImage(FRAME, FRAME, BufferedImage.TYPE_INT_RGB);
         myBuffer = myImage.getGraphics();
			addKeyListener(new Key());
			setFocusable(true);
			
			

			
         
         // create ball and jump
         ball = new Ball(400, 200, 50, Color.BLACK);
			ball.move(400,400);
			
			
         
			
      
         // create prize and jump
      	//prize = new Polkadot(100, 300, 10, Color.BLACK);
            
         // create bumper and jump
      	a =new Bumper(10, 20, 20, 100, Color.BLUE);
      	b =new Bumper(370, 20, 20, 100, Color.BLUE);
         // ensure ball is outside the bumper
      
        
     //   	if (a.inBumper(prize) || b.inBumper(prize))
//  			{
//  			prize.jump(500,500);
//  			}
      
         ptR = 0;
			ptL= 0;
         timer = new Timer(5, new Listener());
         timer.start();

      }
      
       public void paintComponent(Graphics g)
      {
         g.drawImage(myImage, 0, 0, getWidth(), getHeight(), null);
			g.drawLine(200, 0, 200, 400);
      }
          
       
		 private class Key extends KeyAdapter
		{
			public void keyPressed(KeyEvent e)
			{
				if(e.getKeyCode() == KeyEvent.VK_UP)
					{
					
					b.setY(b.getY()-15);
					}
				if(e.getKeyCode() == KeyEvent.VK_DOWN)
					{
					b.setY(b.getY()+15);
					}
				if(e.getKeyCode() == KeyEvent.VK_S)
					{
					a.setY(a.getY()-15);
					}
				if(e.getKeyCode() == KeyEvent.VK_X)
					{
					a.setY(a.getY()+15);
					}
				
			}
			
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
            //collide(ball, prize);
            BumperCollision.collide(a, ball);
				BumperCollision.collide(b, ball);
         
            // draw ball, bumper & prize
            ball.draw(myBuffer);
            //prize.draw(myBuffer);
            a.draw(myBuffer);
            b.draw(myBuffer);
         	// ensure the prize did not jump inside the bumper
//             while(a.inBumper(prize) || b.inBumper(prize))
//                prize.jump(FRAME, FRAME);
//          
            // update hits on buffer
            myBuffer.setColor(Color.black);
            myBuffer.setFont(new Font("Monospaced", Font.BOLD, 24));
            
				if( ball.getX() <= 27)
				{
				 ptR++;
				 
				}
				if(ball.getX() >= 400-27)
				{
					ptL++;
					
				}
				
				myBuffer.drawString("Count: " + ptR, FRAME - 150, 25);
				myBuffer.drawString("Count: " + ptL, 10, 25);
				
				if(ptR>= 10 || ptL>=10)
				{
					System.exit(0);
				}
            
            repaint();
         }
      }
		 
      public void collide(Ball b, Bumper p)
		{ 
         // find distance between ball & prize centers
         double dist = distance(b.getX(), b.getY(), p.getX(), p.getY());
         
         if(dist < p.getXWidth() + b.getRadius())
         {
            //hits++;
            p.jump(FRAME,FRAME);    	// relocate prize
         }
		}
		

   		
       private double distance(double x1, double y1, double x2, double y2)
      {
         return Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
      }
		
   }