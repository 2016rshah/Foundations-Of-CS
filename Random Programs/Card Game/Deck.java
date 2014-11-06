import java.util.*;
import java.io.*;
import javax.swing.*;
import java.lang.Math;

public class Deck
{
	public Card[] deck;
	public int c; 
	
	public Deck()
	{
		
		deck = new Card[52];
		c = deck.length-1;
		int x = 0;
        for (int a=1; a<=4; a++)
        {
            for (int b=1; b<=13; b++)
             {
               deck[x] = new Card(a,b);
               x++;
             }
        }
		
	}
	public Card draw()
	{
		int index = (int)((Math.random()*c)+1);
		
		Card temp = deck[index];
		deck[index] = deck[c];
		deck[c]= temp;
		deck[c] = null;
		c--;
		
		return temp;
	}
	public int getNumCards()
	{
		return c;
	}
	public Card getCard(int i)
	{
		return deck[i];
	}
}

// import java.util.Random;
// public class Deck {
//     private Card[] cards;
//     int i;
// 
//     Deck()
//     {
//         i=51;
//         cards = new Card[52];
//         int x=0;
//         for (int a=0; a<=3; a++)
//         {
//             for (int b=0; b<=12; b++)
//              {
//                cards[x] = new Card(a,b);
//                x++;
//              }
//         }
//     }
// 
//     public Card drawFromDeck()
//     {
//         Random generator = new Random();
//         int index=0;
// 
//         do {
//             index = generator.nextInt( 52 );
//         } while (cards[index] == null);
// 
//         i--;
//         Card temp = cards[index];
//         cards[index]= null;
//         return temp;
//     }
// 
//     public int getTotalCards()
//     {
//         return i;
//     }
// }
// 