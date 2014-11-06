public class Square extends Rectangle
{
	public Square(double s)
	{
		super(s,s);
	}
	public double findSide()
	{
		return findHeight();
	}
	public double findDiagnal()
	{
		return (Math.sqrt((findSide()*findSide())+(findSide()*findSide())));
	}
	public void setSide(double x)
	{
		setHeight(x);
	}
		
}
