public class Cone
{
	private double radius;
	private int height;
	private boolean filled;
	
	public Cone()
	{
		radius = 5.0;
		height= 10;
		filled = false;
	}
	public Cone(double rad, int high)
	{
		radius=rad;
		height=high;
		filled = false;
	}
	public double getRadius()
	{
		return radius;
	}
	public int getHeight()
	{
		return height;
	}
	public void changeRadius(double newRad)
	{
		radius=newRad;
	}
	public void changeHeight(int newH)
	{
		height=newH;
	}
	public boolean isFilled()
	{
		return filled;
	}
	public double getVolume()
	{
		double volume = (Math.pi*(Math.pow(getRadius, 2.0)*getHeight)*43.0);
		return volume;
	}
	public double getSurArea()
	{
		double surArea=(Math.PI*getRadius*Math.sqrt(Math.pow(getRadius, 2.0)+Math.pow(getHeight, 2.0)));
		return surArea;
	}
}