public class StudentHours12to21 implements Hours
{
	String firstName, lastName, roomType, graduating, warning;
	int creditHours;
	double fees;
	public StudentHours12to21(String last, String first, int h, String r, String g)
	{
		firstName = first;
		lastName = last;
		creditHours = h;
		roomType = r;
		graduating = g;
		warning = "";
		if(roomType.equals("A"))
		{
			if(graduating.equals("Y"))
				fees = ((90*creditHours)+ 250 + 400 + 30 + 35);
			else
				fees = ((90*creditHours)+250 +400 + 30);
		}
		else
		{
			if(graduating.equals("Y"))
				fees = ((90*creditHours)+ 200 + 400 + 30 + 35);
			else
				fees = ((90*creditHours)+ 200 +400 + 30); 
		}
	}	
	public String getFirstName()
	{
		return firstName;
	}
	public String getLastName()
	{
		return lastName;
	}
	public int getCreditHours()
	{
		return creditHours;
	}
	public double getFees()
	{
		return fees;
	}
	public String getRoomType()
	{
		return roomType;
	}
	public String getGraduating()
	{
		return graduating;
	}
	public String getWarning()
	{
		return warning;
	}
	public int compareTo(Hours y)
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
		String string = ("Student " + getFirstName() +" has "+getCreditHours() + " credit hours, and is paying " + getFees());
		//System.out.println(string);
		return string;
	}
}