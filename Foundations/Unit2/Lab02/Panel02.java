import javax.swing.*;
import java.awt.*;
public class Panel02 extends JPanel
{
 public void paintComponent(Graphics g)
 	{
	 g.setColor(Color.RED.darker());
	 g.fillRect(0,0,500,575);
	 g.setColor(Color.WHITE);
	 g.drawString("Our fearless leader", 200,200);
	 g.setColor(Color.YELLOW);
	 
	 	 
	 
	 for (int x= 0; x<=190; x+= 25)
 	 	g.fillOval(x,25,50,50);
	 for (int y = 50; y<=200; y+=25)
	 	g.fillOval(150,y,50,50);
	 for (int x= 0; x<=190; x+= 25)
 	 	g.fillOval(x,225,50,50);	
	 for (int y = 50; y<=200; y+=25)
	 	g.fillOval(25,y,50,50);

	
	ImageIcon thomas = new ImageIcon("tj.jpg");	
	g.drawImage(thomas.getImage(), 50, 70, null);
	// g.drawImage(thomas.getImage(), 50, 50, 25, 75, null);	
		
	
	 }
}