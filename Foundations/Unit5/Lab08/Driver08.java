	//M. Billington
	//version 6.5.2004

   import java.io.*;
   import javax.swing.JOptionPane;
    public class Driver08
   {
       public static void main(String[] args) throws Exception
      {
         String address = JOptionPane.showInputDialog("Enter an email address");
         EMail em = new EMail(address);
         JOptionPane.showMessageDialog(null, em.toString());
         System.exit(0);
      }
    
   }