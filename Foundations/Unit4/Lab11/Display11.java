   //Torbert, e-mail: mr@torbert.com, website: www.mr.torbert.com
	//version 7.14.2003

   import javax.swing.*;
   import java.awt.*;
    public class Display11 extends JPanel
   {
      private JLabel[] output;
      private int[] bits;
       public Display11()
      {
         setLayout(new GridLayout(1, 8));
      
         output = new JLabel[8];
         bits = new int[8];
         for(int x = 0; x <= 7; x++)
         {
            output[x] = new JLabel("", SwingConstants.CENTER);
            output[x].setFont(new Font("Serif", Font.BOLD, 50));
            add(output[x]);
         }
         setBlank();
      }
       public void setBlank()
      {    
        for(int i = 0; i<bits.length; i++)
		  {
		  		bits[i] = 0; 
		  }
		  
		  for(int i = 0; i<output.length; i++)
		  {
		  		output[i].setText(""+bits[i]);
		  }
      }
       public void setValue( int num )
      {
        
		  for(int i = bits.length-1; i>0; i--)
		  {
			  bits[i]= num%2;
			  num=num/2;
		  }
		  for(int i = 0; i<output.length; i++)
		  {
		  		output[i].setText(" "+bits[i]);
		  }
		  
		  
		  //convert the num to binary.
        //display the binary number in the JLabel
      }
   }