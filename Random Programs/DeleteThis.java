
import javax.swing.JFrame;

public class DeleteThis
{
	public static void main(String[] args)
	{



		JFrame frame = new JFrame("Hello Button");
		frame.setSize(1000,1000);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setContentPane(new DeleteThisPanel());
		frame.setVisible(true);
	}
}
		
	