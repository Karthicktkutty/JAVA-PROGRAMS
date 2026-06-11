package string;
import java.util.Scanner;
public class Extract_digit_from_String {
	  public static void main(String[] args) {
	        Scanner s = new Scanner(System.in);
	        String a = s.nextLine();
	        String dig = "";
	        for (int i = 0; i < a.length(); i++) {
	            char ch = a.charAt(i);
	            if (ch >= '0' && ch <= '9') {
	                dig = dig + ch;
	            }
	            
	        }
	        System.out.println(dig + "\n");
	    }
}
