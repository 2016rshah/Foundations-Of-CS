   import java.awt.*;
   import java.awt.event.*;
   import javax.swing.*;
public class BButtons extends JButton
{
	private boolean bomb, enabled;
	
	public BButtons(boolean x, boolean y)
	{
		bomb = x;
		enabled = y;
	}
	public boolean getenabled()
	{
		return enabled;
	}
	public boolean getbomb()
	{
		return bomb;
	}
	public void setenabled(boolean a)
	{
		enabled = a;
	}
	public void setbomb(boolean b)
	{
		bomb = b;
	}
	
}