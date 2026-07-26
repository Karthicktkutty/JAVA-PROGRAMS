package string;


import java.util.Arrays;
import java.util.Scanner;
 class Rearrengement3 {





	  public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter first word: ");
	        String first = sc.nextLine();

	        System.out.print("Enter second word: ");
	        String second = sc.nextLine();

	        // 👇 NORMAL METHOD CALL
	        boolean result = areRearrangements(first, second);

	        // 👇 NORMAL IF CHECK
	        if (result == true) {
	            System.out.println("TRUE - It is an anagram");
	        } else {
	            System.out.println("FALSE - It is not an anagram");
	        }

	        sc.close();
	    }


	    public static boolean areRearrangements(String str1, String str2) {

	        // remove spaces & lowercase
	        String s1 = str1.replaceAll("\\s+", "").toLowerCase();
	        String s2 = str2.replaceAll("\\s+", "").toLowerCase();

	        // length check
	        if (s1.length() != s2.length()) {
	            return false;
	        }

	        // convert to char array
	        char[] arr1 = s1.toCharArray();
	        char[] arr2 = s2.toCharArray();

	        // sort
	        Arrays.sort(arr1);
	        Arrays.sort(arr2);

	        // compare
	        return Arrays.equals(arr1, arr2);
	    }

	  
	}
