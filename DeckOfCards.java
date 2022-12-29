import java.util.Random;

public class DeckOfCards {

    private Random r = new Random();

    public static Card[] deck;
    public static Card[] cuttedDeck = new Card[52];
    public static Card[] user = new Card[24];
    public static Card[] opponent = new Card[24];

    public static Card[] getDeck() {
        return deck;
    }

    public static void setDeck(Card[] deck) {
        DeckOfCards.deck = deck;
    }

    public static Card[] getCuttedDeck() {
        return cuttedDeck;
    }

    public static void setCuttedDeck(Card[] cuttedDeck) {
        DeckOfCards.cuttedDeck = cuttedDeck;
    }

    public static Card[] getUser() {
        return user;
    }

    public static void setUser(Card[] user) {
        DeckOfCards.user = user;
    }

    public static Card[] getOpponent() {
        return opponent;
    }

    public static void setOpponent(Card[] opponent) {
        DeckOfCards.opponent = opponent;
    }

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

    public Card[] dealUser(int round) {

        for (int i = 0; i < 4; i++) {
            user[i] = cuttedDeck[2*i+4+(round-1)*8];
        }

        return user;
    }

        public Card[] dealOpponent(int round) {

            for (int i = 0; i < 4; i++) {
                opponent[i] = cuttedDeck[2*i+5+(round-1)*8];
            }

            return opponent;
        }
    }
		   
	