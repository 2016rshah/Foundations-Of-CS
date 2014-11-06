   //Name______________________________ Date_____________
   import javax.swing.*;
   import java.awt.*;
   import java.awt.event.*;
   public class Panel08 extends JPanel
   {
      private Display08 display;
      
		private JButton button1, button2;
		public Panel08()
      {
         setLayout(new BorderLayout());
      	
			JPanel panel= new JPanel();
			panel.setLayout(new GridLayout(1, 2));
			add(panel, BorderLayout.SOUTH);
			
         display = new Display08();
         add(display, BorderLayout.CENTER);
      	
   		button1= new JButton("Finite");
			button1.addActionListener(new Listener1());
			panel.add(button1);
			
			button2 = new JButton("Infinite");
			button2.addActionListener(new Listener2());
			panel.add(button2);      
			
			
				/************************/
         	/*                      */
         	/* Your code goes here. */
         	/*                      */
         	/************************/
      
      }
      private class Listener1 implements ActionListener
      {
         public void actionPerformed(ActionEvent e)
         {
         	
         	/************************/
         	/*                      */
         	/* Your code goes here. */
         	/*                      */
         	/************************/
         
         }
      }
      private class Listener2 implements ActionListener
      {
         public void actionPerformed(ActionEvent e)
         {
         
         	/************************/
         	/*                      */
         	/* Your code goes here. */
         	/*                      */
         	/************************/
         
         }
      }
   }