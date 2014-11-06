   //Name______________________________ Date_____________
   import java.io.*;      //the File class
   import java.util.*;    //the Scanner class
   
    public class Driver03
   {
      public static final int NUMITEMS = 20;
       public static void main(String[] args) throws Exception
      {
         Scanner infile = new Scanner( new File("data.txt") );
      	
      	//read the text file into the array
      	double[] fahr=new double[20];
			double[] cels=new double[20];
			
			for(int x =0; x<fahr.length; x++)
			{
				fahr[x]=infile.nextDouble();
			}
			
			System.out.print("Fahrenheit:"+"\t");
			System.out.println("Celsius: ");
      	
      	//process the array
			for(int x = 0; x<fahr.length; x++)
			{
				cels[x]= (5.0/9*(fahr[x]-32));
				//output
				System.out.print(fahr[x]+"\t"+"\t");
				System.out.println(cels[x]);
			} 
      	
      	
      	
			
      	
      	
      	}
   }
	/************************************
	Fahrenheit      | Celsius
	----------------|-------------------
	5.0             | -15.0
	10.0            | -12.222222222222221
	15.0            | -9.444444444444445
	20.0            | -6.666666666666667
	25.0            | -3.888888888888889
	26.0            | -3.3333333333333335
	28.0            | -2.2222222222222223
	31.0            | -0.5555555555555556
	37.0            | 2.7777777777777777
	45.0            | 7.222222222222222
	48.0            | 8.88888888888889
	51.0            | 10.555555555555555
	75.0            | 23.88888888888889
	98.6            | 37.0
	212.0           | 100.0
	451.0           | 232.77777777777777
	32.0            | 0.0
	0.0             | -17.77777777777778
	9.29            | -12.616666666666667
	19.77           | -6.794444444444445

	END OF EXECUTION, press any key:
	*************************************/