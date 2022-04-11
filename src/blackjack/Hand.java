package blackjack;


import java.util.ArrayList;

/**
 *
 * @author arshp
 */
public class Hand {
    public ArrayList<Card> hand;
    public int handValue = 0;
    
    public Hand(){
        this.hand = new ArrayList<>();
    }
    
    public String addCard(){
        Card aCard = new Card(new Number1( (int) (Math.random()*13) ), (new Suit1((int) (Math.random()*4) )));
        this.hand.add(aCard);
        handValue += aCard.numValue;
        return aCard.toString();
        
    }
    
    
//    public int handValue(){
//        
//    }
    
}
