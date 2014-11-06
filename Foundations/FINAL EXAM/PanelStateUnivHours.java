   import javax.swing.JFrame;
	import java.io.*;      //the File class
	import java.util.*;    //the Scanner class
	import javax.swing.*;
	import java.awt.*;
	import java.awt.event.*;
	import java.text.DecimalFormat;

public class PanelStateUnivHours extends JPanel
{
	private JPanel panel, subPanel, subPanel2;
	private JLabel topLabel, firstNameLabel, lastNameLabel, creditLabel, roomLabel, gLabel, warningLabel, feesLabel, totalLabel;
	private JTextField firstNameField, lastNameField, creditField, roomField, gField, warningField, feesField, totalField;
	private JButton next, quit;
	public Hours array[];
	public int n;
	public double tot;
	private DecimalFormat d, h;
	
	public PanelStateUnivHours()
	{
		panel = new JPanel();
		panel.setLayout(new BorderLayout());
		add(panel);
		
		subPanel = new JPanel();
		subPanel.setLayout(new GridLayout(8, 2));
		panel.add(subPanel, BorderLayout.CENTER);
		
		subPanel2 = new JPanel();
		subPanel2.setLayout(new FlowLayout());
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
		subPanel.add(firstNameField);
		
		lastNameLabel = new JLabel ("Last name: ");
		subPanel.add(lastNameLabel);
		
		lastNameField = new JTextField("", 10);
		subPanel.add(lastNameField);
		
		creditLabel = new JLabel ("Size: ");
		subPanel.add(creditLabel);
		
		creditField = new JTextField("", 10);
		subPanel.add(creditField);
		
		roomLabel = new JLabel ("Room Type: ");
		subPanel.add(roomLabel);
		
		roomField = new JTextField("", 10);
		subPanel.add(roomField);
		
		gLabel = new JLabel("Graduating: ");
		subPanel.add(gLabel);
		
		gField = new JTextField("", 10);
		subPanel.add(gField);
		
		warningLabel = new JLabel("Warning: ");
		subPanel.add(warningLabel);
		
		warningField = new JTextField("", 10);
		subPanel.add(warningField);
		
		feesLabel = new JLabel ("Fees: ");
		subPanel.add(feesLabel);
		
		feesField = new JTextField("",10);
		subPanel.add(feesField);
		
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
		
		try
		{
			String s = JOptionPane.showInputDialog("Name of File");
			Scanner infile = new Scanner(new File(s));
			array = new Hours[infile.nextInt()];
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
				String temp4 = infile.next();
				String temp5 = infile.next();
				if(temp3<12)
				{
					array[i] = new StudentHoursLessThan12(temp, temp2, temp3, temp4, temp5);
				}
				else if(temp3>=12 && temp3<= 21)
				{
					array[i] = new StudentHours12to21(temp, temp2, temp3, temp4, temp5);
				}
				else
				{
					array[i] = new StudentHoursGreaterThan21(temp, temp2, temp3, temp4, temp5);
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
					Hours temp = array[b-1];
					array[b-1] = array[b];
					array[b] = temp;
				}
			}
		}
		for(int i = 0; i<array.length; i++)
		{
			System.out.println(array[i].toString());
		}
		
		System.out.println(array[0].getGraduating());
// 		System.out.println((array[array.length-1].getCreditHours())*90);
// 		System.out.println((array[array.length-1].getFees()));


	
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

//          	int c = array[n].getCreditHours();
//          	double fees = array[n].getFees();
// 				tot = tot+array[n].getFees();
// 				d= new DecimalFormat("$0.00");
// 				h = new DecimalFormat("0 hrs");
// 				firstNameField.setText(array[n].getFirstName());
// 				lastNameField.setText(array[n].getLastName());
// 				creditField.setText(h.format(c));
// 				roomField.setText(array[n].getRoomType());
// 				gField.setText(array[n].getGraduating());
// 				warningField.setText(array[n].getWarning());
// 				feesField.setText(d.format(fees));
// 				totalField.setText(d.format(tot));

				int c = array[n].getCreditHours();
				double fees = array[n].getFees();
				tot = tot+array[n].getFees();
				firstNameField.setText(array[n].getFirstName());
				lastNameField.setText(array[n].getLastName());
				creditField.setText("" + c);
				roomField.setText(array[n].getRoomType());
				gField.setText(array[n].getGraduating());
				warningField.setText(array[n].getWarning());
				feesField.setText(""+fees);
				totalField.setText(""+tot);
				
				
				n++;
			}
			if(n>array.length)
			{
				System.exit(0);
			}
		}
	}
			
}