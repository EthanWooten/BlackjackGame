/**
 * Insert Header Text Here
 */


public class Dealer extends Player
{
	//define a deck of cards
   private Deck deck;
   

	public Dealer() {
      super();
      deck = new Deck();
	}

	public void  shuffle()
	{
	   //shuffle the deck
      deck.shuffle();
	}

	public Card  deal(){
	   return deck.nextCard();
	}
	
	public int numCardsLeftInDeck()
	{
		return deck.numCardsLeft();
	}

	public boolean hit()
	{
	   return getHandValue() < 17;
    }
}








