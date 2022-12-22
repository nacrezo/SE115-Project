import java.util.Random;

public class DeckOfCards {
	
	private Random r = new Random();
	
	public static Card[] deck;
	public static Card[] cuttedDeck = new Card[52];
	public static Card[] user = new Card[4];
	public static Card[] opponent = new Card[4];
	

	public DeckOfCards() {
		
		String[] faces = { "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K" };
		
		String[] suits = { "♥", "♦", "♣", "♠" };
		
        deck = new Card[52];
       
        for(int i = 0; i<deck.length; i++) {
        deck[i] = new Card(faces[i%13], suits[i/13]);
		}
	}

    public void shuffle() {
	   
	   for(int first_card = 0; first_card < deck.length; first_card++) {
		   int second_card = r.nextInt(52);
		   
		   Card temp_card = deck[first_card];
	       deck[first_card] = deck[second_card];
		   deck[second_card] = temp_card;
	    }
	}
	
	public void cut(int cutPoint) {
		
		for(int i = 0; i < deck.length - cutPoint; i++) {
			cuttedDeck[i] = deck[cutPoint + i];
		}
		
		for(int i = 0; i < cutPoint; i++) {
			cuttedDeck[52 - cutPoint + i] = deck[i];
		}
	}
		
		public Card[] dealUser() {
        Card[] user = new Card[4];

        for(int a = 0; a < 1; a++) {
            for (int i = 0; i < 8; i++) {
                if (i==0) {
                    user[a] = cuttedDeck[i];
                } else if (i==2) {
                    user[a+1] = cuttedDeck[i];
                } else if (i==4) {
                    user[a+2] = cuttedDeck[i];
                } else if (i==6) {
                    user[a+3] = cuttedDeck[i];
                }
            }
        }
        return user;
    }
		
		public Card[] dealOpponent() {
        Card[] opponent = new Card[4];

        for(int a = 0; a < 1; a++) {
            for (int i = 0; i < 8; i++) {
                if (i == 1) {
                    opponent[a] = cuttedDeck[i];
                } else if (i == 3) {
                    opponent[a + 1] = cuttedDeck[i];
                } else if (i == 5) {
                    opponent[a + 2] = cuttedDeck[i];
                } else if (i == 7) {
                    opponent[a + 3] = cuttedDeck[i];
                }
            }
        }

        return opponent;
    }
}
  
		   
	