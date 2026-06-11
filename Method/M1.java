package Method;
import java.util.Scanner;
public class M1 {
	
	
	    public static void main(String[] args) {
	 Scanner s = new Scanner(System.in);
	 String a = s.nextLine();
	 int v = 0;
	 for(int i = 0; i < 5; i++) {
	     char ch = a.charAt(i);
	   boolean aa = vowel(ch);
	         v++;
	         System.out.println(aa);
	       //  System.out.println(v);
	     
	 }
	   System.out.println(v);
	    }
	    public static boolean vowel(char ch) {
	        return ch == 'e' || ch == 'o' || ch == 'l';
	    }
	}

