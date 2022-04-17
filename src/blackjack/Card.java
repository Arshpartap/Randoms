package blackjack;

/**
 *
 * @author arshp
 */
public class Card {
    private Number1 num;
    private Suit1 suit;
    private int numValue;
    
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
    
    public int getNumValue(){
        return this.numValue;
    }
    
    
}
