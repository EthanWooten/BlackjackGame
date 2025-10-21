/**
 * public class Player
 *  
 * Author:  Ethan Wooten
 * Date:    10/08/2025
 * Course:  CS III
 * Period:  4th
 *  
 * Summary of file:
 *   - This program creates the Play class that will be used to create a instatiate and deck of cards with BlackJack values.
 *   - No inputs, Output a deck, amount of cards in the deck, and value of the deck in terms of BlackJack.
 *
 */

import java.util.*;

public class Player
{
   private ArrayList<Card> hand;
   private int winCount;

   public Player ()
   
   {
      hand = new ArrayList<Card>();
      winCount = 0;
      
   }

   public Player (int score)
   {
      hand = new ArrayList<Card>();
      winCount = 0;
   }

   public void addCardToHand( Card temp )
   {
      hand.add( temp);
   }
   
   public void addWin()
   {
      winCount++;
   }

   public void resetHand( )
   {
      hand.clear();
   }

   public  void setWinCount( int numwins )
   {
      winCount = numwins;
   }

   public int getWinCount() { return winCount; }

   public int getHandSize() { return hand.size(); }

   public int getHandValue()
   {
      int total = 0;
      for ( Card c : hand)
      {
         total += c.getValue();
      }
      return total;
   }

   public  boolean  hit( )
   {
      return getHandValue() < 17;
   }

   public String toString()
   {  
      
      String output = "hand = [";
      for (Card c : hand){
      
         output += c + "\n";
      }
      output += "] - " + getHandValue();
      return output;
   }
}
