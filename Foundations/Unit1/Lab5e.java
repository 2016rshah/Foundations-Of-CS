//Torbert, e-mail: smtorbert@fcps.edu
//version 4.16.2003

    public class Lab5e
   {
       public static void main(String[] args)
      {
        
 
			Racer weismuller = new Racer(1);
         Racer fraser = new Racer(4);
         Racer spitz = new Racer(7);
         
			Thread t1 = new Thread( weismuller );
         Thread t2 = new Thread( fraser );
         Thread t3 = new Thread( spitz );
         
			t1.start();
         t2.start();
         t3.start();
       }
   }