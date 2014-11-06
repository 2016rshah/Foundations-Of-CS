import java.io.*;
import java.util.*;
import javax.swing.JOptionPane;

public class Driver06
{
	

	public static void main(String[] args) throws Exception
	{
		System.setOut(new PrintStream(new FileOutputStream("output.txt")));
		Shape[] objects= new Shape[41];
		for(int i=0; i<objects.length; i++)
		{
			int x=(int)(Math.random()*4+1);
			if(x==1)
				objects[i]=new Circle((Math.random()*100+1));
			else if(x==2)
				objects[i]=new Rectangle((Math.random()*100+1), (Math.random()*100+1));
			else if(x==3)
				objects[i]=new Square((Math.random()*100+1));
			else
				objects[i]=new Triangle((Math.random()*100+1));
		}

		System.out.println("Shapes");
		System.out.println("------");
		
		for(int i=0; i<objects.length; i++)
		{
			double x=((int)(objects[i].findArea()*100)/100.0);
			System.out.println("area: "+x+"\t"+"\t"+"\t"+"\t"+"\t"+objects[i].toString());
			
		}
	}
}
			
			