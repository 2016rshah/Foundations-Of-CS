import java.util.Scanner;
public class Driver01
{	
	
	public static void main(String[] args)
	{
		//public double sum, avg, min, max ;
		double[] array = new double[10];
		
		//fill the array
		Scanner keyboard = new Scanner(System.in);
		for(int x = 0; x<array.length; x++)
		{
			System.out.print("#: " + (x+1)+": ");
			array[x]= keyboard.nextDouble();	
		}
		
		
		//process the data
		double sum = 0;
		for(int x = 0; x<array.length; x++)
		{
			sum= sum + array[x];
		}
		double avg=sum/array.length;
		double min=array[0];
		for(int x = 0; x<array.length; x++)
		{
			if(min>array[x])
			{
				min=array[x];
			}
		}
		double max=array[0];
		for(int x = 0; x<array.length; x++)
		{
			if(max<array[x])
				max=array[x];
		}
			
		
		//print the results
		System.out.println("Sum: "+sum);
		System.out.println("Avg: "+avg);
		System.out.println("Min: "+min);
		System.out.println("Max: "+max);
		
		
		
		
	}
}