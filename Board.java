import java.util.Random;

public class Board {

    private Random r = new Random();
    public Card[] dealBoard() {
    Card[] board = new Card[4];

        for(int i = 8; i < 12; i++) {
            board[i-8] = DeckOfCards.cuttedDeck[i];
        }
        return board;
    }

    public Card[] throwUser(int chosen_card) {
        Card[] throw_user = new Card[4];

        throw_user[0] = DeckOfCards.user[chosen_card-1];
        return throw_user;
    }

    public Card[] throwOpponent(int random_card) {
        random_card = r.nextInt(4);
        Card[] throw_opponent = new Card[4];
		
        throw_opponent[0] = DeckOfCards.opponent[random_card];
        return throw_opponent;
    }
}