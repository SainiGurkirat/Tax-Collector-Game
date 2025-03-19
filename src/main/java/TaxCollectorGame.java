import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.HashSet;
import java.util.Collections;

public class TaxCollectorGame {


    public static void main(String[] args){

        displayBoxes(100);
    }

//finding factors of a number 
public static int[] findFactors(int number){
         int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }

        int[] factorsArray = new int[count];
        int index = 0;

        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factorsArray[index++] = i;
            }
        }

        return factorsArray;
    }
       
    
   
    
    //gets info from board and takes remaining factors based of user's choice
    private int[] taxCollectorChoice(int[] usersChoices) {
    
       
        return usersChoices; 
    }

    
    //checks if game is won
    private boolean isGameWon(int playerScore, int taxScore) {
        if(playerScore > taxScore) {
            return true;
        }
        else {
            return false;
        }
    }


    // prints a string of all the possible option
    private static void displayBoxes(int ceilingNumber){


        int section = 1;
        for(int i = 1; i <= ceilingNumber; i++){
            
    
            //prints new line every 5 box's
            if(i % 10 == 1){
                System.out.println();
                for(int s = 0; s < 10; s++){
                    System.out.print("+===+");
                }
                System.out.println();
            }
            
            
             //prints middle of box
             if(i < 10){
                System.out.print("| " + i + " |");
             }else System.out.print("| " + i + "|");
            
             if(i == ceilingNumber){

                int numbersLeft = ceilingNumber%10;

                if(numbersLeft == 0) numbersLeft = 10;
                
                System.out.println();
                for(int s = 0; s < numbersLeft; s++){
                    System.out.print("+===+");
                }
             }
        }
    

            
            

            
            
        }
    private static int CalculatePlayerScore(int )
    }

