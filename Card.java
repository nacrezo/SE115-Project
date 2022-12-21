public class Card {
	private final String face;
	private final String suit;
	
	public Card(String a, String b) {
		face = a;
		suit = b;
	}
	
	public String getA() { return face; }
	public String getB() { return suit; }
	
	public String toString(){
		return suit + face;
	}
}
		
		