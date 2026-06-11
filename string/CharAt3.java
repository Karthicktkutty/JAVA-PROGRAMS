package string;

//Online Java Compiler
//Use this editor to write, compile and run your Java code online
import java.util.Scanner;

public class CharAt3 {
 public static void main(String[] args) {

     Scanner s = new Scanner(System.in);

     // Input
     String str = s.nextLine();
     char ch = s.next().charAt(0);

     int count = 0;

     // Count occurrences
     for (int i = 0; i < str.length(); i++) {
         if (str.charAt(i) == ch) {
             count++;
         }
     }

     // Output
     System.out.println("Original String: " + str);
     System.out.println("Character: " + ch);
     System.out.println("Occurrences: " + count);

     s.close();
 }
}

