import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DeckOfCards deckOfCards = new DeckOfCards();
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < 52; i++) {
            deckOfCards.shuffle();
        }

        System.out.println(" Enter a cut point (1-52) ");
        int cutPoint = sc.nextInt();
        deckOfCards.cut(cutPoint);



        for(int j = 0; j < 52; j++) {
            System.out.println(deckOfCards.dealCard());
        }
    }
}	
		