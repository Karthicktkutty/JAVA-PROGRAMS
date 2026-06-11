package string;
import java.util.Scanner;
public class CharAt5 {
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	String input = s.nextLine();
	char[] characters = input.toCharArray();
	System.out.println("Character Frequencies: ");
	
	for(int i = 0; i < characters.length; i++) {
		char currentChar = characters[i];
		int count = 1;
		for(int j = 0; j < i; j++) {
			if(characters[j] == currentChar) {
				count = 0; 
				break;
			}
		}
		if(count == 1) {
			for(int j = i + 1; j < characters.length; j++) {
			if(characters[i] == currentChar) {
				count++;
			}
		}
		System.out.println(currentChar + ":" + count);
	}
}
	s.close();
}
}