public class CustomerSmallYard implements Yard
{
	String firstName, lastName;
	int size;
	double cost;
	public CustomerSmallYard(String last, String first, int s)
	{
		firstName = first;
		lastName = last;
		size = s;
		cost = .005 * size;
	}	
	public String getFirstName()
	{
		return firstName;
	}
	public String getLastName()
	{
		return lastName;
	}
	public int getSize()
	{
		return size;
	}
	public double getCost()
	{
		return cost;
	}
	public int compareTo(Yard y)
	{
		String s = getLastName();
		if(s.compareTo(y.getLastName())>0)
		{
			return 1;
		}
		else if(s.compareTo(y.getLastName())<0)
		{
			return -1;
		}
		else
		{
			return 0;
		}
		
	}
	public String toString()
	{
		String string = ("The small yard is " + getSize() +" square units, and costs "+getCost());
		System.out.println(string);
		return string;
	}
}