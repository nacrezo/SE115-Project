public class Card {
	private String faces;
	private String suits;
	
	public Card(String a, String b) {
		faces = a;
		suits = b;
	}
	public String getA() {return faces;}
	public void setA(String a) {faces = a;}
	
	public String getB() {return suits;}
	public void setB(String b) {suits = b;}
	
	public String toPrint(){
		return faces + "of" + suits;
	}
}
		
		