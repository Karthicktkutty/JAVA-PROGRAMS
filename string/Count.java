package string;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Count {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take password input
        System.out.print("Enter your password: ");
        String password = sc.nextLine();

        // Store character occurrences
        Map<Character, Integer> charCount = new HashMap<>();

        for (char ch : password.toCharArray()) {
            charCount.put(ch, charCount.getOrDefault(ch, 0) + 1);
        }

        // Display results
        System.out.println("\nCharacter Occurrences:");
        for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {
            System.out.println("'" + entry.getKey() + "' : " + entry.getValue());
        }

        sc.close();
    }
}
