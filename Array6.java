
import java.util.Scanner;
public class Array6 {
	   public static void main(String[] args) {
		   Scanner s = new Scanner(System.in);
		   int a = s.nextInt();
		   int[] b = new int[a];
		   for(int arr : b) {
		       b[arr] = s.nextInt();
		    //   System.out.println(b[arr]);
		   }
		  // for(int arr : b) {
		     //  System.out.println(b[arr]);
		     for(int i = 0; i < a; i++) {
		         int[] x = b;
		         System.out.println(x);
		     }
		   }
}
