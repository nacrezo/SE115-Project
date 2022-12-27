public class Card {
    private String face;
    private String suit;

    public Card(String a, String b) {
        face = a;
        suit = b;
    }

    public String getFace() { return face; }
    public String getSuit() { return suit; }

    public String toString(){
        return suit + face;
    }
}