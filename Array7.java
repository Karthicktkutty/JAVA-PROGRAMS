
import java.util.Scanner;
public class Array7 {

	    public static void main(String[] args) {
	   Scanner s = new Scanner(System.in);
	   int a = s.nextInt();
	   int[] b = new int[a];
	   int count = 0;
	   for(int arr : b) {
	       b[count] = s.nextInt();
	       count++;
	    //   System.out.println(b[arr]);
	   }
	   for(int ar : b) {
	       System.out.println(ar);
	    // for(int i = 0; i < a; i++) {
	       //  int[] x = b;
	      //   System.out.println(x);
	     }
	   }
	    }

