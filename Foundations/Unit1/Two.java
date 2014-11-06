import edu.fcps.Digit;
public class Two extends Digit
{
	public Two (int x, int y)
	{
		super(x,y);
	}
	public void display()
	{
		segment1_On();
		segment2_On();
		segment3_Off();
		segment4_On();
		segment5_On();
		segment6_Off();
		segment7_On();
	}
}