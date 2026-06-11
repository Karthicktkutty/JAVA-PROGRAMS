package string;
import java.util.Scanner;
public class Builder2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input = s.nextLine();
		String reversed = new StringBuilder(input).reverse().toString();
		
		if(input.equals(reversed)) {
			System.out.println("The string '" + input + "' is a palindrome.");
		} else {
			System.out.println("The string '" + input + "' is not a palindrome.");
		}
	}

}
