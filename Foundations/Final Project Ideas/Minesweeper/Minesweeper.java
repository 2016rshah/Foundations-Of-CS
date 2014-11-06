//Name______________________________ Date_____________
   import java.awt.*;
   import java.awt.event.*;
   import javax.swing.*;
	
   public class Minesweeper extends JPanel
   {
      private BButtons[][] board;
      //private boolean[][] matrix, enabled;
		public int z, safes, x, y;
      private JLabel label;
      private JButton reset;
		private Font andalus;
      public Minesweeper()
      {
         setLayout(new BorderLayout());
			andalus = new Font("Andalus", Font.BOLD, 40);
			x = Integer.parseInt(JOptionPane.showInputDialog("How many rows?"));
			y = Integer.parseInt(JOptionPane.showInputDialog("How many cols?"));

      
         JPanel north = new JPanel();
         north.setLayout(new FlowLayout());
         add(north, BorderLayout.NORTH);
			
         label = new JLabel("Welcome to Minesweeper");
			//label.setFont(new Font("Arial", Font.BOLD, 28));
			north.add(label);
      
         JPanel center = new JPanel();
         center.setLayout(new GridLayout(x,y));
         add(center, BorderLayout.CENTER);
      
         board = new BButtons[x][y];
         //matrix = new boolean[10][10];
			
         for(int r = 0; r < board.length; r++)
            for(int c = 0; c < board[0].length; c++)
            {
               board[r][c] = new BButtons(false, true);
               board[r][c].setBackground(Color.blue);
               board[r][c].addMouseListener( new Handler1(r, c) );
               center.add(board[r][c]);
            }
//       	for(int r = 0; r<10; r++)
// 				for(int c = 0; c<10; c++)
// 				{
// 					matrix[r][c] = false;
// 				}
         reset = new JButton("Play Again");
			         reset.addActionListener( new Handler2() );
         reset.setEnabled(false);
         add(reset, BorderLayout.SOUTH);

      	z = Integer.parseInt(JOptionPane.showInputDialog("How many bombs would you like?"));
         placeMines(x, y, z);

      }
      private void placeMines(int a, int b, int r)
      {
    		for(int i = r; i>0; i--)
			{
				int x = (int)(Math.random() *(a-1) +1);
				int y = (int)(Math.random() *(b-1) +1);
				board[x][y].setbomb(true);
				
				System.out.println(x+ " " +y);
			}				
		}
		private class Handler1 implements MouseListener
		{
			private int myRow, myCol;
         public Handler1(int r, int c)
         {

				myRow = r;
				myCol = c;
         }
			
			public int findAB()
			{
				int bombs = 0;
				if(myRow>0 && myCol>0 && myRow<(x-1) && myCol<(y-1))
				{
					for(int i = myRow -1; i<=myRow+1; i++)
					{
						for(int j = myCol-1; j<=myCol+1; j++)
						{
							if(board[i][j].getbomb())
							{
								bombs++;
							}
						}
					}
				}
				else if(myRow==0 && myCol == 0)
				{
					for(int i = myRow; i<=myRow+1; i++)
					{
						for(int j = myCol; j<=myCol+1; j++)
						{
							if(board[i][j].getbomb())
							{
								bombs++;
							}
						}
					}
				}
				else if(myRow == (x-1) && myCol == (y-1))
				{
					for(int i = myRow -1; i<=myRow; i++)
					{
						for(int j = myCol-1; j<=myCol; j++)
						{
							if(board[i][j].getbomb())
							{
								bombs++;
							}
						}
					}
				}
				else if(myRow == 0 && myCol == (y-1))
				{
					for(int i = myRow; i<=myRow+1; i++)
					{
						for(int j = myCol-1; j<=myCol; j++)
						{
							if(board[i][j].getbomb())
							{
								bombs++;
							}
						}
					}
				}
				else if(myRow == (x-1) && myCol == 0)
				{
					for(int i = myRow -1; i<=myRow; i++)
					{
						for(int j = myCol; j<=myCol+1; j++)
						{
							if(board[i][j].getbomb())
							{
								bombs++;
							}
						}
					}
				}
				else if(myRow == 0)
				{
					for(int i = myRow; i<=myRow+1; i++)
					{
						for(int j = myCol-1; j<=myCol+1; j++)
						{
							if(board[i][j].getbomb())
							{
								bombs++;
							}
						}
					}
				}
				else if(myCol ==0)
				{
					for(int i = myRow -1; i<=myRow+1; i++)
					{
						for(int j = myCol; j<=myCol+1; j++)
						{
							if(board[i][j].getbomb())
							{
								bombs++;
							}
						}
					}
				}
				else if(myRow ==(x-1))
				{
					for(int i = myRow -1; i<=myRow; i++)
					{
						for(int j = myCol-1; j<=myCol+1; j++)
						{
							if(board[i][j].getbomb())
							{
								bombs++;
							}
						}
					}
				}
				else if(myCol == (y-1))
				{
					for(int i = myRow -1; i<=myRow+1; i++)
					{
						for(int j = myCol-1; j<=myCol; j++)
						{
							if(board[i][j].getbomb())
							{
								bombs++;
							}
						}
					}
				}

				return bombs;

				
			}
			public void mouseExited(MouseEvent e){ }
			public void mouseEntered(MouseEvent e){}
			public void mouseReleased(MouseEvent e){}
			public void mousePressed(MouseEvent e){}
			public void mouseClicked(MouseEvent e)
			{
				if(board[myRow][myCol].getenabled())
				{
					if(e.isMetaDown())
					{
						board[myRow][myCol].setForeground(Color.red);
						board[myRow][myCol].setFont(andalus);
						board[myRow][myCol].setText("!");
					}
					else
					{
						
						if(board[myRow][myCol].getbomb())
						{
							label.setText("Sorry, you lose");
							board[myRow][myCol].setBackground(Color.red);
							for(int i = 0; i<board.length; i++)
							{
								for(int j = 0; j<board[0].length; j++)
								{
									if(board[i][j].getbomb())
									{
										board[i][j].setBackground(Color.red);
									}
									else
									{
										
										board[i][j].setBackground(Color.white);
										
									}
									
								}
							}
							reset.setEnabled(true);
						}
						else
						{
							board[myRow][myCol].setBackground(Color.white);
							board[myRow][myCol].setForeground(Color.black);
							board[myRow][myCol].setFont(andalus);
							board[myRow][myCol].setText("" + findAB());
							board[myRow][myCol].setenabled(false);
							safes++;
							//System.out.println(myRow + " " + myCol);
						}
						if(safes == (100 - z))
						{
							label.setText("Congrats, you won!");
							for(int i = 0; i<board.length; i++)
							{
								for(int j = 0; j<board[0].length; j++)
								{
									if(board[i][j].getbomb())
									{
										board[i][j].setBackground(Color.red);
									}
									else
									{
										board[i][j].setBackground(Color.green);
									}
								}
							} 
							reset.setEnabled(true);
							
						}
					}
				}	
			}
			
			
				
		}
		private class Handler2 implements ActionListener
		{
			public void actionPerformed(ActionEvent e)
			{
				for(int i =0; i<board.length; i++)
				{
					for(int j = 0; j<board[0].length; j++)
					{
						board[i][j].setenabled(true);
						board[i][j].setBackground(Color.blue);
						board[i][j].setText("");
						board[i][j].setbomb(false);
						
						label.setText("Welcome to Minesweeper");
					}
				}
				safes =0;
				placeMines(x, y, z);
				
			}
			
			
		}
	}