// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int layers = sc.nextInt();
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int[][][] arr = new int[layers][rows][cols];

        // Input values
        for (int i = 0; i < layers; i++) {
            for (int j = 0; j < rows; j++) {
                for (int k = 0; k < cols; k++) {
                    arr[i][j][k] = sc.nextInt();
                }
            }
        }

        System.out.println("3D Array:");

        // Print array & calculate sum of each layer
        for (int i = 0; i < layers; i++) {
            int sum = 0;
            System.out.println("Layer " + (i + 1) + ":");

            for (int j = 0; j < rows; j++) {
                for (int k = 0; k < cols; k++) {
                    System.out.print(arr[i][j][k] + " ");
                    sum += arr[i][j][k];
                }
                System.out.println();
            }

            System.out.println("Sum of layer " + (i + 1) + ": " + sum);
        }

        sc.close();
    }
}
