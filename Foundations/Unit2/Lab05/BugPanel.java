    //Torbert, e-mail: smtorbert@fcps.edu	
	 //version 6.17.2003
	 //version 11.4.09  mlbillington@fcps.edu
   import javax.swing.*;
   import java.awt.*;
   import java.awt.event.*;
   import java.awt.image.*;
    public class BugPanel extends JPanel
   {
      private BufferedImage myImage;
      final int N = 400;
       public BugPanel()
      {
         myImage = new BufferedImage(N, N, BufferedImage.TYPE_INT_RGB);
         Graphics buffer = myImage.getGraphics();
         buffer.setColor(Color.BLUE);
         buffer.fillRect(0, 0, N, N);
         buffer.setColor(Color.YELLOW);
      
			Bug b = new Bug(0,0);
			Bug a = new Bug(400,0);
			Bug c = new Bug(400, 400);
			Bug d = new Bug(0, 400);
			
			for (int k = 0; k<= 50; k++)
			{
				
			b.walkTowards(a, .1);
			a.walkTowards(c, .1);
			c.walkTowards(d, .1);
			d.walkTowards(b, .1);
			buffer.drawLine(b.getX(), b.getY(), a.getX(), a.getY());
			buffer.drawLine(a.getX(), a.getY(), c.getX(), c.getY());
			buffer.drawLine(c.getX(), c.getY(), d.getX(), d.getY());
			buffer.drawLine(d.getX(), d.getY(), b.getX(), b.getY());
			
			}
         /************************/
      	/*                      */
      	/* Your code goes here. */
      	/*                      */
      	/************************/
      }
       public void paintComponent(Graphics g)
      {
         g.drawImage(myImage, 0, 0, getWidth(), getHeight(), null);
      }
   }