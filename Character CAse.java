import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class Main {
	
	public static void main(String[] args)  throws IOException
    {
	char m;
     BufferedReader bf = new BufferedReader (new InputStreamReader(System.in));
      m= (char) bf.read();
      
      if(m>=65 && m<=96)
      {
        System.out.println("1");
     
      }else if(m>=97 && m<=123){
        System.out.println("0");
	      
	            
      }else if(m>=33 && m<=57){
        System.out.println("-1");
      }
      
   

	}
}
