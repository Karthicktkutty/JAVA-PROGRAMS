import java.util.Scanner;

 class Main {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        // Step 1: Create 1D array of size 5
        int[] elements = new int[5];

        int sum = 0;

        // Step 2 & 3: Populate array + calculate sum
        for (int i = 0; i < elements.length; i++) {
            elements[i] = s.nextInt();   // user input
            sum = sum + elements[i];     // add to sum
        }

        // Step 4: Print original array
        System.out.print("Array: [");
        for (int i = 0; i < elements.length; i++) {
            System.out.print(elements[i]);
            if (i < elements.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

        // Print sum
        System.out.println("Sum: " + sum);

        s.close();
    }
}
