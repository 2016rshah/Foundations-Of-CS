	//Name______________________________ Date_____________
   import javax.swing.*;
   import java.awt.*;
   public class ScoreCard09 extends JPanel
   {
      private JTextField[] input;
      public ScoreCard09()
      {
         setLayout(new GridLayout(2, 18));
      
         for(int x = 1; x <= 18; x++)
         {
            add(new JLabel("" + x, SwingConstants.CENTER));
         }
      
         input = new JTextField[18];
         for(int x = 0; x < input.length; x++)
         {
            input[x] = new JTextField();
            add(input[x]);
         }
      }
      public void randomize()
      {
    			//int x=(int)(Math.random()*4+1);     	
				for(int i=0; i<input.length; i++)
				{
					int x=(int)(Math.random()*4+1);
					if(x==1)
						input[i].setText("1");
					else if(x==2)
						input[i].setText("2");
					else if(x==3)
						input[i].setText("3");
					else
						input[i].setText("4");
				}
      }
      public int findTotal()
      {
				int total=0;
         	for(int i=0;i<input.length; i++)
				{
					total=Integer.parseInt(input[i].getText())+total;
				}
				return total;
      }
      public int findAces()
      {
    			int aces=0;     	
				for(int i=0; i<input.length; i++)
				{
					if(Integer.parseInt(input[i].getText())==1)
						aces++;
				}
				return aces;
					
      }
      public int findHardestHole()
      {
    			int max=0; 
				int r=0; 
				int x = 0;   	
				for(int i=0; i<input.length; i++)
				{
					if(Integer.parseInt(input[i].getText())>max)
					{
						max=Integer.parseInt(input[i].getText());
						r=i+1;
					}
					
				}
				return r;
				
				
					
      }
   }