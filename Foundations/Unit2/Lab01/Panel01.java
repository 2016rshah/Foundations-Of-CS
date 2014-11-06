import javax.swing.*;
import java.awt.*;
public class Panel01 extends JPanel
{
 public void paintComponent(Graphics g)
 	{
	 g.setColor(Color.LIGHT_GRAY);
	 g.fillRect(150,275,50,75);
	 g.setColor(Color.GREEN.darker());
	 g.drawLine(0,350,400,350);
	 g.setColor(Color.RED);
	 g.drawRect(100,200,150,150);
	 g.setColor(Color.BLACK);
	 g.fillRect(150,275,50,75);
	 
	 int xPoints[] = {75,175,275};
	 int yPoints[] = {200,150,200};
	 g.drawPolygon (xPoints, yPoints, 3);
	 
	 g.setColor(Color.BLUE.darker());
	 g.fillOval(300,75,50,50);
	 
	 g.setColor(Color.WHITE);
	 g.setFont(new Font("Andalus", Font.ITALIC, 20));
	 g.drawString("Welcome Home!", 40,40);
	 
	 for (int x= 0; x<=400; x+= 10)
	 	g.drawLine(x, 250, x,350);
	 for (int x= 0; x<=400; x+= 10)
	 	g.drawOval(x,75,50,50);
	 
	 }
}