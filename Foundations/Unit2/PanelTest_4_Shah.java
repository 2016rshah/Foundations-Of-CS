import javax.swing.*;
import java.awt.*;
public class PanelTest_4_Shah extends JPanel
{
 public void paintComponent(Graphics g)
 	{

	 
	 g.setColor(Color.WHITE);
	 g.fillRect(0,0,1000,1000);
 	 for (int x=0; x<=320; x+=80)
 	 	g.fillOval(x, 180, 80, 80);
 	 
 	 g.setColor(Color.BLUE.darker());
 	 g.fillRect(0, 180, 400, 80); 
 	 g.setColor(Color.WHITE);
 	 for (int x=0; x<=320; x+=80)
 	 	g.fillOval(x, 100, 100, 100);
		
	 g.setColor(Color.GREEN);
	 g.fillOval(160, 0, 20, 20);
	 g.fillRect(167, 20, 5, 150);
	 g.setColor(Color.CYAN);
	 g.fillRect(80, 150, 200, 30);
	 g.setColor(Color.MAGENTA);
	 int xPoints [] = {160, 160, 80};
	 int yPoints [] = {20, 150, 150};
	 g.fillPolygon(xPoints, yPoints, 3);
	 g.setColor(Color.MAGENTA.darker());
	 int xxPoints [] = {180, 180, 280};
	 int yyPoints [] = {20, 150, 150};
	 g.fillPolygon(xxPoints, yyPoints, 3);
	 
	 g.setColor(Color.WHITE);
	 int xpoints [] = {80, 100, 80}; 
	 int ypoints [] = {150, 180,180};
	 g.fillPolygon(xpoints, ypoints, 3);
	 

	 g.setColor(Color.RED);
	 g.drawOval(20,60,40,40);
	 g.drawOval(60, 60, 40, 40);
	 
	 g.setColor(Color.BLACK);
	 g.drawString("S.S Rushi", 100, 170);
	 g.setColor(Color.RED);
	 g.drawString("47", 280, 150);
	 
	 g.setColor(Color.WHITE);
	 g.fillRect(20,80,80,40);
 	 
	 
	 
		
	
	 }
}