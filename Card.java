public class Card {
	private String face;
	private String suit;
	
	public Card(String a, String b) {
		face = a;
		suit = b;
	}
	
	public String getA() { return face; }
	public String getB() { return suit; }
	
	public String toString(){
		return face + suit;
	}
}
		
		