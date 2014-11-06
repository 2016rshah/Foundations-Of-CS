import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.Line;
import javax.sound.sampled.LineEvent;
import javax.sound.sampled.LineListener;
import java.io.*;
import java.applet.Applet;
import java.net.URL;

   public class DeleteThisPanel extends JPanel
   {
      private JLabel label1, label2;
      private JTextField box;
		private Clip clip;
		private AudioInputStream ais;
		private URL mediaURL; 

      public DeleteThisPanel()
      {

			mediaURL = this.getClass().getResource("charge.wav");
			
			if(JOptionPane.showConfirmDialog(null,"choose one", "choose one", JOptionPane.YES_NO_OPTION)==0)
			{
				System.out.println("yes");
			}
			else
			{
				System.out.println("no");
			}
			//1= no
			//0 = yes

			
			Object[] possibleValues = { "Yes", "No", "Maybe" };
			Object selectedValue = JOptionPane.showInputDialog(null,"Choose one", "Input",JOptionPane.INFORMATION_MESSAGE, null, possibleValues, possibleValues[0]);
			if(selectedValue == possibleValues[0])
			{
				System.out.println(selectedValue);
			}
			else if(selectedValue == possibleValues[1])
			{
				System.exit(0);
			}
			else if(selectedValue == "Maybe")
			{
				System.out.print("Come back later");
				System.exit(0);
	
			}
			
			String name = JOptionPane.showInputDialog("name?");
			JOptionPane.showMessageDialog(null, "stuff", "stuff", JOptionPane.PLAIN_MESSAGE);
			
			
			
			setLayout(new FlowLayout());

      
         label1 = new JLabel("Enter A Number 1-5");
         label1.setFont(new Font("Serif", Font.BOLD, 50));
         label1.setForeground(Color.blue);
         add(label1);
      
         JPanel panel = new JPanel();
         panel.setLayout(new FlowLayout());
         add(panel);
      
         box = new JTextField("Enter A Number 1-5", 25);
         box.setHorizontalAlignment(SwingConstants.RIGHT);
         panel.add(box);
      
  			JButton button1 = new JButton("Click Here");
			button1.addActionListener(new Listener1());
			panel.add(button1);		
			
			JButton button2 = new JButton("Enter");
			button2.addActionListener(new Listener2());
			panel.add(button2);
      
         JButton button3 = new JButton("Quit");
         button3.addActionListener(new Listener3());
         panel.add(button3);
			
			try
			{
	        	clip = AudioSystem.getClip();
				ais = AudioSystem.getAudioInputStream(mediaURL);
				clip.open(ais);
	        	clip.loop(Clip.LOOP_CONTINUOUSLY);			
		  		clip.stop();
		   }
		  catch(Exception e){}
		  //clip.loop(Clip.LOOP_CONTINUOUSLY);
		}

  		private class Listener1 implements ActionListener
		{
			public void actionPerformed(ActionEvent e)
			{
// 				try
// 				{
// 					clip.open(ais);
// 					clip.loop(Clip.LOOP_CONTINUOUSLY);
// 				}
// 				catch(Exception ef){}
					clip.start();
			}

		}		
		private class Listener2 implements ActionListener
		{
			public void actionPerformed(ActionEvent e)
			{
				int s = Integer.parseInt(box.getText());
				if(s>5 || s<1)
				{
					label1.setText("You can't read");
				}

				else
				{
					int x = ((int)(Math.random() *5+1));
					if( s == x)
					{
						label1.setText("Winner!");
					}
					else
					{
						label1.setText("Better Luck Next Time");
					}
				}
			}
		}    
		private class Listener3 implements ActionListener
      {
         public void actionPerformed(ActionEvent e)
         {
         
         	System.exit(0);
         
         }
      }
   }