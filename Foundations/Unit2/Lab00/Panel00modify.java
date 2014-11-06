import javax.swing.*;
import java.awt.*;
public class Panel00modify extends JPanel
{
 public void paintComponent(Graphics g)
 	{
	 g.setColor(Color.RED);
	 g.fillRect(155, 70, 400, 325);
	 g.setFont(new Font("Serif", Font.BOLD, 50));
	 g.setColor(new Color (150, 150, 150));
	 g.drawString("Helo World", 100, 150);
	 g.setColor(Color.MAGENTA);
	 g.setFont(new Font("Andalus", Font.ITALIC, 72));
	 g.drawString("Time to Win", 200, 300);	
	}
}