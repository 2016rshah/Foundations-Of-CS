   import javax.swing.*;
   import java.awt.*;
   
	public class Display extends JPanel //probably not needed
   {
      private JLabel label1, label2, label3;
      private int value, small, attempts, target;
      
		public Display()
      {
         setLayout(new BorderLayout());
         setBackground(Color.BLACK);
            	
			
      }
      public int update()
      {  
         attempts++;     
         value = secret(50, 10);
         if( value < target )
            small++;
         label1.setText("New Value: " + value);
         label2.setText("Target: " + target);     
         label3.setText("Less than target: " + small);
         return attempts;
      }
      private int secret(int r, int f)
      {
         return (int)(Math.random() * r + f);
      }   
   }