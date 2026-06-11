package string;
import java.util.Scanner;
public class ReplaceAll {
	  public static void main(String[] args) {
	        Scanner s = new Scanner(System.in);
	        String fName = s.nextLine().replaceAll("\\s+","");
	        String sName = s.nextLine().replaceAll("\\s+","");
	        String result = fName + sName;
	        System.out.println("Concatenated String: " + result);
	    }
}
