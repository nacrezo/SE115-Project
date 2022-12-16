public class Main {
	public static void main(String[] args) {
		
		DeckOfCards deckOfCard = new DeckOfCards();
		
		for(int i = 0; i<52; i++) {
			System.out.println(deckOfCard.dealCard());
		}
	}
}
    		
		