package blackjack;

/**
 *
 * @author arshp
 */
public class Suit1 {

    

    
    
    private String[] suits = {"Clubs", "Diamonds", "Spades", "Hearts"};
    private String suit;
    private String suitName;
    
    
    public String[] getSuits() {
        return suits;
    }

    public void setSuits(String[] suits) {
        this.suits = suits;
    }

    public String getSuit() {
        return suit;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }

    public String getSuitName() {
        return suitName;
    }

    public void setSuitName(String suitName) {
        this.suitName = suitName;
    }
    
    
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
