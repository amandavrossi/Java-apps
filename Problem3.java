/*
 * 	Prompt the user to enter three integers representing
 *          the three angles of a triangle. 
 *    Pass the user input values to method isEquilateralTriangle( )
 *    TO DO: complete method isEquilateralTriangle( ) so that it returns 
 *             true if the angles represent those of an equilateral triangle,
 *             and returns false if the angles do not represent those of
 *             an equilateral triangle
 *   NOTE: An equilateral triangle is a triangle in which each 
 *             of the three internal angles is 60°.
 * 
 */
import java.util.Scanner;

public class Problem3
{
	public static void main(String [] args)
	{
		//variable declaration
		int angle1 = 0;
      int angle2 = 0;
      int angle3 = 0;
      boolean response = false;
      int count = 1;
		
		Scanner kbd = new Scanner(System.in);
		
      while(count >= 3)
      {
         
   		//user prompt and data entry
   		System.out.println("Please enter the first angle: ");
   		angle1 = kbd.nextInt();
         
         System.out.println("Please enter the second angle: ");
   		angle2 = kbd.nextInt();
         
         System.out.println("Please enter the third angle: ");
   		angle3 = kbd.nextInt();
   		
   		//business logic
   		response = isEquilateralTriangle(angle1, angle2, angle3);
   		
   		//program display
   		if(response == true)
            System.out.println("The three values are those of an equilateral triangle");
   	   else
            System.out.println("The three values are not those of an equilateral triangle");
            
            count ++;
      }
   }
   public static boolean isEquilateralTriangle(int a1, int a2, int a3)
   {
      if(a1 == 60 && a2 == 60  && a3 == 60)
         return(true);
         
      return(false); //false is to be replaced with the result of testing a1, a2 and a3
   }
}
