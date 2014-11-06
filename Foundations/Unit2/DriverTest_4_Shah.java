import javax.swing.JFrame;
public class DriverTest_4_Shah
	{
	public static void main (String[] args)
		{
		JFrame frame = new JFrame ("DriverTest_4_Shah");
		frame.setSize(400, 225);
		frame.setLocation(100, 100);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setContentPane(new PanelTest_4_Shah());
		frame.setVisible(true);
		

		}
	}