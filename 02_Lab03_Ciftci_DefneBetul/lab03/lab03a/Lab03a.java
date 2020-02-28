import java.util.Scanner;

/**
 * ___Lab03a____ Determining which numbers are divisible by which, counting odd and even numbers, getting the sum of numbers
 * @author ___Nur �iftci____
 * @version ___25.10.2018___
 */ 


public class Lab03a
{
   public static void main( String[] args)
   {
   Scanner scan = new Scanner( System.in);
   
   //variables
   int k;
   int oddNum;
   int evenNum;
   int n;
   int sum1;
   int sum2;
   
   //program code
   oddNum = 0;
   evenNum = 0;
   sum1 = 0;
   
   System.out.println( "Enter a number here: ");
   n = scan.nextInt();
   
   //loop for sum of numbers until n
   for ( int i = 0; i<=n; i++)
   {
      sum1 = sum1 + i; 
   }

   
  
   for ( int x = 0; x<=50; x++)
   {
      
     //for numbers that are not between 12 and 25 
      if ( x<12 || x>25)
         System.out.println( x + " Out of range 12-25");
      else
         System.out.println( x);
      
      //for even numbers
      if ( x % 2 == 0)
      {
               System.out.println( "even number");
               evenNum = evenNum + 1;
      }
      //for odd numbers
      else
      {
               System.out.println( "odd number");
               oddNum = oddNum + 1;
      }
            
      //for numbers divisible by 5      
      if ( x % 5 == 0)
         System.out.println( "Hi Five");
      //for numbers divisible by 2
      else if ( x % 2 == 0)
         System.out.println( "Hi Two");
      //for numbers divisible by 3 or 7
      else if ( x % 3 == 0 || x % 7 == 0)
         System.out.println( "Hi ThreeOrSeven");
      //for numbers divisible by none of these
      else
         System.out.println( "Hi Others!");
         
      }
   System.out.println( "The count of even numbers is " + evenNum);
   System.out.println( "The count of odd numbers is " + oddNum);
   
   //sum formula
   sum2 = n*(n+1)/2;
   
   //checking if the formula gives the same result as the loop
   if ( sum1 == sum2)
      System.out.println( "Sum " + sum1 + " and n*(n+1)/2= " + sum2 + " is equal");
   else
      System.out.println( "Sum and n*(n+1)/2 is not equal");
   
   
   }
}