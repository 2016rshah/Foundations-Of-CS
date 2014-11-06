import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class SelfAvoidingWalk extends JPanel
{
	public JButton[][] b;
	public SelfAvoidingWalk()
	{

		int N = Integer.parseInt(JOptionPane.showInputDialog("Rows and Columns?"));
		//int T = Integer.parseInt(JOptionPane.showInputDialog("Trials?"));
		setLayout(new GridLayout(N, N));
		b = new JButton[N][N];
		int deadEnds = 0;
		for(int i =0; i<b.length; i++)
		{
			for(int j = 0; j<b[0].length; j++)
			{
				b[i][j] = new JButton();
				add(b[i][j]);
				b[i][j].setBackground(Color.blue);
			}
		}
		//for(int t = 0; t<T; t++)
		//{
			boolean[][] a = new boolean[N][N];
			//b = new JButton[N][N];
			int x = N/2;
			int y = N/2;
			while (x>0 && x<N-1 && y>0 && y<N-1)
			{
				a[x][y] = true;
				b[x][y].setBackground(Color.red);
				if(a[x-1][y] && a[x+1][y] && a[x][y-1] && a[x][y+1])
				{
					deadEnds++;
					break;
				}
				
				double r = Math.random();
				if			(r<0.25 && !a[x-1][y]) x++;
				else if	(r<0.50 && !a[x-1][y]) x--;
				else if	(r<0.75 && !a[x][y-1]) y++;
				else if	(r<1.00 && !a[x][y+1]) y--;
			}
		//}
		System.out.println(100*deadEnds + "% dead ends");
	}
}