/**
 * public class BlackJackCard
 *  
 * Author:  Ethan Wooten
 * Date:    10/06/2025
 * Course:  CS III
 * Period:  4th
 *  
 * Summary of file:
 *   - This program creates the BlackJackCard class that will be used to create a BlackJack game.
 *   - Input Face and Suit, No Outputs yet.
 *
 */

public class BlackJackCard extends Card
{
  	//constructors
   public BlackJackCard(){
   
   }
   
   public BlackJackCard ( int f, String s )
   {
      super ( f, s );
   }
   



  	public int getValue()
  	{
  		//enables you to build the value for the game into the card
  		//this makes writing the whole program a little easier
      if ( super.getValue() == 1 )
         return 11;
      else if ( super.getValue() > 10 )
         return 10;
      else
         return super.getValue();


		
  	}
  	
 }