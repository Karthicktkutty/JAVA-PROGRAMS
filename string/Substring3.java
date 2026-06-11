package string;
import java.util.Scanner;
public class Substring3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner s = new Scanner(System.in);
	        String a = s.nextLine();
	        int b = s.nextInt();
	        int c = s.nextInt();
	        if((b >= 0 && b < a.length()) && (c >= 0 && c <= a.length())) {
	            String d = a.substring(b, c) ; 
	            System.out.println(d);
	        } else {
	            System.out.println("jjjnefj");
	        }
	}

}
