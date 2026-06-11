import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the Number");
        int num = s.nextInt();
        if(num == 1) {
            System.out.println("one");
        }
        else if(num == 2) {
              System.out.println("Two");
        }
        else if(num == 3) {
              System.out.println("Three");
        }
    }
}