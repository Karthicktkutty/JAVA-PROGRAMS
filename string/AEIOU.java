package string;
import java.util.Scanner;
public class AEIOU {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Prompt user for input
	        System.out.print("Enter a string: ");
	        String input = scanner.nextLine();

	        // Validate input
	        if (input == null || input.trim().isEmpty()) {
	            System.out.println("Invalid input. Please enter a non-empty string.");
	            return;
	        }

	        int vowelCount = 0;
	        StringBuilder vowelsFound = new StringBuilder();

	        // Convert to lowercase for easy comparison
	        String lowerInput = input.toLowerCase();

	        for (int i = 0; i < lowerInput.length(); i++) {
	            char ch = lowerInput.charAt(i);
	            if (isVowel(ch)) {
	                vowelCount++;
	                vowelsFound.append(ch).append(" ");
	            }
	        }

	        // Output results
	        System.out.println("Vowels found: " + vowelsFound.toString().trim());
	        System.out.println("Total number of vowels: " + vowelCount);

	        scanner.close();
	    }

	    // Helper method to check if a character is a vowel
	    private static boolean isVowel(char ch) {
	        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
	    }
	}

