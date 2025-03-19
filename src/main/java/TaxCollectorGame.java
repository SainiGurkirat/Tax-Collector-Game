import java.util.Set;
import java.util.HashSet;


public class TaxCollectorGame {


    public static void main(String[] args){

        int[] test = {100, 99, 98, 96, 94};

        int[] test1 = taxCollectorChoice(test);

        displayBoxes(100, test1, test);
        
        for(int i: test1){
            System.out.println("\n" + i);
        }
    }
//player score
private static int calculatePlayerScore(int[] numbers) {
        int totalscore = 0;
        for (int number : numbers) {
            totalscore += number;
        }
        return totalscore;
    }
// tax score
    private static int calculateTaxscore(int[] taxnumbers) {
        int taxtotalscore = 0;
        for (int number : taxnumbers) {
            taxtotalscore += number;
        }
        return taxtotalscore;
    }

//finding factors of a number 
public static Set<Integer> getFactors(int number){
    
        Set<Integer> factorsArray = new HashSet<>();

        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factorsArray.add(i);
            }
        }

        return factorsArray;
    }
       
    
   
    
    //gets info from board and takes remaining factors based of user's choice
    private static int[] taxCollectorChoice(int[] usersChoices) {
        Set<Integer> taxCollectorChoices = new HashSet<>();

        //Find all factors from the array
        for(int num: usersChoices){
            taxCollectorChoices.addAll(getFactors(num));
            
        }

        // Convert the set to an array
        int[] result = new int[taxCollectorChoices.size()];
        int index = 0;
        for (int factor : taxCollectorChoices) {
            result[index++] = factor;
        }
       
        return result; 
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
    private static void displayBoxes(int ceilingNumber, int[] taxCollectorChoices, int[] usersChoices){

        for(int i = 1; i <= ceilingNumber; i++){
            
    
            //prints new line every 5 box's
            if(i % 10 == 1){
                System.out.println();
                for(int s = 0; s < 10; s++){
                    System.out.print("+===+");
                }
                System.out.println();
            }
            
            // when users choice equals the index prints out an "O" and continue to the next index
            boolean O = false;
            for(int usersChoice: usersChoices){
                if(usersChoice == i){
                    System.out.print("| O |");
                    O = true;
                }
            }
            

            // When the index reaches the end, print out the final set of lines at the bottom
            if(i == ceilingNumber){
                int numbersLeft = ceilingNumber%10;

                if(numbersLeft == 0) numbersLeft = 10;
                
                System.out.println();
                for(int s = 0; s < numbersLeft; s++){
                    System.out.print("+===+");
                }
             }

            if(O == true) continue;
            // when users tax collectors choice equals the index prints out an "X" and continue to the next index
            boolean x = false;
            for(int taxChoice: taxCollectorChoices){
                if(taxChoice == i){
                    System.out.print("| X |");
                    x = true;
                }
            }
            if(x == true) continue;


             //if neither tax collector choice or user choice was in the index it shuld print out the index number
             if(i < 10){
                System.out.print("| " + i + " |");
             }else {
                // fixes padding on the box when number is 2 digits big
                System.out.print("| " + i + "|");
            }
            
             
        }
   
        }
    }

