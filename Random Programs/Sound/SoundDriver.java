
import javax.swing.JFrame;

public class SoundDriver
{
	public static void main(String[] args)
	{



		JFrame frame = new JFrame("Sound");
		frame.setSize(1000,1000);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setContentPane(new SoundPanel());
		frame.setVisible(true);
	}
}
		
	