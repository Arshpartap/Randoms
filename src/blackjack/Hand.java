package blackjack;


import java.util.ArrayList;

/**
 *
 * @author arshp
 */
public class Hand {

    public ArrayList<Card> getHand() {
        return hand;
    }

    public void setHand(ArrayList<Card> hand) {
        this.hand = hand;
    }

    public int getHandValue() {
        return handValue;
    }

    public void setHandValue(int handValue) {
        this.handValue = handValue;
    }
    private ArrayList<Card> hand;
    private int handValue = 0;
    
    public Hand(){
        this.hand = new ArrayList<>();
    }
    
    public String addCard(){
        Card aCard = new Card(new Number1( (int) (Math.random()*13) ), (new Suit1((int) (Math.random()*4) )));
        this.hand.add(aCard);
        handValue += aCard.getNumValue();
        return aCard.toString();
        
    }
    
    
//    public int handValue(){
//        
//    }
    
}
