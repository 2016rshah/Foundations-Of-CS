import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Panel02 extends JPanel
{
	private JLabel label1;
	private JTextField box;
	public Panel02()
	{
		setLayout(new FlowLayout());
		
		box = new JTextField("0.0", 10);
		box.setHorizontalAlignment(SwingConstants.RIGHT);
		add(box);
		
		JButton sqrt = new JButton("Sqrt");
		sqrt.addActionListener(new Sqrt());
		add(sqrt);
		
		JButton cubeRoot = new JButton("Cube Root");
		cubeRoot.addActionListener(new CubeRoot());
		add(cubeRoot);
		
		JButton reciprocal = new JButton("reciprocal");
		reciprocal.addActionListener(new Reciprocal());
		add(reciprocal);
		
		JButton random = new JButton("Random");
		random.addActionListener(new Random());
		add(random);
		
		JButton quit = new JButton("Quit");
		quit.addActionListener(new Quit());
		add(quit);
		
		
		label1 = new JLabel("0.0");
		label1.setFont(new Font("Serif", Font.BOLD, 20));
		label1.setForeground(Color.blue);
		add(label1);
		
	
	}
	private class Sqrt implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
			{
			double d = Double.parseDouble(box.getText());
			double x = Math.sqrt(d);
			label1.setText(" "+ x);
			box.setText(" "+x);
			
			if(d<= 0)
			{
				x=Math.sqrt(d*-1);
				label1.setText(" " + x + "i");
			}
			
			
			}
	
	}
	private class CubeRoot implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
			{
			double d = Double.parseDouble(box.getText());
			double c= Math.pow(d, 1.0/3.0);
			label1.setText(" " + c);
			box.setText(" " + c);
			
			
			}
	}
	private class Reciprocal implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
			{
			double d = Double.parseDouble(box.getText());
			double r  = (1)/d;
			label1.setText(" " + r);
			box.setText(" " + r);
			
			}
	}
	private class Random implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
			{
			double x = Math.random();
			label1.setText(" " + x);
			box.setText(" " + x);
			}
	}
	private class Quit implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
			{
			System.exit(0);
			}
	}
}