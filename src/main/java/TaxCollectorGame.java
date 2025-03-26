import java.util.Set;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Arrays;

public class TaxCollectorGame {

private static Scanner scanner = new Scanner(System.in);

    public static void testTaxCollectorsChoice(){
        // test case 1, Gurkirat
        int[] test1UserArray = {64, 11};
        int[] test1Array = taxCollectorChoice(test1UserArray);
        //sorts array
        Arrays.sort(test1Array);
        // what the output should be 
        int[] test1Output = {1, 2, 4, 8, 16, 32};
        int index = 0;
        boolean test1 = true;
        // Check all values to see if equal
        for(int num: test1Array){
            if(num != test1Output[index]){
                test1 = false;
            }
            index++;
        }
        if(test1 == true){
            System.out.println("Test 1 Passed");
        }else System.out.println("Test 1 Failed.");
        
        //test case 2, Simar 
        int[] testUserChoice2 = {25};
        int[] testtaxchoice2 = taxCollectorChoice(testUserChoice2);
        
        //output
        int[] testoutput2 = {1,5};
        //test
        if (Arrays.equals(testoutput2, testtaxchoice2)) {
            System.out.println("Test 2 Passed");
        } else {
            System.out.println("Test 2 Failed");
        }
        //test case 3, Simar
        int[] testUserChoice3 = {128};
        int[] testtaxchoice3 = taxCollectorChoice(testUserChoice3);
        Arrays.sort(testtaxchoice3);

        //output
        int[] testoutput3 = {1,2,4,8,16,32,64};
        //test
        if (Arrays.equals(testoutput3, testtaxchoice3)) {
            System.out.println("Test 3 Passed");
        } else {
            System.out.println("Test 3 Failed");
        }

        // test case 4, Gurkirat
        int[] test4UserArray = {100, 50, 25};
        int[] test4Array = taxCollectorChoice(test4UserArray);
        //sorts array
        Arrays.sort(test4Array);
        // what the output should be 
        int[] test4Output = {1, 2, 4, 5, 10, 13, 20, 25};
        index = 0;
        boolean test4 = true;
        // Check all values to see if equal
        for(int num: test4Array){
            if(num != test4Output[index]){
                test4 = false;
            }
            index++;
        }
        if(test4 == true){
            System.out.println("Test 4 Passed");
        }else System.out.println("Test 4 Failed.");
    }
    public static void testGetFactors(){

    }
    public static void testIsgamewon(){
        //test case 1, Gurkirat 
        boolean test1 = isGameWon(100, 50);
        if(test1 == true){
            System.out.println("Test 1 passed.");
        }else System.out.print("Test 1 failed.");

        //test case 2, Gurkirat 
        boolean test2 = isGameWon(20, 90);
        if(test2 == false){
            System.out.println("Test 2 passed.");
        }else System.out.print("Test 2 failed.");
        
        
    }
    
    public static void testCalculateTaxScore() {
        System.out.println("Tax Score Testing");
        
        //test case 1
        int[] myValues = {1,2,3,4,5};
        int result = calculateTaxscore(myValues);
        System.out.println(result);
        //test 1 should have 15 tax score
        if (result == 15) {
            System.out.println("test passed");

        } else {
            System.out.println("test failed");
        }
        
        
        //test case 2
        //int[] myValues= {0,5,10,15,20};
        //int result = calculateTaxscore(myValues);
        //System.out.println(result);
        //should get 50 tax score
        //if (result == 50) {
            //System.out.println("test passed");

        //} else {
            //System.out.println("test failed");
        //}
        
        //test case 3
        //int[] myValues = {0};
        //int result = calculateTaxscore(myValues);
        //System.out.println(result);
        //should get 0 tax score
        //if (result == 0) {
            //System.out.println("test passed");

        //} else {
            //System.out.println("test failed");
        //}
        
        //test case 4
        //int[] myValues = {2,4,6,8,10};
        //int result = calculateTaxscore(myValues);
        //System.out.println(result);
        //should get 30 tax score
        //if (result == 30) {
            //System.out.println("test passed");

        //} else {
            //System.out.println("test failed");
        //}
         
    }
    
    public static void testPlayerScore(){
        System.out.println("Player Score Testing");

        //test case 1
        int[] myValues = {1,2,3,4,5};
        int result = calculatePlayerScore(myValues);
        System.out.println(result);
        //should get 15 player score
        if (result == 15) {
            System.out.println
        }
        

        //test case 2
        //int[] myValues = {0,2,4,6,8};
        //System.out.println(result);
        //should get 20 player score

        //test case 3
        //int[] myValues ={25,31,5,6,9};
        //int result = calculatePlayerScore(myValues);
        //System.out.println(result);
        //should get 76 player score 

        //test case 4
        //int[] myValues ={16,24,32,48,56};
        //int result = calculatePlayerScore(myValues);
        //System.out.println(result)
        
    }
    
