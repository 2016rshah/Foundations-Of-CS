import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Panel01 extends JPanel
{
private JLabel label1;
private JTextField box;
public Panel01()
{
	setLayout(new FlowLayout());
	
	box = new JTextField("0.0", 10);
	box.setHorizontalAlignment(SwingConstants.RIGHT);
	add(box);
	
	JButton button = new JButton("Sqrt");
	button.addActionListener(new Listener());
	add(button);
	
	label1 = new JLabel("0.0");
	label1.setFont(new Font("Serif", Font.BOLD, 20));
	label1.setForeground(Color.blue);
	add(label1);
	

}
private class Listener implements ActionListener
{
public void actionPerformed(ActionEvent e)
	{
	double d = Double.parseDouble(box.getText());
	double x = Math.sqrt(d);
	label1.setText(" "+ x);
	
	if(d<= 0)
	{
		x=Math.sqrt(d*-1);
		label1.setText(" " + x + "i");
	}
	
	
	}
}
}