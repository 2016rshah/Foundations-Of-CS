	//Name______________________________ Date_____________
   import javax.swing.*;
   import java.awt.*;
   public class Dice extends JPanel
   {
      private JLabel label1, label2;
      public Dice()
      {
         setLayout(new GridLayout(1, 2, 5, 5));
      
         label1 = new JLabel();
         label1.setIcon(new ImageIcon("one.jpg"));
         add(label1);
      
         label2 = new JLabel();
         label2.setIcon(new ImageIcon("one.jpg"));
         add(label2);
      }
      public int roll()
      {
         int a = rollOne(label1);
         int b = rollOne(label2);
         return a + b;
      }
      private int rollOne(JLabel label)
      {
      		ImageIcon one= new ImageIcon("one.jpg");
				ImageIcon two = new ImageIcon("two.jpg");
				ImageIcon three = new ImageIcon("three.jpg");
				ImageIcon four = new ImageIcon("four.jpg");
				ImageIcon five = new ImageIcon("five.jpg");
				ImageIcon six = new ImageIcon("six.jpg");
				
    			int dice1= (int)(Math.random()*6)+1;
				
				
				for(int k=1; k<=6; k++)
				switch(dice1)
				  {
				    case 1: label.setIcon(one);
					 break;
				    case 2: label.setIcon(two);  
					 break;
					 case 3: label.setIcon(three);
					 break;
				      
				     
				    case 4: label.setIcon(four);
					 break;
				    case 5: label.setIcon(five);
					 break;
					 case 6: label.setIcon(six); 
					 break; 

				    
				  }
				
				
// 				if(dice1== 1)
// 					 label.setIcon(one);
// 				if(dice1== 2)
// 					label.setIcon(two);
// 				if(dice1==3 )
// 					label.setIcon(three);
// 				if(dice1== 4)
// 					 label.setIcon(four);
// 				if(dice1== 5)
// 					label.setIcon(five);
// 				if(dice1==6 )
// 					label.setIcon(six);
					

					
				
					
				return dice1;

				
				/************************/
         	/*                      */
         	/* Your code goes here. */
         	/*                      */
         	/************************/
      
      }
   }