package string;
import java.util.Arrays;
import java.util.Scanner;
public class rearrengement2 {
	

	    public static boolean areRearrangements(String str1, String str2) {

	        // Step 1: remove spaces & lowercase
	        String s1 = str1.replaceAll("\\s+", "").toLowerCase();
	        String s2 = str2.replaceAll("\\s+", "").toLowerCase();

	        // Step 2: length check
	        if (s1.length() != s2.length()) {
	            return false;
	        }

	        // Step 3: convert to char array
	        char[] arr1 = s1.toCharArray();
	        char[] arr2 = s2.toCharArray();

	        // Step 4: sort
	        Arrays.sort(arr1);  // alpabatic order convert array values
	        Arrays.sort(arr2);

	        // Step 5: compare
	        return Arrays.equals(arr1, arr2);
	    }

	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter first word: ");
	        String first = sc.nextLine();

	        System.out.print("Enter second word: ");
	        String second = sc.nextLine();

	        if (areRearrangements(first, second)) {
	            System.out.println("TRUE - It is an anagram");
	        } else {
	            System.out.println("FALSE - It is not an anagram");
	        }

	        sc.close();
	    }
	}

