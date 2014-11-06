import javax.swing.JFrame;
public class Driver01
	{
	public static void main (String[] args)
		{
		JFrame frame = new JFrame ("Lab01");
		frame.setSize(400, 225);
		frame.setLocation(100, 100);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setContentPane(new Panel01());
		frame.setVisible(true);
		

		}
	}