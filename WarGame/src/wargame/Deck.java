package wargame;

public class Deck {

	private int topCard;
	private Card[] deck = new Card[52];
	

	public int getTopCard() {
		return this.topCard;
	}

	/**
	 * 
	 * @param topCard
	 */
	public void setTopCard(int topCard) {
		this.topCard = topCard;
	}

	public Card[] getDeck() {
		return this.deck;
	}

	/**
	 * 
	 * @param deck
	 */
	public void setDeck(Card[] deck) {
		this.deck = deck;
	}

	public void shuffle() {

        topCard = 0;

        for (int i = 0; i < 1000; i++) {
            int j = (int)(Math.random()*52);
            int k = (int)(Math.random()*52);
            Card tmpCard = deck[j];
            deck[j] = deck[k];
            deck[k] = tmpCard;
        } 
        }  
        public Card dealCard(){
        Card theCard;
        if (topCard < deck.length) {
            theCard = deck[topCard];
            topCard++;
        }
        else
            theCard = null;

        return theCard;
        }
    }
