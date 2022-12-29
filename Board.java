public class Board {

    DeckOfCards deckOfCards = new DeckOfCards();
    Card[] board = new Card[52];
    Card[] accumulated_cards_user = new Card[52];
    Card[] accumulated_cards_opponent = new Card[52];

    public Card[] dealBoard() {

        for (int i = 0; i < 4; i++) {
            board[i] = DeckOfCards.cuttedDeck[i];
        }
        return board;
    }

    public Card[] board(int choice, int random) {

        for (int i = 4; i < 12; i++) {
            if (i % 2 == 0) {
                board[i] = deckOfCards.dealUser(1)[choice - 1];
            } else {
                board[i] = deckOfCards.dealOpponent(1)[random];
            }
        }

        for (int i = 12; i < 20; i++) {
            if (i % 2 == 0) {
                board[i] = deckOfCards.dealUser(2)[choice - 1];
            } else {
                board[i] = deckOfCards.dealOpponent(2)[random];
            }
        }

        for (int i = 20; i < 28; i++) {
            if (i % 2 == 0) {
                board[i] = deckOfCards.dealUser(3)[choice - 1];
            } else {
                board[i] = deckOfCards.dealOpponent(3)[random];
            }
        }

        for (int i = 28; i < 36; i++) {
            if (i % 2 == 0) {
                board[i] = deckOfCards.dealUser(4)[choice - 1];
            } else {
                board[i] = deckOfCards.dealOpponent(4)[random];
            }
        }

        for (int i = 36; i < 44; i++) {
            if (i % 2 == 0) {
                board[i] = deckOfCards.dealUser(5)[choice - 1];
            } else {
                board[i] = deckOfCards.dealOpponent(5)[random];
            }
        }

        for (int i = 44; i < 52; i++) {
            if (i % 2 == 0) {
                board[i] = deckOfCards.dealUser(6)[choice - 1];
            } else {
                board[i] = deckOfCards.dealOpponent(6)[random];
            }
        }

        return board;
    }

    public int userPoint (Card[] accumulated_cards_user) {
        int user_point = 0;

        for (int i = 0; i < accumulated_cards_user.length; i++) {
            if (accumulated_cards_user[i] == null) {
                continue;
            } else if (accumulated_cards_user[i].getFace().equals("2") && accumulated_cards_user[i].getSuit().equals("♣")) {
                user_point += 2;
            } else if (accumulated_cards_user[i].getFace().equals("2") && accumulated_cards_user[i].getSuit().equals("♦")) {
                user_point += 3;
            } else {
                user_point++;
            }
        }
        return user_point;
    }

    public int opponentPoint (Card[] accumulated_cards_opponent) {
        int opponent_point = 0;

        for (int i = 0; i < accumulated_cards_opponent.length; i++) {
            if (accumulated_cards_opponent[i] == null) {
                continue;
            } else if (accumulated_cards_opponent[i].getFace().equals("2") && accumulated_cards_opponent[i].getSuit().equals("♣")) {
                opponent_point += 2;
            } else if (accumulated_cards_opponent[i].getFace().equals("10") && accumulated_cards_opponent[i].getSuit().equals("♦")) {
                opponent_point += 3;
            } else {
                opponent_point++;
            }
        }
            return opponent_point;
        }
    }
