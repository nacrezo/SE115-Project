public class Board {

    DeckOfCards deckOfCards = new DeckOfCards();
    Card[] board = new Card[12];
    Card[] accumulated_cards_user = new Card[52];
    Card[] accumulated_cards_opponent = new Card[52];

    public Card[] dealBoard() {

        for (int i = 0; i < 4; i++) {
            board[i] = DeckOfCards.cuttedDeck[i];
        }
        return board;
    }

    public Card[] throwUser(int choice) {

        for (int i = 1; i < 7; i++) {
            for (int j = 4; j < board.length; j++) {
                if (j % 2 == 0) {
                    board[j] = deckOfCards.dealUser(i)[choice - 1];
                }
            }
        }
        return board;
    }

    public Card[] throwOpponent(int random) {
        for (int i = 1; i < 7; i++) {
            for (int j = 4; j < board.length; j++) {
                if (j % 2 != 0) {
                    board[j] = deckOfCards.dealOpponent(i)[random];
                }
            }
        }
        return board;
    }
}