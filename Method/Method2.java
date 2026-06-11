package Method;
import java.util.Scanner;
public class Method2 {

	    public static void main(String[] args) {
	        Scanner s = new Scanner(System.in);
	        String a = s.nextLine();
	        String b = s.nextLine();
	 boolean brr = areRearrangements(a, b);
	System.out.println(brr);
	    }
	    static boolean areRearrangements(String a, String b) {
	       if( a.equals(b)) {
	           return true;
	           
	       } else {
	       return false;
	       }
	    }
	}
