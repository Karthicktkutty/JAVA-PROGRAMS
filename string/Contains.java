package string;

public class Contains {
	    public static void main(String[] args) {
	        String text = "Java programming is fun";

	        // Check if the string contains certain words
	        System.out.println(text.contains("Java"));   // true
	        System.out.println(text.contains("fun"));    // true
	        System.out.println(text.contains("python")); // false
	    }
	}

