package Array;
import java.util.Scanner;
public class Array3 {

	    public static void main(String[] args) {

	        Scanner s = new Scanner(System.in);

	        int a = s.nextInt();

	        // create array with single element
	        int[] b = { a };

	        int[] arr = {100, 200, 300, 400};

	        System.out.println(arr[0]); // 100

	        for (int arrs : arr) {
	            System.out.println(arrs);
	        }

	        // print b array
	        for (int x : b) {
	            System.out.println(x);
	        }
	    }
	}

