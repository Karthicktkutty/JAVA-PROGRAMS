package string;
import java.util.Scanner;
public class Contains2 {

	public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    String a = s.nextLine();
    String b = s.nextLine();
    if(a.contains(b)) {
    	System.out.println("The substring '" + b + "' is found in the main string.");  
    } else {
    	System.out.println("The substring '" + b + "' is not found in the main string.");
    }
       s.close();
	}

}
