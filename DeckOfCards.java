import java.util.Random;
import java.util.Scanner;

public class DeckOfCards {
	Random r = new Random();
	private Card[] deck;
	private int current_card;

	public DeckOfCards() {
		current_card = 0;
		
		String[] faces = { "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K" };
		
		String[] suits = { "Hearths", "Diamonds", "Clubs", "Spades" };
		
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
	
	public void cut() {
		
		Scanner sc = new Scanner(System.in);
		int cutPoint = sc.nextInt();
		
		for(int i = 0; i < deck.length - cutPoint; i++) {
			deck[i] = deck[cutPoint + i];
		}
		
		for(int i = 0; i < cutPoint; i++) {
			deck[52 - cutPoint + i] = deck[i];
			deck[i] = null;
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
  
		   
	