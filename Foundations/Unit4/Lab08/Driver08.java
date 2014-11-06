import java.io.*;
import java.util.*;
import javax.swing.JOptionPane; 



public class Driver08
{
	public static void main(String[] args) throws Exception
	{
		Scanner infile=new Scanner(new File("words.txt"));
		
		String[] dict=new String[Integer.parseInt(infile.next())];
		int nope=0;
		for(int i=0; i<dict.length; i++)
		{
			dict[i]=infile.next();
		}
		while(true)
		{
			String myWord = JOptionPane.showInputDialog("Word? (type -1 to quit)");
			if(myWord.equals("-1"))
			{
				System.out.println("Goodbye");
				break;
			}
			for(int i=0; i<dict.length; i++)
			{
				if(myWord.equals(dict[i]))
				{
					System.out.println("yes, "+myWord+" is a word(#"+i+")");
					nope=0;
					break;
				}
				else
				{
					nope=1;
				}
			}
		if(nope==1)
			System.out.println("no, "+myWord+" is not a word, sorry");
		}
	}
}