   import javax.swing.JFrame;
	import java.io.*;      //the File class
	import java.util.*;    //the Scanner class
	import javax.swing.*;
	import java.awt.*;
	import java.awt.event.*;
	import java.text.DecimalFormat;

public class PanelSampleYard extends JPanel
{
	private JPanel panel, subPanel, subPanel2;
	private JLabel topLabel, firstNameLabel, lastNameLabel, sizeLabel, costLabel, totalLabel;
	private JTextField firstNameField, lastNameField, sizeField, costField, totalField;
	private JButton next, quit;
	public Yard array[];
	public int n;
	public double tot;
	private DecimalFormat d;
	public PanelSampleYard()
	{
		panel = new JPanel();
		panel.setLayout(new BorderLayout());
		add(panel);
		
		subPanel = new JPanel();
		subPanel.setLayout(new GridLayout(5, 2));
		panel.add(subPanel, BorderLayout.CENTER);
		
		subPanel2 = new JPanel();
		subPanel2.setLayout(new GridLayout(0, 2));
		panel.add(subPanel2, BorderLayout.SOUTH);
		
		n =0;
		tot = 0;
		
// 		topLabelRight = new JLabel("Green and Grow");
// 		add(topLabelRight);
		topLabel = new JLabel("Green and Grow, Mowing Company");
		panel.add(topLabel,BorderLayout.NORTH );
		
		firstNameLabel = new JLabel("First name: ");
		subPanel.add(firstNameLabel);
		
		firstNameField = new JTextField("", 10);
		//box.setHorizontalAlignment(SwingConstants.RIGHT);
		subPanel.add(firstNameField);
		
		lastNameLabel = new JLabel ("Last name: ");
		subPanel.add(lastNameLabel);
		
		lastNameField = new JTextField("", 10);
		subPanel.add(lastNameField);
		
		sizeLabel = new JLabel ("Size: ");
		subPanel.add(sizeLabel);
		
		sizeField = new JTextField("", 10);
		subPanel.add(sizeField);
		
		costLabel = new JLabel ("Cost: ");
		subPanel.add(costLabel);
		
		costField = new JTextField("",10);
		subPanel.add(costField);
		
		totalLabel = new JLabel ("Total: ");
		subPanel.add(totalLabel);
		
		totalField = new JTextField("",10);
		subPanel.add(totalField);
		
		next = new JButton("Next");
		next.addActionListener(new Next());
		subPanel2.add(next);		

		

		
		quit = new JButton("Quit");
		quit.addActionListener(new Quit());
		subPanel2.add(quit);
		
		String q = "y";
		String v = "y";
		
		if(q.equals("y"))
		{
			System.out.println(" yayayayay");
			
		}
		else
		{
			System.out.println("jalfdkjald");
		}
		try
		{
			String s = JOptionPane.showInputDialog("Name of File");
			
			Scanner infile = new Scanner(new File(s));
			array = new Yard[infile.nextInt()];
// 			array[0] = new CustomerSmallYard(infile.next(),infile.next(), infile.nextInt());
// 			array[1] = new CustomerSmallYard(infile.next(),infile.next(), infile.nextInt());
// 			array[2] = new CustomerMediumYard(infile.next(), infile.next(), infile.nextInt());
// 			array[3] = new CustomerMediumYard(infile.next(), infile.next(), infile.nextInt());
// 			array[4] = new CustomerLargeYard(infile.next(), infile.next(), infile.nextInt());
			for(int i =0; i<array.length; i++)
			{
				String temp= infile.next();
				String temp2 = infile.next();
				int temp3 = infile.nextInt();
				if(temp3<= 10000)
				{
					array[i] = new CustomerSmallYard(temp, temp2, temp3);
				}
				else if(temp3>10000 && temp3<= 20000)
				{
					array[i] = new CustomerMediumYard(temp, temp2, temp3);
				}
				else
				{
					array[i] = new CustomerLargeYard(temp, temp2, temp3);
				}
			}
		}
		catch(FileNotFoundException e )
		{
			System.out.print("Oh noes");
		}
		
		for(int passes = 1; passes<array.length; passes++)
		{
			for(int b = 1; b<array.length; b++)
			{
				if(array[b].compareTo(array[b-1])<0)
				{
					Yard temp = array[b-1];
					array[b-1] = array[b];
					array[b] = temp;
				}
			}
		}


	
	}
	private class Quit implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			System.exit(0);
		}
	}
	private class Next implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			if(n<array.length)
			{
// 			String firstname = item.getFirstName();
//          String lastname = item.getLastName();
         	int size = array[n].getSize();
         	double cost = array[n].getCost();
				
				tot = tot+array[n].getCost();
				d= new DecimalFormat("$0.00");
				firstNameField.setText(array[n].getFirstName());
				lastNameField.setText(array[n].getLastName());
// // 				sizeField.setText(""+array[n].getSize());
// // 				costField.setText(""+array[n].getCost());
// // 				totalField.setText(""+tot);
// 				firstNameField.setText(d.format(array[n].getFirstName()));
// 				lastNameField.setText(d.format(array[n].getLastName()));
				sizeField.setText(d.format(size));
				costField.setText(d.format(cost));
				totalField.setText(d.format(tot));
				n++;
			}
		}
	}
			
}