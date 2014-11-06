	//Name______________________________ Date_____________
   import java.awt.*;
   import java.awt.event.*;
   import javax.swing.*;
   public class Battleship extends JPanel
   {
      private JButton[][] board;
      private int[][] matrix;
      private int hits, torpedoes;
      private JLabel label;
      private JButton reset;
      public Battleship()
      {
         setLayout(new BorderLayout());
         hits = 0;
         torpedoes = 50;
      
         JPanel north = new JPanel();
         north.setLayout(new FlowLayout());
         add(north, BorderLayout.NORTH);
			
         label = new JLabel("Welcome to Battleship -- You have "+ torpedoes + " torpedoes.");
			//label.setFont(new Font("Arial", Font.BOLD, 28));
			north.add(label);
      
         JPanel center = new JPanel();
         center.setLayout(new GridLayout(10,10));
         add(center, BorderLayout.CENTER);
      
         board = new JButton[10][10];
         matrix = new int[10][10];
         for(int r = 0; r < 10; r++)
            for(int c = 0; c < 10; c++)
            {
               board[r][c] = new JButton();
               board[r][c].setBackground(Color.blue);
               board[r][c].addActionListener( new Handler1(r, c) );
               center.add(board[r][c]);
            }

         reset = new JButton("Play Again");
			         reset.addActionListener( new Handler2() );
         reset.setEnabled(false);
         add(reset, BorderLayout.SOUTH);
      
         placeShip();
			placeShip();
			placeShip();
			label.setText("Welcome to Battleship -- You have "+ torpedoes + " torpedoes.");
      }
      private void placeShip()
      {
    		int coin = (int) (Math.random() *2 );
			int x = (int) (Math.random() *6);
			int y = (int) (Math.random() *6);
			//board[x][y] = 1;
			if(coin == 1)
			{
				for(int i = y; i<y+4; i++)
				{	
					matrix[x][i] = 1;
				}

			}
			else
			{

				for(int i = x; i<x+4; i++)
				{	
					matrix[i][y] = 1;
				}
			}
			
			     	
				/************************/
         	/*                      */
         	/* Your code goes here. */
         	/*                      */
         	/************************/
      }
      private class Handler1 implements ActionListener
      {
         private int myRow, myCol;
         public Handler1(int r, int c)
         {
            myRow = r;
            myCol = c;
         }
         public void actionPerformed(ActionEvent e)
         {
    			label.setText("Welcome to Battleship -- You have " + torpedoes + " torpedoes.");			
				if(matrix[myRow][myCol] == 1)
				{
					hits++;
					board[myRow][myCol].setBackground(Color.white);
					matrix[myRow][myCol] = 0;
					board[myRow][myCol].setEnabled(false);
				}
				else
				{
					board[myRow][myCol].setBackground(Color.red);
					board[myRow][myCol].setEnabled(false);
					
				}
							
				torpedoes = torpedoes -1;
				if(torpedoes == 0)
				{
					label.setText("You Lose. Press Play Again");
					for(int i =0; i<board.length; i++)
					{
						for(int j = 0; j<board[0].length; j++)
						{
							board[i][j].setEnabled(false);
							if(matrix[i][j] == 1)
							{
								board[i][j].setBackground(Color.white);
							}
							else
							{
								board[i][j].setBackground(Color.red);
							}
						}
					}
				
					reset.setEnabled(true);
				}
				
				if(hits == 12)
				{
					label.setText("Congrats, you win, press Play Again");
					reset.setEnabled(true);
					
				}     	
				/************************/
         	/*                      */
         	/* Your code goes here. */
         	/*                      */
         	/************************/
         }
      }
      private class Handler2 implements ActionListener
      {
         public void actionPerformed(ActionEvent e)
         {
    			torpedoes = 50;
				hits =0;
				for(int i = 0; i<matrix.length; i++)
				{
					for(int j = 0; j<matrix[0].length; j++)
					{
						board[i][j].setBackground(Color.blue);
						board[i][j].setEnabled(true);
						matrix[i][j] = 0;
					}
				}
				label.setText("Welcome to Battleship -- You have "+ torpedoes + " torpedoes.");   
				placeShip();
				placeShip();
				placeShip();
				  	
				/************************/
         	/*                      */
         	/* Your code goes here. */
         	/*                      */
         	/************************/
         }
      }
   }