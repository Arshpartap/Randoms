package blackjack;


import static java.lang.Integer.parseInt;

/**
 *
 * @author arshp
 */
public class Number1 {

    
    public int num;
    public String[] numbers = {"Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King", "Ace"};
    public int value;
    public String numName;
    
    
    public Number1(int index){
        this.numName = numbers[index];
        switch(numName){
        
            case "Two": this.num = 2; break;
            case "Three": this.num = 3; break;
            case "Four": this.num = 4; break;
            case "Five": this.num = 5; break;
            case "Six": this.num = 6; break;
            case "Seven": this.num = 7; break;
            case "Eight": this.num = 8; break;
            case "Nine": this.num = 9; break;
            case "Ten": this.num = 10; break;
            case "Jack": this.num = 10; break;
            case "Queen": this.num = 10; break;
            case "King": this.num = 10; break;
            case "Ace": this.num = 11; break;
    }
    }
    
    
    
    public String numName(int index){
        numName = this.numbers[index];
        return numName;
    }
    
    public int getValue(String numName){
        
        switch(numName){
        
            case "Two": value = 2; break;
            case "Three": value = 3; break;
            case "Four": value = 4; break;
            case "Five": value = 5; break;
            case "Six": value = 6; break;
            case "Seven": value = 7; break;
            case "Eight": value = 8; break;
            case "Nine": value = 9; break;
            case "Ten": value = 10; break;
            case "Jack": value = 10; break;
            case "Queen": value = 10; break;
            case "King": value = 10; break;
            case "Ace": value = 11; break;
    }
        return value;
        
    }
    
    
    @Override
    public String toString() {
        return numName; 
    }
    
}
