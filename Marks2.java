import java.util.Scanner;
public class Main {
	
	  public static void main(String[] args) {

        char a;
        int x, y, z;
        Scanner store = new Scanner(System.in);
        a = store.next().charAt(0);
        x=store.nextInt();
        y=store.nextInt();
        z=store.nextInt();

        if(x>=y && y>=z) System.out.println(a+" "+(x+y)/2);

        else if (x>=y && z>=y) System.out.println(a+" "+(x+z)/2);
        else if (y>=x && x>=z) System.out.println(a+" "+(y+z)/2);
        else if (y>=x && z>=x) System.out.println(a+" "+(y+z)/2);
        else if (z>=x && x>=y) System.out.println(a+" "+(x+z)/2);

        else {
            System.out.println(a+" "+(z+y)/2);
        }
       
        }
    }
}
