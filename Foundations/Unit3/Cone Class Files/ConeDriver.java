//Shah, email:rushi.shah@ymail.com
// import edu.fcps.karel2.Display;
// import edu.fcps.karel2.Robot; 
	import javax.swing.JOptionPane;

public class ConeDriver
{
	public static void main(String[] args)
	{
	Cone cone = new Cone();
	
	System.out.print(cone.toString());
	System.out.println();
	System.out.print(cone.getVolume());
	System.out.println();
	System.out.print(cone.getSurArea());
	System.out.println();
	cone.changeRadius(cone.getRadius()*2);
	System.out.print(cone.toString());
	System.out.println();
	System.out.print(cone.getVolume());
	
   double x = Double.parseDouble(JOptionPane.showInputDialog("x?"));
  	int y = Integer.parseInt(JOptionPane.showInputDialog("y?"));
 	
 	Cone cone2 = new Cone(x, y);
	System.out.println();
	System.out.print(cone2.toString());
	
	
		
	 }
}