	//Name______________________________ Date_____________
   import javax.swing.*;
   import java.awt.*;
   public class Display11 extends JPanel
   {
      private JLabel label, p1, p2, nim;
		public ImageIcon s1, s2, s3, s4, s5, s6, s7, s8, s9;
      private int stones;
      public Display11()
      {
         setLayout(new BorderLayout());
         //next = 5;
			
			s1 = new ImageIcon("stones1.jpg");
			s2 = new ImageIcon("stones2.jpg");
			s3 = new ImageIcon("stones3.jpg");
			s4 = new ImageIcon("stones4.jpg");
			s5 = new ImageIcon("stones5.jpg");
			s6 = new ImageIcon("stones6.jpg");
			s7 = new ImageIcon("stones7.jpg");
			s8 = new ImageIcon("stones8.jpg");
			s9 = new ImageIcon("stones9.jpg");
			
      
         label = new JLabel();
			label.setIcon(s9);
         //label.setFont(new Font("Serif", Font.BOLD, 100));
         label.setHorizontalAlignment(SwingConstants.CENTER);
         //label.setForeground(Color.blue);
			p1= new JLabel("0");
			p1.setFont(new Font("Serif", Font.BOLD, 100));
			
			p2= new JLabel("0");
			p2.setFont(new Font("Serif", Font.BOLD, 100));
			nim= new JLabel("Nim");
			nim.setFont(new Font("Serif", Font.BOLD, 32));
			nim.setHorizontalAlignment(SwingConstants.CENTER);

			stones=9;
			
			
         add(label);
			add(p1, BorderLayout.WEST);
			add(p2, BorderLayout.EAST);
			add(nim, BorderLayout.NORTH);
      }
      public void one()
      {
      	stones=stones-1;
			if(stones==9)
				label.setIcon(s9);
			else if(stones==8)
				label.setIcon(s8);
			else if(stones==7)
				label.setIcon(s7);
			else if(stones==6)
				label.setIcon(s6);
			else if(stones==5)
				label.setIcon(s5);
			else if(stones==4)
				label.setIcon(s4);
			else if(stones==3)
				label.setIcon(s3);
			else if(stones==2)
				label.setIcon(s2);
			else if(stones==1)
				label.setIcon(s1);
			else
				nim.setText("GAME OVER");
    			     	
      
      }
		public void two()
      {
      	stones=stones-2;
			if(stones==9)
				label.setIcon(s9);
			else if(stones==8)
				label.setIcon(s8);
			else if(stones==7)
				label.setIcon(s7);
			else if(stones==6)
				label.setIcon(s6);
			else if(stones==5)
				label.setIcon(s5);
			else if(stones==4)
				label.setIcon(s4);
			else if(stones==3)
				label.setIcon(s3);
			else if(stones==2)
				label.setIcon(s2);
			else if(stones==1)
				label.setIcon(s1);
			else
				nim.setText("GAME OVER");
         	
      
      }
      public void three()
      {
      	stones=stones-3;
			if(stones==9)
				label.setIcon(s9);
			else if(stones==8)
				label.setIcon(s8);
			else if(stones==7)
				label.setIcon(s7);
			else if(stones==6)
				label.setIcon(s6);
			else if(stones==5)
				label.setIcon(s5);
			else if(stones==4)
				label.setIcon(s4);
			else if(stones==3)
				label.setIcon(s3);
			else if(stones==2)
				label.setIcon(s2);
			else if(stones==1)
				label.setIcon(s1);
			else	
				nim.setText("GAME OVER");
			
         	
      
      }
//       public boolean guessHigh()
//       {
//          pickNext();
//          return next > last;
//       }
//       public boolean guessLow()
//       {
//          pickNext();
//          return next < last;
//       }
   }