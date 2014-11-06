import java.util.*;
import java.io.*;
import javax.swing.JOptionPane;

public class DriverNumberGame
{
	public static void main(String[] args)
	{
		int ui;
		do
		{
			ui=Integer.parseInt(JOptionPane.showInputDialog("Enter a number"));
			int count=0;
			//String abc=JOptionPane.showInputDialog("Enter a number");
			System.out.println(ui);
			//System.out.println(abc);
			
			int[] numbers=new int[26];
			//String[] abcs=new String[26];
			for(int i=0; i<numbers.length; i++)
			{
				numbers[i]=(int)(Math.random()*26+1);
				//System.out.println(numbers[i]);
			}
			for(int i=0; i<numbers.length; i++)
			{
				if(ui==numbers[i])
				{
					count++;
				}
			}
			System.out.println("The number of correct guesses was: "+count);
			
		}while (ui != 999);
	}
}