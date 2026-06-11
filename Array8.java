package Array;
import java.util.Scanner;
public class Array8 {
	public static void main(String[] args) {
		  Scanner s = new Scanner(System.in);

	      int n = s.nextInt();      // how many values
	      int[] arr = new int[n];  // create array

	      for (int i = 0; i < n; i++) {
	          arr[i] = s.nextInt();   // read values
	      }

	    
	    	  for(int i = 0; i < n; i++) {
	    	       int[] z = arr;
	    	    System.out.println(z[i]);
	    	}
	  }
}
