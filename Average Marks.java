import java.util.Scanner // Scanner is missing in the given Code


public class Solution {


	public static void main(String[] args) {
      
     Scanner sc = new Scanner(System.in);
      
      String name=sc.nextLine();
      int	 m1=sc.nextInt();
	int m2=sc.nextInt(); //input of marks 2	
      int m3=sc.nextInt(); //taking the input of marks 3
		
      int avg=(m1+m2+m3)/3; // Finding the average marks
      
      System.out.println(name); // Printing the name of subject		
		
      System.out.println(avg);   // printing the average marks.
		
	
		
	}

}
