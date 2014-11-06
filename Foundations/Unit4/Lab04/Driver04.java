import java.io.*;
import java.util.*;
import javax.swing.JOptionPane; 


public class Driver04
{
	public static void main(String[] args)
	{
		Scanner infile = null;
		try
		{
			String filename = JOptionPane.showInputDialog("Enter filename");
			infile = new Scanner( new File(filename) );
		}
		catch(FileNotFoundException e)
		{
			JOptionPane.showMessageDialog(null, "Error: File not found.");
			System.exit(0);
		}
		int x=infile.nextInt();
		double[] array = new double[x];
		for(int i=0; i<array.length; i++)
		{
			array[i]=infile.nextDouble();
		}
		infile.close();
		
		//process the data
		double sum = 0;
		for(int i = 0; i<array.length; i++)
		{
			sum= sum + array[i];
		}
		double avg=sum/array.length;
		double min=array[0];
		for(int i = 0; i<array.length; i++)
		{
			if(min>array[i])
			{
				min=array[i];
			}
		}
		double max=array[0];
		for(int i = 0; i<array.length; i++)
		{
			if(max<array[i])
				max=array[i];
		}
			
		
		//print the results
		System.out.println("Sum: "+sum);
		System.out.println("Avg: "+avg);
		System.out.println("Min: "+min);
		System.out.println("Max: "+max);
	}
}