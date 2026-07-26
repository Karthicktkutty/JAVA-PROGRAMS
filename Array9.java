
import java.util.Scanner;
public class Array9 {
	    public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
	    int n = s.nextInt();
	    int[] arr = new int[n];
	    int count = 0;
	    for (int x : arr) {
	    arr[count] = s.nextInt();
	    count++;
	   // System.out.println(count);
//	    System.out.println(arr[0]);
	    }
	    System.out.println(arr[0]);
	     System.out.println(arr[1]);
	      System.out.println(arr[2]);
	      for (int y : arr) {
	          System.out.println(y);  // important note nee y[arr] - nu kudukka kodathu aana arr                                intrathu just value not for index.
	      }
	}
	}
