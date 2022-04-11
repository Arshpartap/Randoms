package blackjack;

import java.util.Scanner;

/**
 *
 * @author arshp
 */
public class Blackjack {
    
    public static boolean wonGame;
    public static boolean lostGame;
    public static boolean pushGame;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Welcome to Blackjack");
        System.out.println("Please enter your username: ");
        Scanner input = new Scanner(System.in);
        String uname = input.next();
        System.out.println("Hello "+uname+"! Let's begin");
        boolean repeat = true;
        boolean repeat1 = true;
        
        
            Hand playerHand = new Hand();
            
            Hand dealerHand = new Hand();
            
            dealerHand.addCard();
        
        while(repeat){
            
            while(repeat1){
            
            
            
            
//            playerHand.addCard();
//            playerHand.addCard();
//            
//            dealerHand.addCard();
            
            
            System.out.println("your card 1 is "+playerHand.addCard());
            System.out.println("your card 2 is "+playerHand.addCard());
            System.out.println("your hand value is "+playerHand.handValue);
            
            
            System.out.println("\nDealer's face up card is "+dealerHand.addCard());
            System.out.println("dealer's total is "+dealerHand.handValue);
            
            
            
            
            if(playerHand.handValue == 21){
                wonGame = true;
                System.out.println("BLACKJACK!!!!");
            }
            
            
            
            
            if(playerHand.handValue > 21){
                lostGame = true;
                System.out.println("You bust! Your total went more than 21");
                break;
            }
            if(dealerHand.handValue > 21){
                wonGame = true;
                System.out.println("Dealer busts! Dealer's total went more than 21. YOU WON!!");
                break;
            }
            
            
            
            if(playerHand.handValue < 21){
                int playerCount = 3;
                int dealerCount = 3;
                
                while(playerHand.handValue < 21){
            System.out.println("\nDo you want to (1)Hit or (2)Stand ?");
            int cont;
            cont = input.nextInt();
            
            if(cont == 1){
                System.out.println("your card "+playerCount+" is "+playerHand.addCard());
                System.out.println("your hand value is now "+playerHand.handValue);
                if(playerHand.handValue > 21){
                lostGame = true;
                System.out.println("You bust! Your total went more than 21");
                //break;
                }
                
                if(wonGame){
                    break;
                }
                else if(lostGame){
                    break;
                }
                else if(pushGame){
                    break;
                }
                
//                else if(playerHand.handValue == 21){
//                    break;
//                }
                playerCount++;
                
//                if(wonGame){
//                    break;
//                }
//                else if(lostGame){
//                    break;
//                }
//                else if(pushGame){
//                    break;
//                }
                
                //break;
            }
                //break;
                if(wonGame){
                    break;
                }
                else if(lostGame){
                    break;
                }
                else if(pushGame){
                    break;
                }
                
                //break;
                }
                
                
                if(wonGame){
                    break;
                }
                else if(lostGame){
                    break;
                }
                else if(pushGame){
                    break;
                }
            
            
            while(dealerHand.handValue <= 17){
                System.out.println("dealer's card "+dealerCount+" is "+dealerHand.addCard());
                System.out.println("dealer's hand value is now "+dealerHand.handValue);
                dealerCount++;
            }
            
            
            if(dealerHand.handValue > 21){
                lostGame = true;
                System.out.println("Dealer busts! Dealer's total went more than 21. YOU WON!!");
                break;
            }
            
            
            
            if(playerHand.handValue > dealerHand.handValue){
                wonGame = true;
                System.out.println("YOU WON!!");
                break;
            }
            else if(playerHand.handValue < dealerHand.handValue){
                lostGame = true;
                System.out.println("You lose. Dealer's hand value is more than you");
                break;
            }
            else {
                pushGame = true;
                System.out.println("It's a push. No one wins");
                break;
            }
            }  // WHILE LOOP}
            
                
                if(wonGame){
                    break;
                }
                else if(lostGame){
                    break;
                }
                else if(pushGame){
                    break;
                }
                
                
             int dealerCount = 3;   
            
            while(dealerHand.handValue <= 17){
                System.out.println("dealer's card "+dealerCount+" is "+dealerHand.addCard());
                System.out.println("dealer's hand value is now "+dealerHand.handValue);
                if(dealerHand.handValue > 21){
                wonGame = true;
                System.out.println("Dealer busts! Dealer's total went more than 21. YOU WON!!");
                break;
            }
                
                
                
                
                if(wonGame){
                    break;
                }
                else if(lostGame){
                    break;
                }
                else if(pushGame){
                    break;
                }
                
                
                
                
                if(playerHand.handValue > dealerHand.handValue){
                wonGame = true;
                System.out.println("YOU WON!!");
            }
            else if(playerHand.handValue == dealerHand.handValue){
                pushGame = true;
                System.out.println("It's a push. No one wins");
            }
            else {
                lostGame = true;
                System.out.println("You lose. Dealer's hand value is more than you");}
            
            }
            }
                
            
            
            if(wonGame){
                    break;
                }
                else if(lostGame){
                    break;
                }
                else if(pushGame){
                    break;
                }
            
            
            
            
            if(playerHand.handValue > 21){
                lostGame = true;
                System.out.println("You bust! Your total went more than 21");
                break;
            }
            if(dealerHand.handValue > 21){
                wonGame = true;
                System.out.println("Dealer busts! Dealer's total went more than 21. YOU WON!!");
                break;
            }
            
            if(playerHand.handValue > dealerHand.handValue){
                wonGame = true;
                System.out.println("YOU WON!!");
            }
            else if(playerHand.handValue == dealerHand.handValue){
                pushGame = true;
                System.out.println("It's a push. No one wins");
            }
            else {
                lostGame = true;
                System.out.println("You lose. Dealer's hand value is more than you");
            }
            
            
            
            
            
            
            
            
            
//            if(wonGame){
//                System.out.println("You won!!");
//            }
//            else if(lostGame){
//                System.out.println("You lost");
//            }
//            else if(pushGame){
//                System.out.println("It's a push");
//            }
            
            
            
            
            
            
            
            
            
            System.out.println("Would you like to play another round? (If yes, enter 1)");
            int choice = input.nextInt();
            if(choice != 1){
                repeat1 = false;
            }
        }
            
             System.out.println("Would you like to play another round? (If yes, enter 1)");
            int choice = input.nextInt();
            if(choice != 1){
                repeat = false;
            }
            
            
        }
        
       
            
    }

            


                   
            

        
        
        
    
    

