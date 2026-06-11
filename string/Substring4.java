package string;
import java.util.Scanner;
public class Substring4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String a = s.nextLine();
        int b = s.nextInt();
        int c = s.nextInt();
        if((b >= 0 && b < a.length()) && (c >= 0 && c < a.length())) {
            String d = a.substring(b, a.length()); 
            System.out.println(d);
        } else {
            System.out.println("jjjnefj");
        }
    }
}
