package blackjack;

import java.util.Scanner;

/**
 *
 * @author arshp
 */
public class Blackjack {
    


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int score;
        score = 0;
        System.out.println("Welcome to Blackjack");
        System.out.print("Please enter your username: ");
        Scanner input = new Scanner(System.in);
        String uname = input.next();
        System.out.println("\nHello "+uname+"! Let's begin");
        boolean repeat = true;
        boolean repeat1 = true;
        

        
            
            
            
            
            while (repeat){
                
                
                boolean wonGame = false;
                boolean lostGame = false;
                boolean pushGame = false;
                
                
                Hand playerHand = new Hand();
            
                Hand dealerHand = new Hand();
            
                dealerHand.addCard();
                
                
                
                System.out.println("\nYour card 1 is "+playerHand.addCard());
                System.out.println("Your card 2 is "+playerHand.addCard());
                System.out.println("Your hand value is "+playerHand.getHandValue());
                
                
                
                System.out.println("\nDealer's face up card is "+dealerHand.addCard());
//                System.out.println("dealer's total value is "+dealerHand.handValue);
                
                
                
                
                if (playerHand.getHandValue() == 21){
                    System.out.println("\nBLACKJACK!!!! YOU WON!!");
                    score++;
                    wonGame = true;
                    
                }
                
                if (playerHand.getHandValue() > 21){
                    System.out.println("\nYou lost. Your hand value went more than 21");
                    lostGame = true;
                    
                }
                
                if (dealerHand.getHandValue() > 21){
                    System.out.println("\nDealer's hand value went over 21. YOU WON!!!!");
                    score++;
                    wonGame = true;
                    
                }
                
                
               
                
                
                
                
                
                if(!wonGame && !lostGame && !pushGame){
                while (playerHand.getHandValue() <= 21){
                    
                    System.out.println("\nWould you like to (1)Hit or (2)Stand ?");
                    int hos = input.nextInt();
                    if (hos == 1){
                        System.out.println("\nYou drew "+playerHand.addCard());
                        System.out.println("You hand value is "+playerHand.getHandValue());
                        
                        if(playerHand.getHandValue() > 21){
                            System.out.println("\nYour hand value went over 21. You lost");
                            lostGame = true;
                            break;
                        }
                        
                        
                    }
                    else { 
                        System.out.println("\nDealer's hand value is "+dealerHand.getHandValue());
                        break; }
                    
                    
                    
                }
                
            }
                
                
                
                
               
                
                
                if(!wonGame && !lostGame && !pushGame){
                while(dealerHand.getHandValue() <= 16){
                    System.out.println("\nDealer drew "+dealerHand.addCard());
                    System.out.println("dealer's hand value is "+dealerHand.getHandValue());
                }
                }
                
                
                
                
                if(!wonGame && !lostGame && !pushGame){
                if(dealerHand.getHandValue() > 21){
                    System.out.println("\nDealer's hand value went over 21. YOU WON!!!!");
                    score++;
                    wonGame = true;
                    
                }
                else{
                    
                    if(dealerHand.getHandValue() > playerHand.getHandValue()){
                        System.out.println("\nYou lost. Dealer's hand value is more than your's");
                        lostGame = true;
                    }
                    
                    if(dealerHand.getHandValue() < playerHand.getHandValue()){
                        System.out.println("\nYour hand value is more than the dealer's. YOU WON!!!!");
                        score++;
                        wonGame = true;
                    }
                    
                    if(dealerHand.getHandValue() == playerHand.getHandValue()){
                        System.out.println("\nIt's a push. Your hand is value is equal to the dealer's");
                        pushGame = true;
                    }
                    
                    
                }
            }
                
                
               
                
                
                System.out.println("\nYour score is "+score);
                
                
                System.out.println("\nWould you like to play another round? (If yes, enter 1)");
                int choice = input.nextInt();
                if(choice == 1){
                    repeat = true;
                }
                else{ repeat = false; }
                
                
            }
                 
    }
    
}

            


                   
            

        
        
        
    
    

