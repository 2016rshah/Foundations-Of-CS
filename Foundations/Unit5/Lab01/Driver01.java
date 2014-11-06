	//Name______________________________ Date_____________
  

   import java.io.*;
    public class Driver01
   {
       public static void main(String[] args)
      {
      	//input
         double[] myArray = {17.0, 3.7, 9.9, 8.1, 8.5, 7.4, 1.0, 6.2};
      				      


			for(int entire =0; entire<myArray.length; entire++)
			{
					int maxIndex= 0;
					double tempMax = 0;
         		double temp;
					for(int x = entire; x<myArray.length; x++)
					{
						if(myArray[x]>tempMax)
						{
							tempMax = myArray[x];
						}
					}
					for(int x = entire; x<myArray.length; x++)
					{
						if(myArray[x] == tempMax)
						{
							maxIndex = x;
						}
					}
					
				
				temp = myArray[maxIndex];
				myArray[maxIndex] = myArray[entire];
				myArray[entire] = temp;
			}
      	/*********************************
      	*   write your code here
      	*
      	*********************************/
      			  
      	//output
			for(int x = 0; x<myArray.length; x++)
			{
				System.out.println(myArray[x]);
			}
		}
      
   }