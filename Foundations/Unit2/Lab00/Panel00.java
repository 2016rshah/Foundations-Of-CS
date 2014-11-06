import javax.swing.*;
import java.awt.*;
public class Panel00 extends JPanel
{
 public void paintComponent(Graphics g)
 	{
	 g.setColor(Color.GRAY.darker());
	 g.fillRect(0, 0, 1000, 1000);
	 g.setFont(new Font("Serif", Font.BOLD, 72));
	 g.setColor(new Color (15, 20, 25));
	 g.drawString("Elementary my dear Watson", 100, 150);
	 g.setColor(Color.ORANGE);
	 g.setFont(new Font("Andalus", Font.ITALIC, 54));
	 g.drawString("And that made all the difference", 150, 250);
	 g.setColor(new Color (0, 200, 200));
	 g.setFont(new Font("Comic Sans", Font.PLAIN, 34));
	 g.drawString("Don't judge a book by it's movie", 360, 600);
	 g.setFont(new Font("Courrier Sans", Font.ITALIC, 20));
	 g.setColor(Color.BLUE.darker());
	 g.drawString("Am I a part of the cure, or am I a part of the disease?", 252, 358);
	 
	 
	 }
}