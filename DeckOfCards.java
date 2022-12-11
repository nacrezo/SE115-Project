import java.util.Random;

public class DeckOfCards {
	Random r = new Random(System.currentTimeMillis());
	private Card[] deck;

	public DeckOfCards() {
		String[] cardNumbers = { "Ace", "Deuce", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King" };
		String[] cardShapes = { "Hearth", "Diamond", "Club", "Spade" };
        deck = new Card[52];
       
        for(int i = 0; i<deck.length; i++) {
        deck[i] = new Card(cardNumbers[i%13], cardShapes[i/13]);
		}
	}

    public void shuffle() {
	   
	   for(int first_card = 0; first_card < deck.length; first_card++) {
		   int second_card = r.nextInt(52);
		   Card temp_card = deck[first_card];
	       deck[first_card] = deck[second_card];
	    }
	}
}
  
		   
	