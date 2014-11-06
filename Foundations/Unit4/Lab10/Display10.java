   //Name______________________________ Date_____________
   import javax.swing.*;
   import java.awt.*;
   public class Display10 extends JPanel
   {
      private JLabel[] bits;
		private JLabel deci;
      public Display10()
      {
         setLayout(new GridLayout(1, 9));
         bits = new JLabel[8];
         for(int x = 0; x < bits.length; x++)
         {
            bits[x] = new JLabel("", SwingConstants.CENTER);
            bits[x].setFont(new Font("Serif", Font.BOLD, 50));
            add(bits[x]);
         }
   		deci = new JLabel("", SwingConstants.CENTER);
			deci.setFont(new Font("Serif", Font.BOLD, 50));
			add(deci);      
			randomize();
			convert();
      }
      public void randomize()
      {
         	for(int k = 0; k<bits.length; k++)
				{
				bits[k].setText(""+(int)(Math.random()*2));
				}
				convert();
      }
      public void reverse()
      {
				int lol = 0;
				for(int k = 0; k<bits.length/2; k++)
				{
				lol=Integer.parseInt(bits[k].getText());
				bits[k].setText(bits[bits.length-1-k].getText());
				bits[bits.length-1-k].setText(""+lol);
             }
				 convert();
		}
      public void shift()
      {
           for(int k = bits.length-1; k>=0; k--)
			  {
			  if(k==0)
			  bits[k].setText("0");
			  else
			  bits[k].setText(bits[k-1].getText());
			  }
			  convert();
      }
      public void rotate()
      {
		int yay = Integer.parseInt(bits[bits.length-1].getText());
           for(int k = bits.length-1; k>=0; k--)
			  {
				  if(k==0)
			  bits[k].setText(""+yay);
			  else
			  bits[k].setText(bits[k-1].getText());
			  }
			  convert();
      }
		private void convert()
		{
			double total=0;
			int[] c= new int[bits.length];
			for(int i = 0; i<bits.length; i++)
			{
				c[i]=Integer.parseInt(bits[(bits.length-1)-i].getText());
			}
			for(int i = 0; i<bits.length; i++)
			{
				total = (c[i]*Math.pow(2, i))+total;
			}
			deci.setText(""+total);
		}
   }