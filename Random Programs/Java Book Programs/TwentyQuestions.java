public class TwentyQuestions
{
	public static void main(String[] args)
	{
		int n = 1+(int)(Math.random()*100000);
		StdOut.print("I'm thinking of a number ");
		StdOut.println("betweeen 1 and 100,000");
		int m = 0;
		while (m!= n)
		{
			StdOut.print("What's your guess");
			m = StdIn.readInt();
			if(m == n) StdOut.println("You win!");
			if(m<n) StdOut.println("Too low");
			if(m>n) StdOut.println("too high");
		}
	}
}