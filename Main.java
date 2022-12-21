import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DeckOfCards deckOfCards = new DeckOfCards();
        
		deckOfCards.shuffle();
        for(int i = 0; i < 52; i++) {
            System.out.print(DeckOfCards.deck[i]);
        }
		System.out.println();
		
		while(true) {
			System.out.println(" Enter a cut point (1-52) ");
			try {
				Scanner sc = new Scanner(System.in);
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
			System.out.println(deckOfCards.dealUser()[i]);
		}
		
		System.out.println("Opponent's cards:");
		
		for(int i = 4; i < 8; i++) {
			System.out.println(deckOfCards.dealOpponent()[i-4]);
		}
	}
}	
		