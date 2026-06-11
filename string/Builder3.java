package string;
import java.util.Scanner;
public class Builder3 {
	  public static void main(String[] args) {
	       Scanner s = new Scanner(System.in);
			String input = s.nextLine();
			String reversed = new StringBuilder(input).reverse().toString();
			
		System.out.println(reversed);
	    }
}
