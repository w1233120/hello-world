package tw.design.java7;

public class DeckOfCardsTest {

	public static void main(String[] args) {
		
		DeckOfCard newDeckOfCards = new DeckOfCard(); // 初始化樸克牌
		newDeckOfCards.shuffle(); // 洗牌
		// 發牌
		for(int i=1;i<=52;i++){
			
			System.out.printf("  第%02d張:%20s",i,newDeckOfCards.dealCard());
			
			if(i%4==0)
				System.out.println();
		}

	}

}
