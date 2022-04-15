package blackjack;

/**
 *
 * @author arshp
 */
public class Suit1 {

    
    
    public String[] suits = {"Clubs", "Diamonds", "Spades", "Hearts"};
    public String suit;
    public String suitName;
    
    
//    public Suit1(){
//       
//    }
    
    public Suit1(int index){
        suit = suits[index];
    }
    
//    public String suitName(int index){
//        suitName = this.suits[index];
//        return suitName;
//    }
    
    @Override
    public String toString() {
        return suit; 
    }
    
}
