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
                System.out.println("Your hand value is "+playerHand.handValue);
                
                
                
                System.out.println("\nDealer's face up card is "+dealerHand.addCard());
//                System.out.println("dealer's total value is "+dealerHand.handValue);
                
                
                
                
                if (playerHand.handValue == 21){
                    System.out.println("\nBLACKJACK!!!! YOU WON!!");
                    score++;
                    wonGame = true;
                    
                }
                
                if (playerHand.handValue > 21){
                    System.out.println("\nYou lost. Your hand value went more than 21");
                    lostGame = true;
                    
                }
                
                if (dealerHand.handValue > 21){
                    System.out.println("\nDealer's hand value went over 21. YOU WON!!!!");
                    score++;
                    wonGame = true;
                    
                }
                
                
               
                
                
                
                
                
                if(!wonGame && !lostGame && !pushGame){
                while (playerHand.handValue <= 21){
                    
                    System.out.println("\nWould you like to (1)Hit or (2)Stand ?");
                    int hos = input.nextInt();
                    if (hos == 1){
                        System.out.println("\nYou drew "+playerHand.addCard());
                        System.out.println("You hand value is "+playerHand.handValue);
                        
                        if(playerHand.handValue > 21){
                            System.out.println("\nYour hand value went over 21. You lost");
                            lostGame = true;
                            break;
                        }
                        
                        
                    }
                    else { break; }
                    
                    
                    
                }
                
            }
                
                
                
                
               
                
                
                if(!wonGame && !lostGame && !pushGame){
                while(dealerHand.handValue <= 16){
                    System.out.println("\nDealer drew "+dealerHand.addCard());
                    System.out.println("dealer's hand value is "+dealerHand.handValue);
                }
                }
                
                
                
                
                if(!wonGame && !lostGame && !pushGame){
                if(dealerHand.handValue > 21){
                    System.out.println("\nDealer's hand value went over 21. YOU WON!!!!");
                    score++;
                    wonGame = true;
                    
                }
                else{
                    
                    if(dealerHand.handValue > playerHand.handValue){
                        System.out.println("\nYou lost. Dealer's hand value is more than your's");
                        lostGame = true;
                    }
                    
                    if(dealerHand.handValue < playerHand.handValue){
                        System.out.println("\nYour hand value is more than the dealer's. YOU WON!!!!");
                        score++;
                        wonGame = true;
                    }
                    
                    if(dealerHand.handValue == playerHand.handValue){
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

            


                   
            

        
        
        
    
    

