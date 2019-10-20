


public class Solution {


	public static void main(String[] args) {
      
     Scanner sc = new Scanner(System.in);
      
      String name=sc.nextLine();
      int	 m1=sc.nextInt();
      
      int avg=(m1+m2+m3)/3;
      
      System.out.println(name);
      System.out.println(avg);
		
	
		
	}
	
	

}

Another programme

import java.util.Scanner;

class CheckEvenOdd
{
  public static void main(String args[])
  {
    int num;
    System.out.println("Enter an Integer number:");

    //The input provided by user is stored in num
    Scanner input = new Scanner(System.in);
    num = input.nextInt();

    /* If number is divisible by 2 then it's an even number
     * else odd number*/
    if ( num % 2 == 0 )
        System.out.println("Entered number is even");
     else
        System.out.println("Entered number is odd");
  }
}
