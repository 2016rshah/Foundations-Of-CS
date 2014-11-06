	//Name______________________________ Date_____________
   import java.io.*;      //the File class
   import java.util.*;    //the Scanner class
    public class Driver04
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
         Comparable[] array = new Weight[numitems];
         for(int k = 0; k < numitems; k++)
         {
   			array[k] = new Weight(infile.nextInt(), infile.nextInt());      	
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
						Comparable temp = array[b-1];
						array[b-1] = array[b];
						array[b] = temp;
					}
				}
			}
		}
      
//        public static void sort(Comparable[] array)
//       {
//          int maxPos;
//          for(int k = 0; k < array.length; k++)
//          {
//             maxPos = findMax(array, array.length - k);
//             swap(array, maxPos, array.length - k - 1);
//          }
//       }
// 	public static int findMax(Comparable[] array, int upper) //what does "upper" do???
//    {
//     			int max = 0;   
// 				int somethingMustBeWrong = 999;  	
// 				for(int i = 0; i<=upper; i++)
// 				{
// 					if (compareTo(array[i])>max)
// 					{
// 						max = array[i];
// 					}
// 				}
// 				for(int j = 0; j<=upper; j++)
// 				{
// 					if (compareTo(array[j])== max)
// 					{
// 						return j;
// 					}
// 				}
// 				return somethingMustBeWrong;
//     }
//     public static void swap(Comparable[] array, int a, int b)//what are "a" and "b" for???
//     {
//     			int temp = array[a];
// 				array[a]=array[b];
// 				array[b]=temp;
// 				     	
// 				/************************/
//          	/*                      */
//          	/* Your code goes here. */
//          	/*                      */
//          	/************************/
//     }
   
         	/****************************/
         	/*                          */
         	/* Helper methods go here.  */
         	/*                          */
         	/****************************/
   
   }