import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;


public class DeckPanel extends JPanel
{
	private JLabel topLabel;
	private JButton dealButton;
	
	public DeckPanel()
	{
		setLayout(new BorderLayout());
		
		dealButton = new JButton("Deal");
		dealButton.addActionListener(new Deal());
		add(dealButton, BorderLayout.SOUTH);
	}
	private class Deal implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			
			
		}
		
	}
}
	