    private static int ceilingNumber = 10; 
    public static void main(String[] args){
        testTaxCollectorsChoice();
        //making user call ceiling number, call game func with ceiling # (1-100)
        System.out.print("Welcome to Tax Game \n\nRules: Pick numbers from the list to add to your score. If you pick a number that divides other numbers in the list, the Tax Collector earns those numbers. The game ends when all numbers are picked or taxed. The player with the highest score wins!");

        System.out.print("\n\nEnter Your Ceiling Number: ");
        
        while(true){
            if(scanner.hasNextInt()){
                ceilingNumber = scanner.nextInt();
                scanner.nextLine();

                if (ceilingNumber > 0 && ceilingNumber <= 100) {
                    break; 
                } else {
                    System.out.print("Please enter a number between 1 and 100: ");
                }
        }else{
            System.out.print("Please Enter A Valid Number: ");
            scanner.nextLine();
        }
        } 

        Game();
    }


    private static int[] pickNumber(int[] taxCollectorChoice, int[] usersChoices){

        int usersChoice = 0;
        
        System.out.print("\nEnter a number: ");
        while(true){
            if(scanner.hasNextInt()){
                usersChoice = scanner.nextInt();
                scanner.nextLine();

                boolean numTaken = false; 
                for(int taxNum: taxCollectorChoice){
                    if(taxNum == usersChoice){
                        System.out.print("That number is already taken! Enter new number: ");
                        numTaken = true;
                    }
                }

                for(int usersNum: usersChoices){
                    if(usersNum == usersChoice){
                        System.out.print("That number is already taken! Enter new number: ");
                        numTaken = true;
                    }
                }


                if(numTaken == true) continue;

                if (usersChoice > 0 && usersChoice <= ceilingNumber) {
                    break; 
                } else {
                    System.out.print("Please enter a number between 1 and " + ceilingNumber + ": ");
                }
        }else{
            System.out.print("Please Enter A Valid Number: ");
            scanner.nextLine();
        }
        } 
        int[] newUsersChoices = new int[(usersChoices.length + 1)];

        int index = 0;
        for(int usersNum: usersChoices){
            newUsersChoices[index] = usersNum;
            index++;
        }

        newUsersChoices[index] = usersChoice;

        return newUsersChoices;
    }

    // calculate player score
    private static int calculatePlayerScore(int[] numbers) {
        int totalscore = 0;
        for (int number : numbers) {
            totalscore += number;
        }
        return totalscore;
    }
    
    // calculate tax score
    private static int calculateTaxscore(int[] taxnumbers) {
        int taxtotalscore = 0;
        for (int number : taxnumbers) {
            taxtotalscore += number;
        }
        return taxtotalscore;
    }

    //finding factors of a number (the user's choice)
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
        Set<Integer> allFactors = new HashSet<>();
        Set<Integer> newTaxCollectorChoices = new HashSet<>();

        //Find all factors from the array
        for(int num: usersChoices){
            allFactors.addAll(getFactors(num));
        }

        for(int num: allFactors){
            // Make sure any duplicate values and values already taken by user get removed
            boolean isDuplicate  = false; 

            for(int userNum: usersChoices){
                if(userNum == num) isDuplicate = true;
            }
           
            if(!isDuplicate){
                newTaxCollectorChoices.add(num);
            }
        }

        // Convert the set to an array
        int[] result = new int[newTaxCollectorChoices.size()];
        int index = 0;
        for (int factor : newTaxCollectorChoices) {
            
            
            
            result[index] = factor;
            index++;
        }
        
        
        return result; 
    }

    
    //checks if game is won
    private static boolean isGameWon(int playerScore, int taxScore) {
        if(playerScore > taxScore) {    //player wins
            return true;
        } else return false;
        
    }

    private static void Game() {
       int[] taxCollectorChoices = {};
       int[] usersChoices = {};
       int playerScore = 0;
       int taxCollectorScore = 0;
       boolean isGameWon = false;


        while (true) {
            displayBoxes(ceilingNumber, taxCollectorChoices, usersChoices);
            usersChoices = pickNumber(taxCollectorChoices, usersChoices);
            taxCollectorChoices = taxCollectorChoice(usersChoices);
    
            playerScore = calculatePlayerScore(usersChoices);
            taxCollectorScore = calculateTaxscore(taxCollectorChoices);

            if((taxCollectorChoices.length + usersChoices.length) == ceilingNumber) {
                break;
            }
        }
        
        isGameWon = isGameWon(playerScore, taxCollectorScore);
        if (isGameWon == true){
            System.out.println("You won by " + (playerScore - taxCollectorScore) + " points!");
            
        } else {
            System.out.println("You lost by " + (taxCollectorScore - playerScore));
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
            if(O == true){
                // if the index reaches the end then continue to next index otherwise just continue
                if(i == ceilingNumber){
                    int numbersLeft = ceilingNumber%10;

                    if(numbersLeft == 0) numbersLeft = 10;
                    
                    System.out.println();
                    for(int s = 0; s < numbersLeft; s++){
                        System.out.print("+===+");
                    }
                }
                continue;
            }

            
            
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

            // When the index reaches the end, print out the final set of lines at the bottom
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
    }

