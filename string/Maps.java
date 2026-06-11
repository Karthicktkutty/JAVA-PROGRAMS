package string;
import java.util.Scanner;
import java.util.LinkedHashMap;
import java.util.Map;

class Maps {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Read input
        String input = sc.nextLine();

        // Map to store character frequencies
        Map<Character, Integer> freqMap = new LinkedHashMap<>();

        // Loop through each character
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if (freqMap.containsKey(ch)) {
                freqMap.put(ch, freqMap.get(ch) + 1);
            } else {
                freqMap.put(ch, 1);
            }
        }

        // Print output
        System.out.println("Character Frequencies:");
        for (Map.Entry<Character, Integer> entry : freqMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        sc.close();
    }
}