package chapter07;

public class SutdaDeck {
	final int CARD_NUM = 20;
	SutdaCard[] cards = new SutdaCard[CARD_NUM];

	SutdaDeck() {
		for(int i=0; i<CARD_NUM/2; i++) {
			boolean kwang = false;
			if(i==0 || i==2 || i==7) kwang = true;
			
			cards[i] = new SutdaCard(i+1,kwang);
			cards[10+i] = new SutdaCard(i+1,false);
		}
	}
	
	void shuffle() {
		for(int i=0; i<100; i++) {
			int rand1 = (int) (Math.random() * 20);
			int rand2 = (int) (Math.random() * 20);
			SutdaCard temp = cards[rand1];
			cards[rand1] = cards[rand2];
			cards[rand2] = temp;
		}
	}
	
	SutdaCard pick(int idx) {
		return cards[idx];
	}
	
	SutdaCard pick() {
		return cards[(int)(Math.random()*20)];
	}
	
}
