public class Rectangle extends Shape
{
	private double height, base;
	public Rectangle(double x, double y)
	{
		height=x;
		base=y;
		
	}
	public double findHeight()
	{
		return height;
	}
	public double findBase()
	{
		return base;
	}
	public void setHeight(double x)
	{
		height=x;
	}
	public void setBase(double y)
	{
		base=y;
	}
	public double findArea()
	{
		return (base*height);
	}
	public double findPerimeter()
	{
		return (base+base+height+height);
	}
	public double findDiagonal()
	{
		return(Math.sqrt(base*base+height*height));
	}
}