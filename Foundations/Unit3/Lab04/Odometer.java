	//Name______________________________ Date_____________
   import javax.swing.*;
   import java.awt.*;
    public class Odometer extends JPanel
   {
      
	  
	  public int ones, h, t, x;
	  private JLabel ones1;
	  private JLabel tens10;
	  private JLabel hundreds100;
	  
	  
	  
	  /****************************/
     /*                          */
     /* Declare 3 fields.        */
     /*
     /* Declare 1 int variable.  */
     /*                          */
     /****************************/
   
       public Odometer()
      {
         	
				setLayout(new FlowLayout());
				
 				hundreds100= new JLabel("");
 				hundreds100.setFont(new Font("Serif", Font.BOLD, 100));
 				hundreds100.setForeground(Color.black);
				add(hundreds100);
				
				
				
				tens10 = new JLabel("");
				tens10.setFont(new Font("Serif", Font.BOLD, 100));
				tens10.setForeground(Color.black);
				add(tens10);
								
				ones1 = new JLabel("");
         	ones1.setFont(new Font("Serif", Font.BOLD, 100));
        	 	ones1.setForeground(Color.white);
         	add(ones1);
				

				
 				ones1.setText(" " + ones);
  				tens10.setText(" " + t);
				hundreds100.setText(" " + h);
			

				
				
				/*******************************/
         	/* This is the constructor.    */
         	/* Set the layout.				 */
				/* Set the background.         */
         	/* Instantiate all objects and */
      		/* set their properties.       */
      		/*	                            */ 
         	/*******************************/
      }
       
		 
		 public void update()
      {

				x++;
				ones= x%10;
				h = x/100;
				t = ((x %100)/10);
 				ones1.setText(" " + ones);
 				tens10.setText(" " + t);
				hundreds100.setText(" " + h);

				
				System.out.print(h);
				System.out.print(t);
				System.out.print(ones);
	
				
				/***************************/
         	/*                         */
         	/* Increment the counter,  */
         	/* set the labels.         */
      		/*                         */          
         	/***************************/
      }
   }