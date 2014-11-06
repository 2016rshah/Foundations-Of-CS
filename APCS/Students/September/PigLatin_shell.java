// your name, date
   import java.util.*;
   import java.io.*;
	import javax.swing.*;
    public class PigLatin_shell
   {
       public static void main(String[] args) throws FileNotFoundException
      {
         part_1();
         //part_2();
      }
       public static String pig(String s)
      {
         /***************************
         *
         *   enter your code here  
         *
         ****************************/
			
			char v = s.charAt(0);
			boolean uC = false;
			if(Character.isUpperCase(v))
			{
				uC=true;
			}
			if(v=='a' || v == 'e' || v=='i' || v=='o' || v=='u')
			{
				s = s+"way";
				if(uC)
				{
					s = s.substring(0, 1).toUpperCase() + s.substring(1).toLowerCase();
				}
				return s;
			}
			int x = 0;
			for(int i = 0; i<s.length(); i++)
			{
				char c = s.charAt(i);
				if(c == 'a' || c == 'e' || c=='i' || c=='o' || c == 'u')
					x++;					
			}

					
			if(x>0)
			{
					
						int i = 0;
						char c = s.charAt(i);
						String temp = "";
						if(i<s.length())
						{
							while(c!='a' && c!='e' && c!='i' && c!='o' && c!='u')
							{
								if(c=='q' && s.charAt(i+1)=='u')
								{
									//temp = temp+s.substring(i, i+2);
									s=s.substring(i+2);
									String r = s+temp+"quay";
									return r;
								}
									
								temp = temp + s.substring(i, i+1);
								i++;
								c = s.charAt(i);
							}
						}
						s = s.substring(i);
						String r = s+temp+"ay";
						if(uC)
						{
							r = r.substring(0, 1).toUpperCase() + r.substring(1).toLowerCase();
						}
						return r;
			}
			else
			{
				String w = "INVALID";
				return w;
			}

			
      
      }
       public static void part_1()
      {
         Scanner sc = new Scanner(System.in);
			boolean x = true;
         while(true)
         {
            System.out.print("\nWhat word? ");
            String s = sc.next();
            if (s.equals("-1")) 
               break;
            String p = pig(s);
            System.out.println("***** " + p + " *****");
				if(s.equals("exit"))
				{
					x = false;
				}
         }		
      }
       public static void part_2() 
      {
   		Scanner infile = null;
					
			try
			{
				String f = JOptionPane.showInputDialog("Filename?");
				infile = new Scanner(new File(f));
				int t = infile.nextInt();
				PrintStream outfile = new PrintStream(new FileOutputStream("IgLatinpay.txt"));
				for(int i = 0; i<t; i++)
				{
					
					outfile.println(pig(infile.next()));
				} 
			}
			catch(FileNotFoundException e)
			{
				System.out.println("woops");
				System.exit(0);
			}
			try
			{
				String f = "declaration.txt";
				infile = new Scanner(new File(f));
				int t = infile.nextInt();
				PrintStream outfile2 = new PrintStream(new FileOutputStream("EclerationDay.txt"));
				for(int i = 0; i<t; i++)
				{
					outfile2.print(pig(infile.next()));
				}
				
			}
			catch(FileNotFoundException e)
			{
				System.out.println("arghhh Nic stole the decleration");
				System.exit(0);
			}
			
   
			/***************************
         *
         *   enter your code here:
      		 Scanner class, try-catch, nested loops, file output  
         *
         ****************************/
      }
   }
