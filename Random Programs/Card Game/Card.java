import java.util.*;
import java.io.*;
import javax.swing.*;

public class Card
{
	private int mySuit, myRank;
	
	public Card(int s, int r)
	{
		mySuit = s;
		myRank = r;
	}
	public int getSuit()
	{
		return mySuit;
	}
	public int getRank()
	{
		return myRank;
	}
	public void setSuit(int s)
	{
		 mySuit= s;
	}
	public void setRank(int r)
	{
		myRank = r;
	}
	public String toString()
	{
		
		String s = (mySuit + ", "+myRank);
		return s;
	}
}