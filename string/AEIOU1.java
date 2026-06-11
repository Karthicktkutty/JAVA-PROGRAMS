package string;
import java.util.Scanner;
public class AEIOU1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a string: ");
        String input = s.nextLine();
        
        int vowel = 0;
        for(char ch : input.toCharArray()) {
        	if("aeiouAEIOU".indexOf(ch) != -1) {
        		vowel++;
        	}
        }
        System.out.println("Original String: " + input);
        System.out.println("Number of vowels: " + vowel);
	}

}
