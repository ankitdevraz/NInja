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