/**
 * public class Deck
 *  
 * Author:  Ethan Wooten
 * Date:    10/08/2025
 * Course:  CS III
 * Period:  4th
 *  
 * Summary of file:
 *   - This program creates the Deck class that will be used to create a instatiate and shuffle a deck of cards.
 *   - No inputs, Output a shuffled deck, amount of cards, left in deck and top card index location.
 *
 */

import java.util.ArrayList;
import java.util.Collections;

public class Deck
{
	public static final int NUMFACES = 13;
	public static final int NUMSUITS = 4;
	public static final int NUMCARDS = 52;

	public static final String SUITS[] = {"CLUBS","SPADES","DIAMONDS","HEARTS"};

	private int topCardIndex;
	private ArrayList<Card> stackOfCards;

	public Deck ()
	{
		//initialize data - stackOfCards - topCardIndex
		stackOfCards = new ArrayList<>();
      
		
		//loop through suits
      for (String suit : SUITS)
      {
         //loop through faces
         for (int value = 1; value <= 13; value++)
         {
            //add in a new card
            stackOfCards.add( new Card( value, suit));
			
		   }
      }
      
      topCardIndex = stackOfCards.size() - 1;
		
	}

	//modifiers
   public void shuffle ()
	{
		//shuffle the deck
      Collections.shuffle(stackOfCards);
		//reset variables as needed
      topCardIndex = stackOfCards.size() - 1;;
	}

   //accessors
	public int  size ()
	{
		return stackOfCards.size();
	}

	public int numCardsLeft()
	{
		return topCardIndex + 1;
	}

	public Card nextCard()
	{
		return stackOfCards.get(topCardIndex--);
	}

	public String toString()
	{
		return stackOfCards + "   topCardIndex = " + topCardIndex;
	} 
}