import javax.swing.JFrame;

public class Driver11
{
	public static void main(String[] args)
	{
		JFrame frame = new JFrame("NIM");
		frame.setSize(500,500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setContentPane(new Panel11());
		frame.setVisible(true);
		}
	}