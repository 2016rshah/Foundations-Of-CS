public class Driver03
{
	public static void main(String[] args)
	{
		int[] array = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		print(array);
		System.out.println();
		scramble(array);
		print(array);
		System.out.println();
		insertion(array);
		print(array);
		
	}
	public static void print(int [] array)
	{
		for(int i = 0; i<array.length; i++)
		{
			System.out.println(array[i]);
		}
	}
	public static void scramble(int[] array)
	{

			for(int i = 0; i<array.length; i++)
			{
				int r1 = (int)(Math.random()*9+1);
				int r2 = (int)(Math.random()*9+1);
				int temp = array[r1];
				array[r1] = array[r2];
				array[r2] = temp;
			}
	}
	public static void sort(int[] array)
   {
         int maxPos;
         for(int k = 0; k < array.length; k++)
         {
            maxPos = findMax(array, array.length - k - 1);
            swap(array, maxPos, array.length - k - 1);
         }
   }
   public static int findMax(int[] array, int upper) //what does "upper" do???
   {
    			int max = array[0];   
				int somethingMustBeWrong = 999;  	
				for(int i = 0; i<=upper; i++)
				{
					if (array[i]>max)
					{
						max = array[i];
					}
				}
				for(int j = 0; j<=upper; j++)
				{
					if (array[j]== max)
					{
						return j;
					}
				}
				return somethingMustBeWrong;
    }
    public static void swap(int[] array, int a, int b)//what are "a" and "b" for???
    {
    			int temp = array[a];
				array[a]=array[b];
				array[b]=temp;
				     	
				/************************/
         	/*                      */
         	/* Your code goes here. */
         	/*                      */
         	/************************/
    }
	 public static void bubble(int[] array)
	 {
	 	for(int passes = 1; passes<array.length; passes++)
		{
			for(int b = 1; b<array.length; b++)
			{
				if(array[b]<array[b-1])
				{
					int temp = array[b-1];
					array[b-1] = array[b];
					array[b] = temp;
				}
			}
		}
	}
	public static void insertion(int[] array)
	{
		
// 		for(int i = 1; i<array.length-1; i++)
// 		{
// 			int x = 1;
// 			int y = 0;
// 			while(array[i-y]<array[i-x])
// 			{
// 				
// 				int temp = array[i];
// 				array[i] = array[i-x];
// 				array[i-x] = temp;
// 				x++;
// 				y++;
// 			}
// 		}
			for(int i = 1; i<array.length; i++)
			{
				for(int j = 0; j<array.length; j++)
				{
					int x = 1;
					while(array[i]<array[i-x])
					{
						int temp = array[i];
						array[i]=array[i-1];
						array[i-1]=temp;
						x++;
					}
				}
			}
				
			
			
		
	}
}
