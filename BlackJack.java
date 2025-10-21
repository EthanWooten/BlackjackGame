/**
 * public class BlackJack
 *  
 * Author:  Ethan Wooten
 * Date:    10/08/25
 * Course:  CS III
 * Period:  4th ( 6...7 )
 *  
 * Summary of file:
 *   - This is the final class of the BlackJack game. Runs a full game of BlackJack agains the A.I. dealer.
 *   - Input whether or not you will hit, and if youu want to play again. Output the BlackJack games.
 *
 */
import static java.lang.System.*;
import java.util.Scanner;

public class BlackJack
{
	//add in Player instance variable
   private Player player;
	//add in Dealer instance variable
   private Dealer dealer;

	public BlackJack()
	{
      player = new Player();
      dealer = new Dealer();
	}

	public void playGame()
	{
      
		Scanner keyboard = new Scanner(System.in);
		char playAgain = 'Y';
      
      while (playAgain == 'Y' || playAgain == 'y')
      {
         Deck BJDeck = new Deck();
         BJDeck.shuffle();
         
         player.resetHand();
         dealer.resetHand();
         //Dealing Cards
         player.addCardToHand( BJDeck.nextCard() );
         dealer.addCardToHand( BJDeck.nextCard() );
         player.addCardToHand( BJDeck.nextCard() );
         dealer.addCardToHand( BJDeck.nextCard() );
         char playerHit = 0;
         while( player.getHandValue() < 21 && playerHit != 'N' )
         {
         
            System.out.println( "Current hand " + player.toString() ); 
            System.out.print( "Do you want to hit? [Y/N] " );
            String tempString = keyboard.next();
            playerHit = tempString.charAt(0);
            if (playerHit == 'Y')
            player.addCardToHand( BJDeck.nextCard() );
         
         }
      
         while (dealer.getHandValue() < 17 )
         {
            dealer.addCardToHand( BJDeck.nextCard() );
         }
      
         System.out.println( "PLAYER \nHand Value :: " + player.getHandValue() + "\nHand Size :: " + player.getHandSize() );
         System.out.println( "Cards in Hand :: " + player + "\n");
         
      
         System.out.println( "DEALER \nHand Value :: " + dealer.getHandValue() + "\nHand Size :: " + dealer.getHandSize() );
         System.out.println( "Cards in Hand :: " + dealer.toString() + "\n");
         
         int dealerTotal = dealer.getHandValue();
         int playerTotal = player.getHandValue();
         
         if(playerTotal>21&&dealerTotal<=21)
		   {
		      System.out.println("\nDealer wins - Player busted!");
            dealer.addWin();
		   }
		   else if(playerTotal<=21&&dealerTotal>21)
		   {
		      System.out.println("\nPlayer wins - Dealer busted!");
            player.addWin();
		   }
		   else if(playerTotal>21&&dealerTotal>21){
		      System.out.println("Both players bust!");
            
		   }
		   else if(playerTotal<dealerTotal){
		      System.out.println("\nDealer has bigger hand value!");
            dealer.addWin();
		   }
		   else{
		      System.out.println("\nPlayer has bigger hand value!");
            player.addWin();
		   }
         
         System.out.println("Dealer has won " + dealer.getWinCount() + " times.");
         System.out.println("Player has won " + player.getWinCount() + " times.\n");
         System.out.print("Do you want to play again? [Y,y,N,n] :: ");
         playAgain = keyboard.next().charAt(0);
         System.out.println();
	   }  
   }
	
	public static void main(String[] args)
	{
		BlackJack game = new BlackJack();
		game.playGame();
      
	}
}