   //Name______________________________ Date_____________
   import javax.swing.JOptionPane;
   public class Driver13
   {
      public static void main(String[] args)
      {
         while(true)
         {
            int x = Integer.parseInt(JOptionPane.showInputDialog("x?"));
				int y = Integer.parseInt(JOptionPane.showInputDialog("y?"));
				if(x == -1)
            {
               System.exit(0);
            }
				
				
				int sx=x;
				int sy=y;
				int c=0;
				int iterations=0;
				
				boolean eq= true;
				
				while(eq==true)
				{
					if(x+y>=10)
						c=(x+y)%10;
					else 
						c=x+y;
					System.out.print(x+"\t");
					
					x=y;
					y=c;
					
					//System.out.print(x+"\t");
					//System.out.print(y+"\t");
					
					iterations++;
					if(x==sx && y==sy)
					{
						eq=false;
					}
				}
				System.out.print(x+"\t"+y);
				System.out.println();
				System.out.println(iterations);
			}
		}
	}
				
