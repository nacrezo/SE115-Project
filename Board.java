public class Board {

    DeckOfCards deckOfCards = new DeckOfCards();

    public Card[] dealBoard() {
        Card[] board = new Card[4];

        for(int i = 0; i < 4; i++) {
            board[i] = DeckOfCards.cuttedDeck[i];
        }
        return board;
    }

    public Card[] throwUser(int choice) {
        Card[] throw_user = new Card[24];

        for (int i = 0; i < 4; i++) {
            throw_user[i] = deckOfCards.dealUser(1)[choice - 1];
        }
        return throw_user;
    }

    public Card[] throwOpponent(int random) {
        Card[] throw_opponent = new Card[24];

        for (int i = 0; i < 4; i++) {
            throw_opponent[i] = deckOfCards.dealOpponent(1)[random];
        }
        return throw_opponent;
    }
}