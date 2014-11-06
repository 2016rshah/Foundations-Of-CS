    import java.awt.*;
    import java.awt.event.*;
    import javax.swing.*;
     public class AliceStringDemo
    {
        public static void main (String[] args)
       {
          String alice = "aliceInWonderland";
         System.out.println(" 9:  " + alice);
          String tweedleDum;
          tweedleDum = "tweedleDee";
          System.out.println(" 12:  " + tweedleDum);
          alice = tweedleDum;
          System.out.println(" 14:  " + alice);
          if (alice == tweedleDum)
             System.out.println(" 16:  " + "alice has the same reference as tweedleDum");
          if (alice.equals(tweedleDum)) // also:  equalsIgnoreCase()
             System.out.println(" 18:  " + "alice is an identical string to tweedleDum");
          //at this point, draw a picture of the references to the String objects.
       
          int len = alice.length();
          System.out.println(" 22:  " + len);
          alice = "aliceInWonderland";
          tweedleDum = "alice";
          int i = tweedleDum.compareTo(alice);
          if (i < 0)
             System.out.println(" 27:  " + "tweedleDum is alphabetically before alice");
          i = alice.compareTo(alice);
          if (i == 0)
             System.out.println(" 30:  " + "alice is the same as alice!");
          i = alice.compareTo(tweedleDum);
          if (i > 0) 
             System.out.println(" 33:  " + "alice is alphabetically after tweedleDum");
          
          System.out.println("35:  " + alice.substring(7, 8));
          System.out.println("36:  " + alice.substring(7,13));
          System.out.print("37:  ");
          for (i = 0; i < alice.length(); i++)
             System.out.print("   " + alice.substring(i,i+1));
          System.out.println();
          System.out.print("41:  ");
         for (i = 0; i < alice.length(); i++)
             System.out.print("   " + alice.charAt(i));
          System.out.println();
          
          alice = "   * aliceInWonderLand *   ";
          System.out.println("47:  " + alice);
          System.out.println("48:  " + alice.trim());
          alice = "aliceInWonderLandaliceInWonderLandaliceInWonderLand";
          System.out.println("50:  " + alice.indexOf("i"));
          System.out.println("51:  " + alice.indexOf("ice"));
          System.out.println("52:  " + alice.indexOf("i", 3));
          System.out.println("53:  " + alice.lastIndexOf("ice"));
          String madHatter = "madHatter";
          System.out.println("55:  " + madHatter.toUpperCase());
          System.out.println("56:  " + "MaRcHhArE".toLowerCase());
       }
    }
