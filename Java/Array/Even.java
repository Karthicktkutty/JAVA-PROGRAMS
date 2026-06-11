// Online Java Compiler
// Use this editor to write, compile and run your Java code online

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();          // size of array
        int[] arr = new int[n];

        // input elements
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // print array
        System.out.print("Array: [");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]);
            if (i < n - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

        // sum of even numbers
        int evenSum = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                evenSum += arr[i];
            }
        }

        System.out.println("Sum of even numbers: " + evenSum);
    }
}
