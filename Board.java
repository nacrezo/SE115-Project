import java.util.Random;

public class Board {
	
	DeckOfCards deckOfCards = new DeckOfCards();

    public Card[] dealBoard() {
    Card[] board = new Card[4];

        for(int i = 8; i < 12; i++) {
            board[i-8] = DeckOfCards.cuttedDeck[i];
        }
        return board;
    }

    public Card[] throwUser(int choice) {
        Card[] throw_user = new Card[4];

        throw_user[0] = deckOfCards.dealUser()[choice-1];
        return throw_user;
    }

    public Card[] throwOpponent(int random) {
        Card[] throw_opponent = new Card[4];
		
        throw_opponent[0] = deckOfCards.dealOpponent()[random];
        return throw_opponent;
    }
}