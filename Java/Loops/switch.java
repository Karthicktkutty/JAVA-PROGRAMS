// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the Number");
        int num = s.nextInt();
        switch(num) {
            case 1 : System.out.println("one");
            break;
                  case 2 : System.out.println("Two");
                    break;
                        case 3 : System.out.println("Three");
                          break;
                        default : System.out.println("Invalid");
        }
     //   else if(num == 2) {
       //       System.out.println("Two");
    //    }
      //  else if(num == 3) {
        //      System.out.println("Three");
    //    }
    }
}