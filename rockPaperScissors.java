// Catherine Balaban
// Programming IV
// Challenge 17
// Rock Paper Scissors



import java.util.Scanner;
import java.util.Random;

public class rockPaperScissors

{

   public static void main (String[] args)
   {
   
   System.out.println ("Welcome to Rock Paper Scissors!!"); //start the game
   
   int number, answer = 0;
   
   Scanner keyboard = new Scanner(System.in); //set up scanner
   
   Random randomNumbers = new Random(); //let random numbers be generated
   
   number = randomNumbers.nextInt(3); //set the range of random numbers
   
   /** if the number 1 is generated then
      rock will be selected for the computer*/

   /** if the number 2 is generated then
      paper will be selected for the computer*/


   /** if the number 3 is generated then
      scissors will be selected for the computer*/
  do 
  {    
    System.out.print ("Number is" + number);
   
   System.out.println ("Please select your weapon:"); //allow the user to pick rock, paper, or scissors
   System.out.println ("1) Rock");
   System.out.println ("2) Paper");
   System.out.println ("3) Scissors");
   
   answer = keyboard.nextInt();
   
   if (answer == number)
   
   {
   
   System.out.print ("You and the computer have chosen the same answer.  Play again to determine a winner.");
   
   }
   
   else if (answer == 1 && number == 2 )
   {
   
   paperVRockComputer (number); //send to new method to reveal results
   
   }
   
   else if (answer == 1 && number == 3 ) 
   {
   
   rockVScissorsUser (number); //send to method to reveal results
   
   }
   
   else if (answer == 2 && number == 1)
   {
   
   paperVRockUser (number); //send to method to reveal results
   
   }
   
   else if (answer == 2 && number == 3)
   {
   
   scissorsVPaperComputer (number); //send to method to reveal results
   
   }
   
   else if (answer == 3 && number == 1)
   {
   
   rockVScissorsComputer (number); //send to method to reveal results
   
   }
   
   else if (answer == 3 && number == 2)
   {
    
    scissorsVPaperUser (number); //send to method to reveal results
   }
   }while (answer == number);
   
   }
   
/**-------------------------------------------------------------------------------
                                      METHODS
   -----------------------------------------------------------------------------*/
   
   //if computer selects paper and user selects rock, user looses
     
   public static void paperVRockComputer (int number)
   
   {
   
   System.out.print ("The computer had beaten your selection of rock with it's use of paper.  YOU LOSE!");
  
   }
   
   // if computer selects paper and the user selects scissors, user wins
   
   public static void rockVScissorsUser (int number)
   
   {
   
   System.out.print ("You have beaten the computer's selection of paper by your use of scissors.  YOU WIN!");
   
   }
   
   //if the computer selects rock and the user selects paper, user wins
   
   public static void paperVRockUser (int number)
   
   {
   
  
   System.out.print ("You have beaten the computer's selection of rock by your use of paper.  YOU WIN!");
   
   }
   
   //if the computer selects scissors and the use selects paper, user looses
   
   public static void scissorsVPaperComputer (int number)
   {
   
   System.out.print ("The computer has beaten your selection paper with it's use of scissors.  YOU LOSE!");
   
   }
   
   //if the computer selects rock and the user selects scissors, user looses
   
   public static void rockVScissorsComputer (int number)
   {
   
   System.out.print ("The computer has beaten your selection of scissors with it's use of rock.  YOU LOSE!");
   
   }
   
   // if the computer selects paper and user selects scissors, user wins
   
   public static void scissorsVPaperUser (int number)
   {
   
   System.out.print ("You have beaten the computer's selection of paper with your use of scissors.  YOU WIN!");
   
   }
   
}
