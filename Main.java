import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        DeckOfCards deckOfCards = new DeckOfCards();
        Board boards = new Board();
        int num_choice;
        int random_num = r.nextInt(4);

        deckOfCards.shuffle();
        for (int i = 0; i < 52; i++) {
            System.out.print(DeckOfCards.deck[i]);
        }
        System.out.println();

        while (true) {
            System.out.println(" Enter a cut point (1-52) ");
            try {
                int cutPoint = sc.nextInt();
                deckOfCards.cut(cutPoint);

            } catch (Exception e) {
                System.err.println("error !");
                continue;
            }
            break;
        }
        System.out.println("Complete deck:");

        for (int i = 0; i < 52; i++) {
            System.out.print(deckOfCards.cuttedDeck[i]);
        }

        System.out.println(" ");
        System.out.println("Cards on board:");

        for (int i = 0; i < 4; i++) {
            System.out.println(boards.dealBoard()[i]);
        }

        for (int round = 1; round < 7; round++) {

            System.out.println("User's cards:");

            for (int i = 0; i < 4; i++) {
                System.out.println(deckOfCards.dealUser(round)[i]);
            }

            System.out.println("Opponent's cards:");

            for (int i = 0; i < 4; i++) {
                System.out.println(deckOfCards.dealOpponent(round)[i]);
            }

            System.out.println("Choose a card to throw (1-4)");
            num_choice = sc.nextInt();
            System.out.println(deckOfCards.dealUser(round)[num_choice - 1]);


                if (deckOfCards.dealUser(round)[num_choice - 1].getFace().equals(boards.board(num_choice, random_num)[0].getFace())) {
                    for (int i = 0; i < 5; i++) {
                        boards.accumulated_cards_user[i] = boards.board(num_choice, random_num)[i];
                        System.out.print(boards.accumulated_cards_user[i]);
                    }
                }

                if (deckOfCards.dealUser(round)[num_choice - 1].getFace().equals("J")) {
                    for (int i = 0; i < 5; i++) {
                        boards.accumulated_cards_user[i] = boards.board(num_choice, random_num)[i];
                    }
                }

                System.out.println("Cards on board:");

                for (int i = 4; i > -1; i--) {
                    System.out.println(boards.board[i]);
                }

                System.out.println("Opponent is choosing a card...");
                random_num = r.nextInt(4);
                System.out.println(deckOfCards.dealOpponent(round)[random_num]);

                if (deckOfCards.dealOpponent(round)[random_num].getFace() == boards.board(num_choice, random_num)[0].getFace()) {
                    for (int i = 0; i < 5; i++) {
                        boards.accumulated_cards_opponent[i] = boards.board(num_choice, random_num)[i];
                        System.out.print(boards.accumulated_cards_opponent[i]);
                    }
            }

            System.out.println("Cards on board:");

            for (int i = 5; i > -1; i--) {
                System.out.println(boards.board[i]);
            }

            System.out.println("Choose a card to throw (1-4)");
            num_choice = sc.nextInt();
            System.out.println(deckOfCards.dealUser(round)[num_choice - 1]);

            if (deckOfCards.dealUser(round)[num_choice-1].getFace() == boards.board(num_choice, random_num)[0].getFace()) {
                for (int i = 0; i < 6; i++) {
                    boards.accumulated_cards_user[i] = boards.board(num_choice, random_num)[i];
                    System.out.print(boards.accumulated_cards_user[i]);
                }
            }

            System.out.println("Cards on the board:");

            for (int i = 6; i > -1; i--) {
                System.out.println(boards.board[i]);
            }

            System.out.println("Opponent is choosing a card...");
            random_num = r.nextInt(4);
            System.out.println(deckOfCards.dealOpponent(round)[random_num]);

            if (deckOfCards.dealOpponent(round)[random_num].getFace() == boards.board(num_choice, random_num)[0].getFace()) {
                for (int i = 0; i < 4; i++) {
                    boards.accumulated_cards_opponent[i] = boards.board(num_choice, random_num)[i];
                    System.out.print(boards.accumulated_cards_opponent[i]);
                }
            }

            System.out.println("Cards on the board:");

            for (int i = 7; i > -1; i--) {
                System.out.println(boards.board[i]);
            }

            System.out.println("Choose a card to throw (1-4)");
            num_choice = sc.nextInt();
            System.out.println(deckOfCards.dealUser(round)[num_choice - 1]);

            if (deckOfCards.dealUser(round)[num_choice-1].getFace() == boards.board(num_choice, random_num)[0].getFace()) {
                for (int i = 0; i < 5; i++) {
                    boards.accumulated_cards_user[i] = boards.board(num_choice, random_num)[i];
                    System.out.print(boards.accumulated_cards_user[i]);
                }
            }

            System.out.println("Cards on board:");

            for (int i = 8; i > -1; i--) {
                System.out.println(boards.board[i]);
            }

            System.out.println("Opponent is choosing a card...");
            random_num = r.nextInt(4);
            System.out.println(deckOfCards.dealOpponent(round)[random_num]);

            if (deckOfCards.dealOpponent(round)[random_num].getFace() == boards.board(num_choice, random_num)[0].getFace()) {
                for (int i = 0; i < 4; i++) {
                    boards.accumulated_cards_opponent[i] = boards.board(num_choice, random_num)[i];
                    System.out.print(boards.accumulated_cards_opponent[i]);
                }
            }

            System.out.println("Choose a card to throw (1-4)");
            num_choice = sc.nextInt();
            System.out.println(deckOfCards.dealUser(round)[num_choice - 1]);

            if (deckOfCards.dealUser(round)[num_choice-1].getFace() == boards.board(num_choice, random_num)[0].getFace()) {
                for (int i = 0; i < 5; i++) {
                    boards.accumulated_cards_user[i] = boards.board(num_choice, random_num)[i];
                    System.out.print(boards.accumulated_cards_user[i]);
                }
            }

            System.out.println("Cards on board:");

            for (int i = 9; i > -1; i--) {
                System.out.println(boards.board[i]);
            }

            System.out.println("Opponent is choosing a card...");
            random_num = r.nextInt(4);
            System.out.println(deckOfCards.dealOpponent(round)[random_num]);

            if (deckOfCards.dealOpponent(round)[random_num].getFace() == boards.board(num_choice, random_num)[0].getFace()) {
                for (int i = 0; i < 4; i++) {
                    boards.accumulated_cards_opponent[i] = boards.board(num_choice, random_num)[i];
                    System.out.print(boards.accumulated_cards_opponent[i]);
                }
            }
        }
    }
}