import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        DeckOfCards deckOfCards = new DeckOfCards();
        Board boards = new Board();
        int num_choice;
        int random_num;

        deckOfCards.shuffle();
        for(int i = 0; i < 52; i++) {
            System.out.print(DeckOfCards.deck[i]);
        }
        System.out.println();

        while(true) {
            System.out.println(" Enter a cut point (1-52) ");
            try {
                int cutPoint = sc.nextInt();
                deckOfCards.cut(cutPoint);

            } catch(Exception e) {
                System.err.println("error !");
                continue;
            }
            break;
        }
        System.out.println("Complete deck:");

        for(int i = 0; i < 52; i++) {
            System.out.print(deckOfCards.cuttedDeck[i]);
        }

        System.out.println(" ");
        System.out.println("User's cards:");

        for(int i = 0; i < 4; i++) {
            System.out.println(deckOfCards.dealUser(1)[i]);
        }

        System.out.println("Opponent's cards:");

        for(int i = 0; i < 4; i++) {
            System.out.println(deckOfCards.dealOpponent(1)[i]);
        }

        System.out.println("Cards on board:");

        for(int i = 0; i < 4; i++) {
            System.out.println(boards.dealBoard()[i]);
        }

        while(true) {
            System.out.println("Choose a card to throw (1-4)");

            try {
                num_choice = sc.nextInt();
                boards.throwUser(num_choice);
                System.out.println(boards.throwUser(num_choice)[0]);

            } catch (Exception e) {
                System.err.println("error !");
                continue;
            }
            break;

        }
        random_num = r.nextInt(4);
        boards.throwOpponent(random_num);
        System.out.println(boards.throwOpponent(random_num)[0]);
    }
}
