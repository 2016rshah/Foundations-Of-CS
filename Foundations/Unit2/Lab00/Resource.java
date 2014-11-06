import javax.swing.*;
importjava.awt.*;
public class Panel00 extends JPanel
{
 public void paintComponent(Graphics g)
 	{
	 g.setColor(Color.BLUE);
	 g.fillRect(75, 50, 300, 125);
	 g.setFont(new Font("Andalus". Font.BOLD, 50));
	 g.setColor(new Clor (150, 150, 0));
	 g.drawString("Helo World", 100, 150);
	 }
}