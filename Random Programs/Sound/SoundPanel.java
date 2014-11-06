import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.sound.sampled.*;
import java.io.*;
import java.applet.Applet;
import java.net.URL;

public class SoundPanel extends JPanel
{
	private Clip clip1, clip2, clip3;
	private AudioInputStream ais1, ais2, ais3;
	private URL mediaURL1, mediaURL2, mediaURL3; //Sound things
	private int i;
	private JLabel label;
	private JButton k1, k2, k3;
	
	public SoundPanel()
	{
		i = 0;
		setLayout(new FlowLayout());
		mediaURL1 = this.getClass().getResource("g-piano3.wav");
		mediaURL2 = this.getClass().getResource("g-piano4.wav");
		mediaURL3 = this.getClass().getResource("charge.wav");
		
		try
		{
			clip1 = AudioSystem.getClip();
			clip2 = AudioSystem.getClip();
			clip3 = AudioSystem.getClip();
			ais1 = AudioSystem.getAudioInputStream(mediaURL1);
			ais2 = AudioSystem.getAudioInputStream(mediaURL2);
			ais3 = AudioSystem.getAudioInputStream(mediaURL3);
			clip1.open(ais1);
			clip1.loop(Clip.LOOP_CONTINUOUSLY);			
		  	clip1.stop();
			clip2.open(ais2);
			clip2.loop(Clip.LOOP_CONTINUOUSLY);
			clip2.stop();
			clip3.open(ais3);
			clip3.loop(Clip.LOOP_CONTINUOUSLY);
			clip3.stop();
		}
		catch(Exception ef){};
		
		k1 = new JButton("g3");
		k1.addActionListener(new K1());
		add(k1);
		
		k2 = new JButton("g4");
		k2.addActionListener(new K2());
		add(k2);
		
		k3 = new JButton("charge");
		k3.addActionListener(new K3());
		add(k3);
	}
	private class K1 implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{

				clip1.loop(1);

		}
	}
	private class K2 implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			clip2.loop(1);
		}
	}
	private class K3 implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			clip3.loop(1);
		}
	}
}
	
		
		
		
		
	