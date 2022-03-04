import java.util.Scanner;

public class CountSameValueStarterFile
{
   public static void main(String [] args)
   {
      //variable declarations
      //int a, b, c = 0; //receives a warning
      int val1 = 0, val2 = 0, val3 = 0;
      int largestCount = 0;
      int largest = 0;
      Scanner kbd = new Scanner(System.in);
      
      //user prompt and input
      System.out.print("Enter val1: ");
      val1 = kbd.nextInt();
      
      System.out.print("Enter val2: ");
      val2 = kbd.nextInt();
      
      System.out.print("Enter val3: ");
      val3 = kbd.nextInt();
      
      //program output
      System.out.println("The largest value was entered " + 
                          countSameValue(val1, val2, val3) + " time(s)");
   }
   public static int countSameValue( int a, int b, int c)
   {
   int largestCount = 0;
   
   if(a >= b && a >= c)
   {
      largestCount++;
   
      if(a == b || a == c)
      {
         largestCount++;
         if(b  == c)
            largestCount++;
      }
      }
   else if(b >= a && b >= c)
   {
      largestCount++;
    
      if(b == c)
      {
         largestCount++;
      }
      }
   else if(c >= a && c >= b)
   {
      largestCount++;
   }
 
      return largestCount;
   }  
}
