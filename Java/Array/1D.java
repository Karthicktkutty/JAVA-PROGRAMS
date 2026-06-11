import java.util.Scanner;

public class UserInputArray {
    public static void main(String[] args) {

        // Declare an array to store 5 marks
        int[] marks = new int[5];

        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Loop to take 5 inputs from the user
        for (int i = 0; i < marks.length; i++) {
            System.out.print("Enter mark for student " + (i + 1) + ": ");
            marks[i] = scanner.nextInt(); // Store each mark in the array
        }

        // Print the values stored in the array
        System.out.println("\nMarks of the students are:");
        for (int i = 0; i < marks.length; i++) {
            System.out.println("Student " + (i + 1) + ": " + marks[i]);
        }
    }
}