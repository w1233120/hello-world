package tw.design.java7;

import java.util.Random;

public class DeckOfCard {
	private Card[] deck; // array of Card objext
	private int currentCard; // index if next Card to be dealt
	private static final int NUMBER_OF_CARDS = 52; // constant # of Cards
	
	private static final Random randomNumbers = new Random();

	public DeckOfCard() {
		String[] face = { "Ace", "Deuce", "Three", "Four", "Five"
				, "Six", "Seven", "Eight", "Nine", "Ten", "Jack",
				"Queen", "King" };
		
		String[] suit = { "Hearts", "Diamond", "Clubs", "Spades" };
		
		deck = new Card[NUMBER_OF_CARDS];
		
		currentCard = 0;
		
		for(int count = 0;count<deck.length;count++){
			deck[count] = new Card(face[count%13], suit[count/13]);
		}
	}
	
	public void shuffle(){
		
		currentCard = 0;
		
		for(int first = 0;first<deck.length;first++){
			
			int second = randomNumbers.nextInt(NUMBER_OF_CARDS);
			
			
			Card temp = deck[first];
			deck[first] = deck[second];
			 deck[second] = temp;
		}
	}
	
	public Card dealCard(){
		if(currentCard<deck.length){
			return deck[currentCard++];
		}else{
			return null;
		}
	}

}
