	//Name______________________________ Date_____________
   import java.awt.*;
   import javax.swing.JPanel;
   import java.awt.image.BufferedImage;
   public class Panel03 extends JPanel
   {
      private BufferedImage myImage;
      public Panel03()
      {
         final int N = 400; //width & height of buffered-image
         myImage = new BufferedImage(N, N, BufferedImage.TYPE_INT_RGB);
         Graphics buffer = myImage.getGraphics();
      
      	//webbing
         buffer.setColor(Color.BLUE.darker());
         buffer.fillRect(0, 0, N, N);
         buffer.setColor(Color.YELLOW);
         for(int k = 0; k <= 50; k++)
         {
            buffer.drawLine(N * k / 50, 0, N, N * k / 50);
         	buffer.drawLine(0, N * k / 50, N * k / 50, N);
				buffer.drawLine(N*k/50, 0, 0, N-(N*k/50)); 
				buffer.drawLine(N-(N*k/50), N, N, N*k/50);
				 
            /************************/
         	/*                      */
         	/* Your code goes here. */
         	/*                      */
         	/************************/
         
         }
      
      	//sunshine
         int x = N / 2, y = N / 2; //center
         int x1, y1;							//endpoint for each ray
         int size = 100;					//length of each ray
         int r1 = 60, r2 = 55;			//radius of the sun
			
      	// x1= (int) (x + size * Math.cos(angle * Math.PI / 180));
//  			y1= (int) (y + size * Math.sin(angle  * Math.PI / 180));
			for (int angle=0; angle<=360; angle+=30)
			{
			x1= (int) (x + size * Math.cos(angle * Math.PI / 180));
 			y1= (int) (y + size * Math.sin(angle * Math.PI / 180));
			buffer.drawLine(x, y, x1, y1);
			}
         /************************/
      	/*                      */
      	/* Your code goes here. */
      	/*                      */
      	/************************/
      
         buffer.setColor(Color.BLUE.darker());
         buffer.fillOval(x - r1, y - r1, r1 * 2, r1 * 2);
         buffer.setColor(Color.YELLOW);
         buffer.fillOval(x - r2, y - r2, r2 * 2, r2 * 2);	
      }
      public void paintComponent(Graphics g)
      {
         g.drawImage(myImage, 0, 0, getWidth(), getHeight(), null);
      }
   }