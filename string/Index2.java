package string;
import java.util.Scanner;
public class Index2 {
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.print("Enter a word: ");
	String word = s.nextLine();
	System.out.print("Enter a character to find: ");
	char ch = s.next().charAt(0);
	
	int position = word.indexOf(ch);
	
	if(position != -1) {
		System.out.println("Character found at index: " + position);
		
	} else {
		System.out.println("Character not found");
	}
	s.close();
}
}
