package string;
import java.util.Scanner;
public class CharAt2 {
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	String a = s.nextLine();
	int b = s.nextInt();
	if(b >= 0 && b < a.length()) {
		char c = a.charAt(b);
		System.out.println("The character at index " + b + " is " + c + ".");
	} else {
		System.out.println("Invalid index.");
	}
}
}
