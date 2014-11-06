public class Triangle extends Shape
{
	private double side;
	public Triangle(double s)
	{
		side=s;
	}
	public double findSide()
	{
		return side;
	}
	public double findArea()
	{
		double x = (Math.sqrt(3)/4)*side*side; 
		return x;
	}
	public void setSide(double x)
	{
		
		side=x;
	}
	public double findPerimeter()
	{
		return (side*3);
	}
		
}
