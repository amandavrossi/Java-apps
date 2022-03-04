import java.util.Scanner;
import java.util.Random;

public class GuessingGameAgain
{
   public static void main(String [] args)
   {
   
      Scanner kdb = new Scanner(System.in);
      int computerValue = 0;
      int userValue = -1;
      char playAgain = 'y';
      
      //the main things to do
      //do-while loop
      do{
         Random randomNumber = new Random();
         computerValue = randomNumber.nextInt(99)+1;
         computerValue++;
         int tries = 0;
         
         boolean isFound = false;
         //
         while(isFound) {//isFound == false)
            System.out.println("Please enter your guess number: "); 
            userValue = kdb.nextInt();
            tries++;
            
            if (userValue < computerValue)
            {
               System.out.println("too low, try again");
            }
            else if (userValue > computerValue)
            {
               System.out.println("too high, try again");
            }
            else
            {
               System.out.println("Congrats! You've got the number! it was: " + computerValue
                  + "in" + tries + "tries");
                  isFound = true;//terminate loop
            }
            }   //after the terminate while loop
            System.out.println("Do you wish to play the game again?"
            + "\n Eneter y for yes or n for no: ");
            
           String userResponse = kdb.next();
           playAgain = userResponse.charAt(0);
           
      }
      while(playAgain == 'y' || playAgain == 'Y');
   
   }
}