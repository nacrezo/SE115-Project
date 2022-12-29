import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        DeckOfCards deckOfCards = new DeckOfCards();
        Board boards = new Board();
        int num_choice = 0;
        int random_num = r.nextInt(4);
        int cutPoint;

        deckOfCards.shuffle();
        for (int i = 0; i < 52; i++) {
            System.out.print(DeckOfCards.deck[i]);
        }
        System.out.println();

        boolean a = true;
        while (a) {
            System.out.println(" Enter a cut point (1-52) ");
            try {
                String name = sc.nextLine();
                cutPoint = Integer.parseInt(name);
                deckOfCards.cut(cutPoint);
                a = false;

            } catch (Exception e) {
                System.err.println("error !");
            }
        }

        System.out.println("Complete deck:");

        for (int i = 0; i < 52; i++) {
            System.out.print(deckOfCards.cuttedDeck[i]);
        }

        System.out.println(" ");
        System.out.println("User's cards:");
        deckOfCards.setUser(deckOfCards.dealUser(1));
        for (int i = 0; i < 4; i++) {
            System.out.println(deckOfCards.getUser()[i].toString());
        }

        System.out.println("Cards on board:");

        for (int i = 0; i < 4; i++) {
            System.out.println(boards.dealBoard()[i]);
        }

            for (int i = 4; i < 12; i++) {

                if (i % 2 == 0) {
                    boolean b = true;
                    while (b) {
                        System.out.println("Choose a card to throw (1-4)");
                        try {
                            String name = sc.nextLine();
                            num_choice = Integer.parseInt(name);
                            System.out.println(deckOfCards.dealUser(1)[num_choice - 1]);
                            b = false;

                        } catch (Exception e) {
                            System.err.println("error !");
                        }
                    }
                }

                if (i % 2 != 0) {
                    System.out.println("Opponent is choosing a card...");
                    random_num = r.nextInt(4);
                    System.out.println(deckOfCards.dealOpponent(1)[random_num]);
                }

                /* if (i % 2 == 0) {
                    if (deckOfCards.dealUser(1)[num_choice - 1].getFace().equals(boards.board(num_choice, random_num)[0].getFace())) {
                        for (int j = 0; j < i + 1; j++) {
                            boards.accumulated_cards_user[j] = boards.board(num_choice, random_num)[j];
                        }
                        System.out.println("Cards on board:");
                        System.out.println(boards.board[i + 1]);

                    } else {
                        System.out.println("Cards on board:");
                        for (int j = 0; j < i + 1; j++) {
                            System.out.println(boards.board[j]);
                        }
                    }
                }
                */
                if (i % 2 == 0) {
                    boards.board[i] = deckOfCards.dealUser(1)[num_choice - 1];
                } else {
                    boards.board[i] = deckOfCards.dealOpponent(1)[random_num];
                }
            }

            System.out.println("User's cards:");
            deckOfCards.setUser(deckOfCards.dealUser(2));
            for (int i = 0; i < 4; i++) {
                System.out.println(deckOfCards.getUser()[i].toString());
            }


            for (int i = 0; i < 4; i++) {
                deckOfCards.setOpponent(deckOfCards.dealOpponent(2));
            }

            for (int i = 12; i < 20; i++) {

                boolean c = true;
                while (c) {
                    System.out.println("Choose a card to throw (1-4)");
                    try {
                        String name = sc.nextLine();
                        num_choice = Integer.parseInt(name);
                        System.out.println(deckOfCards.dealUser(2)[num_choice - 1]);
                        c = false;

                    } catch (Exception e) {
                        System.err.println("error !");
                    }
                }

                if (i % 2 != 0) {
                    System.out.println("Opponent is choosing a card...");
                    random_num = r.nextInt(4);
                    System.out.println(deckOfCards.dealOpponent(2)[random_num]);
                }

                /*
                if (i % 2 == 0) {
                    if (deckOfCards.dealUser(2)[num_choice - 1].getFace().equals(boards.board(num_choice, random_num)[0].getFace())) {
                        for (int j = 12; j < i + 1; j++) {
                            boards.accumulated_cards_user[j] = boards.board(num_choice, random_num)[j];
                        }
                        System.out.println("Cards on board:");
                        System.out.println(boards.board[i + 1]);

                    } else {
                        System.out.println("Cards on board:");
                        for (int j = 0; j < i + 1; j++) {
                            System.out.println(boards.board[j]);
                        }
                    }
                }
                 */

                if (i%2==0) {
                    boards.board[i] = deckOfCards.dealUser(2)[num_choice-1];
                } else {
                    boards.board[i] = deckOfCards.dealOpponent(2)[random_num];
                }
            }

            System.out.println("User's cards:");
            deckOfCards.setUser(deckOfCards.dealUser(3));
            for (int i = 0; i < 4; i++) {
            System.out.println(deckOfCards.getUser()[i].toString());
            }


            for (int i = 0; i < 4; i++) {
            deckOfCards.setOpponent(deckOfCards.dealOpponent(3));
            }

            for (int i = 20; i < 28; i++) {

                boolean d = true;
                while (d) {
                    System.out.println("Choose a card to throw (1-4)");
                    try {
                        String name = sc.nextLine();
                        num_choice = Integer.parseInt(name);
                        System.out.println(deckOfCards.dealUser(4)[num_choice - 1]);
                        d = false;

                    } catch (Exception e) {
                        System.err.println("error !");
                    }
                }

                if (i % 2 != 0) {
                    System.out.println("Opponent is choosing a card...");
                    random_num = r.nextInt(4);
                    System.out.println(deckOfCards.dealOpponent(3)[random_num]);
                }

                /*
                if (i % 2 == 0) {
                    if (deckOfCards.dealUser(3)[num_choice - 1].getFace().equals(boards.board(num_choice, random_num)[0].getFace())) {
                        for (int j = 20; j < i + 1; j++) {
                            boards.accumulated_cards_user[j] = boards.board(num_choice, random_num)[j];
                        }
                        System.out.println("Cards on board:");
                        System.out.println(boards.board[i + 1]);

                    } else {
                        System.out.println("Cards on board:");
                        for (int j = 0; j < i + 1; j++) {
                            System.out.println(boards.board[j]);
                        }
                    }
                }
                */

                if (i%2==0) {
                    boards.board[i] = deckOfCards.dealUser(3)[num_choice-1];
                } else {
                    boards.board[i] = deckOfCards.dealOpponent(3)[random_num];
                }
            }

                System.out.println("User's cards:");
                deckOfCards.setUser(deckOfCards.dealUser(4));
                for (int i = 0; i < 4; i++) {
                System.out.println(deckOfCards.getUser()[i].toString());
                }


                for (int i = 0; i < 4; i++) {
                deckOfCards.setOpponent(deckOfCards.dealOpponent(4));
                }

                for (int i = 28; i < 36; i++) {

                boolean f = true;
                while (f) {
                    System.out.println("Choose a card to throw (1-4)");
                    try {
                        String name = sc.nextLine();
                        num_choice = Integer.parseInt(name);
                        System.out.println(deckOfCards.dealUser(1)[num_choice - 1]);
                        f = false;

                    } catch (Exception e) {
                        System.err.println("error !");
                    }
                }

                if (i % 2 != 0) {
                    System.out.println("Opponent is choosing a card...");
                    random_num = r.nextInt(4);
                    System.out.println(deckOfCards.dealOpponent(4)[random_num]);
                }

                /*
                if (i % 2 == 0) {
                    if (deckOfCards.dealUser(4)[num_choice - 1].getFace().equals(boards.board(num_choice, random_num)[0].getFace())) {
                        for (int j = 28; j < i + 1; j++) {
                            boards.accumulated_cards_user[j] = boards.board(num_choice, random_num)[j];
                        }
                        System.out.println("Cards on board:");
                        System.out.println(boards.board[i + 1]);

                    } else {
                        for (int j = 0; j < i + 1; j++) {
                            System.out.println(boards.board[j]);
                        }
                    }
                }
                */

                if (i%2==0) {
                    boards.board[i] = deckOfCards.dealUser(4)[num_choice-1];
                } else {
                    boards.board[i] = deckOfCards.dealOpponent(4)[random_num];
                }
            }

                System.out.println("User's cards:");
                deckOfCards.setUser(deckOfCards.dealUser(5));
                for (int i = 0; i < 4; i++) {
                System.out.println(deckOfCards.getUser()[i].toString());
                }


                for (int i = 0; i < 4; i++) {
                deckOfCards.setOpponent(deckOfCards.dealOpponent(5));
                }

                for (int i = 36; i < 44; i++) {

                boolean g = true;
                while (g) {
                    System.out.println("Choose a card to throw (1-4)");
                    try {
                        String name = sc.nextLine();
                        num_choice = Integer.parseInt(name);
                        System.out.println(deckOfCards.dealUser(5)[num_choice - 1]);
                        g = false;

                    } catch (Exception e) {
                        System.err.println("error !");
                    }
                }

                if (i % 2 != 0) {
                    System.out.println("Opponent is choosing a card...");
                    random_num = r.nextInt(4);
                    System.out.println(deckOfCards.dealOpponent(5)[random_num]);
                }

                /*
                if (i % 2 == 0) {
                    if (deckOfCards.dealUser(5)[num_choice - 1].getFace().equals(boards.board(num_choice, random_num)[0].getFace())) {
                        for (int j = 36; j < i + 1; j++) {
                            boards.accumulated_cards_user[j] = boards.board(num_choice, random_num)[j];
                        }
                        System.out.println("Cards on board:");
                        System.out.println(boards.board[i + 1]);

                    } else {
                        System.out.println("Cards on board:");
                        for (int j = 0; j < i + 1; j++) {
                            System.out.println(boards.board[j]);
                        }
                    }
                }
                 */

                if (i%2==0) {
                    boards.board[i] = deckOfCards.dealUser(5)[num_choice-1];
                } else {
                    boards.board[i] = deckOfCards.dealOpponent(5)[random_num];
                }
            }

                System.out.println("User's cards:");
                deckOfCards.setUser(deckOfCards.dealUser(6));
                for (int i = 0; i < 4; i++) {
                System.out.println(deckOfCards.getUser()[i].toString());
                }


                for (int i = 0; i < 4; i++) {
                    deckOfCards.setOpponent(deckOfCards.dealOpponent(6));
                }

            for (int i = 44; i < 52; i++) {

                boolean k = true;
                while (k) {
                    System.out.println("Choose a card to throw (1-4)");
                    try {
                        String name = sc.nextLine();
                        num_choice = Integer.parseInt(name);
                        System.out.println(deckOfCards.dealUser(6)[num_choice - 1]);
                        k = false;

                    } catch (Exception e) {
                        System.err.println("error !");
                    }
                }

                if (i % 2 != 0) {
                    System.out.println("Opponent is choosing a card...");
                    random_num = r.nextInt(4);
                    System.out.println(deckOfCards.dealOpponent(6)[random_num]);
                }

                /*
                if (i % 2 == 0) {
                    if (deckOfCards.dealUser(6)[num_choice - 1].getFace().equals(boards.board(num_choice, random_num)[0].getFace())) {
                        for (int j = 44; j < i + 1; j++) {
                            boards.accumulated_cards_user[j] = boards.board(num_choice, random_num)[j];
                        }
                        System.out.println("Cards on board:");
                        System.out.println(boards.board[i + 1]);

                    } else {
                        System.out.println("Cards on board:");
                        for (int j = 0; j < i + 1; j++) {
                            System.out.println(boards.board[j]);
                        }
                    }
                }
                 */

                if (i%2==0) {
                    boards.board[i] = deckOfCards.dealUser(6)[num_choice-1];
                } else {
                    boards.board[i] = deckOfCards.dealOpponent(6)[random_num];
                }
            }

                System.out.println("User's point:");
                System.out.println(boards.userPoint(boards.accumulated_cards_user));


                System.out.println("Opponent's point:");
                System.out.println(boards.opponentPoint(boards.accumulated_cards_opponent));

                System.out.println("Game Over !");
            }
        }