import javax.swing.*;
import edu.fcps.Bucket;
public class Driver04
{
 public static void main (String args[])
  {
   JFrame frame = new JFrame ("Bubkets");
	frame.setSize(600, 400);
	frame.setLocation(100, 100);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setContentPane( new BucketPanel());
	frame.setVisible(true);
	Bucket.setSpeed(5);
	Bucket.useTotal(true);
	Bucket five = new Bucket(5);
	Bucket three = new Bucket(3);
	
	five.fill();
	five.pourInto(three);
	three.spill();
	five.pourInto(three);
	five.fill();
	five.pourInto(three);
	
  }
}
	
	