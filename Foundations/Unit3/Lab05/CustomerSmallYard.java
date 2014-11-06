public class CustomerSmallYard implements Yard
{
	String string = "stuff";
	int integer= 16;
	double decimal = 13.5;	
	public String getFirstName()
	{
		return string;
	}
	public String getLastName()
	{
		return string;
	}
	public int getSize()
	{
		return integer;
	}
	public double getCost()
	{
		return decimal;
	}
	public int compareTo(Yard y)
	{
		return integer;
	}
	public String toString()
	{
		return string;
	}
}