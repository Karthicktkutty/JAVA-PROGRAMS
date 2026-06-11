// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int[][] arr = new int[rows][cols];

        // input array
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        // print array
        System.out.println("Array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        int sum = 0;

        // find minimum of each row
        for (int i = 0; i < rows; i++) {
            int min = arr[i][0];   // assume first element is minimum

            for (int j = 1; j < cols; j++) {
                if (arr[i][j] < min) {
                    min = arr[i][j];
                }
            }

            System.out.println("Minimum of row " + (i + 1) + ": " + min);
            sum += min;
        }

        System.out.println("Sum of minimum elements: " + sum);
        sc.close();
    }
}
