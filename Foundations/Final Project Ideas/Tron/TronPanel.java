import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TronPanel extends JPanel implements FocusListener, KeyListener, ActionListener, MouseListener {

	private MosaicPanel arena;  
	                            
	
	private JLabel message;   

	private Timer timer;  
	
	private final static int ROWS = 60;         // Number of rows in the arena.
	private final static int COLUMNS = 80;      // Number of columns in the arena.
	private final static int BLOCKSIZE = 10;    // Size of each square in the arena-- used only in creating the arena object.
	private final static int BORDER_WIDTH = 5;  // The width of the colored border around the arena.
	
	private final static int UP = 0, LEFT = 1, DOWN = 2, RIGHT = 3, NOT_MOVING = 4; // Constants representing possible directions.
	private int direction, direction2;  // The direction that the "lightcycle" is currently heading, one of the above constants.

	private int currentColumn, currentRow, currentColumn2, currentRow2, jumpCount, jumpCount2, speedCount, speedCount2, right, left; // The current row number and column number where the "lightcycle" is located.
	
	public boolean rightWins, jump, jump2, speed, speed2;
	public FocusEvent v;
	
	/**
	 * The "constructor" for the TronPanel class creates all the components that are
	 * displayed in the panel and adds them to the panel.  It also sets up listening
	 * for events.  The panel listens for mouse events from the label and from the
	 * arena, for focus events from the arena, for action events from the timer, and
	 * for key events from the arena.  (Thus, key events are only processed when the
	 * arena has the input focus.)a
	 */
	public TronPanel() 
	{
		setFocusable(true);
		arena = new MosaicPanel(ROWS, COLUMNS, BLOCKSIZE, BLOCKSIZE, Color.WHITE, BORDER_WIDTH);
		message = new JLabel("To Start, Click the Arena", JLabel.CENTER);
		message.setBackground(Color.LIGHT_GRAY);
		message.setBorder(BorderFactory.createEmptyBorder(5,0,5,0));
		JPanel bottom = new JPanel();
		bottom.setLayout(new BorderLayout());
		bottom.setBackground(Color.LIGHT_GRAY);
		setBackground(Color.DARK_GRAY);
		setLayout(new BorderLayout(3,3));
		bottom.add(message,BorderLayout.CENTER);

		add(bottom, BorderLayout.SOUTH);
		add(arena, BorderLayout.CENTER);
		setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY,3));
		arena.setGroutingColor(null);
		arena.addFocusListener(this);
		arena.addKeyListener(this);
		arena.addMouseListener(this);
		message.addMouseListener(this);
		jumpCount = 3;
		jumpCount2 = 3;
		speedCount = 3;
		speedCount2 = 3;
		right = 0;
		left= 0;
		JOptionPane.showMessageDialog(null,"Use WASD or Arrow Keys. Powerups are C,V and N,M respectively","Instructions",JOptionPane.WARNING_MESSAGE);
		
	}

	/**
	 * This method responds to the action events that are generated by the timer as
	 * long as the game is in progress.  It simply moves the "lightcycle" one square
	 * in the curretnly selected direction.  (It gets "stuck" in the same position
	 * when it hits one of the walls of the arena.)  The square containing the
	 * "lightcycle" is colored with a random color.  Note that if the current
	 * direction is NOT_MOVING, then the light cycle does not move.
	 */
		public void wallCrash(int a, int b)
		{
			if(a<=0 || a>=ROWS-1)
			{
				rightWins = false;
				message.requestFocus();
			}
			if(b<=0 || b>=COLUMNS-1)
			{
				rightWins = false;
				message.requestFocus();
			}
		}
		public void wallCrash2(int a, int b)
		{
			if(a<=0 || a>=ROWS-1)
			{
				rightWins = true;
				message.requestFocus();
			}
			if(b<=0 || b>=COLUMNS-1)
			{
				rightWins = true; 
				message.requestFocus();
			}
		}
		public void crash(int a, int b)
		{
			if(direction!=NOT_MOVING)
			{
			
				//code for collision of right player
				if(arena.getColor(a, b) != null )
				{
					rightWins=false;
					message.requestFocus();
					message.setText("Oh no, right player crashed");
					
				}
			}
		}
		public void crash2(int a, int b)
		{	
			if(direction2!=NOT_MOVING)
			{	
				//code for collision of left player
				if(arena.getColor(a, b) != null)
				{
					
					rightWins=true;
					message.requestFocus();
					message.setText("Oh no, left player crashed");
					
				}
			}
		}
	public void actionPerformed(ActionEvent e) 
	{


		
			//moves both light-cycles
			switch (direction) 
			{
				case UP:
					if (currentRow > 0)
					{
						crash(currentRow-1, currentColumn);
						wallCrash(currentRow-1, currentColumn);
						wallCrash(currentRow-1, currentColumn);
						if(jump)
						{
							currentRow-=5;    // Move up one row, unless already in the top row, number 0.
							jumpCount--;
							jump=false;
						}
						else if(speed)
						{
							for(int i = 0; i<10; i++)
							{
								crash(currentRow-1, currentColumn);
								wallCrash(currentRow-1, currentColumn);
								currentRow--;
								arena.setHSBColor(currentRow,currentColumn, 1, 1, 1);
							}
							speedCount--;
							speed = false;							
						}
						else
							currentRow--;
					}
					
					break;
				case DOWN:
					if (currentRow < ROWS-1)
					{
						crash(currentRow+1, currentColumn);
						wallCrash(currentRow+1, currentColumn);
						wallCrash(currentRow+1, currentColumn);
						if(jump)
						{
							currentRow+=5;   // Move down one row, unless already in the bottom row, number ROWS-1.
							jumpCount--;
							jump = false;
						}
						else if(speed)
						{
							for(int i = 0; i<10; i++)
							{
								currentRow++;
								arena.setHSBColor(currentRow,currentColumn, 1, 1, 1);
								crash(currentRow+1, currentColumn);
								wallCrash(currentRow+1, currentColumn);
							}
							speedCount--;
							speed = false;
						}
						else
							currentRow++;
							
					}
					break;
				case RIGHT:
					if (currentColumn < COLUMNS-1)
					{
						crash(currentRow, currentColumn+1);
						wallCrash(currentRow, currentColumn+1);
						if(jump)
						{
							currentColumn+=5;  // Move right one column, unless already in the rightmost column, number COLUMNS-1.
							jumpCount--;
							jump = false;
						}
						else if(speed)
						{
							for(int i = 0; i<10; i++)
							{
								currentColumn++;
								arena.setHSBColor(currentRow,currentColumn, 1, 1, 1);
								crash(currentRow, currentColumn+1);
								wallCrash(currentRow, currentColumn+1);
							}
							speedCount--;
							speed = false;
						}
						else
							currentColumn++;
					}
					break;
				case LEFT:
					if (currentColumn > 0)
					{
						crash(currentRow, currentColumn-1);
						wallCrash(currentRow, currentColumn-1);
						if(jump)
						{
							currentColumn=currentColumn-5;
							jumpCount--;
							jump = false;
						}
						else if(speed)
						{
							for(int i = 0; i<10; i++)
							{
								currentColumn--;
								arena.setHSBColor(currentRow,currentColumn, 1, 1, 1);
								crash(currentRow, currentColumn-1);
								wallCrash(currentRow, currentColumn-1);
							}
							speedCount--;
							speed = false;
						}
						else
						{
							currentColumn--;  // Move left one column, unless already in the leftmost column, number 0.
						}
					}
					break;
				
			}
			arena.setHSBColor(currentRow,currentColumn, 1, 1, 1);
			switch(direction2)
			{
				case UP:
					if (currentRow2 > 0)
					{
						crash2(currentRow2-1, currentColumn2);
						wallCrash2(currentRow2-1, currentColumn2);
						if(jump2)
						{
							currentRow2-=5;
							jumpCount2--;
							jump2 = false;
						}
						else if(speed2)
						{
							for(int i = 0; i<10; i++)
							{
								currentRow2--;
								arena.setHSBColor(currentRow2,currentColumn2, 1, 0, 1);
								crash2(currentRow2-1, currentColumn2);
								wallCrash2(currentRow2-1, currentColumn2);
							}
							speedCount2--;
							speed2 = false;							
						}
						else
							currentRow2--;    // Move up one row, unless already in the top row, number 0.
					}
					break;
				case DOWN:
					if (currentRow2 < ROWS-1)
					{
						crash2(currentRow2+1, currentColumn2);
						wallCrash2(currentRow2+1, currentColumn2);
						if(jump2)
						{
							currentRow2+=5;
							jumpCount2--;
							jump2 = false;
						}
						else if(speed2)
						{
							for(int i = 0; i<10; i++)
							{
								currentRow2++;
								arena.setHSBColor(currentRow2,currentColumn2, 1, 0, 1);
								crash2(currentRow2+1, currentColumn2);
								wallCrash2(currentRow2+1, currentColumn2);
							}
							speedCount2--;
							speed2 = false;							
						}
						else
						{
							currentRow2++;   // Move down one row, unless already in the bottom row, number ROWS-1.

						}
					}
					break;
				case RIGHT:
					if (currentColumn2 < COLUMNS-1)
					{
						crash2(currentRow2, currentColumn2+1);
						wallCrash2(currentRow2, currentColumn2+1);
						if(jump2)
						{
							currentColumn2+=5;
							jumpCount2--;
							jump2 = false;
						}
						else if(speed2)
						{
							for(int i = 0; i<10; i++)
							{
								currentColumn2++;
								arena.setHSBColor(currentRow2,currentColumn2, 1, 0, 1);
								crash2(currentRow2, currentColumn2+1);
								wallCrash2(currentRow2, currentColumn2+1);
							}
							speedCount2--;
							speed2 = false;							
						}
						else
							currentColumn2++;  // Move right one column, unless already in the rightmost column, number COLUMNS-1.
					}
					break;
				case LEFT:
					if (currentColumn2 > 0)
					{
						crash2(currentRow2, currentColumn2-1);
						wallCrash2(currentRow2, currentColumn2-1);
						if(jump2)
						{
							currentColumn2-=5;
							jumpCount2--;
							jump2 = false;
						}
						else if(speed2)
						{
							for(int i = 0; i<10; i++)
							{
								currentColumn2--;
								arena.setHSBColor(currentRow2,currentColumn2, 1, 0, 1);
								crash2(currentRow2, currentColumn2-1);
								wallCrash2(currentRow2, currentColumn2-1);
							}
							speedCount2--;
							speed2 = false;							
						}
						else
							currentColumn2--;  // Move left one column, unless already in the leftmost column, number 0.
					}
					break;
			}
			arena.setHSBColor(currentRow2,currentColumn2, 1, 0, 1);
		
			
				
			
		
		

	}

	/**
	 * This method is called when the user presses a key on the keyboard (but only if the
	 * arena has the input focus).  If the user presses an arrow key, the current direction
	 * of motion of the light cycle is set to the direction that corresponds to the arrow
	 * (up, down, left, or right).  If the "P" key is pressed, the game is paused (by giving
	 * the input focus to the message component, which indirectly stops the game from running).
s	 */
	public void keyPressed(KeyEvent e) 
	{
		int code = e.getKeyCode();  // This code tells which key was pressed.  The value is one of the 
		                            // virtual keyboard ("VK") constants in the KeyEvent class.
		if(direction!=RIGHT && code == KeyEvent.VK_LEFT)
		{
				direction = LEFT;
		}
		
		if(direction!=LEFT && code == KeyEvent.VK_RIGHT)
			direction = RIGHT;
		else if (direction!=DOWN && code == KeyEvent.VK_UP)
			direction = UP;
		else if (direction !=UP && code == KeyEvent.VK_DOWN)
			direction = DOWN;
		else if (code == KeyEvent.VK_P)
			message.requestFocus();
		else if (jumpCount>0 && code == KeyEvent.VK_M)
			jump=true;
		else if (speedCount>0 && code == KeyEvent.VK_N)
			speed = true;


			
		
		
		int code2 = e.getKeyCode();
		
		if (direction2!= RIGHT && code == KeyEvent.VK_A)
			direction2 = LEFT;
		else if (direction2!=LEFT && code == KeyEvent.VK_D)
			direction2 = RIGHT;
		else if (direction2!=DOWN && code == KeyEvent.VK_W)
			direction2 = UP;
		else if (direction2!=UP && code == KeyEvent.VK_S)
			direction2 = DOWN;
		else if (code == KeyEvent.VK_P)
			message.requestFocus();
		else if (jumpCount2>0 && code == KeyEvent.VK_C)
			jump2 = true;
		else if (speedCount2>0 && code == KeyEvent.VK_V)
			speed2 = true;
			

			
// 		if(e.getKeyCode()==KeyEvent.VK_SPACE)
// 		{
// 			focusGained(v);
// 			System.out.println("works");
// 			
// 		}
		
		
	}

	/**
	 * This method is called when the arena gains focus, which means that it will start
	 * receiving Key events.  When this happens, the game action is turned on (by creating
	 * a timer to drive the game), the color of the arena's border is changed to cyan,
	 * and the text of the message is changed.
	 */
	public void focusGained(FocusEvent v) 
	{
		arena.setBorder(BorderFactory.createLineBorder(Color.CYAN, BORDER_WIDTH));
		arena.fill(null);  // This resets all the squares to black to erase the picture from the previous run.
		currentColumn = COLUMNS/4*3;  // Starting column, 3/4 of the way across the scree.
		currentRow = ROWS/2;          // Starting row, halfway down the screen
		direction = UP;               // Starting direction of motion.
		arena.setColor(currentRow,currentColumn,255,(int)(Math.random()*19),0);  // color first square red
		direction = NOT_MOVING;       // No motion until a direction key is pressed
		currentColumn2 = COLUMNS/4;
		currentRow2 = ROWS/2;
		direction2 = NOT_MOVING;
		arena.setColor(currentRow, currentColumn, (int)(Math.random()*18), 0, 0);
		message.setText("Left: "+left+" "+" "+" "+"Right: "+right);
		jumpCount=3;
		jumpCount2=3;
		jump = false;
		jump2 = false;
		speedCount = 3;
		speedCount2 = 3;
		speed = false;
		speed2 = false;
		
		
		
		
		timer = new Timer(50,this); // timer generates an ActionEvent every 50 milliseconds
		timer.start();
	}

	/**
	 * This method is called when the arena loses focus, which means that it will not
	 * receive Key events.  When this happens, the game is suspended (by turning off 
	 * the timer that drives the game), the color of the arena's border is changed to
	 * gray, and the text of the message is changed.
	 */
	public void focusLost(FocusEvent e) 
	{
		arena.setBorder(BorderFactory.createLineBorder(Color.GRAY, BORDER_WIDTH));
		if (timer != null)
			timer.stop();
		timer = null;
		message.setText("To START, Click the Arena");
		if(rightWins)
		{
			message.setText("Oh no, Left Player crashed");
			right++;
		}
		else
		{
			message.setText("oh no, right player crashed");
			left++;
		}
		if(right>=3)
		{
			JOptionPane.showMessageDialog(null,"RIGHT WINS","GAME OVER",JOptionPane.WARNING_MESSAGE);
			right = 0;
			left = 0;
		}
		else if(left>=3)
		{
			JOptionPane.showMessageDialog(null,"LEFT WINS","GAME OVER",JOptionPane.WARNING_MESSAGE);
			right = 0;
			left = 0;
		}
		
			
	}

	/**
	 * Mouse clicks on the arena and on the message are simply used to move the focus to
	 * the component that was clicked.  (The point of giving the focus to the message is
	 * simply to make the arena lose focus, which causes the game to be paused.)
	 */
	public void mousePressed(MouseEvent e) 
	{
		if (e.getSource() == arena)
			arena.requestFocus();
		else
			message.requestFocus();
	}

	
	// The following subroutines are required by the "KeyListener" and "MouseListener" interfaces,
	// but are not used in this program.  They are defined as subrotines with empty bodies, which
	// means that they do nothing.
	
	public void mouseClicked(MouseEvent e) {}
	public void mouseEntered(MouseEvent e) {}
	public void mouseExited(MouseEvent e) {}
	public void mouseReleased(MouseEvent e) {}
	public void keyReleased(KeyEvent e) {}
	public void keyTyped(KeyEvent e) {}



} // end class TronPanel
