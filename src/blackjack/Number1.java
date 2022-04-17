package blackjack;


import static java.lang.Integer.parseInt;

/**
 *
 * @author arshp
 */
public class Number1 {

    

    
    int num;
    private String[] numbers = {"Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King", "Ace"};
    private int value;
    private String numName;
    
    
    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String[] getNumbers() {
        return numbers;
    }

    public void setNumbers(String[] numbers) {
        this.numbers = numbers;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    private String getNumName() {
        return numName;
    }

    public void setNumName(String numName) {
        this.numName = numName;
    }
    
    
    public Number1(int index){
        this.numName = numbers[index];
        switch(this.getNumName()){
        
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
        this.setNumName(this.getNumbers()[index]);
        return this.getNumName();
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
