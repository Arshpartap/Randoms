package blackjack;

/**
 *
 * @author arshp
 */
public class Card {
    public Number1 num;
    public Suit1 suit;
    public int numValue;
    
    public Card(Number1 num, Suit1 suit){
        this.num = num;
        this.suit = suit;
        this.numValue = num.num;
    }
    
    @Override
    public String toString(){
        return this.num.toString()+" of "+this.suit.toString();
    }
    
    public Number1 getNum(){
        return this.num;
    }
    
    
}
