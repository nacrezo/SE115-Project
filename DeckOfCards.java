import java.util.Random;

public class DeckOfCards {
	Random r = new Random();
	private Card[] deck;
	private int current_card;

	public DeckOfCards() {
		current_card = 0;
		
		String[] faces = { "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K" };
		
		String[] suits = { "u0003", "u0004", "u0005", "u0006" };
		
        deck = new Card[52];
       
        for(int i = 0; i<deck.length; i++) {
        deck[i] = new Card(faces[i%13], suits[i/13]);
		}
	}

    public void shuffle() {
		
		current_card = 0;
	   
	   for(int first_card = 0; first_card < deck.length; first_card++) {
		   int second_card = r.nextInt(52);
		   
		   Card temp_card = deck[first_card];
	       deck[first_card] = deck[second_card];
		   deck[second_card] = temp_card;
	    }
	}
	
	public Card dealCard() {
		if(current_card < deck.length) {
			return deck[current_card++];
		} else {
			return null;
		}
    }
}
  
		   
	