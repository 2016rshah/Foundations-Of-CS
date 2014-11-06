   //Torbert, e-mail: mr@torbert.com, website: www.mr.torbert.com
	//version 4.4.2003

   import javax.swing.*;
   import java.awt.*;
   import java.awt.event.*;
   public class Panel11 extends JPanel
   {
      private Display11 display;
		public int stones, times;
      //private Scoreboard11 scoreboard;
      public Panel11()
      {
         setLayout(new BorderLayout());
			stones=9;
      
//          scoreboard = new Scoreboard10();
//          add(scoreboard, BorderLayout.NORTH);
      
         display = new Display11();
         add(display, BorderLayout.CENTER);
      
         JPanel panel = new JPanel();
         panel.setLayout(new BorderLayout());
         add(panel, BorderLayout.SOUTH);
         JButton button1 = new JButton("One");
         button1.addActionListener(new Listener1());
         panel.add(button1, BorderLayout.WEST);
         JButton button2 = new JButton("Two");
         button2.addActionListener(new Listener2());
         panel.add(button2, BorderLayout.CENTER);
			JButton button3 = new JButton("Three");
			button3.addActionListener(new Listener3());
			panel.add(button3, BorderLayout.EAST);
			times=0;
			
      }
      private class Listener1 implements ActionListener
      {
         public void actionPerformed(ActionEvent e)
         {
            display.one();
         }
      }
      private class Listener2 implements ActionListener
      {
         public void actionPerformed(ActionEvent e)
         {
            display.two();
         }
      }
		private class Listener3 implements ActionListener
      {
         public void actionPerformed(ActionEvent e)
         {
            display.three();
         }
      }
		
   }