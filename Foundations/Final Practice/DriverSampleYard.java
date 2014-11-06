//Rushi Shah 

   import javax.swing.JFrame;
	import java.io.*;      //the File class
	import java.util.*;    //the Scanner class
	import javax.swing.*;
	import java.awt.*;
	import java.awt.event.*;
   public class DriverSampleYard
   {
      public static void main(String[] args) throws Exception
      {
         JFrame frame = new JFrame("Yard");
         frame.setSize(250, 200);
         frame.setLocation(200, 100);
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         frame.setContentPane(new PanelSampleYard());
         frame.setVisible(true);

			
      }
   }