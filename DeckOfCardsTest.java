package tw.design.java7;

public class DeckOfCardsTest {

	public static void main(String[] args) {
		
		DeckOfCard newDeckOfCards = new DeckOfCard(); // ��l�ƾ�J�P
		newDeckOfCards.shuffle(); // �~�P
		// �o�P
		for(int i=1;i<=52;i++){
			
			System.out.printf("  ��%02d�i:%20s",i,newDeckOfCards.dealCard());
			
			if(i%4==0)
				System.out.println();
		}

	}

}
