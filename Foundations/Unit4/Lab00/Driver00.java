   import java.util.Scanner;
   public class Driver00
   {
      public static final int NUMITEMS = 10;
      public static void main(String[] args)
      {
         double[] array = new double[NUMITEMS];
         Scanner keyboard = new Scanner(System.in);
         for(int x = 0; x< NUMITEMS; x++)
         {
            System.out.print("#" + (x+1) +":  ");
            array[x] = keyboard.nextDouble();
         }
         System.out.println("The numbers you typed in, backwards:");
//          for (int x = 0; x<NUMITEMS; x++)
//             System.out.println("/"+ array[NUMITEMS-x-1]);
			for (int y = NUMITEMS; y>0; y--)
				System.out.println(" " +array[y-1]);
				

      }
   }