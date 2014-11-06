import java.io.*;
import java.util.*;
public class Driver00
{
	public static void main(String[] args) throws Exception
	{
		Scanner infile = new Scanner(new File("data.txt"));
		int numitems = infile.nextInt();
		double[] array = new double[numitems];
		for(int k=0; k<numitems; k++)
			array[k] = infile.nextDouble();
		infile.close();
		int minPos, maxPos;
		minPos = findMin(array);
		maxPos = findMax(array);
		System.out.println("Min value: " + array[findMin(array)]);
		System.out.println("Max value: " + array[findMax(array)]);
	}
	private static int findMin(double[] apple)
	{
		double tMin = apple[0];
		int somethingMustHaveGoneWrong = 999;
		for(int x= 0; x<apple.length; x++)
		{
			if(apple[x]<tMin)
			{
				tMin = apple[x];
			}
		}
		for(int x = 0; x<apple.length; x++)
		{
			if(apple[x]==tMin)
			{
				return x;
				//break;
			}
			
		}
		return somethingMustHaveGoneWrong;
			
		
		
	}
	private static int findMax(double[] orange)
	{
		double tMax = orange[0];
		int somethingMustHaveGoneWrong = 999;
		for(int x = 0; x<orange.length; x++)
		{
			if(orange[x]>tMax)
			{
				tMax = orange[x];
			}
		}
		for(int x = 0; x<orange.length; x++)
		{
			if(orange[x] == tMax)
			{
				return x;
			}
		}
		return somethingMustHaveGoneWrong;
		
	}
}
	