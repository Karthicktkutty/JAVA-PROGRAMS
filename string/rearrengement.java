package string;
import java.util.Arrays;
public class rearrengement {

	    public static boolean areRearrangements(String str1, String str2) {
	        // Remove spaces and convert to lowercase
	        String s1 = str1.replaceAll("\\s+", "").toLowerCase();
	        String s2 = str2.replaceAll("\\s+", "").toLowerCase();

	        // If lengths differ, they can't be rearrangements
	        if (s1.length() != s2.length()) {
	            return false;
	        }

	        // Convert to char arrays and sort
	        char[] arr1 = s1.toCharArray();
	        char[] arr2 = s2.toCharArray();
	        Arrays.sort(arr1);
	        Arrays.sort(arr2);

	        // Compare sorted arrays
	        return Arrays.equals(arr1, arr2);
	    }

	    public static void main(String[] args) {
	        System.out.println(areRearrangements("king", "gink")); // true
	        System.out.println(areRearrangements("car", "rat"));   // false
	        System.out.println(areRearrangements("listen", "silent")); // true
	    }
	}


