import javax.swing.JFrame;
public class Driver02
	{
	public static void main (String[] args)
		{
		JFrame frame = new JFrame ("Lab02");
		frame.setSize(400, 225);
		frame.setLocation(100, 100);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setContentPane(new Panel02());
		frame.setVisible(true);
		

		}
	}