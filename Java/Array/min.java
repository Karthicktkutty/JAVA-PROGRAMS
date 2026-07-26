// Online Java Compiler
// Use this editor to write, compile and run your Java code online

import java.util.Scanner;

 class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();      // array size
        int[] arr = new int[n];

        // read array elements
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // assume first element is minimum
        int min = arr[0];

        // find minimum
        for (int i = 1; i < n; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
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

        // print minimum
        System.out.println("Minimum value: " + min);
    }
}
