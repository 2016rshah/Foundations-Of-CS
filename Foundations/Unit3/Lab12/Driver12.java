   //Name______________________________ Date_____________
   import javax.swing.JOptionPane;
   public class Driver12
   {
      public static void main(String[] args)
      {
         while(true)
         {
            int n = Integer.parseInt(
                       JOptionPane.showInputDialog(
                                    "How many rowss? (-1 to quit)"));
            if(n == -1)
            {
               System.out.println("Bye-bye!");
               System.exit(0);
            }
            String message = "What type? (1-4)";
            message = message + "\n1. Standard";
            message = message + "\n2. Backward";
            message = message + "\n3. Pyramid";
            message = message + "\n4. Box with X";
            int type = Integer.parseInt(JOptionPane.showInputDialog(message));
            switch(type)
            {
               case 1: standard(n);
                  break;
               case 2: backward(n);
                  break;
               case 3: pyramid(n);
                  break;
               case 4: box(n);
                  break;
               default: System.out.println("Not a valid type.");
                  break;
            }
            System.out.println();
         }
      }
      public static void standard(int n)
      {
         for(int rowss=1; rowss<=n; rowss++)
			{
				for(int stars=1; stars<=rowss; stars++)
				{
					System.out.print("*");
				}
				System.out.println();
			
			}
      }
      public static void backward(int n)
      {
         for(int rowss=1; rowss<=n; rowss++)
			{
				for(int spaces=1; spaces<=n-rowss; spaces++)
				{
					System.out.print(" ");
				}
				for(int stars=1; stars<=rowss; stars++)
				{
					System.out.print("*");
				}
				System.out.println();
			}
      }
      public static void pyramid(int n)
      {
			int x=1;
         for(int rowss=1; rowss<=n; rowss++)
			{
				for(int spaces=1; spaces<=n-rowss; spaces++)
				{
					System.out.print(" ");
				}
				for(int stars=1; stars<=x; stars++)
				{
					System.out.print("*");
					
				}
				x=x+2;
				System.out.println();
			}
			
				
      }
      public static void box(int n)
      {
         for(int rows=1; rows<=n; rows++)
			{
				for(int col = 1; col<=n; col++)
				{
					if(rows==1)
						System.out.print("*");
					else if(rows==n)
						System.out.print("*");
					else if(rows==col)
						System.out.print("*");
					else if(col==n-(rows-1))
						System.out.print("*");
					else if(col==1)
						System.out.print("*");
					else if(col==n)
						System.out.print("*");
					else
						System.out.print(" ");
				}
				System.out.println();
			}
      }
   }