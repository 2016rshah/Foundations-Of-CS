   //Torbert, e-mail: mr@torbert.com, website: www.mr.torbert.com
	//version 7.14.2003

   import javax.swing.JFrame;
   public class SelfAvoidingWalkDriver
   {
      public static void main(String[] args)
      {
         JFrame frame = new JFrame("SelfAvoiding Walk");
         frame.setSize(700, 700);
         frame.setLocation(300, 200);
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         frame.setContentPane(new SelfAvoidingWalk());
         frame.setVisible(true);
      }
   }