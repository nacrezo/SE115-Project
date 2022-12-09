public class Card {
	private String numbers;
	private String shapes;
	
	public Card(String cardNumbers, String cardShapes) {
		numbers = cardNumbers;
		shapes = cardShapes;
	}
	public String toPrint(){
		return "number:" +numbers "shape:" +shapes; 
	}
}
		
		