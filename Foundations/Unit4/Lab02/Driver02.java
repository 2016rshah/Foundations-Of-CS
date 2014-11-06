import java.util.Scanner;
public class Driver02
{
	public static void main(String[] args)
	{
		//instantiate arrays
		double[] fahr = new double[15];
		double[] cels = new double[15];
		
		//fill the array
		//first ten			
		Scanner keyboard = new Scanner(System.in);
		for(int x = 0; x<=9; x++)
		{
			System.out.print("#" + (x+1) + ": ");
			fahr[x]=keyboard.nextDouble();
		}
		//last 5
		for(int x = 11; x<=fahr.length; x++)
		{
			fahr[x-1]=((int)(Math.random()*999.99*10)/10.0);
			System.out.println("random #s: " +fahr[x-1]);
		}
		
		System.out.print("Fahrenheit:"+"\t");
		System.out.println("Celsius: ");
		
		//convert the fahr to cels
		for(int x = 0; x<fahr.length; x++)
		{
			cels[x]= (5.0/9*(fahr[x]-32));
			System.out.print(fahr[x]+"\t"+"\t");
			System.out.println(cels[x]);
		} 	
		
		
		
	}
}