 	//Name______________________________ Date_____________
   import javax.swing.*;
   import java.awt.*;
   public class Display05 extends JPanel
   {
      private JLabel label1, label2, label3;
      private int value, total, oldHS;
      public Display05()
      {
         setLayout(new GridLayout(3, 1));
         Font f = new Font("Serif", Font.BOLD, 30);
         total = value = 0;
      
         label1 = new JLabel("Value: ");
         label1.setFont(f);
         label1.setForeground(Color.blue);
         add(label1);
      
         label2 = new JLabel("Total: ");
         label2.setFont(f);
         label2.setForeground(Color.blue);
         add(label2);
			
			label3 = new JLabel("Highscore: ");
			label3.setFont(f);
			label3.setForeground(Color.blue);
			add(label3);
			
			oldHS=0;
			total=0;
			
      }
      public void update()
      {
      	value= (int)(Math.random()*11+1);
			label1.setText("Value: " +value);
			total=value+total;
			if(total>=oldHS)
			{
				oldHS= total;
			}
			label3.setText("Highscore: " + oldHS);
			
			
			if(value==2 || value==1)
			{
				value=0;
				total=0;
				label1.setText("Value: " + value);
				label2.setText("Total: " + total);
			}
         else
			{
				label2.setText("Total: " + total);
			}
			
      
      }
   }