package tw.design.java7;

public class Card {

	private String face; // face of the card(Ace,Deuce...)
	private String suit; // suit of the card(heart,diamonds)

	public Card(String face, String suit) {
		super();
		this.face = face;
		this.suit = suit;
	}

	@Override
	public String toString() {
		return  face+" of "+suit;
	}
	

}
