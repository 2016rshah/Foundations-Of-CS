	//Name______________________________ Date_____________
   import java.io.*;      //the File class
   import java.util.*;    //the Scanner class
    public class Driver05
   {
       public static void main(String[] args) throws Exception
      {
         Comparable[] array = input("data.txt");
         bubble(array);
         output(array, "output.txt");
      }
   	
       public static Comparable[] input(String filename) throws Exception
      {	
         Scanner infile = new Scanner( new File(filename) );
         int numitems = infile.nextInt();
         Comparable[] array = new Distance[numitems];
         for(int k = 0; k < numitems; k++)
         {
   			array[k] = new Distance(infile.nextInt(), infile.nextInt());      	
				/************************/
         	/*                      */
         	/* Your code goes here. */
         	/*                      */
         	/************************/
         }
         infile.close();
			//Weight[] array = new Weight[];
         return array;
      }
      
       public static void output(Object[]array, String filename) throws Exception
      {
         System.setOut(new PrintStream(new FileOutputStream(filename)));
         for(int k = 0; k < array.length; k++)
            System.out.println(array[k]);
      }
		public static void bubble(Comparable[] array)
	 	{
	 		for(int passes = 1; passes<array.length; passes++)
			{
				for(int b = 1; b<array.length; b++)
				{
					//if(compareTo(array[b])<compareTo(array[b-1]))
					if(array[b].compareTo(array[b-1])<0)
					{
						swap(array, b);
					}
				}
			}
		}
		public static void swap(Comparable[] array, int b)
		{
			Comparable temp = array[b-1];
			array[b-1] = array[b];
			array[b] = temp;
		}
			
	}
