import javax.swing.JFrame;
public class DeckDriver
{
	public static void main(String[] args)
	{
		Deck d = new Deck();
		Card c;
		System.out.println(d.getNumCards());
		//System.out.println(d.getCard(15).toString());
		for(int i = 1; i<=51; i++)
		{
			c = d.draw();
			//c = d.getCard(i);
			System.out.println(c.toString());
			//System.out.println(i);
		}
		JFrame frame = new JFrame("Cards");
		frame.setSize(1000,1000);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setContentPane(new DeckPanel());
		frame.setVisible(true);
	}
}