   //Name:    Date:
   import javax.swing.*;
   import java.awt.*;
   import java.awt.event.*;
   import java.awt.image.*;

    public class PrizePanel extends JPanel
   {
      private static final int FRAME = 400;
      private static final Color BACKGROUND = new Color(204, 204, 204);
      private BufferedImage myImage;
      private Graphics myBuffer;
      private Ball ball;
      private Polkadot pd;
      private Timer t;
		private int  hits;
		

		//constructor   
       public PrizePanel()
      {
        myImage =  new BufferedImage(FRAME, FRAME, BufferedImage.TYPE_INT_RGB);
         myBuffer = myImage.getGraphics();
         myBuffer.setColor(BACKGROUND);
         myBuffer.fillRect(0, 0, FRAME,FRAME);
         int xPos = (int)(Math.random()*(FRAME-100) + 50);
         int yPos = (int)(Math.random()*(FRAME-100)+ 50);
         ball = new Ball(xPos, yPos, 50, Color.BLACK);
         pd = new Polkadot (100,300, 10, Color.RED);  
         t = new Timer(5, new Listener());
         t.start();
   
      }
       public void paintComponent(Graphics g)
      {
      g.drawImage(myImage, 0, 0, getWidth(), getHeight(), null);
      }
       private class Listener implements ActionListener
      {
          public void actionPerformed(ActionEvent e)
         {
           myBuffer.setColor(BACKGROUND);
			  myBuffer.fillRect(0,0,FRAME,FRAME);
			  
			  ball.move(FRAME,FRAME);
			  collide(ball, pd);
			  
			  ball.draw(myBuffer);
			  pd.draw(myBuffer);
			  
			  myBuffer.setColor(Color.BLACK);
			  myBuffer.setFont(new Font("Monospaced", Font.BOLD, 24));
			  myBuffer.drawString("Count: " + hits, FRAME - 150, 25);
			  repaint();
         }
      }   
       private void collide(Ball b, Polkadot pd)
      {
        double d = distance(ball.getX(), ball.getY(), pd.getX(), pd.getY());  
		  if (d<=ball.getRadius()+pd.getRadius())
		  	{
			hits++;
			pd.jump(FRAME, FRAME);
			}
						  
      }
      private double distance(double x1, double y1, double x2, double y2)
      {
         return Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2));
      }
   }
