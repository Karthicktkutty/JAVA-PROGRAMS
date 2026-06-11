import java.util.Scanner;

public class TwoDArrayInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] marks = new int[2][3]; // 2 students, 3 subjects

        // Taking input
        for (int i = 0; i < marks.length; i++) { // rows
            for (int j = 0; j < marks[i].length; j++) { // columns
                System.out.print("Enter mark for Student " + (i + 1) + " Subject " + (j + 1) + ": ");
                marks[i][j] = sc.nextInt();
            }
        }

        // Printing values
        System.out.println("\nMarks table:");
        for (int i = 0; i < marks.length; i++) {
            for (int j = 0; j < marks[i].length; j++) {
                System.out.print(marks[i][j] + " ");
            }
            System.out.println(); // New line after each row
        }

        sc.close(); // Close the Scanner object
    }
}
