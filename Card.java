/**
 * public class Card
 *  
 * Author:  Ethan Wooten
 * Date:    10/06/2025
 * Course:  CS III
 * Period:  4th
 *  
 * Summary of file:
 *   - This program creates the generic Card class that will be used to create a BlackJack game.
 *   - Input Face and Suit, No Outputs yet.
 *
 */

public class Card
{
	public static final String FACES[] = {"ZERO","ACE","TWO","THREE","FOUR",
			"FIVE","SIX","SEVEN","EIGHT","NINE","TEN","JACK","QUEEN","KING"};

	private String suit;
	private int face;

  	//constructors
   public Card() 
   {
      face = 0;
      suit = "";
      
      
   }
   
   public Card ( int f, String su )
   {
      face = f;
      suit = su;
   }
      


	// modifiers
   public void setFace( int f )
   {
      face = f;
   }
   
   public void setSuit (String s)
   {
      suit = s;
   }


  	//accessors

  	public int getValue()
  	{
  		if ( face == 1 )
         return 11;
      else if ( face > 10 )
         return 10;
      else
         return face;
  	}
   public String getSuit(){
      return suit;
   }
 
	public boolean equals(Object obj)
	{
      if ( this.getValue() == ((Card)obj).getValue() && this.getSuit() == ((Card)obj).getSuit() )
         return true;
      else
		   return false;
	}
   
  	//toString
   public String toString(){
      return FACES[face] + " of " + suit + " | value = " + getValue();
   }
  	
 }