public class CustomerLargeYard implements Yard
{
	String firstName, lastName;
	int size;
	double cost;
	public CustomerLargeYard(String last, String first, int s)
	{
		firstName = first;
		lastName = last;
		size = s;
		cost = .003 * size;
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
		String string = ("The large yard is " + getSize() +" square units, and costs "+getCost());
		System.out.println(string);
		return string;
	}
}