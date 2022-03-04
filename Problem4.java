/*
 * 	Prompt the user to enter three integers representing
 *          the three angles of a triangle. 
 *    Pass the user input values to method isEquilateralTriangle( )
 *    TO DO: complete method isTriangle( ) so that it returns 
 *             true if the angles represent those of a triangle,
 *             and returns false if the angles do not represent those of
 *             a triangle
 *   NOTE: The sum of the angles of a triangle is 180 degrees.
 * 
 */
import java.util.Scanner;

public class Problem4
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
      
      while(count <= 3)
      {
		
   		//user prompt and data entry
   		System.out.println("Please enter the number of degrees of the first angle: ");
   		angle1 = kbd.nextInt();
         
         System.out.println("Please enter the number of degrees of the second angle: ");
   		angle2 = kbd.nextInt();
         
         System.out.println("Please enter the number of degrees of the third angle: ");
   		angle3 = kbd.nextInt();
   		
   		//business logic
   		response = isTriangle(angle1, angle2, angle3);
   		
   		//program display
   		if(response == true)
            System.out.println("The three values are those of a triangle");
   	   else
            System.out.println("The three values are not those of a triangle");
            
            count ++;
      }
   }
   public static boolean isTriangle(int a1, int a2, int a3)
   { 
      if(a1 == 60 && a2 == 60 && a3 == 60)
         return(true);
         
      return(false); //false is to be replaced with the result of testing a1, a2 and a3
   }
}
