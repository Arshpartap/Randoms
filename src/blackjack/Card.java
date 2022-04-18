package blackjack;

/**
 *
 * @author arshp
 */
public class Card extends Number1{
    private Number1 num;
    private Suit1 suit;
    private int numValue;

    public Card(Suit1 suit, int numValue, int num, int value, String numName) {
        super(num, value, numName);
        this.suit = suit;
        this.numValue = numValue;
    }
    
    
    
    
    @Override
    public String toString(){
        return this.num.toString()+" of "+this.suit.toString();
    }
    
   
    
    public int getNumValue(){
        return this.numValue;
    }
    
    
}
